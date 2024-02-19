public class Escobilla
{
    private String marcaEscobilla;
    private boolean hayDeRepuesto;

    /**
     * Constructor for objects of class Escobilla
     */
    public Escobilla()
    {
        String marcaEscobilla = "CulitoLimpito";
        Boolean hayDeRepuesto = true;
    }


    public String getMarcaEscobilla()
    {
        return marcaEscobilla;        
    }
    
    public boolean hayDeRepuesto(){
        return hayDeRepuesto;
    }
    
}
