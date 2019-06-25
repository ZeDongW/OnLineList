package cn.zedongw.dao.impl;

import cn.zedongw.dao.IAdminDao;
import cn.zedongw.entity.Admin;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminDaoTest {
    IAdminDao dao = new AdminDao();
    @Test
    public void findAdByUNAndPwd() {
        System.out.println(dao.findAdByUNAndPwd(new Admin("zedongw","admin")));
    }
}