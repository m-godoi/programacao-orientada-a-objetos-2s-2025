package sistema_radar;

public class Simulacao{
    public static void main(String[] args) {
        Carro Etios = new Carro();
        Etios.ano = 2018;
        Etios.modelo = "lindo";
        Etios.placa = "PBD3565";
        Etios.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistão Sul";
        radar.LimiteVelocidade = 60;

        radar.avaliarVelocidade(Etios);

        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();
        Etios.acelerar();

        radar.avaliarVelocidade(Etios);
    }
}
