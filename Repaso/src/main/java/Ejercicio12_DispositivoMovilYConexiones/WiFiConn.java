package Ejercicio12_DispositivoMovilYConexiones;

public class WiFiConn implements Connection{
	public String sendData(String data, long crc) {
		return "Datos: " + data + "\n" + "CRC: " + crc;
	}
	
	public String pict() {
		return "Simbolo de WiFi";
	}
}