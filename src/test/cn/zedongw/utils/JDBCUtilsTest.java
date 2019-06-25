package cn.zedongw.utils;

import cn.zedongw.entity.Students;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class JDBCUtilsTest {

    @Test
    public void getQueryRunner() throws SQLException {
        String sql = "select * from students";
        QueryRunner queryRunner = JDBCUtils.getQueryRunner();
        List<Students> query = queryRunner.query(sql, new BeanListHandler<Students>(Students.class));
        System.out.println(query);
    }
}