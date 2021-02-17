package com.xmut.tian_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xmut.tian_backend.common.api.ApiResult;
import com.xmut.tian_backend.model.entity.BmsBillboard;
import com.xmut.tian_backend.model.entity.BmsTip;
import com.xmut.tian_backend.service.IBmsBillboardService;
import com.xmut.tian_backend.service.IBmsTipService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tip")
@CrossOrigin
public class BmsTipController extends BaseController {

    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
