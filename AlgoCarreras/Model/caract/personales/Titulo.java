package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;


public class Titulo extends Personales {

    private String titulo;

    public Titulo(String titulo) {
        this.nombre = "Titulo";
        this.titulo = titulo;
    }


    @Override
    public Puntaje getPuntaje() {
        return new PuntajeSimple(2);
    }


    public void afectar(Personales caracteristica) {
        caracteristica.afectar(this);
    }
    @Override
    public boolean esTitulo() {
        return true;
    }

}
