package megalodonte.base.route;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class RoutePropsTest {
    @Test void regularRoutesRemainWindowedByDefault() {
        assertFalse(new RouteProps(900, 550, "Home", true).fullScreen());
        assertFalse(new RouteProps(900, 550, "Home", true, "/icon.png").fullScreen());
    }

    @Test void dedicatedRoutesCanRequestFullScreen() {
        assertTrue(new RouteProps(1200, 620, "PDV", true, true).fullScreen());
    }
}
