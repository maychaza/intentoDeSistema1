package ada.prueba;

public class Main {
/*
Crear un sistema que permita calcular el perímetro y área de una figura.
Las figuras pueden ser cuadrados, triángulos o círculos.
Todas las figuras tienen un color asignado, que puede consultarse.
Nota: el valor de Pi pueden tomarlo como 3.14 o pueden usar la constante Math.PI
 */
    public static void main(String[] args) {
	Cuadrado p= new Cuadrado("rojo", 5);
	Cuadrado r= new Cuadrado("azul", 8);

    System.out.println("el perimetro de p es: "+p.getPerimetro());
    System.out.println("el perimetro de p es: "+r.getPerimetro());


//-----------------------**** Nueva figura ****---------------------------------


    Circulo x= new Circulo("lila", 9.0);

    System.out.println("el color es: "+x.getColor());
    System.out.println("el perimetro es: "+x.getPerimetro());
    System.out.println("el area es: "+x.getArea());
    System.out.println("el radio es: "+x.getRadio());





    }
}
