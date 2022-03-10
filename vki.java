package KontrolYapilari;
import java.util.Scanner;

// kullanıcıdan alınan değerlere göre vücut kitle endeksini hesaplayın.
// vke = kilo(kg)/((boy(cm)/100)^2)

public class vki {
    public static void main(String[] args) {

        int boy = 0;
        double kilo =0;
        Scanner bilgiler = new Scanner(System.in);

        System.out.print("Boy(cm): ");
        boy= bilgiler.nextInt();

        System.out.print("Kilo(kg): ");
        kilo = bilgiler.nextInt();


        double cmToMetre = boy/100d;   //????????
        double boyunKaresi = Math.pow(cmToMetre,2);
        double vki = kilo / boyunKaresi;

        System.out.print("Vücut Kitle İndeks: ");

        if (vki<15 || vki == 15){
            System.out.println(vki + " Çok ciddi derecede düşük kilo");
        }else if (vki>15 && vki<=16){
            System.out.println(vki + " Ciddi derecede düşük kilo");
        }else if (vki> 16 && vki<=18.5){
            System.out.println(vki + " Düşük kilo");
        }else if (vki>18.5 && vki<= 25){
            System.out.println(vki + " Normal kilo");
        }else if (vki>25 && vki<= 30){
            System.out.println(vki + " Fazla Kilolu");
        }else if (vki>30 && vki<= 35){
            System.out.println(vki + " 1.dereceden obez");
        }else if (vki>35 && vki <=40){
            System.out.println(vki + " 2.dereceden obez");
        }else if (vki>40){
            System.out.println(vki + " 3.dereceden obez");
        }


        // neden switch-case kullanmadık??
        // 1- virgüllü sayılarda kullanılmaz.
        // 2- switch-case yapılarında aralık belirtemeyiz.


    }

}
