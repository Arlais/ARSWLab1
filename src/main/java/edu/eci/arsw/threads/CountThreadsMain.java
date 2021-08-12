/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main( String[] args ){
        CountThread Hilo1 =new CountThread(0,100);
        CountThread Hilo2 =new CountThread(99,200);
        CountThread Hilo3 =new CountThread(199,300);
        //Hilo1.start();
        //Hilo2.start();
        //Hilo3.start();
        Hilo1.run();
        Hilo2.run();
        Hilo3.run();
    }
}
