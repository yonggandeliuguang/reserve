package com.biyesheji.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "gird")
public class Gird implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "uid")
    private Integer uid;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "buy_time")
    private Integer buyTime;

    @Column(name = "is_pay")
    private String isPay;

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
     * @return buy_time
     */
    public Integer getBuyTime() {
        return buyTime;
    }

    /**
     * @param buyTime
     */
    public void setBuyTime(Integer buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * @return is_pay
     */
    public String getIsPay() {
        return isPay;
    }

    /**
     * @param isPay
     */
    public void setIsPay(String isPay) {
        this.isPay = isPay == null ? null : isPay.trim();
    }
}