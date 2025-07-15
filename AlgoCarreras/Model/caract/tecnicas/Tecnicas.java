package AlgoCarreras.Model.caract.tecnicas;

import AlgoCarreras.Model.caract.personales.CondicionFisica;
import AlgoCarreras.Model.caract.personales.Experiencia;
import AlgoCarreras.Model.caract.personales.Titulo;
import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.caract.Caracteristicas;


public abstract class Tecnicas extends Caracteristicas {

    protected String nombre;


    public void afectar(Caracteristicas caracteristica) {

    }
    public void afectar(Velocidad velocidad) {
        // Nada por defecto
    }

    public void afectar(Peso peso) {
        // opcional
    }

    public void afectar(CondicionFisica condicionFisica) {
        // opcional
    }

}
