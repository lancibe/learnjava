package keng;

import deom.Druidtest.DruidTest;
import deom.utilsgong.JDBcUtls;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import r.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@WebServlet("/keng.zc")
public class zc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JdbcTemplate  jdbcTemplate=new JdbcTemplate(JDBcUtls.getDataSorce());
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select  * from name where yh=? and mm=?","张三","520lq");
        for (int j = 0; j <maps.size() ; j++) {
            System.out.println(maps.get(j));

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


}
}
