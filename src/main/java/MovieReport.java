import java.awt.*;
import java.util.List;

public class MovieReport {
    private MovieRepository movieRepository;

    public MovieReport(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void generate(){
        List<Movie> movies = movieRepository.findAll();
        System.out.println(movies);
    }
}
