package cp.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

/**
 * Description:
 *
 * @author chenpeng
 * @date 2019/10/17 15:13
 */
public class Client {
    /**
     * 端口号
     */
    private static int PORT = 8080;
    /**
     * 项目名称
     */
    private static String CONTEXTPATH = "/testTomcat";

    public static void main(String[] args) throws LifecycleException {
        // 创建Tomcat服务器
        Tomcat tomcatServer = new Tomcat();
        // 设置Tomcat端口号
        tomcatServer.setPort(PORT);
        tomcatServer.getHost().setAutoDeploy(false);
        // 创建Context上下文
        StandardContext standardContext = new StandardContext();
        standardContext.setPath(CONTEXTPATH);
        standardContext.addLifecycleListener(new Tomcat.FixContextListener());
        // tomcat容器添加standardContext
        tomcatServer.getHost().addChild(standardContext);
        // 创建servlet
        tomcatServer.addServlet(CONTEXTPATH, "IndexServlet", new IndexServlet());
        // 添加servlet url映射
        standardContext.addServletMappingDecoded("/index", "IndexServlet");
        tomcatServer.start();
        System.out.println("tomcat启动...");
        tomcatServer.getServer().await();

    }

}