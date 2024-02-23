 

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
      public void setRepuesto(){
        this.hayDeRepuesto = !hayDeRepuesto;
    }
      public void setMarcaEscobilla(String nuevaMarca){
        this.marcaEscobilla = nuevaMarca;
    }
    
      public void setCalidadEscobilla(String nuevaCalidad){
        this.calidadEscobilla = nuevaCalidad;
    }
    public String calidadEscobilla(){
        return calidadEscobilla;
    }
    
    public void imprimirEscobilla() {
        System.out.println("Marca: " + marcaEscobilla + " | Repuesto: " + hayDeRepuesto + " | Calidad: " + calidadEscobilla);
    }
}
