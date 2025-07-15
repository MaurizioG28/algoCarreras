package AlgoCarreras.Model.puntaje;

public class PuntajeSimple  extends Puntaje{

    public PuntajeSimple(double valor) {
        this.valor = valor;
    }


    public Puntaje sumarCon(Puntaje puntaje) {
        return puntaje.sumarCon(this);
    }


    public Puntaje sumarCon(PuntajeSimple otroPuntaje) {
        return new PuntajeSimple(this.valor + otroPuntaje.getValor());
    }


    public Puntaje sumarCon(PuntajeMultiplicador otroPuntaje) {
        return new PuntajeMultiplicador(this.valor + otroPuntaje.getValor(),otroPuntaje.FactorMultiplicador());
    }

    @Override
    public double calcular() {
        return this.getValor();
    }
}
