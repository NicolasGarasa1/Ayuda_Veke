import Guia_Objetos_Figuras.Circulo.Circulo;
import Guia_Objetos_Figuras.Rectangulo.Rectangulo;

public class Main {
    public static void main(String[] args) {



        //Rectangulo Recta_1 = new Rectangulo(5, 2, "Rojo");
        //Recta_1.MostrarInfo();

        Circulo Circulo_1 = new Circulo("Azul", 3);
        Circulo_1.Mostrar_Info();

        Rectangulo.MostrarFormulaArea();

        System.out.println("\n Pi:"+Circulo.Pi+".");

    }
}