package xyz.hplus.guava.interceptor;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import xyz.hplus.guava.support.MyUser;
import xyz.hplus.web.support.AppContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Component
public class AppContextInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        AppContext.set("url", request.getRequestURI());
        AppContext.set("method", request.getMethod());
        String[] cooperator = request.getParameterValues("cooperator");
        if (cooperator != null && cooperator.length > 0) {
            AppContext.set("cooperator", cooperator[0]);
        }
        HttpSession session = request.getSession();
        if (session != null) {
            SecurityContext context = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
            if (context != null) {
                Authentication token = context.getAuthentication();
                MyUser user = (MyUser) token.getPrincipal();
                AppContext.set("userId", user.getUserId().toString());
            }
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        AppContext.clear();
    }
}
