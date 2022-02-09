package Entidad;

public class Direccion {

	private String tipoVia;
	private String nombreVia; 
	private String cogigoPostal;
	private String pais;
	private String Cuidad;
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public String getCuidad() {
		return Cuidad;
	}
	public void setCuidad(String cuidad) {
		Cuidad = cuidad;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCogigoPostal() {
		return cogigoPostal;
	}
	public void setCogigoPostal(String cogigoPostal) {
		this.cogigoPostal = cogigoPostal;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cogigoPostal=" + cogigoPostal
				+ ", pais=" + pais + "]";
	}
	
	
	
}
