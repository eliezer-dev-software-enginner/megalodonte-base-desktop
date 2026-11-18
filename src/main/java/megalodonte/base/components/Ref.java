package megalodonte.base.components;

/**
 * A mutable reference holder for components. Analogous to React's {@code useRef} —
 * allows a parent to access a child component after render.
 *
 * @param <T> the type of component held
 */
public class Ref<T> implements megalodonte.contracts.RefContract<T> {
    private T current;

    public Ref() {
    }

    public Ref(T initial) {
        this.current = initial;
    }

    @Override
    public T current() {
        return current;
    }

    @Override
    public void setCurrent(T component) {
        this.current = component;
    }
}
