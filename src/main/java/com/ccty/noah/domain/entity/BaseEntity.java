package com.ccty.noah.domain.entity;

import java.util.Date;

/**
 * @author 缄默
 * @date 2020/06/03
 */
public abstract class BaseEntity {
    //自增id
    protected Long id;
    //创建时间
    protected Date createTime;
    //修改时间
    protected Date updateTime;
    //创建人
    protected String creator;
    //修改人
    protected String modifier;
    //是否删除
    protected Boolean isBoolean;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Boolean getBoolean() {
        return isBoolean;
    }

    public void setBoolean(Boolean aBoolean) {
        isBoolean = aBoolean;
    }
}
