package movies;

import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueInput;

        do {
            Movie movie = new Movie();

            System.out.print("Enter the title of the movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets);

            System.out.println(movie.toString());

            System.out.print("Do you want to enter another movie? (yes/no): ");
            keyboard.nextLine(); // Clear the buffer
            continueInput = keyboard.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        if (continueInput.equalsIgnoreCase("no")) {
            System.out.println("Thanks for sharing your movie choices! Catch you later, movie buff! 🎬✨");
        }

        keyboard.close();
    }
}
