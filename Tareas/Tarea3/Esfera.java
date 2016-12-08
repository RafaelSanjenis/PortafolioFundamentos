
import cstio.*;


public class Esfera {
	
	Pizarra p = new Pizarra();
    Dialog d = new Dialog();
	String r;
	Atributos Obj1 = new Atributos();
	
	private void inicio() {
		p.out("Hello\n" + "\nAqui Capturaremos El atributo de una esfera navide¤a");
        p.setVisible(true);
	}
	public void datos (Atributos b) {
	
		d.readString("De que color es la esfera");
		b.setC
		d.readString("la esfera brilla");
		b.setB
		String C = (String) Obj1.getC
		d.out("el color es "+C)
	}
	
	   public static void main(String[] args) {
        String resp = "S";
        PruebaNadadores Inicia = new PruebaNadadores();

        Inicia.Inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj1);
            resp = Inicia.d.readString("Deseas Capturar El Numero De Medallas? Si/No: ");
        }

    }
}
  