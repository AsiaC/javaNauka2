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
public interface Serializable {
    static int zmienna1=3; //musi byc deklaracja
    final int zmienna2=7;
    final static int zmienna3=8;
    int zmienna4=9;
    abstract int metoda1(int a, int b);
    
     default int metoda1(int a)
            {return 0;};
}
