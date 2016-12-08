
class Zodiacal {

    String nombre, leo, cancer, virgo, sagitario;
    String capricornio, aries, acuario, piscis;
    String geminis, escorpio, libra, tauro;
    int dia, mes;

    String setNombre(String n) {
        nombre = n;
        return n;
    }

    boolean setDia(int d) {
        if (d >= 0) {
            dia = d;
            return true;
        } else {
            return false;
        }
    }

    boolean setMes(int m) {
        if (m >= 0) {
            mes = m;
            return true;
        } else {
            return false;
        }
    }

    String getNombre() {
        return nombre;
    }

    int getDia() {
        return dia;
    }

    int getMes() {
        return mes;
    }

    String getAries() {
        return aries = "Cuidado este año corres peligro :v";
    }

    String getAcuario() {
        return acuario = "No esperes a que pase algo, tu hazlo";
    }

    String getPiscis() {
        return piscis = "Exenta al de alado";
    }

    String getLeo() {
        return leo = "Procura no enojarte, y ve siempre el lado bueno de las cosas :v";
    }

    String getGeminis() {
        return geminis = "Procura pensar bien tus desiciones que podrian afectar el restu de tu vida";
    }

    String getEscorpio() {
        return escorpio = "Procura expresarte correctamente podrian mal interpretarte";
    }

    String getLibra() {
        return libra = "Ve hacia adelante y nunca mires atras";
    }

    String getTauro() {
        return tauro = "Tu semana estara un poco pesada tu puedes :v";
    }

    String getcancer() {
        return cancer = "Hoy el profe te exentara verdad? a y esta semana es muy importante para ti";
    }

    String getCapricornio() {
        return capricornio = "vive la vida como vives tus sueños";
    }

    String getVirgo() {
        return virgo = "Esta semana esta llena de exitos para ti";
    }

    String getSagitario() {
        return sagitario = "vive cada momento como si fuera el ultimo";
    }
}
