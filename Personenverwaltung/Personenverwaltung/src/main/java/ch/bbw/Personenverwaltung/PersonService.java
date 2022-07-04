package ch.bbw.Personenverwaltung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonService {
    @Autowired
    JdbcTemplate template;

    public List<Personen> findAll() {
        String sql = "select * from Personen";
        RowMapper<Personen> rm = new RowMapper<Personen>() {
            @Override
            public Personen mapRow(ResultSet resultSet, int i) throws SQLException {
                Personen person = new Personen(resultSet.getInt("id"),
                        resultSet.getString("Vorname"),
                        resultSet.getString("Nachname"));
                String email = resultSet.getString("E-Mail Addresse");


                return person;
            }
        };

        return template.query(sql, rm);
    }
}
