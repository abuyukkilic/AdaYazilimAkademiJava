package jp.j23_finalExercise.data;

import jp.j23_finalExercise.exceptions.*;
import jp.j23_finalExercise.domain.Movie;
import java.io.*;
import java.util.*;

public class DataAccessImpl implements DataAccess {

    @Override
    public boolean exists(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        return file.exists();
    }

    @Override
    public List<Movie> list(String fileName) throws ReadDataAccessEx {
        File file = new File(fileName);
        List<Movie> movies = new ArrayList();
        try {
            try (BufferedReader input = new BufferedReader(new FileReader(file))) {
                String line;
                line = input.readLine();
                while (line != null) {
                    Movie movie = new Movie(line);
                    movies.add(movie);
                    line = input.readLine();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return movies;
    }

    
    @Override
    public void write(Movie movie, String fileName, boolean append) throws WriteDataAccessEx {
        File file = new File(fileName);
        try {
            try (PrintWriter output = new PrintWriter(new FileWriter(file, append))) {
                output.println(movie.toString());
            }
            System.out.println("The file has been written correctly");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public String find(String find, String fileName) {
        File file = new File(fileName);
        String result = null;
        try {
            try (BufferedReader input = new BufferedReader(new FileReader(file))) {
                String line;
                int i = 0;
                line = input.readLine();
                while (line != null) {
                    if (find != null && find.equalsIgnoreCase(line)) {
                        result = "Movie " + line + " found in the index " + i;
                        break;
                    }
                    line = input.readLine();
                    i++;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return result;
    }

    @Override
    public void create(String fileName) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("The file has been created correctly");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void delete(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        file.delete();
        System.out.println("The file has been deleted correctly");
    }
}
