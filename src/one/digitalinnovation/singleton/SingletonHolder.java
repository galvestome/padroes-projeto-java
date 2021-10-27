package one.digitalinnovation.singleton;

public class SingletonHolder {

    public static class Holder {
        public static SingletonHolder instancia = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstania() {
        return Holder.instancia;
    }
}
