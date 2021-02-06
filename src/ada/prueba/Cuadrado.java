package ada.prueba;

public class Cuadrado extends Figura {
    private Double lado;
    private Double base;
    private Double altura;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado= lado;
    }

    @Override
    public Double getPerimetro() {
        Double perimetro;
        perimetro= lado * 4;
        return perimetro;
    }

    @Override
    public Double getArea() {
        area= lado* lado;
        return area;
    }
}
