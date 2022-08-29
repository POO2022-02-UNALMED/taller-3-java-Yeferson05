package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV = 0;
	
	public TV (Marca marca, boolean estado) {
		numTV ++;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		this.marca = marca;
		this.estado = estado;
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca () {
		return marca;
	}
	public void setControl (Control control) {
		this.control = control;
	}
	public Control getControl () {
		return control;
	}
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	public int getPrecio () {
		return precio;
	}
	public void setVolumen (int volumen) {
		if (estado && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	public int getVolumen () {
		return volumen;
	}
	public void setCanal (int canal) {
		if (estado && canal >= 1 && canal <= 120) {
			this.canal = canal;
		}
	}
	public int getCanal () {
		return canal;
	}
	
	public static void setNumTV (int numTv) {
		numTV = numTv;
	}
	public static int getNumTV () {
		return numTV;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff () {
		this.estado = false;
	}
	public void canalUp() {
		if (getEstado() == true && getCanal()>= 1 && getCanal()<= 120) {
			this.canal++;
		}
	}
	public void canalDown() {
		if (getEstado() == true && getCanal()>= 1 && getCanal()<= 120) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if (estado && volumen < 7) {
			this.volumen+=1;
		}
	}
	public void volumenDown() {
		if (estado && volumen > 0) {
			this.volumen-=1;
		}
	}
	public boolean getEstado () {
		return estado;
	}
	

}