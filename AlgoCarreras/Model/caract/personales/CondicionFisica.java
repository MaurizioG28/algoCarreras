package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class CondicionFisica extends Personales {

    private EstadoCondicion estado;


    public CondicionFisica(EstadoCondicion estado) {
        this.estado = estado;
    }

    public void cambiarEstado(EstadoCondicion estado) {
        this.estado = estado;
    }

    @Override
    public Puntaje getPuntaje() {
        return estado.getPuntaje();
    }

    public String getNombre() {
        return estado.getCondicion(); // Delegación al estado actual
    }

    public void afectar(Personales caracteristica) {
        caracteristica.afectar(this);
    }
    public boolean estaEnCondicionExcelente() {
        return estado instanceof CondicionExcelente;
    }


}

