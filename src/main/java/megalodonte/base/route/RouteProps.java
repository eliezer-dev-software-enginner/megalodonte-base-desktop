package megalodonte.base.route;

/**
 * Immutable properties for a route. Defines the screen dimensions, title,
 * resizability, and optional icon path.
 *
 * @param screenWidth         initial screen width (before scaling)
 * @param screenHeight        initial screen height (before scaling)
 * @param name                screen title displayed in the title bar
 * @param screenIsExpandable  whether the user can resize the window
 * @param iconPath            classpath resource path for the window icon, or null
 * @param fullScreen          whether the route occupies the complete display without window chrome
 */
public record RouteProps(int screenWidth, int screenHeight, String name, boolean screenIsExpandable,
                         String iconPath, boolean fullScreen) {
    public RouteProps(int screenWidth, int screenHeight, String name, boolean screenIsExpandable) {
        this(screenWidth, screenHeight, name, screenIsExpandable, null, false);
    }

    public RouteProps(int screenWidth, int screenHeight, String name, boolean screenIsExpandable,
                      String iconPath) {
        this(screenWidth, screenHeight, name, screenIsExpandable, iconPath, false);
    }

    public RouteProps(int screenWidth, int screenHeight, String name, boolean screenIsExpandable,
                      boolean fullScreen) {
        this(screenWidth, screenHeight, name, screenIsExpandable, null, fullScreen);
    }
}
