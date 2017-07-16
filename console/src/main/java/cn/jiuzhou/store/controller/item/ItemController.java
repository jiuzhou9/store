package cn.jiuzhou.store.controller.item;

import cn.jiuzhou.store.model.Brand;
import cn.jiuzhou.store.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jiuzhou on 2017/7/9.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private BrandService brandService;

    /**
     * 跳转首页
     * @return
     */
    @RequestMapping("toIndex.do")
    public String toIndex(){
        return "/item/index";
    }

    /**
     * 跳转列表页
     * @return
     */
    @RequestMapping("toBrandList.do")
    public ModelAndView toList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Brand> brands = brandService.selectAll();
        modelAndView.setViewName("/item/listbrand");
        modelAndView.addObject("brands",brands);
        return modelAndView;
    }

    /**
     * 跳转品牌添加页
     * @return
     */
    @RequestMapping("addbrand.do")
    public ModelAndView addbrand(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/item/addbrand");
        return modelAndView;
    }


}
