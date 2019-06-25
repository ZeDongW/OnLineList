package cn.zedongw.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author ZeDongW
 * @ClassName loginFilter
 * @Description 登录控制器，及编码统一处理
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 7:48
 * @modified By：
 */

public class loginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //转换对象
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //设置统一编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取请求资源
        String requestURI = req.getRequestURI();
        //截取请求
        String path = requestURI.substring(requestURI.lastIndexOf("/") + 1);

        //登录请求,直接放行
        if ("admin".equals(path) || "login.jsp".equals(path)){
            //放行
            filterChain.doFilter(req, resp);
        } else {  //其他请求需要判断是否登陆
            //获取Session对象
            HttpSession session = req.getSession(false);
            //Session 不为空
            if (session != null){
                //获取Session里的登录信息
                Object loginInfo = session.getAttribute("loginInfo");

                //登录信息不为空，放行
                if (loginInfo != null){
                    //放行
                    filterChain.doFilter(req, resp);
                    return;
                }
            }
            //跳转到登陆页面
            req.getRequestDispatcher("/page/login.jsp").forward(req, resp);
        }
    }

    @Override
    public void destroy() {

    }
}
