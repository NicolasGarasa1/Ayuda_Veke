package Guia_Objetos_Figuras.Figura;

public abstract class Figura {
    // ATRIBUTOS
    protected String Color;

    // CONSTRUCTOR
    public Figura(){}
    public Figura(String _Color){
        this.Color = _Color;
        //System.out.print("\n Se construyo una Figura.");
    }

    // METODOS
    protected abstract double Retornar_Perimetro();
    protected abstract double Retornar_Area();

}