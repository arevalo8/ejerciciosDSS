package ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        KnightOfTheRoundTable knight = context.getBean("knight", KnightOfTheRoundTable.class);
        knight.setQuest(new HolyGrailQuest());
        try {
            Object questResult = knight.embarkOnQuest();
            // Resto de la lógica
        } catch (QuestFailedException e) {
            // Manejo de la excepción
        }
    }
}
