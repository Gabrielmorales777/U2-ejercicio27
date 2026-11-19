
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       
        List<ItemFacturable> items = new ArrayList<>();


        items.add(new ProductoImportado("Notebook", 500000));
        items.add(new ServicioProfesional("Consultoria informatica", 150000));
        items.add(new AlimentoBasico("Leche", 2000));


        double totalFactura = 0;


        System.out.println("==================================");
        System.out.println("       DETALLE DE FACTURACION");
        System.out.println("==================================");

        for (ItemFacturable item : items) {

            System.out.println();

            item.mostrarDetalle();

            totalFactura += item.calcularPrecioFinal();
        }


        System.out.println("\n==================================");
        System.out.println("TOTAL DE LA FACTURA: $" + totalFactura);
        System.out.println("==================================");
    }
}

