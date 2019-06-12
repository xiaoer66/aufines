package com.aufine.service;

import java.util.HashMap;
import java.util.List;


public interface RoleInfoService {
    List<HashMap<String,Object>> getRoleInfoByUserID(HashMap<String, Object> paramsMap);
}
