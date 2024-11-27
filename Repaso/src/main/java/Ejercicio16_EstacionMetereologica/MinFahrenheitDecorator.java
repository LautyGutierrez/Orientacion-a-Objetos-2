package Ejercicio16_EstacionMetereologica;

public class MinFahrenheitDecorator extends WeatherDecorator{
	public MinFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Minima F: " + this.getTemperaturaMinima() + "\n";
	}
}
