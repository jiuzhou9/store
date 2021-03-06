package cn.jiuzhou.store.servicetest;

import cn.jiuzhou.store.SpringTestCase;
import cn.jiuzhou.store.model.Brand;
import cn.jiuzhou.store.service.BrandService;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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

    @Test
    public void uploadTest(){
        String fileName = "a.txt";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:/Users/九州/Desktop/编辑1.TXT");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            String s = brandService.fileUpload(fileName, bufferedInputStream);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
    }
}
