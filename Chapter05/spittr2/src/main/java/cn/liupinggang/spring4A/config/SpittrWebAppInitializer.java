package cn.liupinggang.spring4A.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 启动时会返回带有@Configuration注解的类来配置ContextLoaderListener创建的应用上下文的Bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootCofig.class};
    }

    /**
     * 指定Web配置类，DispatcherServlet加载上下文时使用WebConfig中的Bean
     *     DispatcherServlet应该加载包含Web组件的Bean，比如：控制器、视图解析器、处理器映射
     *     启动时会返回带有@Configuration注解的类用来定义DispatcherServlet应用上下文中的Bean，
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * 将SpringMvc的DispatcherServlet映射到“/”
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
