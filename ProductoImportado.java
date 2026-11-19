
public class ProductoImportado extends ItemFacturable {

    private static final double TASA_IMPUESTO = 0.21;


    public ProductoImportado(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return precioBase * TASA_IMPUESTO;
    }
}
