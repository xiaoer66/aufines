package com.aufine.bean;

import com.aufine.entity.RoleInfo;
import com.aufine.entity.PermissionInfo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class PermissionRoleBean implements Serializable {
    private Integer permissionid;
    private String permissionname;
    private String permissionzhname;
    private String permissiondescription;
    private String permissionurl;
    private String permissionperms;
    private Integer permissionpid;
    private Short permissiontype;
    private String ordernum;
    private Integer iconid;
    /**
     * 相同权限集合
     */
    private List<RoleInfo> roleInfos;
    /**
     * 子级菜单
     */
    private List<PermissionInfo> childrenPermissionInfos;
}
