package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Arbitro;
import co.edu.uniquindio.poo.model.Atleta;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.EventoDeportivo;
import co.edu.uniquindio.poo.model.Participante;
import co.edu.uniquindio.poo.model.TipoEvento;

public class EmpresaTest {

    private static final  Logger LOG = Logger.getLogger(EmpresaTest.class.getName());

    /**
     * test para verificar la lista de atletas de natacion
     */
    @Test
    public void listaAtletasNtacionTest(){
        LOG.info("iniciando test");

        Empresa empresa = new Empresa("happycity");

        EventoDeportivo evento = new EventoDeportivo("festival de verano", "natacion", "Ecuador", "Quito", LocalDate.of(2024, 10, 16), TipoEvento.COMPETICION);

        Participante participante = new Atleta("sebastian", "gomez", "colombiana", LocalDate.of(2004, 12, 13), (byte) 19, "colombia", (byte) 14);

        Participante participante2 = new Atleta("diego", "rodriguez", "colombiano", LocalDate.of(2004, 8, 22), (byte) 20, "Colombia", (byte) 5);

        Participante participante3 = new Arbitro("julian", "perez", "peruano", LocalDate.of(1980, 11, 15), (byte) 43, "uruguay", "elite");

        evento.getListaParticipantes().add(participante);
        evento.getListaParticipantes().add(participante2);
        evento.getListaParticipantes().add(participante3);  

        empresa.getListaEventos().add(evento);

        List<Atleta> atletasEsperados = Arrays.asList(
            (Atleta) participante, 
            (Atleta) participante2
        );

        assertIterableEquals(atletasEsperados, empresa.listaAtletasNatacion());

        LOG.info("finalizando test");
    }
    
}
