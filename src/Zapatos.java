public class Zapatos {
    private final static String MARCA = "Arturo";
    private final static String TIPO_MATERIAL = "Cuero";
    private final static double PRECIO_BASE = 10000;

    private String marca; 
    private String tipo_material; 
    private Double precioBase;

    public Zapatos (){
        marca = MARCA;
        tipo_material = TIPO_MATERIAL;
        precioBase = PRECIO_BASE;
    }

    public Zapatos (String marca){
        this.marca = marca;
        tipo_material = TIPO_MATERIAL;
        precioBase = PRECIO_BASE;
    }

    public Zapatos (String marca, String tipo_material, double precioBase){
        this.marca = marca;
        this.tipo_material = tipo_material;
        this.precioBase = precioBase;
    }

    public double calcularPrecio(){
        double precioFinal = precioBase;
            if (marca.equals("Arturo")){
                precioFinal = precioFinal+ (precioFinal * 0.75);
            }else{
                precioFinal = precioFinal + (precioFinal * 0.2);
            }
            if (tipo_material.equals("Cuero")){
                if ((precioFinal - 5000)>0){
                    precioFinal = precioFinal - 5000;
                    return precioFinal;
                }else{
                    return precioFinal;
                }
            }else{
                if ((precioFinal - 500)>0){
                    precioFinal = precioFinal - 500;
                    return precioFinal;
                }else{
                    return precioFinal;
                }
            }        
    }

}
