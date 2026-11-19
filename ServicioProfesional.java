
public class ServicioProfesional extends ItemFacturable {

    private static final double TASA_IMPUESTO = 0.10;


    public ServicioProfesional(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return precioBase * TASA_IMPUESTO;
    }
}
