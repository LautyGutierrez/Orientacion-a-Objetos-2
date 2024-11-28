package Ejercicio8_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {
	public State() {
		
	}
	
	public void start(ToDoItem item) {
		
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish(ToDoItem item) {
		
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getInicio(), LocalDateTime.now());
	}
	
	public void addComment(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}
}