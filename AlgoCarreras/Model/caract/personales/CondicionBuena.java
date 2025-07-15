package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class CondicionBuena implements EstadoCondicion{

    @Override
    public Puntaje getPuntaje() {
        return new PuntajeSimple(5);
    }
    @Override
    public String getCondicion() {
        return "Buena condicion";
    }
}
