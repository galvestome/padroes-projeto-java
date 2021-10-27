package one.digitalinnovation.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstania() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
