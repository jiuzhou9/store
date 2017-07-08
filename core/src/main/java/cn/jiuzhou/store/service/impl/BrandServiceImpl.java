package cn.jiuzhou.store.service.impl;

import cn.jiuzhou.store.dao.BrandMapper;
import cn.jiuzhou.store.model.Brand;
import cn.jiuzhou.store.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiuzhou on 2017/7/8.
 */
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    public int deleteByPrimaryKey(Long brandId) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer brandId) {
        return 0;
    }

    public Brand selectByPrimaryKey(Integer brandId) {
        Brand brand = brandMapper.selectByPrimaryKey(brandId);
        return brand;
    }

    public int insert(Brand record) {
        int insert = brandMapper.insert(record);
        return insert;
    }

    public int insertSelective(Brand record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Brand record) {
        return 0;
    }

    public int updateByPrimaryKey(Brand record) {
        return 0;
    }
}
