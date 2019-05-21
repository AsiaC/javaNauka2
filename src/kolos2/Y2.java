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
public interface Y2 {
    static void s()
    { System.out.println("Y2.s()");}
    default void m()
    { System.out.println("Y::m()");}
}
