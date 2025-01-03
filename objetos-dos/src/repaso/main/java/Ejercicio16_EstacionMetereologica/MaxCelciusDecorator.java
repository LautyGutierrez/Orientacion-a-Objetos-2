package Ejercicio16_EstacionMetereologica;

public class MaxCelciusDecorator extends WeatherDecorator{
	public MaxCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Maxima C: " + this.convertirACelcius(this.getTemperaturaMaxima()) + "\n";
	}
}
