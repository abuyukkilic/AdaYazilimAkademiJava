package jp.j23_finalExercise.jpc;

import jp.j23_finalExercise.business.*;
import java.util.Scanner;

public class JpcFinalExercise {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static int option = -1;
    //The moviesCatalog folder must has been created manually (moviesCatalog)
    private static final String FILE_NAME = "c:\\javaTest\\movies.txt";
    private static final MoviesCatalog MOVIES_CATALOOG = new MoviesCatalogImpl();

    public static void main(String[] args) {

        //While the option chosen is NOT 0, we ask the user
        while (option != 0) {
            try {
                System.out.println("Choose an option:\n"
                        + "1.- Create the Movies Catalog\n"
                        + "2.- Add a Movie\n"
                        + "3.- List Movies\n"
                        + "4.- Find a Movie\n"
                        + "0.- Exit");
                
                option = Integer.parseInt(SCANNER.nextLine());

                switch (option) {
                    case 1:
                        //1. We create the object that manages the movies catalog
                        //The creation of the file is optional, anyway it will be created
                        //when writing for the first time in the file
                        MOVIES_CATALOOG.createFile(FILE_NAME);
                        break;
                    case 2:
                        //2. Add file information
                        System.out.println("Enter the name of a movie to add:");
                        String name = SCANNER.nextLine();
                        MOVIES_CATALOOG.addMovie(name, FILE_NAME);
                        break;
                    case 3:
                        //3. list full catalog
                        MOVIES_CATALOOG.listMovies(FILE_NAME);
                        break;
                    case 4:
                        //4. Find movie
                        System.out.println("Enter the name of the movie to find:");
                        String find = SCANNER.nextLine();
                        MOVIES_CATALOOG.findMovie(FILE_NAME, find);
                        break;
                    case 0:
                        System.out.println("See you soon!");
                        break;
                    default:
                        System.out.println("Option not found");
                        break;
                }
                System.out.println("\n"); 

            } catch (NumberFormatException e) {
                e.printStackTrace(System.out);
                System.out.println("Error!");
            }
        }
    }
}
