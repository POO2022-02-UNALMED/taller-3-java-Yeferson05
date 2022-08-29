package taller3.televisores;

public class Control {
	TV tv;
	
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff () {
		tv.estado = false;
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canalp) {
		tv.setCanal(canalp);
	}
	public void enlazar(TV televi) {
		this.tv = televi;
		
	}
	public void seTv (TV tv) {
		this.tv = tv;
	}
	public TV getTv () {
		return tv;
	}
}
