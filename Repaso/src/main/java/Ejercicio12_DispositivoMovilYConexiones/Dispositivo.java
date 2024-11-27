package Ejercicio12_DispositivoMovilYConexiones;

public class Dispositivo {
	private Ringer ringer;
	private Display display;
	private CRC_Calculator crcCalculator;
	private Connection connection;
	
	public Dispositivo(Ringer ringer, Display d, CRC_Calculator crc, Connection c) {
		this.ringer = ringer;
		this.display = d;
		this.crcCalculator = crc;
		this.connection = c;
	}
	
	public void setCRC(CRC_Calculator crc) {
		this.crcCalculator = crc;
	}
	
	public void setConnection(Connection c) {
		this.connection = c;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
}
