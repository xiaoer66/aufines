package com.aufine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * permission_info
 * @author 
 */
public class PermissionInfo implements Serializable {
    /**
     * 权限信息主键ID
     */
    private Integer permissionid;

    /**
     * 权限名称
     */
    private String permissionname;

    /**
     * 权限中文名称
     */
    private String permissionzhname;

    /**
     * 权限描述
     */
    private String permissiondescription;

    /**
     * 权限访问路径
     */
    private String permissionurl;

    /**
     * 权限标识
     */
    private String permissionperms;

    /**
     * 权限父级ID
     */
    private Integer permissionpid;

    /**
     * 权限类型
            0:未选择
            1:目录
            2:菜单
            3:按钮
     */
    private Short permissiontype;

    /**
     * 权限排序
     */
    private String ordernum;

    /**
     * 权限图标,附件信息ID
     */
    private Integer iconid;

    private Integer createid;

    private String createname;

    private Date createtime;

    private Integer updateid;

    private String updatename;

    private Date updatetime;

    private Short delflag;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getPermissionzhname() {
        return permissionzhname;
    }

    public void setPermissionzhname(String permissionzhname) {
        this.permissionzhname = permissionzhname;
    }

    public String getPermissiondescription() {
        return permissiondescription;
    }

    public void setPermissiondescription(String permissiondescription) {
        this.permissiondescription = permissiondescription;
    }

    public String getPermissionurl() {
        return permissionurl;
    }

    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl;
    }

    public String getPermissionperms() {
        return permissionperms;
    }

    public void setPermissionperms(String permissionperms) {
        this.permissionperms = permissionperms;
    }

    public Integer getPermissionpid() {
        return permissionpid;
    }

    public void setPermissionpid(Integer permissionpid) {
        this.permissionpid = permissionpid;
    }

    public Short getPermissiontype() {
        return permissiontype;
    }

    public void setPermissiontype(Short permissiontype) {
        this.permissiontype = permissiontype;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Integer getIconid() {
        return iconid;
    }

    public void setIconid(Integer iconid) {
        this.iconid = iconid;
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
        PermissionInfo other = (PermissionInfo) that;
        return (this.getPermissionid() == null ? other.getPermissionid() == null : this.getPermissionid().equals(other.getPermissionid()))
            && (this.getPermissionname() == null ? other.getPermissionname() == null : this.getPermissionname().equals(other.getPermissionname()))
            && (this.getPermissionzhname() == null ? other.getPermissionzhname() == null : this.getPermissionzhname().equals(other.getPermissionzhname()))
            && (this.getPermissiondescription() == null ? other.getPermissiondescription() == null : this.getPermissiondescription().equals(other.getPermissiondescription()))
            && (this.getPermissionurl() == null ? other.getPermissionurl() == null : this.getPermissionurl().equals(other.getPermissionurl()))
            && (this.getPermissionperms() == null ? other.getPermissionperms() == null : this.getPermissionperms().equals(other.getPermissionperms()))
            && (this.getPermissionpid() == null ? other.getPermissionpid() == null : this.getPermissionpid().equals(other.getPermissionpid()))
            && (this.getPermissiontype() == null ? other.getPermissiontype() == null : this.getPermissiontype().equals(other.getPermissiontype()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getIconid() == null ? other.getIconid() == null : this.getIconid().equals(other.getIconid()))
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
        result = prime * result + ((getPermissionid() == null) ? 0 : getPermissionid().hashCode());
        result = prime * result + ((getPermissionname() == null) ? 0 : getPermissionname().hashCode());
        result = prime * result + ((getPermissionzhname() == null) ? 0 : getPermissionzhname().hashCode());
        result = prime * result + ((getPermissiondescription() == null) ? 0 : getPermissiondescription().hashCode());
        result = prime * result + ((getPermissionurl() == null) ? 0 : getPermissionurl().hashCode());
        result = prime * result + ((getPermissionperms() == null) ? 0 : getPermissionperms().hashCode());
        result = prime * result + ((getPermissionpid() == null) ? 0 : getPermissionpid().hashCode());
        result = prime * result + ((getPermissiontype() == null) ? 0 : getPermissiontype().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getIconid() == null) ? 0 : getIconid().hashCode());
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
        sb.append(", permissionid=").append(permissionid);
        sb.append(", permissionname=").append(permissionname);
        sb.append(", permissionzhname=").append(permissionzhname);
        sb.append(", permissiondescription=").append(permissiondescription);
        sb.append(", permissionurl=").append(permissionurl);
        sb.append(", permissionperms=").append(permissionperms);
        sb.append(", permissionpid=").append(permissionpid);
        sb.append(", permissiontype=").append(permissiontype);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", iconid=").append(iconid);
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