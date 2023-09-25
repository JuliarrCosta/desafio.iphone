import java.util.Set;

public abstract interface InterfaceMusic {
    public void adcionarMusica(String nome, String cantor);
    public void removerMusica(String nome);
    public Set<Musica> selecionarMusica(String nome);
    public boolean pausarMusica(String nome);
    public boolean tocarMusica(String nome);
   
    
}
