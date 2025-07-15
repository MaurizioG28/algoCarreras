package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class Experiencia extends Personales {

    private int experiencia;

    public Experiencia(int experiencia) {
        this.experiencia = experiencia;
        this.nombre = "Experiencia";
    }


    @Override
    public Puntaje getPuntaje() {
        Puntaje puntaje = new PuntajeSimple(1);
        if(experiencia >= 5){
            return new PuntajeSimple(10);
        } else if(experiencia >= 2){
            return new PuntajeSimple(5);
        }
        return puntaje;
    }

    public void afectar(Personales caracteristica) {
        caracteristica.afectar(this);
    }
}
