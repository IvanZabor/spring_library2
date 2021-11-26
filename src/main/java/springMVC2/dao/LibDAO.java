package springMVC2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import springMVC2.models.Lib;


import java.util.List;


@Component
public class LibDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public LibDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Lib> getAllBooks() {
        return jdbcTemplate.query("SELECT * FROM Lib3", new BeanPropertyRowMapper<>(Lib.class));
    }

    public List<Lib> checkedOutBooks(){
        return jdbcTemplate.query("SELECT * FROM Lib3 WHERE available = false", new BeanPropertyRowMapper<>(Lib.class));
    }

}
