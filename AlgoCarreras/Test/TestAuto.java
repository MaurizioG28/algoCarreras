package AlgoCarreras.Test;

import AlgoCarreras.Model.Auto;
import AlgoCarreras.Model.Piloto;
import AlgoCarreras.Model.caract.personales.*;
import AlgoCarreras.Model.caract.tecnicas.Peso;
import AlgoCarreras.Model.caract.tecnicas.Velocidad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuto {

    Auto auto;
    Piloto piloto;

    @BeforeEach
    void setUp() {
        piloto = new Piloto("Carlos");
        auto = new Auto(piloto);
    }

    @Test
    @DisplayName("Auto con velocidad mayor a 300km/h")
    void test01autoConVelocidadMayorA300kmH() {
        int velocidad = 350;
        int puntajeEsperado = 10;

         auto.agregarCaracteristica(new Velocidad(velocidad));
        assertEquals(puntajeEsperado,auto.getPuntaje().calcular(),"Puntaje deberia ser 10");
    }

    @Test
    @DisplayName("Auto con Peso 850kg")
    void test02autoConPeso850kg() {
        int valorPesoAuto = 850;
        int puntajeEsperado = 5;

        auto.agregarCaracteristica(new Peso(valorPesoAuto));
        assertEquals(puntajeEsperado,auto.getPuntaje().calcular(),"Puntaje deberia ser 10");
    }
    @Test
    @DisplayName("Auto con piloto que tiene más de 3 títulos (bonificación del 10%)")
    void test03AutoConBonificacionPorTitulos() {
        piloto.agregarCaracteristica(new Titulo("Campeón Mundial"));
        piloto.agregarCaracteristica(new Titulo("Campeón Nacional"));
        piloto.agregarCaracteristica(new Titulo("Campeón Europeo"));
        piloto.agregarCaracteristica(new Titulo("Campeón Sudamericano"));

        auto.agregarCaracteristica(new Velocidad(300)); // Puntaje = 5

        double puntajeBase = 5 + (4 * 2); // velocidad + 4 títulos → 5 + 8 = 13
        double puntajeEsperado =  puntajeBase * 1.10 ; // 13 * 1.10 = 14.3 ≈ 14 (truncado a int)

        assertEquals(puntajeEsperado, auto.getPuntaje().calcular(), "Puntaje debería tener bonificación del 10%");
    }

    @Test
    @DisplayName("Auto con piloto que tiene más de 3 títulos (bonificación del 10%)")
    void test04AutoCon280kmHPeso890kgYPiloto2TitulosCondicionBuenaExperiencia4() {
        Piloto piloto = new Piloto("CAR");
        piloto.agregarCaracteristica(new Titulo("Campeón Europeo"));
        piloto.agregarCaracteristica(new Titulo("Campeón Sudamericano"));
        piloto.agregarCaracteristica(new Experiencia(4));
        piloto.agregarCaracteristica(new CondicionFisica(new CondicionBuena()));
        auto.cambiarPiloto(piloto);
        auto.agregarCaracteristica(new Velocidad(280));//5p
        auto.agregarCaracteristica(new Peso(890)); //5

        double puntajeBase = 10 + ((2 * 2) + 5 + 5); // velocidad + peso +(2titulos + buena + exp) → 10 + 14 = 24
        double puntajeEsperado =  puntajeBase ; // 13 * 1.10 = 14.3 ≈ 14 (truncado a int)

        assertEquals(puntajeEsperado, auto.getPuntaje().calcular(), "Puntaje debería tener bonificación del 10%");
    }

    @Test
    @DisplayName("Auto con piloto que tiene más de 3 títulos y condición excelente (bonificación del 10% y duplicación)")
    void test04AutoConBonificacionPorTitulosYCondicionExcelente() {
        piloto.agregarCaracteristica(new Titulo("Campeón Mundial"));
        piloto.agregarCaracteristica(new Titulo("Campeón Nacional"));
        piloto.agregarCaracteristica(new Titulo("Campeón Europeo"));
        piloto.agregarCaracteristica(new Titulo("Campeón Sudamericano"));
        piloto.agregarCaracteristica(new Experiencia(6));
        piloto.agregarCaracteristica(new CondicionFisica(new CondicionExcelente()));

        auto.agregarCaracteristica(new Velocidad(310)); // Puntaje = 10
        auto.agregarCaracteristica(new Peso(880)); //5

        double puntajeBase = 10 + 5 + ((4 * 2) + 10 + 10); // velocidad + peso +(4titulos + EXCE + exp) → 15 + 28 = 43
        double puntajeEsperado =  puntajeBase * 1.10 * 2.00 ; // 13 * 1.10 = 14.3 ≈ 14 (truncado a int)

        assertEquals(puntajeEsperado, auto.getPuntaje().calcular(), "Puntaje debería tener bonificación del 10% y duplicar");
    }


}
