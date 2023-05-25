package ejercicio2;

public class QuestFailedException extends Exception {

    public QuestFailedException() {
        super();
    }

    public QuestFailedException(String message) {
        super(message);
    }

    public QuestFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestFailedException(Throwable cause) {
        super(cause);
    }
}
