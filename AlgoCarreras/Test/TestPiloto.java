package AlgoCarreras.Test;

import AlgoCarreras.Model.Piloto;
import AlgoCarreras.Model.caract.Caracteristicas;
import AlgoCarreras.Model.caract.personales.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestPiloto {

    Piloto piloto1;
    Piloto piloto2;
    Piloto piloto3;

    @BeforeEach
    void setUp() {
        piloto1 = new Piloto("Carlos");
        piloto2 = new Piloto("Juan");
        piloto3 = new Piloto("Miguel");
    }
    @Test
    @DisplayName("Puntaje Piloto con 3 titulos. ")
    void test01PilotoConTitulos() {
        int puntajeEsperado = 6;
        Personales nuevoTitulo = new Titulo("Copa Piston");
        Personales nuevoTitulo2 = new Titulo("Copa Piston2");
        Personales nuevoTitulo3 = new Titulo("Copa Piston3");
        piloto1.agregarCaracteristica(nuevoTitulo);
        piloto1.agregarCaracteristica(nuevoTitulo2);
        piloto1.agregarCaracteristica(nuevoTitulo3);



        assertEquals(puntajeEsperado,piloto1.getPuntaje().calcular(),"Puntaje deberia ser 6.");
    }

    @Test
    @DisplayName("Puntaje Piloto con 5 años de  experiencia.")
    void test02PilotoConExperienciaDe5Anios() {
        int puntajeEsperado = 10;
        Personales experiencia = new Experiencia(5);
        piloto2.agregarCaracteristica(experiencia);
        assertEquals(puntajeEsperado,piloto2.getPuntaje().calcular(),"Puntaje deberia ser 10.");

    }
    @Test
    @DisplayName("Puntaje Piloto con condicion excelente.")
    void test03PilotoConCondicionExcelente() {
        int puntajeEsperado = 10;
        CondicionFisica condicionFisica = new CondicionFisica(new CondicionExcelente());
        piloto2.agregarCaracteristica(condicionFisica);
        assertEquals(puntajeEsperado,piloto2.getPuntaje().calcular(),"Puntaje deberia ser 10.");

    }
    @Test
    @DisplayName(" Puntaje piloto cambia su condicion fisica.")
    void test03PilotoConCondicionBuenaCambiaExcelente() {
        int puntajeEsperado = 5;
        int puntajeEsperado1 = 10;

        CondicionFisica condicionFisica = new CondicionFisica(new CondicionBuena());
        piloto2.agregarCaracteristica(condicionFisica);

        assertEquals(puntajeEsperado,piloto2.getPuntaje().calcular(),"Puntaje deberia ser 10.");

        condicionFisica.cambiarEstado(new CondicionExcelente());
        assertEquals(puntajeEsperado1,piloto2.getPuntaje().calcular(),"Puntaje deberia ser 10.");

    }
    @Test
    @DisplayName("Condicion fisica actual del piloto,luego de cambiar.")
    void test04PilotoConCondicionBuenaCambiaExcelente() {

        CondicionFisica condicionFisica = new CondicionFisica(new CondicionBuena());
        piloto2.agregarCaracteristica(condicionFisica);
        condicionFisica.cambiarEstado(new CondicionExcelente());
        assertEquals("Excelente condicion",condicionFisica.getNombre(),"Condicion debe ser excelente.");

    }

    @Test
    @DisplayName("Puntaje Piloto con 5 años de Experiencia,2 titulos y buena condicion.")
    void test05PilotoConCondicionBuena2TitulosYcon5aniosDeExperiencia() {
        double puntajeEsperado = 17;
        Personales condicionFisica = new CondicionFisica(new CondicionBuena());
        Personales experiencia = new Experiencia(5);
        Personales nuevoTitulo = new Titulo("Copa Piston");

        piloto2.agregarCaracteristica(condicionFisica); //5
        piloto2.agregarCaracteristica(experiencia);  // 10
        piloto2.agregarCaracteristica(nuevoTitulo);  //2

        assertEquals(17,piloto2.getPuntaje().calcular(),"El puntaje esperado es 17.");

    }


}
