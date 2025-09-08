package sistema_radar;

public class Radar {
    private String localizacao;
    private Integer LimiteVelocidade;

    public Radar(String localizacao, Integer LimiteVelocidade){
            this.localizacao = localizacao;
            this.LimiteVelocidade = LimiteVelocidade;
        }
        public String getLocalizacao(){
            return localizacao;
        }
        public void setLocalizacao(String localizacao){
            this.localizacao = localizacao;
        }
         public Integer getLimiteVelocidade(){
            return LimiteVelocidade;
        }
        public void setLimiteVelocidade(Integer LimiteVelocidade){
            this.LimiteVelocidade = LimiteVelocidade;
        }
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade Observada: "+velocidadeObservada);
        System.out.println("Localização: "+this.getLocalizacao());
        System.out.println("Velocidade da via: "+this.getLimiteVelocidade());

        
    }
     public void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > this.LimiteVelocidade){
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }
     }
}
