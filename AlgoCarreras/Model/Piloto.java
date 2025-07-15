package AlgoCarreras.Model;

import AlgoCarreras.Model.caract.Caracteristicas;
import AlgoCarreras.Model.caract.personales.CondicionFisica;
import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeMultiplicador;
import AlgoCarreras.Model.puntaje.PuntajeSimple;
import AlgoCarreras.Model.puntaje.Puntuable;
import AlgoEquipos.model.caracteristica.Caracteristica;
import AlgoEquipos.model.caracteristica.Titulo;

import java.util.ArrayList;
import java.util.Collection;

public class Piloto implements Puntuable {
    private String nombre;
    private Collection<Caracteristicas> caracteristicas = new ArrayList();

    public long cantidadDeTitulos(){
        return caracteristicas.stream()
                .filter(Caracteristicas::esTitulo)
                .count();
    }
    public boolean tieneCondicionExcelente(){
        return caracteristicas.stream()
                .filter(c -> c instanceof CondicionFisica)
                .map(c -> (CondicionFisica) c)
                .anyMatch(cf -> cf.estaEnCondicionExcelente());

    }

    public Piloto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Puntaje getPuntaje(){
        Puntaje puntaje = new PuntajeSimple(0);
        for(Caracteristicas caracteristica : caracteristicas){
            puntaje = puntaje.sumarCon(caracteristica.getPuntaje());
        }
        return puntaje;
    }


    public void agregarCaracteristica(Caracteristicas nuevaCaracteristica) {
        for(Caracteristicas caracteristica : caracteristicas) {
            caracteristica.afectar(nuevaCaracteristica);
        }
        this.caracteristicas.add(nuevaCaracteristica);
    }



}
