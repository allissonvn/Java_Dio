//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartTv tv1 = new SmartTv();

        tv1.ligarTv();
        tv1.aumentarVolume();
        tv1.dimunuirVolume();
        tv1.setVolume(0);
        tv1.dimunuirVolume();
        tv1.setVolume(100);
        tv1.aumentarVolume();

        tv1.passarCanal();
        tv1.voltarCanal();
        tv1.escolherCanal(1);
        tv1.voltarCanal();
        tv1.passarCanal();
        tv1.escolherCanal(101);
        tv1.escolherCanal(0);




    }
}