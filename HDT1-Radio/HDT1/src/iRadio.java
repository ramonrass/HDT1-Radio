/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramón Samayoa
 */
public interface iRadio {
    public void OnOff(boolean estado);
    
    public boolean isOn();

    public void setFrequency(String frecuencia);

    public String getFrequency();
    
    public void setStation(String emisora);
  
    public String getStation();
    
    public void Forward(String frecuencia, String emisora);
    
    public void Backward(String frecuencia, String emisora);
    
    public void setMemory(int position, double Station);

    public String selectMemory(int position);
}
