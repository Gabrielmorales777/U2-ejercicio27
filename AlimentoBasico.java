
public class AlimentoBasico extends ItemFacturable {

    private static final double TASA_IMPUESTO = 0.05;


    public AlimentoBasico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return precioBase * TASA_IMPUESTO;
    }
}
