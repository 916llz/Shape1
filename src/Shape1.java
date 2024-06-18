public class Shape1 {
    // Variáveis de instância
    private int numSides;
    private boolean regular;

    // Construtor padrão
    public Shape1() {
        this.numSides = 0;
        this.regular = false;
    }

    // Construtor com parâmetros
    public Shape1(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Métodos getter e setter para numSides
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Métodos getter e setter para regular
    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    // Método para exibir informações da forma
    public void displayInfo() {
        System.out.println("Número de lados: " + numSides);
        System.out.println("Regular: " + regular);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Shape
        Shape1 shape1 = new Shape1();
        shape1.setNumSides(4);
        shape1.setRegular(true);
        shape1.displayInfo();

        Shape1 shape2 = new Shape1(3, false);
        shape2.displayInfo();
    }
}