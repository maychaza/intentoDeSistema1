package ada.prueba;

public class Circulo extends Figura {
    private Double radio;

    public Circulo(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    @Override
    public Double getPerimetro() {
        Double perimetro;
        perimetro = 3.12* (radio* 2);
        return perimetro;
    }

    @Override
    public Double getArea() {
        area = 3.12* (radio* radio);
        return area;
    }
}
