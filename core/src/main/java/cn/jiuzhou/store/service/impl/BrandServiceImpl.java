package cn.jiuzhou.store.service.impl;

import cn.jiuzhou.file.api.FileUploadServiceApi;
import cn.jiuzhou.file.common.Result;
import cn.jiuzhou.store.dao.BrandMapper;
import cn.jiuzhou.store.model.Brand;
import cn.jiuzhou.store.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.InputStream;
import java.util.List;

/**
 * Created by jiuzhou on 2017/7/8.
 */
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private FileUploadServiceApi fileUploadServiceApi;

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

    public List<Brand> selectAll() {
        List<Brand> brands = brandMapper.selectAll();
        return brands;
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

    public String fileUpload(String fileName, InputStream data) throws Exception{
        Result upload = fileUploadServiceApi.upload(fileName, data);
        String code = upload.getCode();
        if (code.equals("0")){
            //上传文件失败
            String msg = upload.getMsg();
            if (StringUtils.isEmpty(msg)){
                throw new Exception("文件上传失败");
            }else {
                throw new Exception(msg);
            }
        }
        return "文件上传成功";
    }
}
