//package com.lanou.interceptor;
//
//import com.lanou.annotation.RequireRole;
//import com.lanou.entity.TbUser;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class RoleInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HandlerMethod method= (HandlerMethod) handler;
//        RequireRole role=method.getMethodAnnotation(RequireRole.class);
//
//        TbUser u= (TbUser) request.getSession().getAttribute("loginUser");
//        if (role==null){
//            return true;
//        }else if (u==null){
//            return false;
//        }else if (role.value().equals(u.getRole().getRoleName())) {
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
////        System.out.println("RoleInterceptorPost");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
////        System.out.println("RoleInterceptorCompletion");
//    }
//}
