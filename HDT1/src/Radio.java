/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramón Samayoa
 */
public class Radio implements Interface{
    private boolean ON;
    private boolean Frequency;
    private double Station;
    private double[] Memory;

    
    public Radio(){
        ON = false;
        Frequency = true;
        Station =  0.0;
        Memory = new double[12];
    }

    
    public Radio(boolean estado, boolean frec, double emis){
        ON = estado;
        Frequency = frec;
        Station = emis;
        Memory = new double[12];
    }

   
    @Override
    public void On(boolean estado) {
        this.ON = estado;
    }

    @Override
    public boolean isOn() {
        return ON;
    }
  
    @Override
    public void setFrequency(boolean frecuencia) {
        this.Frequency = frecuencia;
    }
    
    @Override
    public boolean getFrequency() {
        return Frequency;
    }

    @Override
    public void setStation(double emisora) {
        this.Station = emisora;
    }
    
    @Override
    public double getStation() {
        return Station;
    }
  
    @Override
    public void setMemory(int position, double emisora) {
        if(position >= 0 && position < 12) {
            Memory[position] = emisora;
        }
    }

 
    @Override
    public double selectMemory(int position) {
        if (position >= 0 && position < 12)
            return Memory[position];
        else return 0.0;
    }
}
