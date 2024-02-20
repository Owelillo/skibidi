 

public class Escobilla
{

    private String marcaEscobilla;
    private boolean hayDeRepuesto;
    String calidadEscobilla;

    /**
     * Constructor for objects of class Escobilla
     */
    public Escobilla()
    {
        marcaEscobilla = "CulitoLimpito";
        hayDeRepuesto = true;
        calidadEscobilla = "Calidad mansilla";
    }

    public String getMarcaEscobilla()
    {
        return marcaEscobilla;        
    }

    public boolean hayDeRepuesto(){
        return hayDeRepuesto;
    }

    public String calidadEscobilla(){
        return calidadEscobilla;
    }
    
    public void imprimirEscobilla() {
        System.out.println("Marca " + marcaEscobilla + " | Repuesto: " + hayDeRepuesto + " | Calidad: " + calidadEscobilla);
    }
}
