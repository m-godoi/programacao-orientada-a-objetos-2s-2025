package sistema_radar;

public class Simulacao{
    public static void main(String[] args) {
        Carro Etios = new Carro("PBD3565",0,2018,"sim");
        

        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(Etios);

        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.setVelocidade(-60);
        radar.avaliarVelocidade(Etios);
    }
}
