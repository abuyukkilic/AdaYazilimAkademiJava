package jp.j23_finalExercise.business;

/**
 *
 * Interface to manage the movies catalog
 *
 * @author Ing. Ubaldo Acosta
 */
public interface MoviesCatalog {

    public void addMovie(String movieName, String fileName);

    public void listMovies(String fileName);

    public void findMovie(String fileName, String find);

    public void createFile(String fileName);

}
