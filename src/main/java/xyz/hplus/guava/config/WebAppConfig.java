package xyz.hplus.guava.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.hplus.guava.interceptor.AppContextInterceptor;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Autowired
    AppContextInterceptor appContextInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(appContextInterceptor);
    }
}
