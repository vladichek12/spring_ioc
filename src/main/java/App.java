import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.tld"});
        DbMovieRepository dbMovieRepository = context.getBean(DbMovieRepository.class);
        MovieReport movieReport = new MovieReport(dbMovieRepository);
        movieReport.generate();
    }
}
