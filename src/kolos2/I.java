/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2;

/**
 *
 * @author Asia
 */
public interface I {
    int CONST_VALUE=3;
    int m();
    static void m2(){System.out.println("static I#m2()");};
    default void m3(){
        this.m();
        System.out.println("default I#m3()");};
    
}
