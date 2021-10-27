package one.digitalinnovation.singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstania() {
        return instancia;
    }
}
