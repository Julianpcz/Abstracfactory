package Pack3;

import Pack2.IConexionBD;

public class ConexionOracle implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conecto a Google");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Google");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}