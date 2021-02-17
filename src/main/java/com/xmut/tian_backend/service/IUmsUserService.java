package com.xmut.tian_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmut.tian_backend.model.dto.RegisterDTO;
import com.xmut.tian_backend.model.entity.UmsUser;

public interface IUmsUserService extends IService<UmsUser> {

    /**
     * 注册功能
     *
     * @param dto
     * @return 注册对象
     */
    UmsUser executeRegister(RegisterDTO dto);
}