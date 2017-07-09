package cn.jiuzhou.store.servicetest;

import cn.jiuzhou.store.SpringTestCase;
import cn.jiuzhou.store.model.Brand;
import cn.jiuzhou.store.service.BrandService;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by jiuzhou on 2017/7/8.
 * 测试BrandService
 */
public class BrandServiceTest extends SpringTestCase {
    @Autowired
    private BrandService brandService;

    Logger logger = Logger.getLogger(BrandServiceTest.class);

    @Test
    public void insertTest(){
        Brand brand = new Brand();
        brand.setBrandName("手机");
        brand.setBrandSort(1);
        brand.setBrandDesc("手机");
        brand.setImgs("www.baidu.com");
        brand.setWebsite("www.baidu.com");
        int insert = brandService.insert(brand);
    }

    @Test
    public void selectByPrimaryKeyTest(){
        Brand brand = brandService.selectByPrimaryKey(1);
        System.out.println(JSON.toJSONString(brand));
    }

    @Test
    public void selectAllTest(){
        List<Brand> brands = brandService.selectAll();
        System.out.println(JSON.toJSONString(brands));
    }
}
