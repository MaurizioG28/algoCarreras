package AlgoCarreras.Model.caract.personales;

import AlgoCarreras.Model.puntaje.Puntaje;
import AlgoCarreras.Model.puntaje.PuntajeSimple;

public class CondicionExcelente implements EstadoCondicion {


    @Override
    public Puntaje getPuntaje() {
        return new PuntajeSimple(10);
    }
    @Override
    public String getCondicion() {
        return "Excelente condicion";
    }
}
