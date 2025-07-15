package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class CondicionRegular implements EstadoCondicion {


    @Override
    public Puntaje getPuntaje() {
        return new PuntajeSimple(0);
    }
    @Override
    public String getCondicion() {
        return "Regular condicion";
    }
}
