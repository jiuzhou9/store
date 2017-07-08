package cn.jiuzhou.store.dao;

import cn.jiuzhou.store.model.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(Long brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Long brandId);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}