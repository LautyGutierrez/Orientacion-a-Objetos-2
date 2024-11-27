package Ejercicio8_ToDoItem;

import java.time.LocalDateTime;

public class Paused extends State{
	public Paused() {
		
	}
	
	public void togglePause(ToDoItem item) {
		item.setEstado(new InProgress());
	}
	
	public void finish(ToDoItem item) {
		item.setEstado(new Finished());
		item.setFin(LocalDateTime.now());
	}
}
