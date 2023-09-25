import java.util.Random;

public class Iphone {
    
    private int ipv4;
    private boolean conexaoInternet;

    private String numeroTelefone;
    private boolean chipTelefone;

    private String nomeUsuario;
    private  boolean aparelhoLigado;

    private int volume;

    private ReprodutorMusical reprodutorInstalado;
    private Telefone telefoneInstalado;
    private Navegador navegadorInstalado;
   
    Random random = new Random();

    public Iphone(String num, String nome) {
        
        this.ipv4 = random.nextInt(10);
        this.numeroTelefone = num;
        this.nomeUsuario = nome;

        this.conexaoInternet = true;
        this.chipTelefone = true;
        this.aparelhoLigado = true;
        this.volume = 20;

        this.reprodutorInstalado = new ReprodutorMusical();
        this.navegadorInstalado = new Navegador();
        this.telefoneInstalado = new Telefone();

    }
    public void mostrarDados(){
        System.out.println("Nome: " + this.nomeUsuario);
        System.out.println("Númeor: " + this.numeroTelefone);
    }
    public void desligar(){
        if(this.aparelhoLigado == true){
            this.aparelhoLigado = false;
        }
    }

    public void colocarNoModoAviao(){
        if(this.aparelhoLigado == true){
            this.conexaoInternet = false;
            this.chipTelefone = false;
        }
    }
    public int aumentarVolume(){
        if(this.volume <= 100){
            this.volume = this.volume + 5;
        }else{
            System.out.println("Volume máximo");
        }
        return this.volume;
    }

    public int diminuirVolume(){
        if(this.volume > 0){
            this.volume = this.volume - 5;
        }else if(this.volume == 0){
            System.out.println("Modo silencioso ativado");
        }
        return this.volume;
    }

    public void baixarMusica(String nome, String cantor){
        reprodutorInstalado.adcionarMusica(nome, cantor);
    }

    public void apagarMusica(String nome){
        reprodutorInstalado.removerMusica(nome);
    }

    public void selecionarMusica(String nome){
        reprodutorInstalado.selecionarMusica(nome);
    }

    public void pausar(String nome){
        reprodutorInstalado.pausarMusica(nome);
    }
    public void play(String nome){
        reprodutorInstalado.tocarMusica(nome);
    } 
    public void exibirPag(String url){
        if(this.conexaoInternet == true && this.aparelhoLigado == true){
            navegadorInstalado.exibirPag(url);
            System.out.println("Recebendo dados no endereco: " + ipv4);
        }

    }
    public void adicionarNovaAba(){
        if(this.aparelhoLigado == true){
            navegadorInstalado.adicionarNovaAba();
        }

    }
    public void atualizarPag(){
        if(this.aparelhoLigado == true){
            navegadorInstalado.atualizarPag();
        }
        
    }
    public void fecharAba(){
        if(this.aparelhoLigado == true){
            navegadorInstalado.fecharAba();
        }
        
    }
    public void ligar(int numero){
        if(this.aparelhoLigado ==true && this.chipTelefone == true){
            telefoneInstalado.ligar(numero);
        }

    }
    public void atender(){
        if(this.aparelhoLigado ==true && this.chipTelefone == true){
            telefoneInstalado.atender();
        }

    }
    public void iniciarCorreioDeVoz(){
        if(this.aparelhoLigado ==true){
            telefoneInstalado.iniciarCorreioDeVoz();
        }
    }
    
}