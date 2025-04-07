package Pack1;

import Pack2.FabricaAbstracta;

public class FabricaProductor {

	public static FabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();

		} else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}

		return null;
	}

}
