package ada.prueba;

public class Triangulo extends Figura {
    private Double lado1;
    private Double lado2;
    private Double lado3;
    private Double base;
    private Double altura;

    public Triangulo(String color, Double lado1, Double lado2, Double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public Double getPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    @Override
    public Double getArea() {
        base = lado3;
        area = (base * altura) /2;
        return area;
    }
}
