package cn.zedongw.servlet;

import cn.zedongw.entity.Students;
import cn.zedongw.service.IStudentsService;
import cn.zedongw.service.impl.StudentsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author ZeDongW
 * @ClassName ListServlet
 * @Description 学生类控制层，查询所有学生
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 7:38
 * @modified By：
 */

public class ListServlet extends HttpServlet {
    //Service 实例
    IStudentsService studentsService = new StudentsService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用Service 查询所有
        List<Students> studentsList = studentsService.getAllStudents();

        //冯封装到request对象中
        req.setAttribute("studentList", studentsList);

        //转发到列表页面
        req.getRequestDispatcher("/page/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
