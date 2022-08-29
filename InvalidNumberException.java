public class InvalidNumberException extends Exception {

    public InvalidNumberException() {
        super("It should be a number between 1 to 12.");
    }

    public InvalidNumberException(String message) {
        super(message);
    }

}
