package com.biyesheji.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goods")
public class Good implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "good_desc")
    private String goodDesc;

    @Column(name = "price")
    private Double price;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "cid")
    private Integer cid;

    @Column(name = "uid")
    private Integer uid;

    @Column(name = "gid")
    private Integer gid;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return good_desc
     */
    public String getGoodDesc() {
        return goodDesc;
    }

    /**
     * @param goodDesc
     */
    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc == null ? null : goodDesc.trim();
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * @param gid
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }
}