class Factura4 {
    Zapatos [] lista;

    public Factura4(Zapatos lista []){
        this.lista = lista;
    }

    public void mostrarTotales(){
        double totalZapatos = 0;
        double totalZapatosNacional = 0;
        double totalZapatosArtesanal = 0;

        for (Zapatos zapatos : lista){
            double precio = zapatos.calcularPrecio();
            totalZapatos += precio;

            if (zapatos.getClass() == ZapatosNacional.class){
                totalZapatosNacional += precio;
            }else if(zapatos.getClass() == ZapatosArtesanal.class){
                totalZapatosArtesanal += precio;
            }
        }
        System.out.println("El precio total de los zapatos es de " + totalZapatos);
        System.out.println("La suma del precio de los ZapatosNacional es de " + totalZapatosNacional);
        System.out.println("La suma del precio de los ZapatosArtesanal es de " + totalZapatosArtesanal);
    }
}
