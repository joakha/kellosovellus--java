import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Kello {

    public static void main(String[] args) throws InterruptedException {
        
        Ikkuna ikkuna = new Ikkuna();
        AikaKentta kentta = new AikaKentta();
        Viikonpaivakentta viikonpaivakentta = new Viikonpaivakentta();
        PvmKentta pvmKentta = new PvmKentta();

        ikkuna.add(kentta);
        ikkuna.add(viikonpaivakentta);
        ikkuna.add(pvmKentta);
        ikkuna.setVisible(true);

        SimpleDateFormat formaatti = new SimpleDateFormat("HH.mm.ss a");

        while (true) {

            Date paivamaara = new Date();
            kentta.setText(formaatti.format(paivamaara.getTime()));

            LocalDate pvm = LocalDate.now();
            String teksti = "";
            teksti += pvm.getDayOfMonth() + "." + pvm.getMonthValue() + "." + pvm.getYear();
            pvmKentta.setText(teksti);

            DayOfWeek viikonpaiva = pvm.getDayOfWeek();
            String viikonpaivamerkkijono = viikonpaiva.name();
            viikonpaivakentta.setText(viikonpaivamerkkijono);

            Thread.sleep(1000);

        }

    }
    
}
