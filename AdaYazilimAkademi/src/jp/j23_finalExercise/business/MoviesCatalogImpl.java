package jp.j23_finalExercise.business;

import jp.j23_finalExercise.exceptions.*;
import jp.j23_finalExercise.domain.Movie;
import jp.j23_finalExercise.data.*;
import java.util.List;

/**
 * Movie catalog manager
 * @author Ing. Ubaldo Acosta
 */
public class MoviesCatalogImpl implements MoviesCatalog{

    private final DataAccess data;

    public MoviesCatalogImpl() {
        this.data = new DataAccessImpl();
    }

    @Override
    public void addMovie(String movieName, String fileName) {
        Movie movie = new Movie(movieName);
        boolean append = false;
        try {
            append = data.exists(fileName);
            data.write(movie, fileName, append);
        } catch (DataAccessEx ex) {
            System.out.println("Data access error");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listMovies(String fileName) {
        try {
            List<Movie> movies = data.list(fileName);
            for (Movie movie : movies) {
                System.out.println("Movie:" + movie);
            }
        } catch (DataAccessEx ex) {
            System.out.println("Data access error");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void findMovie(String fileName, String find) {
        String result = null;
        try {
            result = data.find(find, fileName);
        } catch (ReadDataAccessEx ex) {
            System.out.println("Error finding the movie");
            ex.printStackTrace(System.out);
        }
        System.out.println("Find result:" + result);
    }

    @Override
    public void createFile(String fileName) {
        try {
            if (data.exists(fileName)) {
                data.delete(fileName);
                data.create(fileName);
            } else {
                //Create the file
                data.create(fileName);
            }
        } catch (DataAccessEx ex) {
            System.out.println("Data access error");
            ex.printStackTrace(System.out);
        }
    }
}
