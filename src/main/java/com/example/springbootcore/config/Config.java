package com.example.springbootcore.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.example.springbootcore.interceptor.LoginInterceptor;
import com.example.springbootcore.servlet.MyFilter;
import com.example.springbootcore.servlet.MyListener;
import com.example.springbootcore.servlet.MyServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import javax.sql.DataSource;
import java.sql.SQLException;

//@EnableWebMvc
@Configuration
public class Config implements WebMvcConfigurer {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }
        };
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/login", "/css/**", "/js/**", "/fonts/**", "/images/**","/druid/**","/sql");
    }

  /*  @Bean
    public ServletRegistrationBean statViewServlet() {

        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter() {

        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.jpg,*.png,*.css,/druid/*");
        return filterRegistrationBean;

    }*/

    @Bean
    public ServletListenerRegistrationBean listenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new MyListener());

        return servletListenerRegistrationBean;
    }

    //    自定义Druid
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource druidDataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setFilters("stat,wall");
        return dataSource;
    }


}

