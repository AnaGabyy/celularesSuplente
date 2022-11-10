public class Main {
    public static void main(String[] args) {

        Persona Juliana = new Persona("Juliana", "1234567", "Mujer");
        Persona Catalina = new Persona("Juliana", "7654321", "Mujer");

        Motorola CelularJuliana = new Motorola("Motorola U9", 123, "1.4.5");
        Iphone CelularCatalina = new Iphone("Iphone 8", 456, "3.4.5");

        //Juliana.usaCelular(CelularJuliana);
        //Catalina.usaCelular(CelularCatalina);
        //CelularCatalina.perderBateria();
        //CelularJuliana.perderBateria();

        Juliana.hacerLLamada(CelularJuliana, CelularCatalina, Catalina);

    }
}
