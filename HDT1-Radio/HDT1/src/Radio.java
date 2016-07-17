/**
 *
 * @author Ramón Samayoa
 */
public class Radio implements iRadio{
    private boolean ON;
    private String Frequency;
    private String Station;
    private int[] MemoryAM;
    private double[] MemoryFM;
    
    public Radio(){
        ON = false;
        Frequency = "AM";
        Station = "530";
        MemoryAM = new int[12];
        MemoryFM = new double[12];
    }

    
    public Radio(boolean estado, String frec, String emis){
        ON = estado;
        Frequency = frec;
        Station = emis;
        MemoryAM = new int[12];
        MemoryFM = new double[12];
    }

   
    @Override
    public void OnOff(boolean estado) {
        this.ON = estado;
    }

    @Override
    public boolean isOn() {
        return ON;
    }
  
    @Override
    public void setFrequency(String frecuencia) {
        this.Frequency = frecuencia;
    }
    
    @Override
    public String getFrequency() {
        return Frequency;
    }

    @Override
    public void setStation(String emisora) {
        this.Station = emisora;
    }
    
    @Override
    public String getStation(){
        return Station;
    }
  
    @Override
    public void setMemory(int position, double emisora) {
        if(Frequency == "AM"){
            MemoryAM[position] = (int)emisora;
        }
        else{
            MemoryFM[position] = emisora;
        }
    }

    @Override
    public void Forward(String frecuencia, String emisora) {
        if (frecuencia == "AM"){
            if (Integer.parseInt(emisora) < 1610){   
                Station = Integer.toString(Integer.parseInt(emisora) + 10);}
            else{
                Station = "530";}
        }            
        else{
            if (Double.parseDouble(emisora) < 107.9){               
                Station = Double.toString(Double.parseDouble(emisora) + 0.2);}
            else{
                Station = "87.9";}    
        }
    }
    
    @Override
    public void Backward(String frecuencia, String emisora) {
        if (frecuencia == "AM"){
            if (Integer.parseInt(emisora) > 530){       
                Station = Integer.toString(Integer.parseInt(emisora) - 10);}
            else{
                Station = "1610";}
        }            
        else{
            if (Double.parseDouble(emisora) > 87.9){        
                Station = Double.toString(Double.parseDouble(emisora) - 0.2);}
            else{
                Station = "107.9";} 
        }
    }
    
    @Override
    public String selectMemory(int position) {
        String emisora;
        if(Frequency == "AM"){
            emisora = Integer.toString(MemoryAM[position]);
        }
        else{
            emisora = Double.toString(MemoryFM[position]);
        }
        return emisora;
    }
}
