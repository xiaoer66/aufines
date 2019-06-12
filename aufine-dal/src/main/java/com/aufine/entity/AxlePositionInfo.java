package com.aufine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * axle_position_info
 * @author 
 */
public class AxlePositionInfo implements Serializable {
    /**
     * 轮位信息主键ID
     */
    private Integer axlepositionid;

    /**
     * 车型通用字段ID
     */
    private Integer vehicletypecodeid;

    /**
     * 导向轮可用状态
            0:未设置
            1:推荐使用
            2:一般可用
            3:禁止使用
     */
    private Short isguidewheeltype;

    /**
     * 驱动轮可用状态
            0:未设置
            1:推荐使用
            2:一般可用
            3:禁止使用
     */
    private Short isdrivingwheeltype;

    /**
     * 拖车轮可用状态
            0:未设置
            1:推荐使用
            2:一般可用
            3:禁止使用
     */
    private Short istrailerwheeltype;

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

    public Integer getAxlepositionid() {
        return axlepositionid;
    }

    public void setAxlepositionid(Integer axlepositionid) {
        this.axlepositionid = axlepositionid;
    }

    public Integer getVehicletypecodeid() {
        return vehicletypecodeid;
    }

    public void setVehicletypecodeid(Integer vehicletypecodeid) {
        this.vehicletypecodeid = vehicletypecodeid;
    }

    public Short getIsguidewheeltype() {
        return isguidewheeltype;
    }

    public void setIsguidewheeltype(Short isguidewheeltype) {
        this.isguidewheeltype = isguidewheeltype;
    }

    public Short getIsdrivingwheeltype() {
        return isdrivingwheeltype;
    }

    public void setIsdrivingwheeltype(Short isdrivingwheeltype) {
        this.isdrivingwheeltype = isdrivingwheeltype;
    }

    public Short getIstrailerwheeltype() {
        return istrailerwheeltype;
    }

    public void setIstrailerwheeltype(Short istrailerwheeltype) {
        this.istrailerwheeltype = istrailerwheeltype;
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
        AxlePositionInfo other = (AxlePositionInfo) that;
        return (this.getAxlepositionid() == null ? other.getAxlepositionid() == null : this.getAxlepositionid().equals(other.getAxlepositionid()))
            && (this.getVehicletypecodeid() == null ? other.getVehicletypecodeid() == null : this.getVehicletypecodeid().equals(other.getVehicletypecodeid()))
            && (this.getIsguidewheeltype() == null ? other.getIsguidewheeltype() == null : this.getIsguidewheeltype().equals(other.getIsguidewheeltype()))
            && (this.getIsdrivingwheeltype() == null ? other.getIsdrivingwheeltype() == null : this.getIsdrivingwheeltype().equals(other.getIsdrivingwheeltype()))
            && (this.getIstrailerwheeltype() == null ? other.getIstrailerwheeltype() == null : this.getIstrailerwheeltype().equals(other.getIstrailerwheeltype()))
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
        result = prime * result + ((getAxlepositionid() == null) ? 0 : getAxlepositionid().hashCode());
        result = prime * result + ((getVehicletypecodeid() == null) ? 0 : getVehicletypecodeid().hashCode());
        result = prime * result + ((getIsguidewheeltype() == null) ? 0 : getIsguidewheeltype().hashCode());
        result = prime * result + ((getIsdrivingwheeltype() == null) ? 0 : getIsdrivingwheeltype().hashCode());
        result = prime * result + ((getIstrailerwheeltype() == null) ? 0 : getIstrailerwheeltype().hashCode());
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
        sb.append(", axlepositionid=").append(axlepositionid);
        sb.append(", vehicletypecodeid=").append(vehicletypecodeid);
        sb.append(", isguidewheeltype=").append(isguidewheeltype);
        sb.append(", isdrivingwheeltype=").append(isdrivingwheeltype);
        sb.append(", istrailerwheeltype=").append(istrailerwheeltype);
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