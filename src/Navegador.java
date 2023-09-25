public class Navegador implements InterfaceNavegarNaInternet{
    private int abas;

    public Navegador() {
        this.abas = 1;
    }

    @Override
    public void exibirPag(String url) {
        System.out.println("Exibindo pag");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
       System.out.println("nova Aba");
       this.abas = abas + 1;
    }
    @Override
    public void atualizarPag() {
        System.out.println("Atualizando");
    }
    public void fecharAba(){
        if(this.abas > 0){
            this.abas = abas - 1;
        }
    }

    
}
