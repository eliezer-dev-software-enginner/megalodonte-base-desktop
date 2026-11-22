package megalodonte.application.reload;

import javafx.beans.property.SimpleBooleanProperty;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class LiveReloadTest {

    @Test
    void aplicaModoDaRotaQuandoAJanelaAparece() {
        var showing = new SimpleBooleanProperty(false);
        var calls = new AtomicInteger();

        LiveReload.applyWhenShown(showing, calls::incrementAndGet);

        assertEquals(0, calls.get());
        showing.set(true);
        assertEquals(1, calls.get());
    }

    @Test
    void janelaJaVisivelNaoRecebeAplicacaoDiferida() {
        var showing = new SimpleBooleanProperty(true);
        var calls = new AtomicInteger();

        LiveReload.applyWhenShown(showing, calls::incrementAndGet);

        assertEquals(0, calls.get());
        showing.set(false);
        showing.set(true);
        assertEquals(0, calls.get());
    }

    @Test
    void aplicacaoDiferidaAconteceUmaUnicaVez() {
        var showing = new SimpleBooleanProperty(false);
        var calls = new AtomicInteger();

        LiveReload.applyWhenShown(showing, calls::incrementAndGet);

        showing.set(true);
        showing.set(false);
        showing.set(true);
        assertEquals(1, calls.get());
    }
}
