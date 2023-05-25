package ejercicio2;

public interface Quest<T> {
    T embark() throws QuestFailedException;
}
