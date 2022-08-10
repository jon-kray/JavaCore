package branchoperators.bot;

public class MovieAccessService {

    public static String accessMovie(int age) {
        if (age >= 18 && age <= 21) {
            return "Rating R. Access is allowed.";
        } else if (age > 21) {
            return "Rating F. Access is allowed.";
        } else if (age <= 0) {
            return "Incorrect age, check the user with the given age";
        } else {
            return "Access is denied";
        }
    }
}