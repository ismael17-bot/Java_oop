
public class Carga {
    private boolean ligado;
    public Carga() {
        ligado = false;
    }
    
    public void ligar() {
        ligado = true;
    }
    
    public void desligar() {
        ligado = false;
    }
    
    public boolean estahLigado() {
        return ligado;
    }
}
