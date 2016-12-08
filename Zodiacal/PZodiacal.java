/*1 PZodiacal.java 
2 Instituto Tecnoliogico de Leon
3 Ingenieria en Sistemas Computacionales
4 Fundamentos de Programacion
5 Alumno: Rafael Sanjenis Garduño
6 Tarea #:39
 */
import java.io.*;
import cstio.*;

class PZodiacal {

    Zodiacal obj = new Zodiacal();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    int n1, n2, n3;

    void inicio() {
        p.out("Bienvenido Al Programa Zodiacal \n");
        p.setVisible(true);
    }

    void datos(Zodiacal z) {
        String dat;

        dat = d.readString("Cual Es  Su nombre: ");
        z.setNombre(dat);
        do {
            dat = d.readString("Ingrese El Dia Que nacio:");
        } while (!isNum(dat));
        z.setDia(Integer.parseInt(dat));
        do {
            dat = d.readString("Ingrese el mes que nacio: ");
        } while (!isNum(dat));
        z.setMes(Integer.parseInt(dat));

    }

    void resultados() {
        int m, d;
        m = obj.getMes();
        d = obj.getDia();
        System.out.println(obj.getNombre());
        switch (m) {
            case 1:
                // Enero
                if (d >= 21) {
                    System.out.println("Acuario");
                    System.out.println(obj.getAcuario());
                    p.ofoto("Acuario.jpg");
                } else {
                    System.out.println("Capricornio");
                    System.out.println(obj.getCapricornio());
                    p.ofoto("capricornio.jpg");
                }
                break;
            case 2: ;
                // Febrero
                if (d >= 20) {
                    System.out.println("Piscis");
                    System.out.println(obj.getPiscis());
                    p.ofoto("piscis-PISCIS.jpg");
                } else {
                    System.out.println("Acuario");
                    System.out.println(obj.getAcuario());
                    p.ofoto("Acuario.jpg");
                }
                break;
            case 3:
                // Marzo
                if (d >= 21) {
                    System.out.println("Aries");
                    System.out.println(obj.getAries());
                    p.ofoto("aries-symbol.jpg");
                } else {
                    System.out.println("Piscis");
                    System.out.println(obj.getPiscis());
                    p.ofoto("piscis-PISCIS.jpg");
                }
                break;
            case 4:
                // Abril
                if (d >= 21) {
                    System.out.println("Tauro");
                    System.out.println(obj.getTauro());
                    p.ofoto("tauro.jpg");
                } else {
                    System.out.println("Aries");
                    System.out.println(obj.getAries());
                    p.ofoto("aries-symbol.jpg");
                }
                break;
            case 5:
                // Mayo
                if (d >= 20) {
                    System.out.println("Geminis");
                    System.out.println(obj.getGeminis());
                    p.ofoto("geminis-y-la-amistad.jpg");
                } else {
                    System.out.println("Tauro");
                    System.out.println(obj.getTauro());
                    p.ofoto("tauro.jpg");
                }
                break;
            case 6:
                // Junio
                if (d >= 22) {
                    System.out.println("Cancer");
                    System.out.println(obj.getcancer());
                    p.ofoto("cancer.jpg");
                } else {
                    System.out.println("Geminis");
                    System.out.println(obj.getGeminis());
                    p.ofoto("geminis-y-la-amistad.jpg");
                }
                break;
            case 7:
                // Julio
                if (d >= 22) {
                    System.out.println("Leo");
                    System.out.println(obj.getLeo());
                    p.ofoto("102-leo_350.jpg");
                } else {
                    System.out.println("Cancer");
                    System.out.println(obj.getcancer());
                    p.ofoto("cancer.jpg");
                }
                break;
            case 8:
                // Agosto
                if (d >= 24) {
                    System.out.println("Virgo");
                    System.out.println(obj.getVirgo());
                    p.ofoto("Virgo2.jpg");
                } else {
                    System.out.println("Leo");
                    System.out.println(obj.getLeo());
                    p.ofoto("102-leo_350.jpg");
                }
                break;
            case 9:
                // septiembre
                if (d >= 22) {
                    System.out.println("Libra");
                    System.out.println(obj.getLibra());
                    p.ofoto("Libra.jpg");
                } else {
                    System.out.println("Virgo");
                    System.out.println(obj.getVirgo());
                    p.ofoto("Virgo2.jpg");
                }
                break;
            case 10:
                // octubre
                if (d >= 23) {
                    System.out.println("Escorpio");
                    System.out.println(obj.getEscorpio());
                    p.ofoto("scorpio2.jpg");
                } else {
                    System.out.println("Libra");
                    System.out.println(obj.getLibra());
                    p.ofoto("Libra.jpg");
                }
                break;
            case 11:
                // noviembre
                if (d >= 23) {
                    System.out.println("Sagitario");
                    System.out.println(obj.getSagitario());
                    p.ofoto("Sagitario2.jpg");
                } else {
                    System.out.println("Escorpio");
                    System.out.println(obj.getEscorpio());
                    p.ofoto("scorpio2.jpg");
                }
                break;
            case 12:
                // Agosto
                if (d >= 24) {
                    System.out.println("Capricornio");
                    System.out.println(obj.getCapricornio());
                    p.ofoto("capricornio.jpg");
                } else {
                    System.out.println("Sagitario");
                    System.out.println(obj.getSagitario());
                    p.ofoto("Sagitario2.jpg");
                }
                break;
        }
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Favor De Teclear Solo Numeros");
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        String resp = "S";
        PZodiacal com = new PZodiacal();
        com.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            com.datos(com.obj);
            com.resultados();
            resp = com.d.readString("Desea Calcular De Nuevo s/n: ");
        }
    }
}
