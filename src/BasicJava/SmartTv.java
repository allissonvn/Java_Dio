package BasicJava;

public class SmartTv {
//    Vamos criar um exemplo de uma classe para representar uma BasicJava.SmartTv onde:
//    1. Ela tenha as características: ligada(boolean), canal(int) e volume (int)
//    2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//    3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//    4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

//    Caracteristicas da classe: ligada(boolean), canal(int) e volume (int).
    public boolean ligada;
    public int canal;
    public int volume;

//  Contrustor: ligada(false), canal(1) e volume (0)
    public SmartTv() {
        this.ligada = false;
        this.canal = 0;
        this.volume = 0;
    }

//    Getters e Setters
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    Funções: ligarTv, desligarTv:
//    Nossa TV poderá ligar e desligar e assim mudar o estado ligada.

    public void ligarTv(){
        setLigada(true);
        setCanal(1);
        setVolume(50);
    }

    public void desligarTv(){
        setLigada(false);
        setCanal(0);
        setVolume(0);
    }

//    Funções: aumentarVolume, diminuirVolume:
//    Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1

    public void aumentarVolume(){
        if (isLigada()) {
            if (getVolume() < 100){
                volume = getVolume();
                volume++;
                setVolume(volume);
                System.out.println("Volume:"+getVolume()+"%");
            }else {
                System.out.println("Volume já está 100%");
            }
        }else {
            System.out.println("TV está desligada!");
        }
    }
    public void dimunuirVolume(){
        if (isLigada()) {
            if (getVolume() > 0){
                volume = getVolume();
                volume--;
                setVolume(volume);
                System.out.println("Volume:"+getVolume()+"%");
            }else {
                System.out.println("Volume já está 0%");
            }
        }else {
            System.out.println("TV está desligada!");
        }
    }

//    Funções: passarCanal, voltarCanal e escolherCanal:
//    Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

    public void passarCanal(){
        if (isLigada()){
            if (getCanal() < 100){
                canal = getCanal();
                canal++;
                setCanal(canal);
                System.out.println("Canal:"+getCanal());
            }else {
                setCanal(1);
                System.out.println("Canal:"+getCanal());
            }
        }else {
            System.out.println("TV está desligada!");
        }
    }

    public void voltarCanal(){
        if (isLigada()){
            if (getCanal() > 1){
                canal = getCanal();
                canal--;
                setCanal(canal);
                System.out.println("Canal:"+getCanal());
            }else {
                setCanal(100);
                System.out.println("Canal:"+getCanal());
            }
        }else {
            System.out.println("TV está desligada!");
        }
    }

    public void escolherCanal(int novoCanal){
        if (isLigada()){
            if (novoCanal > 0 && novoCanal <= 100 ){
                setCanal(novoCanal);
                System.out.println("Canal:"+getCanal());
            }else {
                System.out.println("Canal Indisponivel");
            }
        }else {
            System.out.println("TV está desligada!");
        }
    }
}
