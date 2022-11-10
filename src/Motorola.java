public class Motorola extends Celular{

    private String versionAndroid;

    public Motorola(String modelo, int imei, String versionAndroid) {
        super(modelo, imei);
        this.versionAndroid = versionAndroid;
    }

    @Override
    public String toString() {
        return "Motorola{" +
                "versionAndroid='" + versionAndroid + '\'' +
                '}';

    }

    @Override
    public void perderBateria(){
        this.setBateria(this.getBateria() - 0.25);
        System.out.println("Soy el celular " + this.getModelo() + "perdi bateria y ahora me queda" + this.getBateria());
    }

}
