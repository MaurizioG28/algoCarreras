package AlgoCarreras.Model.caract;

import AlgoCarreras.Model.puntaje.Puntuable;

public  abstract class Caracteristicas implements Puntuable, Afectable {

    public abstract void afectar(Caracteristicas unaCaracteristica);
    public boolean esTitulo() {
        return false;
    }
}
