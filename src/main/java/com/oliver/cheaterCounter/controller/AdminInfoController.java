package com.oliver.cheaterCounter.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oliver.cheaterCounter.entity.Admininfo;
import com.oliver.cheaterCounter.service.IAdmininfoService;
import com.oliver.cheaterCounter.utils.methods.UtilsMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Oliver
 * @since 2020-09-30
 */
@RestController
@RequestMapping("/adminInfo")
public class AdminInfoController {
@Autowired
    IAdmininfoService  service;

public Map adminLogin(@RequestBody Admininfo admininfo){

    QueryWrapper<Admininfo> wrapper1 = new QueryWrapper<>();
    boolean equals = wrapper1.equals(admininfo);
    if(equals==true)
        return  new UtilsMap().successInfo(admininfo.getAdminName());
    else
        return new UtilsMap().failInfo(admininfo.getAdminName());

}

}
