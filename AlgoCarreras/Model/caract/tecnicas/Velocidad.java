package AlgoCarreras.Model.caract.tecnicas;

import AlgoCarreras.Model.caract.personales.Personales;
import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class Velocidad extends Tecnicas {
    private int velocidadMaxima;

    public Velocidad(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = "Velocidad Maxima";
    }


    @Override
    public Puntaje getPuntaje() {
        if(velocidadMaxima > 300){
            return new PuntajeSimple(10);
        } else if(velocidadMaxima >= 250){
            return new PuntajeSimple(5);
        }
        return new PuntajeSimple(0);
    }

    public void afectar(Personales caracteristica) {
        caracteristica.afectar(this);
    }

}
