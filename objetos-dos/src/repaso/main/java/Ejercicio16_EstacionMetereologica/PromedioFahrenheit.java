package Ejercicio16_EstacionMetereologica;

public class PromedioFahrenheit extends WeatherDecorator{
	public PromedioFahrenheit(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Promedio F: " + this.getPromedio() + "\n";
	}
}
