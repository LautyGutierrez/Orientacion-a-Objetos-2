package Ejercicio16_EstacionMetereologica;

public class GradosCelciusDecorator extends WeatherDecorator{
	public GradosCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura C: " + this.convertirACelcius(this.getTemperatura()) + "\n";
	}
}
