public class App {
    public static void main(String[] args) throws Exception {
        Zapatos zapatos[]=new Zapatos[5];
            zapatos[0]=new Zapatos("Arturo", "Cuero", 5000);
            zapatos[1]=new ZapatosNacional("Valle");
            zapatos[2]=new ZapatosArtesanal(42);
            zapatos[3]=new Zapatos();
            zapatos[4]=new ZapatosNacional("Cundinamarca");
            
            Factura4 solucion = new Factura4(zapatos);
            solucion.mostrarTotales();
    }
}
