public class Retrete
{
    private String marcaRetrete;
    boolean estadoRetrete;
    Escobilla escobilla;
    /**
     * Constructor for objects of class Retrete
     */
    public Retrete()
    {
        marcaRetrete = "RoCACAlcinada";
        estadoRetrete = true;
        escobilla = new Escobilla();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getMarcaRetrete()
    {
        return marcaRetrete;
    }
      public void setNuevaMarca(String nuevaMarca){
        this.marcaRetrete= nuevaMarca;
    }
       public void setEstadoRetrete(){
        this.estadoRetrete = !estadoRetrete;
    }

    public boolean getEstadoRetrete()
    {
        return estadoRetrete;
    }

    public Escobilla getEscobilla()
    {
        return escobilla;
    }
    public void imprimirRetrete() {
        System.out.println("Marca: " + getMarcaRetrete() + " " + "Estado del Retrete: " + " " + getEstadoRetrete() + "|| Marca de la escobilla: " + escobilla.getMarcaEscobilla() + " || ¿Hay de repuesto? " + escobilla.getRepuesto());
    }
}
