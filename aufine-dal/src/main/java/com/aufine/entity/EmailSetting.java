package com.aufine.entity;

import java.io.Serializable;

/**
 * email_setting
 * @author 
 */
public class EmailSetting implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 发件人地址
     */
    private String senderaddress;

    /**
     * 发件人账户名
     */
    private String senderaccount;

    /**
     * 发件人账户密码
     */
    private String senderpassword;

    /**
     * 邮件主题
     */
    private String subject;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenderaddress() {
        return senderaddress;
    }

    public void setSenderaddress(String senderaddress) {
        this.senderaddress = senderaddress;
    }

    public String getSenderaccount() {
        return senderaccount;
    }

    public void setSenderaccount(String senderaccount) {
        this.senderaccount = senderaccount;
    }

    public String getSenderpassword() {
        return senderpassword;
    }

    public void setSenderpassword(String senderpassword) {
        this.senderpassword = senderpassword;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EmailSetting other = (EmailSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSenderaddress() == null ? other.getSenderaddress() == null : this.getSenderaddress().equals(other.getSenderaddress()))
            && (this.getSenderaccount() == null ? other.getSenderaccount() == null : this.getSenderaccount().equals(other.getSenderaccount()))
            && (this.getSenderpassword() == null ? other.getSenderpassword() == null : this.getSenderpassword().equals(other.getSenderpassword()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSenderaddress() == null) ? 0 : getSenderaddress().hashCode());
        result = prime * result + ((getSenderaccount() == null) ? 0 : getSenderaccount().hashCode());
        result = prime * result + ((getSenderpassword() == null) ? 0 : getSenderpassword().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", senderaddress=").append(senderaddress);
        sb.append(", senderaccount=").append(senderaccount);
        sb.append(", senderpassword=").append(senderpassword);
        sb.append(", subject=").append(subject);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}