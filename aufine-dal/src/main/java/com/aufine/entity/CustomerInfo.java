package com.aufine.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * customer_info
 * @author 
 */
public class CustomerInfo implements Serializable {
    /**
     * 客户信息主键ID
     */
    private Integer customerid;

    /**
     * 名
     */
    @NotNull
    @NotBlank
    private String firstname;

    /**
     * 姓
     */
    @NotNull
    @NotBlank
    private String lastname;

    /**
     * 职称
     */
    private String titleposition;

    /**
     * 海运公司
     */
    private String fleetcompany;

    /**
     * 城市
     */
    private String city;

    /**
     * 省/市/自治区
     */
    private String stateprovince;

    /**
     * 国家
     */
    @NotNull
    @NotBlank
    private String country;

    /**
     * 邮箱
     */
    @NotNull
    @NotBlank
    private String email;

    /**
     * 联系电话
     */
    @NotNull
    @NotBlank
    private String phone;

    /**
     * 客户留言信息
     */
    private String customermsgid;

    /**
     * 是否订阅
     */
    private Short issubscribe;

    private Integer createid;

    private String createname;

    private Date createtime;

    private Integer updateid;

    private String updatename;

    private Date updatetime;

    private Short delflag;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitleposition() {
        return titleposition;
    }

    public void setTitleposition(String titleposition) {
        this.titleposition = titleposition;
    }

    public String getFleetcompany() {
        return fleetcompany;
    }

    public void setFleetcompany(String fleetcompany) {
        this.fleetcompany = fleetcompany;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateprovince() {
        return stateprovince;
    }

    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomermsgid() {
        return customermsgid;
    }

    public void setCustomermsgid(String customermsgid) {
        this.customermsgid = customermsgid;
    }

    public Short getIssubscribe() {
        return issubscribe;
    }

    public void setIssubscribe(Short issubscribe) {
        this.issubscribe = issubscribe;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getDelflag() {
        return delflag;
    }

    public void setDelflag(Short delflag) {
        this.delflag = delflag;
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
        CustomerInfo other = (CustomerInfo) that;
        return (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getTitleposition() == null ? other.getTitleposition() == null : this.getTitleposition().equals(other.getTitleposition()))
            && (this.getFleetcompany() == null ? other.getFleetcompany() == null : this.getFleetcompany().equals(other.getFleetcompany()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getStateprovince() == null ? other.getStateprovince() == null : this.getStateprovince().equals(other.getStateprovince()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCustomermsgid() == null ? other.getCustomermsgid() == null : this.getCustomermsgid().equals(other.getCustomermsgid()))
            && (this.getIssubscribe() == null ? other.getIssubscribe() == null : this.getIssubscribe().equals(other.getIssubscribe()))
            && (this.getCreateid() == null ? other.getCreateid() == null : this.getCreateid().equals(other.getCreateid()))
            && (this.getCreatename() == null ? other.getCreatename() == null : this.getCreatename().equals(other.getCreatename()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdateid() == null ? other.getUpdateid() == null : this.getUpdateid().equals(other.getUpdateid()))
            && (this.getUpdatename() == null ? other.getUpdatename() == null : this.getUpdatename().equals(other.getUpdatename()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getTitleposition() == null) ? 0 : getTitleposition().hashCode());
        result = prime * result + ((getFleetcompany() == null) ? 0 : getFleetcompany().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getStateprovince() == null) ? 0 : getStateprovince().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCustomermsgid() == null) ? 0 : getCustomermsgid().hashCode());
        result = prime * result + ((getIssubscribe() == null) ? 0 : getIssubscribe().hashCode());
        result = prime * result + ((getCreateid() == null) ? 0 : getCreateid().hashCode());
        result = prime * result + ((getCreatename() == null) ? 0 : getCreatename().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdateid() == null) ? 0 : getUpdateid().hashCode());
        result = prime * result + ((getUpdatename() == null) ? 0 : getUpdatename().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerid=").append(customerid);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", titleposition=").append(titleposition);
        sb.append(", fleetcompany=").append(fleetcompany);
        sb.append(", city=").append(city);
        sb.append(", stateprovince=").append(stateprovince);
        sb.append(", country=").append(country);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", customermsgid=").append(customermsgid);
        sb.append(", issubscribe=").append(issubscribe);
        sb.append(", createid=").append(createid);
        sb.append(", createname=").append(createname);
        sb.append(", createtime=").append(createtime);
        sb.append(", updateid=").append(updateid);
        sb.append(", updatename=").append(updatename);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}