package ada.prueba;

public abstract class Figura {
    protected String color;
    protected Double area;
    protected Double perimetro;

    public Figura(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract Double getPerimetro();

    public abstract Double getArea();



}
