package Ejercicio8_ToDoItem;

import java.time.Duration;

public class Finished extends State{
	public Finished() {
		
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getInicio(), item.getFin());
	}
	
	public void addComment(ToDoItem item, String comment) {
		
	}
}
