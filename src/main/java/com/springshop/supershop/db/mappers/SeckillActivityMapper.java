package com.springshop.supershop.db.mappers;

import com.springshop.supershop.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillActivity record);

    int insertSelective(SeckillActivity record);

    SeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillActivity record);

    int updateByPrimaryKey(SeckillActivity record);

    List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);
}