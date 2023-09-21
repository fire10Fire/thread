/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author Mücahit
 */
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
     
        ArrayList<Integer> onBin=new ArrayList<>();
       
        for(int i=0;i<10000;i++){
            onBin.add(i+1);
        }
      
        
        //for(int i=0;i<4;i++){
        //}
        TekCift tc =new TekCift(onBin);
        Thread t1 = new Thread(tc);
        t1.start();
        Thread t2 = new Thread(tc);
        t2.start();
        Thread t3 = new Thread(tc);
        t3.start();
        Thread t4 = new Thread(tc);
        t4.start();
        while (t1.isAlive() || t2.isAlive() ||t3.isAlive() ||t4.isAlive()){}
        System.out.println("selam");
        System.out.println(tc.getTek().toString()); 
    
        System.out.println(tc.getCift().toString()); 
    
    }
    
}
