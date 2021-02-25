import java.util.ArrayList;

public class Refrigerador {
    protected float temperaturaSelecionada;
    //
    protected Carga ventilador;
    protected SensorDeTemperatura sensorTemperaturaAtual;
    private  float tempArmazena;
    private ArrayList<ListenerRefri> listenerRefris = new ArrayList<>();
    public Refrigerador(){
        ventilador = new Carga();
        sensorTemperaturaAtual = new SensorDeTemperatura();
        tempArmazena= sensorTemperaturaAtual.getTemperaturaAtual();
    }
    //Setter para temperatura (Celsius).
    public void selecionarTemperatura(float temperatura) {
        temperaturaSelecionada = temperatura;
    }

    public void controlarTemperatura() {
        if(sensorTemperaturaAtual.getTemperaturaAtual()!=tempArmazena){
            tempArmazena=sensorTemperaturaAtual.getTemperaturaAtual();
            exeListener();
        }
        if(sensorTemperaturaAtual.getTemperaturaAtual() > temperaturaSelecionada) {
            ventilador.ligar();
        }
        else {
            ventilador.desligar();
        }
    }

    public void addListener(ListenerRefri listenerRefri){
        listenerRefris.add(listenerRefri);
    }

    private void exeListener(){
        for (ListenerRefri listenerRefri : listenerRefris){
            listenerRefri.atualizaTemp(sensorTemperaturaAtual.getTemperaturaAtual());
        }
    }
}












