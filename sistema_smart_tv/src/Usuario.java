public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.startus();

        smartTv.aumetarVolume();
        
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();

        smartTv.startus();

        
        smartTv.deminuirVolume();
        smartTv.startus();
        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.startus();
        smartTv.aumentaCanal();
        smartTv.aumentaCanal();
        smartTv.aumentaCanal();
        smartTv.diminuirCanal();
        smartTv.startus();
        smartTv.mudarcanal(18);
        smartTv.startus();
       /* System.out.println("tv ligada ? "+ smartTv.ligada);
        System.out.println("canal atual: "+ smartTv.canal);
        System.out.println("volume atual: "+ smartTv.volume);*/
        smartTv.ligar();
        System.out.println("novo startus=> tv ligada ? "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo startus=> tv ligada ? "+ smartTv.ligada);

        

    }
}
