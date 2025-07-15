package AlgoCarreras.Model;

import AlgoCarreras.Model.caract.Caracteristicas;
import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeMultiplicador;
import AlgoCarreras.Model.puntaje.PuntajeSimple;
import AlgoCarreras.Model.puntaje.Puntuable;

import java.util.ArrayList;
import java.util.Collection;

public class Auto implements Puntuable {

    private Piloto piloto;
    private Collection<Caracteristicas> caracteristicas = new ArrayList();

    public Auto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void cambiarPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public Puntaje getPuntaje() {

        Puntaje puntaje = new PuntajeSimple(0);
        for(Caracteristicas caracteristica : caracteristicas){
            puntaje = puntaje.sumarCon(caracteristica.getPuntaje());
        }
        puntaje = puntaje.sumarCon(piloto.getPuntaje());
        double factor = 1.0;

        if (this.piloto.cantidadDeTitulos() > 3) {
            factor *= 1.10;
        }

        if (this.piloto.tieneCondicionExcelente()) {
            factor *= 2.0;
        }
        puntaje = new PuntajeMultiplicador(puntaje.getValor(), factor);
        return puntaje;
    }

    public void agregarCaracteristica(Caracteristicas nuevaCaracteristica) {
        for(Caracteristicas caracteristica : caracteristicas) {
            caracteristica.afectar(nuevaCaracteristica);
        }
        this.caracteristicas.add(nuevaCaracteristica);
    }
}
