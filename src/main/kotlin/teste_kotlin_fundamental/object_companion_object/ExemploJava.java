package teste_kotlin_fundamental.object_companion_object;

//exemplo para entender static e escopo de classe e de objeto

public class ExemploJava {

    static int valor = 0;
    int value = 0;

    public ExemploJava() {
        valor++;
        value++;
    }

    public static void main(String[] args) {
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();

        ExemploJava ex = new ExemploJava();
        System.out.println(ex.value);
        System.out.println(ExemploJava.valor);
    }
}
