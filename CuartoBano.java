
/**
 * Write a description of class CuartoBaño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoBano
{
    private int metrosCuadrados;
    private String formaBano;
    private Retrete retrete;
    
    /**
     * Constructor for objects of class CuartoBaño
     */
    public CuartoBano()
    {
        metrosCuadrados = 4;
        formaBano = "Romboide";
        retrete = retrete;
        retrete = new Retrete();        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getMetrosCuadrados()
    {
        return metrosCuadrados;
    }

    public String getFormaBano()
    {
        return formaBano;
    }

    public void setMetrosCuadrados(int nuevaMedida){
        this.metrosCuadrados = nuevaMedida;
    }
    public void setNuevaForma(String nuevaForma){
        this.formaBano = nuevaForma;
    }
    
    public Retrete getRetrete()
    {
        return retrete;
    }
     public void imprimirBaño() {
        System.out.println("Metros cuadrados: " + getMetrosCuadrados() + " || Forma del Baño: " + getFormaBano() + " || Marca del retrete: " + retrete.getMarcaRetrete() + " || Estado del retrete: "+ retrete.getEstadoRetrete());
    }
}
