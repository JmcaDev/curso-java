public class Engine {
    public void start(){
        System.out.println("Motor encendido");
    }

    public void start(boolean silentMode){
        if(silentMode){
            System.out.println("Motor encendido en modo silencioso");
        }else{
            System.out.println("Motor encendido");
        }
    }
}
