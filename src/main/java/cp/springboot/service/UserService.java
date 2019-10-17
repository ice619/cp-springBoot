package cp.springboot.service;

import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author chenpeng
 * @date 2019/10/17 15:57
 */
@Service
public class UserService {
    public String index() {
        return "这是我的第一个UserService..";
    }

}