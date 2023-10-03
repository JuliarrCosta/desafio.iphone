public class Telefone implements InterfaceAparelhoTelefonico{
    private boolean statusLigacao;

    public Telefone() {
        this.statusLigacao = false;
    }

    @Override
    public void atender() {
        System.out.println("Atender");
        this.statusLigacao = true;
        
    }

    @Override
    public void iniciarCorreioDeVoz() {
        if(this.statusLigacao == false){
            System.out.println("Iniciando Correio de Voz");
        }
        
    }

    @Override
    public void ligar(int numero) {
        if(this.statusLigacao == true){
            System.out.println("Colocando em conferencia");
        }else{
            System.out.println("Ligando para: " + numero);
        }
    }
    
}
