package one.digitalinnovation.singleton;

public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstania();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstania();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstania();
        System.out.println(eager);
        eager = SingletonEager.getInstania();
        System.out.println(eager);

        SingletonHolder holder = SingletonHolder.getInstania();
        System.out.println(holder);
        holder = SingletonHolder.getInstania();
        System.out.println(holder);
    }
}
