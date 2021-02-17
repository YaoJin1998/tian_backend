package com.xmut.tian_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmut.tian_backend.mapper.BmsBillboardMapper;
import com.xmut.tian_backend.model.entity.BmsBillboard;
import com.xmut.tian_backend.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper
        , BmsBillboard> implements IBmsBillboardService {

}
