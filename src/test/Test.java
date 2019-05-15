package test;
import entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.Map;

/**
 * @author Yeafel
 * 2019/5/15 21:18
 * Do or Die,To be a better man!
 */
public class Test {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();// 连接管理器
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://localhost:3306");

        dataSource.setUsername("root");

        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql="select * from school.student";

        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        System.out.println(list);


        List query = jdbcTemplate.query("select *  from  school.student", new Student());
        Student student = (Student) query.get(0);
        System.out.println(query);

    }
}
