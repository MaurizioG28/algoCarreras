package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.caract.Caracteristicas;
import AlgoCarreras.Model.puntaje.Puntaje;

public interface EstadoCondicion {
    Puntaje getPuntaje();
    String getCondicion();
}
