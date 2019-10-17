package cp.springboot;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Description:加载SpringMVCDispatcherServlet
 *
 * @author chenpeng
 * @date 2019/10/17 15:46
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 加载根容器
      */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }
    /**
     * 加载SpringMVC容器
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }
    /**
     * SpringMVCDispatcherServlet 拦截的请求
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}