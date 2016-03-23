package com.start.coc.service.model;

import java.util.Date;

public class ClanWar {
    private Long id;

    private Integer clanId;

    private String name;

    private Integer gainStar;

    private Integer lossStar;

    private Integer joinAmount;

    private Date created;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClanId() {
        return clanId;
    }

    public void setClanId(Integer clanId) {
        this.clanId = clanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGainStar() {
        return gainStar;
    }

    public void setGainStar(Integer gainStar) {
        this.gainStar = gainStar;
    }

    public Integer getLossStar() {
        return lossStar;
    }

    public void setLossStar(Integer lossStar) {
        this.lossStar = lossStar;
    }

    public Integer getJoinAmount() {
        return joinAmount;
    }

    public void setJoinAmount(Integer joinAmount) {
        this.joinAmount = joinAmount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}