package com.xmut.tian_backend.controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.xmut.tian_backend.common.api.ApiResult;
import com.xmut.tian_backend.model.dto.RegisterDTO;
import com.xmut.tian_backend.model.entity.UmsUser;
import com.xmut.tian_backend.service.IUmsUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ums/user")
@CrossOrigin
public class UmsUserController extends BaseController {

    @Resource
    private IUmsUserService iUmsUserService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResult<Map<String, Object>> register(@Valid @RequestBody RegisterDTO dto) {
        UmsUser user = iUmsUserService.executeRegister(dto);
        if (ObjectUtils.isEmpty(user)) {
            return ApiResult.failed("账号注册失败");
        }
        Map<String, Object> map = new HashMap<>(16);
        map.put("user", user);
        return ApiResult.success(map);
    }
}
