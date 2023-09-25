import java.util.HashSet;
import java.util.Set;

public class ReprodutorMusical implements InterfaceMusic {
    private Set<Musica> playList;
    private boolean reproduzindo;


    public ReprodutorMusical() {
        this.playList = new HashSet<>();
        this.reproduzindo = false;
    }

    public void adcionarMusica(String nome, String cantor){
        if(!playList.isEmpty()){
            playList.add(new Musica(nome, cantor));
        }
    }
    public void removerMusica(String nome){
        Set<Musica> removeMusica = new HashSet<>();
        if(!playList.isEmpty()){
            for(Musica m : playList){
                if(m.getNome() == nome){
                    removeMusica.add(m);
                    break;
                }
            }
            
        }
        playList.removeAll(removeMusica);
    }
    public Set<Musica>  selecionarMusica(String nome){
        Set<Musica> selecionaMusica = new HashSet<>();
        if(!playList.isEmpty()){
            for(Musica m : playList){
                if(m.getNome().startsWith(nome)){ //O método startswith pega tudo que tenha dentro do especificado
                    selecionaMusica.add(m);
                    this.reproduzindo = true;
                }
            }
        }
        return selecionaMusica;
    }
    public boolean pausarMusica(String nome){
        if(!playList.isEmpty()){
            for(Musica m : playList){
                if(m.getNome().startsWith(nome)){ //O método startswith pega tudo que tenha dentro do especificado
                    this.reproduzindo = false;
                }
            }
        } 

        return this.reproduzindo;
    }
    public boolean tocarMusica(String nome){
        if(!playList.isEmpty()){
            for(Musica m : playList){
                if(m.getNome().startsWith(nome)){ //O método startswith pega tudo que tenha dentro do especificado
                    this.reproduzindo = true;
                }
            }
        }
        return this.reproduzindo;

    }

    
}
