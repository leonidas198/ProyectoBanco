
public class Cliente {
	private String nombre;
	private int monto;
	public Cliente(String nom) {
		nombre = nom;
		monto = 0;
	}
	public void depositar(int m) {
		monto+=m;
	}
	public void extraer(int m) {
		monto-=m;
	}
	public int retonarMonto() {
		return monto;
	}
	public void imprimir() {
		System.out.println(nombre+" tiene depositado la suma de "+monto);
	}
	

}
