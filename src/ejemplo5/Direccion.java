package ejemplo5;
enum Direccion {
    NORTE("N", "Armenia"), SUR("S", "Armenia"),
    ESTE("E", "Pereira"), OESTE("O", "Cali");
    private String abreviacion;
    private String  Ciudad;

    Direccion(String abreviacion, String ciudad) {
        this.abreviacion = abreviacion;
        Ciudad = ciudad;
    }

    public String getAbreviacion() {
        return abreviacion;
    }
    public String getCiudad() {
        return Ciudad;
    }
}
