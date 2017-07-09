package cn.jiuzhou.store.service;

import cn.jiuzhou.store.model.Brand;

import java.util.List;

/**
 * Created by jiuzhou on 2017/7/8.
 */
public interface BrandService {
    int deleteByPrimaryKey(Integer brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer brandId);

    List<Brand> selectAll();

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}
