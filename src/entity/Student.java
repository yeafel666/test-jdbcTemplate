package entity;

import com.sun.istack.internal.Nullable;
import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Yeafel
 * 2019/5/15 22:53
 * Do or Die,To be a better man!
 */
@Data
public class Student implements RowMapper {

    private Long id;

    private String name;

    @Override
    @Nullable
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        // 这里的序号是列的序号，以1开始
        student.setId(resultSet.getLong(1));
        student.setName(resultSet.getString(2));
        return student;
    }
}
