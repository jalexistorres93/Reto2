public class ZapatosArtesanal extends Zapatos {
    private final static int TAMAÑO = 40;

    private int tamaño;

    public ZapatosArtesanal (){
        tamaño = TAMAÑO;
    }

    public ZapatosArtesanal (int tamaño){
        this.tamaño = tamaño;
    }

    public ZapatosArtesanal (String marca, String tipo_material, double precioBase, int tamaño){
        super(marca, tipo_material, precioBase);
        this.tamaño = tamaño;
    }

    public double calcularPrecio(){
        double precioFinal = super.calcularPrecio();
            if (tamaño < 40){
                precioFinal += 10000;
            }else{
                precioFinal += 4500;
            }
            return precioFinal;
}}
