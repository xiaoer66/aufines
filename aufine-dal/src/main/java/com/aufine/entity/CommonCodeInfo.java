package com.aufine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * common_code_info
 * @author 
 */
public class CommonCodeInfo implements Serializable {
    /**
     * 通用字段ID
     */
    private Integer commoncodeid;

    /**
     * 字段名称
     */
    private String codename;

    /**
     * 字段ID
     */
    private Integer codeid;

    /**
     * 字段编码
     */
    private String codeno;

    /**
     * 字段内容
     */
    private String codecontent;

    /**
     * 字段上级ID
     */
    private Integer codepid;

    /**
     * 字段备注
     */
    private String codenote;

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

    public Integer getCommoncodeid() {
        return commoncodeid;
    }

    public void setCommoncodeid(Integer commoncodeid) {
        this.commoncodeid = commoncodeid;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public Integer getCodeid() {
        return codeid;
    }

    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }

    public String getCodeno() {
        return codeno;
    }

    public void setCodeno(String codeno) {
        this.codeno = codeno;
    }

    public String getCodecontent() {
        return codecontent;
    }

    public void setCodecontent(String codecontent) {
        this.codecontent = codecontent;
    }

    public Integer getCodepid() {
        return codepid;
    }

    public void setCodepid(Integer codepid) {
        this.codepid = codepid;
    }

    public String getCodenote() {
        return codenote;
    }

    public void setCodenote(String codenote) {
        this.codenote = codenote;
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
        CommonCodeInfo other = (CommonCodeInfo) that;
        return (this.getCommoncodeid() == null ? other.getCommoncodeid() == null : this.getCommoncodeid().equals(other.getCommoncodeid()))
            && (this.getCodename() == null ? other.getCodename() == null : this.getCodename().equals(other.getCodename()))
            && (this.getCodeid() == null ? other.getCodeid() == null : this.getCodeid().equals(other.getCodeid()))
            && (this.getCodeno() == null ? other.getCodeno() == null : this.getCodeno().equals(other.getCodeno()))
            && (this.getCodecontent() == null ? other.getCodecontent() == null : this.getCodecontent().equals(other.getCodecontent()))
            && (this.getCodepid() == null ? other.getCodepid() == null : this.getCodepid().equals(other.getCodepid()))
            && (this.getCodenote() == null ? other.getCodenote() == null : this.getCodenote().equals(other.getCodenote()))
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
        result = prime * result + ((getCommoncodeid() == null) ? 0 : getCommoncodeid().hashCode());
        result = prime * result + ((getCodename() == null) ? 0 : getCodename().hashCode());
        result = prime * result + ((getCodeid() == null) ? 0 : getCodeid().hashCode());
        result = prime * result + ((getCodeno() == null) ? 0 : getCodeno().hashCode());
        result = prime * result + ((getCodecontent() == null) ? 0 : getCodecontent().hashCode());
        result = prime * result + ((getCodepid() == null) ? 0 : getCodepid().hashCode());
        result = prime * result + ((getCodenote() == null) ? 0 : getCodenote().hashCode());
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
        sb.append(", commoncodeid=").append(commoncodeid);
        sb.append(", codename=").append(codename);
        sb.append(", codeid=").append(codeid);
        sb.append(", codeno=").append(codeno);
        sb.append(", codecontent=").append(codecontent);
        sb.append(", codepid=").append(codepid);
        sb.append(", codenote=").append(codenote);
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