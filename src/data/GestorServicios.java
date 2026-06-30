package data;
import model.*;
public class GestorServicios {
    public void mostrarServicios() {
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores del Lago Llanquihue", 2, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Sabores del Sur Austral", 4, 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Paseo al atardecer en Lago Llanquihue", 2, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Tour fotográfico del Lago Llanquihue", 3, "Velero");

        ExcursionCultural excursion1 = new ExcursionCultural("Visita al Museo Colonial Aleman", 2, "Museo Colonial Alemán de Frutillar");
        ExcursionCultural excursion2 = new ExcursionCultural("Ruta del patrimonio arquitectónico de Puerto Varas", 6, "Puerto Varas");

        System.out.println(ruta1.toString());
        System.out.println(ruta2.toString());

        System.out.println(paseo1.toString());
        System.out.println(paseo2.toString());

        System.out.println(excursion1.toString());
        System.out.println(excursion2.toString());


    }
}
