package jp.j23_finalExercise.data;

import jp.j23_finalExercise.exceptions.*;
import jp.j23_finalExercise.domain.Movie;
import java.util.List;

/**
 * @author Ing. Ubaldo Acosta Interface to manage data, from creation, reading
 * and writing
 */
public interface DataAccess {

    boolean exists(String fileName) throws DataAccessEx;

    public List<Movie> list(String fileName) throws ReadDataAccessEx;

    void write(Movie movie, String fileName, boolean append) throws WriteDataAccessEx;

    public String find(String fileName, String find) throws ReadDataAccessEx;

    public void create(String fileName) throws DataAccessEx;

    public void delete(String fileName) throws DataAccessEx;
}
