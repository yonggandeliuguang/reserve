package com.biyesheji.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "chat")
public class Chat implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "content")
    private String content;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "is_read")
    private String isRead;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "another_id")
    private Integer anotherId;

    @Column(name = "is_me")
    private Integer isMe;

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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * @return is_read
     */
    public String getIsRead() {
        return isRead;
    }

    /**
     * @param isRead
     */
    public void setIsRead(String isRead) {
        this.isRead = isRead == null ? null : isRead.trim();
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return another_id
     */
    public Integer getAnotherId() {
        return anotherId;
    }

    /**
     * @param anotherId
     */
    public void setAnotherId(Integer anotherId) {
        this.anotherId = anotherId;
    }

    /**
     * @return is_me
     */
    public Integer getIsMe() {
        return isMe;
    }

    /**
     * @param isMe
     */
    public void setIsMe(Integer isMe) {
        this.isMe = isMe;
    }
}