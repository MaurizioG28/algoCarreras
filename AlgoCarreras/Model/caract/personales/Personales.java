package AlgoCarreras.Model.caract.personales;


import AlgoCarreras.Model.caract.Caracteristicas;

public abstract class Personales extends Caracteristicas {
    protected String nombre;


    public void afectar(Caracteristicas caracteristica) {

    }
    public void afectar(Titulo titulo) {
        // Nada por defecto
    }

    public void afectar(Experiencia experiencia) {
        // opcional
    }

    public void afectar(CondicionFisica condicionFisica) {
        // opcional
    }
}

