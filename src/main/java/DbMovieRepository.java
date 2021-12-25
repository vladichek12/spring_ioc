import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Repository
public class DbMovieRepository implements MovieRepository{
    @Override
    public List<Movie> findAll() {
        List<Movie> result = new ArrayList<>();
        DBWorker worker = new DBWorker();
        String query = "select * from movies";
        try {
            Statement statement  = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Movie movie = new Movie();
                movie.setName(resultSet.getString(2));
                movie.setGenre(resultSet.getString(3));
                result.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
