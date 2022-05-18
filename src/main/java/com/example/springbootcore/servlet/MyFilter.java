
package com.example.springbootcore.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/css/*")
public class MyFilter implements Filter
        {
            @Override
            public void init(FilterConfig filterConfig) throws ServletException {
                System.out.println("filter初始化");
                Filter.super.init(filterConfig);
            }

            @Override
            public void destroy() {
                Filter.super.destroy();
            }

            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                System.out.println("filter执行");
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
