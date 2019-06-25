package cn.zedongw.listener;

import cn.zedongw.entity.Admin;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Set;

/**
 * @Author ZeDongW
 * @ClassName SessionListener
 * @Description 当Session销毁，从在线列表移除当前用户
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 8:04
 * @modified By：
 */

public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        //获取session对象
        HttpSession session = httpSessionEvent.getSession();
        //获取servletContext对象
        ServletContext sc = session.getServletContext();

        //获取session肿得当前的登录用户
        Admin loginInfo = (Admin) session.getAttribute("loginInfo");

        //冲ServletContext获取在线用户集合
        Set<Admin> onLineSet = (Set<Admin>) sc.getAttribute("onLineSet");

        //在线列表不为空，从在线列表中移除当前登录用户
        if (onLineSet != null){
            onLineSet.remove(loginInfo);
        }
    }
}
