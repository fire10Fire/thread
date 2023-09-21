/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mücahit
 */
public class TekCift implements Runnable {
            int order=0;
 ArrayList<Integer> ceyrek;
 ArrayList<Integer> tek=new ArrayList<>();
 ArrayList<Integer> cift= new ArrayList<>();
Object lock= new Object();
    public TekCift(ArrayList<Integer> ceyrek) {
        this.ceyrek = ceyrek;
    }
    @Override
    public void run() {
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ex) {
         ex.getStackTrace();
     }
        synchronized (lock) {
            int a=order*250;
            int b=a+250;
        for(int i =(a);i<b;i++){
            if(this.ceyrek.get(i)%2==1){
            tek.add(ceyrek.get(i));
            }
            else
            cift.add(ceyrek.get(i));
        }
            order++;
         
        }
            
  
        
   
    }

    public ArrayList<Integer> getTek() {
        return tek;
    }

    public ArrayList<Integer> getCift() {
        return cift;
    }

    Object getcift() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
