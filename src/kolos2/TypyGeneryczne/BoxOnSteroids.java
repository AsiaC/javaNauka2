/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2.TypyGeneryczne;

/**
 *
 * @author Asia
 */
public class BoxOnSteroids <T>{
    public T fruit;
    public BoxOnSteroids(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
