public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarcanal(int novoCanal){
        canal=novoCanal;
    }

    public void startus(){
        System.out.println("tv ligada ? "+ ligada);
        System.out.println("canal atual: "+ canal);
        System.out.println("volume atual: "+ volume);
    }
    
    public void aumentaCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }


    public void aumetarVolume(){
        volume++;
        System.out.println("novo volume "+ volume);
    } 

    public void deminuirVolume(){
        volume--;
        System.out.println("novo volume "+ volume);
    } 
    public void ligar(){
        ligada= true;
    } 
    public void desligar(){
        ligada= false;
    } 
}