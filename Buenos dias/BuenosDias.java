
import cstio.Pizarra;
import java.util.*;

public class BuenosDias {

    Calendar calen = Calendar.getInstance();
    Pizarra p = new Pizarra();
    int hora, minutos, segundos, fecha;
    int mes, y;

    void inicio() {
        p.out("Leer E Imprimir Hora Del Dia Con Saludos");
        p.setVisible(true);
    }

    void calculos() {
        hora = calen.get(Calendar.HOUR_OF_DAY);
        minutos = calen.get(Calendar.MINUTE);
        segundos = calen.get(Calendar.SECOND);
        fecha = calen.get(Calendar.DATE);
        mes = calen.get(Calendar.MONTH);
        y = calen.get(Calendar.YEAR);
    }

    void resultados() {
        if (hora < 12) {
            p.out("Buenos Dias!");
            new Dias("Dias.wav");            
        } else if (hora < 19) {
            p.out("Buenas tardes!");
            new Dias("Tardes.wav");
        } else {
            p.out("Buenas Noches!");
            new Dias("Noches.wav");
        }
        p.out("\n Hoy Es: " + fecha + "-" + (mes - 1) + "-" + y);
        p.out(hora + ":" + minutos + ":" + segundos);
    }

    public static void main(String args[]) {
        BuenosDias desp = new BuenosDias();

        desp.inicio();
        desp.calculos();
        desp.resultados();
    }
}
