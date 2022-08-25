//package com.lanou.interceptor;
//
//import com.lanou.annotation.RequireAuth;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoginInterceptor implements HandlerInterceptor {
//    /**
//     * 在目标方法开始执行之前
//     *
//     * @param request
//     * @param response
//     * @param handler
//     * @return
//     * @throws Exception
//     */
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HandlerMethod handlerMethod= (HandlerMethod) handler;
//
//        RequireAuth auth= handlerMethod.getMethodAnnotation(RequireAuth.class);
//        if (auth == null||!auth.value()) {
//            return true;
//        }else {
//            return request.getSession().getAttribute("loginUser")!=null;
//        }
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        HandlerMethod handlerMethod= (HandlerMethod) handler;
////        System.out.println("用户执行"+handlerMethod.getMethod().getName()+"结果是"+modelAndView);
////        System.out.println("LoginInterceptorPost");
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
////        System.out.println("LoginInterceptorCompletion");
//    }
//}
