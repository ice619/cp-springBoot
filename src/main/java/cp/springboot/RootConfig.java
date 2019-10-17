package cp.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:根容器
 *
 * @author chenpeng
 * @date 2019/10/17 15:51
 */
@Configuration
@ComponentScan(basePackages = "cp.springboot")
public class RootConfig {
}