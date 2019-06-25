package cn.zedongw.servlet;

import cn.zedongw.entity.Admin;
import cn.zedongw.service.IAdminService;
import cn.zedongw.service.impl.AdminService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

/**
 * @Author ZeDongW
 * @ClassName AdminServlet
 * @Description 管理员空控制层，用于控制管理员登陆等处
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 7:12
 * @modified By：
 */

public class AdminServlet extends HttpServlet {
    //数理化管理员业务逻辑层
    IAdminService adminService = new AdminService();

    //跳转资源
    String uri;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取管理员操作类型
        String method = req.getParameter("method");

        //登录操作
        if ("login".equals(method)){
            login(req, resp); //调用操作方法
        }

        //退出操作
        if ("logout".equals(method)){
            logout(req, resp); //调用退出方法
        }
    }

    /**
     * @Author: ZeDongW
     * @Description: 管理员退出方法
     * @Date: 2019/6/25 0025 7:18
     * @Param: [req, resp]
     * @return: void
     */
    private void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session
        HttpSession session = req.getSession(false);
        //session不为空，销毁session
        if (session != null){
            session.invalidate();  //销毁Session
        }

        //跳转至登陆页面
        req.getRequestDispatcher("/page/login.jsp").forward(req, resp);
    }

    /**
     * @Author: ZeDongW
     * @Description: 管理员登录
     * @Date: 2019/6/25 0025 7:16
     * @Param: [req, resp]
     * @return: void
     */
    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取登录参数
        String userName = req.getParameter("userName");  //用户名
        String passWord = req.getParameter("passWord"); //密码

        //封装管理员对象
        Admin admin = new Admin(userName, passWord);

        //调用service获取管理员信息
        Admin loginInfo = adminService.findAdByUNAndPwd(admin);

        //没有获取到管理员信息
        if (loginInfo == null){
            uri = "/page/login.jsp";
        } else {  //获取到管理员封装对象
            //将管理员对象保存到session中
            req.getSession().setAttribute("loginInfo", loginInfo);

            //获取ServletContext对象
            ServletContext sc = getServletContext();

            //获取在线列表集合
            Set<Admin> onLineSet = (Set<Admin>) sc.getAttribute("onLineSet");

            if (onLineSet != null){
                onLineSet.add(loginInfo);
            }

            uri = "/list";
        }

        //转发数据
        req.getRequestDispatcher(uri).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
