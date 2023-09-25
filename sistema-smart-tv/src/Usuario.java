public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal( 7);

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(15);
        
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);


    }
}
