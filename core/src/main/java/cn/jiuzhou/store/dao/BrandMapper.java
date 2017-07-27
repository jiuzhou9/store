package cn.jiuzhou.store.dao;

import cn.jiuzhou.store.model.Brand;

import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer brandId);

    List<Brand> selectAll();

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}