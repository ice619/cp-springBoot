package cp.springboot.controller;

import cp.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author chenpeng
 * @date 2019/10/17 15:58
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
    public String index(){
        String str = userService.index();
        System.out.println(str);
        return str;
    }
}