/**
 * Clase Radio
 * @author Ramón Samayoa, Diego Valdez, Sang Wo Shin
 * @version 17.07.16
 */
import java.text.DecimalFormat;

/**
 *
 * @author Diego Valdez
 */
public class Radio implements iRadio{
    /**
     * atributos
     * ON, Frequency, Station, MemoryAM, MemoryFM
     */
    private boolean ON;
    private String Frequency;
    private String Station;
    private int[] MemoryAM;
    private double[] MemoryFM;
    
    /**
     * Constructor de la clase radio, donde se le asignan valores iniciales
     */
    public Radio(){
        ON = false;
        Frequency = "AM";
        Station = "530";
        MemoryAM = new int[12];
        MemoryFM = new double[12];
    }

    /**
     *
     * @param estado : boolean
     * @param frec : String
     * @param emis : String
     */
    public Radio(boolean estado, String frec, String emis){
        ON = estado;
        Frequency = frec;
        Station = emis;
        MemoryAM = new int[12];
        MemoryFM = new double[12];
    }

   
    /**
     * 
     * @param estado : boolean
     * Se recibe el estado ON o OFF
     */
    @Override
    public void OnOff(boolean estado) {
        this.ON = estado;
    }

    /**
     * 
     * @return ON: boolean
     * regresa el estado del atributo ON
     */
    @Override
    public boolean isOn() {
        return ON;
    }
  
    /*
     * @param frecuencia : String
     * Recibe la frecuencia en el atributo Frequency
     */
    @Override
    public void setFrequency(String frecuencia) {
        this.Frequency = frecuencia;
    }
    
    /**
     * 
     * @return Frequency : String
     * Devuelve la frecuencia del atributo Frequency
     */
    @Override
    public String getFrequency() {
        return Frequency;
    }

    /**
     * 
     * @param emisora : String
     * Recibe la estacion en el atributo Station
     */
    @Override
    public void setStation(String emisora) {
        this.Station = emisora;
    }
    
    /**
     * 
     * @return Station : String
     * Devuelve el string con la estacion del atributo Station
     */
    @Override
    public String getStation(){
        return Station;
    }
  
    /**
     * 
     * @param position : int
     * @param emisora : double
     * Guatda en memoria de la radio dependiendo si la emisora es fm o am
     */
    @Override
    public void setMemory(int position, double emisora) {
        if(Frequency.equals("AM")){
            MemoryAM[position] = (int)emisora;
        }
        else{
            MemoryFM[position] = emisora;
        }
    }

    /**
     * 
     * @param frecuencia : String
     * @param emisora : String
     * Aumenta la estacion pero dependiendo la frecuencia
     */
    @Override
    public void Forward(String frecuencia, String emisora) {
        double emis;
        if (frecuencia.equals("AM")){
            if (Integer.parseInt(emisora) < 1610){   
                Station = Integer.toString(Integer.parseInt(emisora) + 10);}
            else{
                Station = "530";}
        }            
        else{
            if (Double.parseDouble(emisora) < 107.9){
                emis= Double.parseDouble(emisora)+0.2;
                DecimalFormat formato = new DecimalFormat("###.#");
                Station = formato.format(emis);}
            else{
                Station = "87.9";}    
        }
    }
    
    /**
     * 
     * @param frecuencia : String
     * @param emisora  : String
     * Disminuye la estacion dependiendo la frecuencia
     */
    @Override
    public void Backward(String frecuencia, String emisora) {
        double emis;
        if (frecuencia.equals("AM")){
            if (Integer.parseInt(emisora) > 530){       
                Station = Integer.toString(Integer.parseInt(emisora) - 10);}
            else{
                Station = "1610";}
        }            
        else{
            if (Double.parseDouble(emisora) > 87.9){   
                emis= Double.parseDouble(emisora)-0.2;
                DecimalFormat formato = new DecimalFormat("###.#");
                Station = formato.format(emis);}
            else{
                Station = "107.9";} 
        }
    }
    
    /**
     * 
     * @param position : int
     * @return emisora: String
     * retorna la emisora dependiendo la localidad que entre
     */
    @Override
    public String selectMemory(int position) {
        String emisora;
        if(Frequency.equals("AM")){
            emisora = Integer.toString(MemoryAM[position]);
        }
        else{
            emisora = Double.toString(MemoryFM[position]);
        }
        return emisora;
    }
}
