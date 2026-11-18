package megalodonte.base.components;

import megalodonte.contracts.ComponentContract;
import megalodonte.contracts.RefContract;
import megalodonte.contracts.ScreenComponentContract;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

final class SharedComponentContractTest {
    @Test
    void desktopTypesImplementSharedContracts() {
        assertTrue(ComponentContract.class.isAssignableFrom(Component.class));
        assertTrue(RefContract.class.isAssignableFrom(Ref.class));
        assertTrue(ScreenComponentContract.class.isAssignableFrom(ScreenComponent.class));
    }
}
