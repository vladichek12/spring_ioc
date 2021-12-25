public class App {

    public static void main(String[] args) {
        DbMovieRepository dbMovieRepository = new DbMovieRepository();
        MovieReport movieReport = new MovieReport(dbMovieRepository);
        movieReport.generate();
    }
}
