package skibidi;

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
        String marcaEscobilla = "CulitoLimpito";
        boolean hayDeRepuesto = true;
        String calidadEscobilla = "Calidad mansilla";
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

}
