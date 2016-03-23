package com.start.coc.service.service.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.start.coc.service.utils.Find;
import com.start.coc.service.utils.MybatisUtils;
import com.start.coc.service.utils.ReflectUtils;

/**
 * mybatisORM
 * @author PRECISION
 *
 * @param <T>
 * @param <PK>
 */
public class BaseServiceImpl<T , PK extends Serializable> //implements BaseService<T, PK>
{
	@Resource
	private SqlSessionFactory sessionFactory;
	
	private Class<T> entityClass;
	
	@SuppressWarnings({ "unchecked" })
	public BaseServiceImpl(){
		this.entityClass = (Class<T>)ReflectUtils.getGenericType(getClass());
		System.out.println(entityClass.getCanonicalName());
	}

	List<T> selectList(String arg0, Object arg1) throws SQLException {
		SqlSession session = MybatisUtils.getSession();		
		List<T> retList = null;
		if (session != null) {
			retList = session.selectList(arg0, arg1);
		}
		MybatisUtils.closeSession();
		return retList;
	}

	protected long selectCount(String p, Object params) throws SQLException {
		SqlSession session = MybatisUtils.getSession();
		if (session != null) {
			Number total = (Number) session.selectOne(p, params);
			if (total == null)
				return 0;
			return total.longValue();
		}
		MybatisUtils.closeSession();
		return 0;
	}

	protected <T> List<T> selectList(String arg0) throws SQLException {
		SqlSession session = MybatisUtils.getSession();
		List<T> retList = null;
		if (session != null) {
			retList = session.selectList(arg0);
		}
		MybatisUtils.closeSession();
		return retList;
	}

	protected T selectOne(String arg0, Object arg1) throws SQLException {
		//SqlSession session = MybatisUtils.getSession();
		SqlSession session = sessionFactory.openSession();
		T ret = null;
		if (session != null) {
			//ret = (T) session.selectOne(arg0, arg1);
			ret = session.getMapper(entityClass);
		}
		session.close();
		return ret;
	}

	protected boolean save(String arg0, Object arg1) throws SQLException {
		SqlSession session = MybatisUtils.getSession();
		boolean ret = false;
		if (session != null) {
			int affectedRows = session.insert(arg0, arg1);
			if (affectedRows > 0) {
				ret = true;
			}
		}
		MybatisUtils.closeSession();
		return ret;
	}

	protected boolean update(String arg0, Object arg1) throws SQLException {
		SqlSession session = MybatisUtils.getSession();
		boolean ret = false;
		if (session != null) {
			int affectedRows = session.update(arg0, arg1);
			if (affectedRows > 0) {
				ret = true;
			}
		}
		MybatisUtils.closeSession();
		return ret;
	}
	
	/*@Override
	public T get(Serializable id){		
		String methodName = getMethodName();
		String temp = entityClass.getCanonicalName()+"."+methodName;		
		System.out.println(temp);
		try {
			return (T)selectOne(temp ,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
	
	public boolean save(T t){
		boolean flag=false;
		try {
			flag = this.save("com.start.first.service.entitys.Dailytop",t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	//获取当前方法的方法名
	private static String getMethodName(){
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	/*@Override
	public List<T> getByFind(Find find) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
