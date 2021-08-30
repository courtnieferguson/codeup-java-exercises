package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {


        boolean running = true;

        while (running) {
            // User picks their option here
            System.out.println(returnMenu());

            int response = promptUser();


            running = executeUserChoice(response);
        }


    }

    private static String returnMenu() {
        String choices = "Please Choose\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the animated category";

        return choices;


    }

    //Prompt user for choice
    private static int promptUser() {
        Input input = new Input();
        System.out.println("type your choice");
        int response = input.getInt(0,6);
        return response;
    }


//    public static void viewMovieByName(String name) {
//        for(Movie movie : MoviesArray.findAll()) {
//            if(movie.getName().equalsIgnoreCase(name)) {
//                System.out.printf("%s --,%s -- ,%s\n", movie.getName(), movie.getCategory(), movie.getYear());
//            }
//        }
//    }

    private static void viewMovieByCategory(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s --,%s -- ,%s\n", movie.getName(), movie.getCategory(), movie.getYear());
            }
        }
    }


    private static boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;

        switch (choice) {
            case 0:
                System.out.println("Goodbye \\n/");
                continueRunningApp = false;
                break;
            case 1:
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s --,%s -- ,%s\n", movie.getName(), movie.getCategory(), movie.getYear());
                }
                break;
            case 2:
                System.out.println("\n");
                viewMovieByCategory("drama");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                viewMovieByCategory("musical");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                viewMovieByCategory("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                viewMovieByCategory("scifi");
                System.out.println("\n");
                break;
            case 6:
                System.out.println("\n");
                viewMovieByCategory("animated");
                System.out.println("\n");
                break;
        }
        return continueRunningApp;
    }



}
