package com.xmut.tian_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmut.tian_backend.model.entity.BmsBillboard;
import com.xmut.tian_backend.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
