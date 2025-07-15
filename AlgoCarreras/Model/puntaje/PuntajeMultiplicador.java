package AlgoCarreras.Model.puntaje;

public class PuntajeMultiplicador  extends Puntaje{
    private double factorMultiplicador;

    public PuntajeMultiplicador(double valor, double factorMultiplicador){
        this.factorMultiplicador = factorMultiplicador;
        this.valor = valor;
    }

    public double FactorMultiplicador() {
        return factorMultiplicador;
    }


    public Puntaje sumarCon(Puntaje puntaje) {
        return puntaje.sumarCon(this);
    }


    public Puntaje sumarCon(PuntajeSimple otroPuntaje) {
        return new PuntajeMultiplicador(this.valor + otroPuntaje.getValor(), this.factorMultiplicador);
    }


    public Puntaje sumarCon(PuntajeMultiplicador otroPuntaje) {
        return new PuntajeMultiplicador(this.valor + otroPuntaje.getValor(), this.factorMultiplicador + otroPuntaje.FactorMultiplicador());
    }
    public double calcular(){
        return (this.valor * this.factorMultiplicador);
    }
}
