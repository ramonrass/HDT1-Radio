/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramón Samayoa
 */
public interface Interface {
    public void On(boolean estado);
    
    //public void Off();
    
    public boolean isOn();

    public void setFrequency(boolean Frequency);

    public boolean getFrequency();
    
    public void setStation(double Station);
  
    public double getStation();
    
    public void setMemory(int position, double Station);

    public double selectMemory(int position);
}
