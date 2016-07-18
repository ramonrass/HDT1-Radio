/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramón Samayoa, Diego Valdez, Sang Wo Shin
 */
public interface iRadio {

    /**
     *
     * @param estado
     */
    public void OnOff(boolean estado);
    
    /**
     *
     * @return
     */
    public boolean isOn();

    /**
     *
     * @param frecuencia
     */
    public void setFrequency(String frecuencia);

    /**
     *
     * @return
     */
    public String getFrequency();
    
    /**
     *
     * @param emisora
     */
    public void setStation(String emisora);
  
    /**
     *
     * @return
     */
    public String getStation();
    
    /**
     *
     * @param frecuencia
     * @param emisora
     */
    public void Forward(String frecuencia, String emisora);
    
    /**
     *
     * @param frecuencia
     * @param emisora
     */
    public void Backward(String frecuencia, String emisora);
    
    /**
     *
     * @param position
     * @param Station
     */
    public void setMemory(int position, double Station);

    /**
     *
     * @param position
     * @return
     */
    public String selectMemory(int position);
}
