package com.aufine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * factory_info
 * @author 
 */
public class FactoryInfo implements Serializable {
    /**
     * 工厂信息主键ID
     */
    private Integer factoryinfoid;

    /**
     * 工厂名称
     */
    private String factoryname;

    /**
     * 工厂地址
     */
    private String factoryadd;

    /**
     * 工厂联系电话
     */
    private String factorytel;

    /**
     * 工厂负责人
     */
    private String factoryperson;

    /**
     * 创建人ID
     */
    private Integer createid;

    /**
     * 创建人
     */
    private String createname;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人ID
     */
    private Integer updateid;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 删除标志
     */
    private Short delflag;

    private static final long serialVersionUID = 1L;

    public Integer getFactoryinfoid() {
        return factoryinfoid;
    }

    public void setFactoryinfoid(Integer factoryinfoid) {
        this.factoryinfoid = factoryinfoid;
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

    public String getFactoryadd() {
        return factoryadd;
    }

    public void setFactoryadd(String factoryadd) {
        this.factoryadd = factoryadd;
    }

    public String getFactorytel() {
        return factorytel;
    }

    public void setFactorytel(String factorytel) {
        this.factorytel = factorytel;
    }

    public String getFactoryperson() {
        return factoryperson;
    }

    public void setFactoryperson(String factoryperson) {
        this.factoryperson = factoryperson;
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
        FactoryInfo other = (FactoryInfo) that;
        return (this.getFactoryinfoid() == null ? other.getFactoryinfoid() == null : this.getFactoryinfoid().equals(other.getFactoryinfoid()))
            && (this.getFactoryname() == null ? other.getFactoryname() == null : this.getFactoryname().equals(other.getFactoryname()))
            && (this.getFactoryadd() == null ? other.getFactoryadd() == null : this.getFactoryadd().equals(other.getFactoryadd()))
            && (this.getFactorytel() == null ? other.getFactorytel() == null : this.getFactorytel().equals(other.getFactorytel()))
            && (this.getFactoryperson() == null ? other.getFactoryperson() == null : this.getFactoryperson().equals(other.getFactoryperson()))
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
        result = prime * result + ((getFactoryinfoid() == null) ? 0 : getFactoryinfoid().hashCode());
        result = prime * result + ((getFactoryname() == null) ? 0 : getFactoryname().hashCode());
        result = prime * result + ((getFactoryadd() == null) ? 0 : getFactoryadd().hashCode());
        result = prime * result + ((getFactorytel() == null) ? 0 : getFactorytel().hashCode());
        result = prime * result + ((getFactoryperson() == null) ? 0 : getFactoryperson().hashCode());
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
        sb.append(", factoryinfoid=").append(factoryinfoid);
        sb.append(", factoryname=").append(factoryname);
        sb.append(", factoryadd=").append(factoryadd);
        sb.append(", factorytel=").append(factorytel);
        sb.append(", factoryperson=").append(factoryperson);
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