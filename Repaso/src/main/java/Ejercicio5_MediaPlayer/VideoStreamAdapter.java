package Ejercicio5_MediaPlayer;

public class VideoStreamAdapter extends Media{
	private VideoStream adaptee;
	
	public VideoStreamAdapter(VideoStream adaptee) {
		this.adaptee = adaptee;
	}
	
	public void play() {
		this.adaptee.reproduce();
	}
}
