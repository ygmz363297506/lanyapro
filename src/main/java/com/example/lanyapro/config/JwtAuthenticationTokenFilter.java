//package com.example.lanyapro.config;
//
//import com.example.lanyapro.vo.TLyUser;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 详细描述: OncePerRequestFilter作为SpringMVC中的一个过滤器，在每次请求的时候都会执行
// *
// * @author yigang
// * @version v1.0.0
// * 创建时间：2023/2/26 13:37
// */
//public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        //获取token
//        String token = request.getHeader("token");
//        if (!StringUtils.hasText(token)) {//如果token为空
//            filterChain.doFilter(request, response);//放行
//            return;//不执行后面的了
//        }
//        //解析token
//        String userid;
////        try {
////            Claims claims = JwtUtil.parseJWT(token);
////            userid = claims.getSubject();
////        } catch (Exception e) {
////            e.printStackTrace();
////            throw new RuntimeException("token非法");
////        }
//
//        //从redis中获取用户信息 key为login:id形式
////        String redisKey = "login:" + userid;
////        TLyUser loginUser = redisCache.getCacheObject(redisKey);
////        if(Objects.isNull(loginUser)){//如果key的值为空，说明用户未登陆
////            throw new RuntimeException("用户未登录");
////        }
//
//        //TODO 获取权限信息封装到Authentication中
////        UsernamePasswordAuthenticationToken authenticationToken =
////                new UsernamePasswordAuthenticationToken(loginUser, null, loginUser.getAuthorities());
//        //判断如果有权限信息，放到权限上下文中,存入SecurityContextHolder
////        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
//        //放行
//        filterChain.doFilter(request, response);
//    }
//}
