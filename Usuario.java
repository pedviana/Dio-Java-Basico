public class Usuario {
    public static void main(String[] args) throws Exception {
     
        SmartTv smartTv = new SmartTv ();

        System.out.println("TV ligada?" + smartTv.ligada);
        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);


        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;
        System.out.println("Volume atual:" + smartTv.volume);


        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();;
        System.out.println("canal atual:" + smartTv.canal);

      
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    }
}
