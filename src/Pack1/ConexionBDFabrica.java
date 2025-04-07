package Pack1;

import Pack2.FabricaAbstracta;
import Pack2.IConexionBD;
import Pack2.IConexionREST;
import Pack3.ConexionMySQL;
import Pack3.ConexionOracle;
import Pack3.ConexionPostgreSQL;
import Pack3.ConexionSQLServer;
import Pack3.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}

