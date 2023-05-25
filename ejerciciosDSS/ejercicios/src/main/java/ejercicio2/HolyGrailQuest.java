package ejercicio2;

public class HolyGrailQuest implements Quest {
	
	public HolyGrailQuest() { /*...*/ }

	public Object embark() throws QuestFailedException {
		// Do whatever it means to embark on a quest
		return new HolyGrail();
	}
}
