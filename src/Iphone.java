public class Iphone extends Celular{
    private String versionIos;

    public Iphone(String modelo, int imei, String versionIos) {
        super(modelo, imei);
        this.versionIos = versionIos;
    }


    public String getVersionIos() {
        return versionIos;
    }

    public void setVersionIos(String versionIos) {
        this.versionIos = versionIos;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "versionIos='" + versionIos + '\'' +
                '}';
    }

    @Override
    public void perderBateria(){
        this.setBateria(this.getBateria() - 0.1);
        System.out.println("Soy el celular " + this.getModelo() + "perdi bateria y ahora me queda " + this.getBateria());
    }
}
