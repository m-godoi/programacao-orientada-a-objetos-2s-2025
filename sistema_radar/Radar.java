package sistema_radar;

public class Radar {
    public String localizacao;
    public Integer LimiteVelocidade;

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade Observada: "+velocidadeObservada);
        System.out.println("Localização: "+this.localizacao);
        System.out.println("Velocidade da via: "+this.LimiteVelocidade);

    }
     public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.LimiteVelocidade){
            emitirNotificacao(carro.placa, carro.velocidade);
        }
     }
}
