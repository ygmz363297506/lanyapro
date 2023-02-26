package com.example.lanyapro.config;

import com.example.lanyapro.service.LYUserService;
import com.example.lanyapro.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

/**
 * 详细描述: 权限控制器
 * @author yigang
 * @version v1.0.0
 * 创建时间：2023/2/26 11:18
 */
@Configuration
@EnableWebSecurity // 启动Spring Security的web安全支持
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private UserDetailsServiceImpl userServiceimpl;

//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        // 开启登录配置
//        auth.userDetailsService(userServiceimpl)// 设置自定义的userDetailsService
//                .passwordEncoder(passwordEncoder());
//
//    }
//    @Resource
//    private AuthenticationEntryPoint authenticationEntryPoint;
//    @Resource
//    public AccessDeniedHandler accessDeniedHandler;
//    @Resource
//    JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;


    @Override
    public void configure(WebSecurity webSecurity) throws Exception{
        webSecurity.ignoring().antMatchers("/css/**","/fonts/**","/images/**","/js/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 使用Bcrypt 加密密码
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();//开启运行iframe嵌套页面
        http//1、配置权限认证
                //关闭csrf(跟跨域访问有关)
                .csrf().disable()
                //不通过Session获取SecurityContext
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // 对于登录接口 允许匿名访问
                .antMatchers("/**").anonymous()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated();
                //把token校验过滤器添加到过滤器链中
//                http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
//                http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).
//                        accessDeniedHandler(accessDeniedHandler);

    }
}
