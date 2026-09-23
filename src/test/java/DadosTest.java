import org.example.Dados;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadosTest {

    @Test
    public void deveRetornarCodCoop() {
        Dados.getInstance().setCodCoop("0437");
        assertEquals("0437", Dados.getInstance().getCodCoop());
    }

    @Test
    public void deveRetornarNumPA() {
        Dados.getInstance().setNumPA("24");
        assertEquals("24", Dados.getInstance().getNumPA());
    }

    @Test
    public void deveRetornarNomeCoop() {
        Dados.getInstance().setNomeCoop("Sicredi Vale do Jaguari/Zona da Mata");
        assertEquals("Sicredi Vale do Jaguari/Zona da Mata", Dados.getInstance().getNomeCoop());
    }
    @Test
    public void deveFazerLogout() {
        Dados.getInstance().encerrarSessao();
        assertNull(null, Dados.getInstance().getCodCoop());
        assertNull(null, Dados.getInstance().getNumPA());
        assertNull(null, Dados.getInstance().getNomeCoop());
    }

}