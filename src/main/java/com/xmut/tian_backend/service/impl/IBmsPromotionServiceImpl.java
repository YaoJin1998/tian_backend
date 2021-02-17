package com.xmut.tian_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmut.tian_backend.mapper.BmsBillboardMapper;
import com.xmut.tian_backend.mapper.BmsPromotionMapper;
import com.xmut.tian_backend.model.entity.BmsBillboard;
import com.xmut.tian_backend.model.entity.BmsPromotion;
import com.xmut.tian_backend.service.IBmsBillboardService;
import com.xmut.tian_backend.service.IBmsPromotionService;
import org.springframework.stereotype.Service;

@Service
public class IBmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper
        , BmsPromotion> implements IBmsPromotionService {

}
