package Ejercicio17_ProductosFinancieros;

public class CompraPesos extends ProductoFinanciero{
	private final double valorCompra = 1230;
	
	public CompraPesos() {
		super();
	}
	
	public double retornoInversion(double monto) {
		return monto;
	}
}
