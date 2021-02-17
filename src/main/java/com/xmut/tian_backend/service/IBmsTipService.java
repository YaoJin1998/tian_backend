package com.xmut.tian_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmut.tian_backend.model.entity.BmsBillboard;
import com.xmut.tian_backend.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}