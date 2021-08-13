public class ZapatosNacional extends Zapatos {
    private final static String REGION = "Cundinamarca";

    private String region;

    public ZapatosNacional (){
        region = REGION;
    }

    public ZapatosNacional (String region){
        this.region = region;
    }

    public ZapatosNacional (String marca, String tipo_material, double precioBase, String region){
        super(marca, tipo_material, precioBase);
        this.region = region;
    }

    public double calcularPrecio(){
        double precioFinal = super.calcularPrecio();
            if (region.equals("Cundinamarca")){
                precioFinal += 10000;
            }
            return precioFinal;
    }



}
