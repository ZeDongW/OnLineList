package cn.zedongw.listener;

import cn.zedongw.entity.Admin;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZeDongW
 * @ClassName OnLineListener
 * @Description 在线列表的初始化及销毁
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 8:12
 * @modified By：
 */

public class OnLineListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //初始化在线列表
        Set<Admin> onLineSet = new HashSet<>();

        //将在线列表放入ServletContext对象汇总
        servletContextEvent.getServletContext().setAttribute("onLineSet", onLineSet);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        //获取ServletContext
        ServletContext sc = servletContextEvent.getServletContext();

        //从ServletContext对象中销毁在线列表
        Object onLineSet = sc.getAttribute("onLineSet");

        //在线列表不为空，则移除
        if (onLineSet != null){
            sc.removeAttribute("onLineSet");
        }
    }
}
