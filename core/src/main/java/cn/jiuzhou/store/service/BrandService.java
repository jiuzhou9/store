package cn.jiuzhou.store.service;

import cn.jiuzhou.store.model.Brand;

import java.io.InputStream;
import java.util.List;

/**
 * Created by jiuzhou on 2017/7/8.
 */
public interface BrandService {
    int deleteByPrimaryKey(Integer brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer brandId);

    /**
     * 查询所有brand
     * @return
     */
    List<Brand> selectAll();

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    /**
     * 文件上传
     * @param fileName
     * @param data
     * @return
     */
    String fileUpload(String fileName,InputStream data) throws Exception;
}
