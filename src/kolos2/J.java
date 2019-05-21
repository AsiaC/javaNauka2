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
public interface J extends I {
    default void m3()
    {I.super.m3();
    System.out.println("default J#m3()");}
}
