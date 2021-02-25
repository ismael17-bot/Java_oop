import java.util.Random;

public class SensorDeTemperatura extends Thread{
    Random random = new Random();
    private float temperaturaAtual;
    public SensorDeTemperatura(){
        super();//super sempre aqui
        this.start();
    }
    @Override
    public void run() {
        while(true){
            temperaturaAtual=random.nextInt(50)+random.nextFloat();
            try {
                sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public float getTemperaturaAtual() {
        return temperaturaAtual;
    }
}
