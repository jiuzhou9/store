package cn.jiuzhou.store.controller.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiuzhou on 2017/7/9.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    /**
     * 跳转首页
     * @return
     */
    @RequestMapping("toIndex.do")
    public String toIndex(){
        return "/item/index";
    }
}
