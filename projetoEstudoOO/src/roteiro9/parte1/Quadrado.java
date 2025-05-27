package roteiro9.parte1;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public double getlado() {
        return lado;
    }
    public void setlado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
    @Override
    public double getArea() {
        return lado * lado;
    }
    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
    
    
}
