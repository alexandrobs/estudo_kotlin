package teste_kotlin_fundamental.classe_anonima;

//ex de uso de classe anonima em java

public class ProgramaJava {

    public void calculo(Bonus bonus) {
        bonus.calcula();
    }

    public static void main(String[] args) {
        ProgramaJava p = new ProgramaJava();
        p.calculo(new Bonus() {
            @Override
            public float calcula() {
                return 500f;
            }
        });
    }
}
