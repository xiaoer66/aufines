package com.aufine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * attachment_info
 * @author 
 */
public class AttachmentInfo implements Serializable {
    /**
     * 附件信息主键ID
     */
    private Integer attachmentid;

    /**
     * 附件名称
     */
    private String attachmentname;

    /**
     * 附件大小(kb)
     */
    private String attachmentsize;

    /**
     * 附件绝对路径
     */
    private String attachmentrelativepath;

    /**
     * 附件相对路径
     */
    private String attachmentabsolutepath;

    /**
     * 附件后缀名
     */
    private String attachmentsuffixname;

    /**
     * 附件备注
     */
    private String attachmentnote;

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

    public Integer getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(Integer attachmentid) {
        this.attachmentid = attachmentid;
    }

    public String getAttachmentname() {
        return attachmentname;
    }

    public void setAttachmentname(String attachmentname) {
        this.attachmentname = attachmentname;
    }

    public String getAttachmentsize() {
        return attachmentsize;
    }

    public void setAttachmentsize(String attachmentsize) {
        this.attachmentsize = attachmentsize;
    }

    public String getAttachmentrelativepath() {
        return attachmentrelativepath;
    }

    public void setAttachmentrelativepath(String attachmentrelativepath) {
        this.attachmentrelativepath = attachmentrelativepath;
    }

    public String getAttachmentabsolutepath() {
        return attachmentabsolutepath;
    }

    public void setAttachmentabsolutepath(String attachmentabsolutepath) {
        this.attachmentabsolutepath = attachmentabsolutepath;
    }

    public String getAttachmentsuffixname() {
        return attachmentsuffixname;
    }

    public void setAttachmentsuffixname(String attachmentsuffixname) {
        this.attachmentsuffixname = attachmentsuffixname;
    }

    public String getAttachmentnote() {
        return attachmentnote;
    }

    public void setAttachmentnote(String attachmentnote) {
        this.attachmentnote = attachmentnote;
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
        AttachmentInfo other = (AttachmentInfo) that;
        return (this.getAttachmentid() == null ? other.getAttachmentid() == null : this.getAttachmentid().equals(other.getAttachmentid()))
            && (this.getAttachmentname() == null ? other.getAttachmentname() == null : this.getAttachmentname().equals(other.getAttachmentname()))
            && (this.getAttachmentsize() == null ? other.getAttachmentsize() == null : this.getAttachmentsize().equals(other.getAttachmentsize()))
            && (this.getAttachmentrelativepath() == null ? other.getAttachmentrelativepath() == null : this.getAttachmentrelativepath().equals(other.getAttachmentrelativepath()))
            && (this.getAttachmentabsolutepath() == null ? other.getAttachmentabsolutepath() == null : this.getAttachmentabsolutepath().equals(other.getAttachmentabsolutepath()))
            && (this.getAttachmentsuffixname() == null ? other.getAttachmentsuffixname() == null : this.getAttachmentsuffixname().equals(other.getAttachmentsuffixname()))
            && (this.getAttachmentnote() == null ? other.getAttachmentnote() == null : this.getAttachmentnote().equals(other.getAttachmentnote()))
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
        result = prime * result + ((getAttachmentid() == null) ? 0 : getAttachmentid().hashCode());
        result = prime * result + ((getAttachmentname() == null) ? 0 : getAttachmentname().hashCode());
        result = prime * result + ((getAttachmentsize() == null) ? 0 : getAttachmentsize().hashCode());
        result = prime * result + ((getAttachmentrelativepath() == null) ? 0 : getAttachmentrelativepath().hashCode());
        result = prime * result + ((getAttachmentabsolutepath() == null) ? 0 : getAttachmentabsolutepath().hashCode());
        result = prime * result + ((getAttachmentsuffixname() == null) ? 0 : getAttachmentsuffixname().hashCode());
        result = prime * result + ((getAttachmentnote() == null) ? 0 : getAttachmentnote().hashCode());
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
        sb.append(", attachmentid=").append(attachmentid);
        sb.append(", attachmentname=").append(attachmentname);
        sb.append(", attachmentsize=").append(attachmentsize);
        sb.append(", attachmentrelativepath=").append(attachmentrelativepath);
        sb.append(", attachmentabsolutepath=").append(attachmentabsolutepath);
        sb.append(", attachmentsuffixname=").append(attachmentsuffixname);
        sb.append(", attachmentnote=").append(attachmentnote);
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