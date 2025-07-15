package AlgoCarreras.Model.puntaje;


public  abstract class Puntaje implements Calculable {
    protected double valor;

    public double getValor(){
        return valor;
    }
    public abstract Puntaje sumarCon(Puntaje puntaje);

    public abstract Puntaje sumarCon(PuntajeSimple otroPuntaje);

    public abstract Puntaje sumarCon(PuntajeMultiplicador otroPuntaje);


}
