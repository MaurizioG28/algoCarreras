package AlgoCarreras.Model.caract.tecnicas;

import AlgoCarreras.Model.caract.personales.Personales;
import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class Peso extends Tecnicas {
    private int peso;

    public Peso(int peso) {
        this.peso = peso;
        this.nombre = "Peso";
    }


    @Override
    public Puntaje getPuntaje() {
        if(peso < 900){
            return new PuntajeSimple(5);
        } else if(peso >= 900 && peso < 1000){
            return new PuntajeSimple(3);
        }
        return new PuntajeSimple(0);
    }

    public void afectar(Personales caracteristica) {
        caracteristica.afectar(this);
    }
}
