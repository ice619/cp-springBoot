package cp.springboot.controller;
import	java.util.ResourceBundle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * 使用@RestController注解等于使用@Controller和@ResponseBody两个注解。
 * 使用@RestController注解的结果是标识该类是Spring MVC controller处理器，
 * 并且把返回结果直接写入HTTP response body中。所以”index”没有被解析为跳转路径，
 * 不会走试图解析器，页面没有跳转。而是作为返回参数，封装到response中；
 *
 * @author chenpeng
 * @date 2019/10/17 16:23
 */
@Controller
public class JspController {
    @RequestMapping("/pageIndex")
    public String pageIndex(){
        return "pageIndex";
    }
}