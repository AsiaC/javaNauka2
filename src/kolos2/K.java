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
class K implements Serializable, Comparable{
    @Override 
    public int compareTo(Object var1)
    {
        return 0;
    }

    @Override
    public int metoda1(int a) {
        return a*a;
    }

    @Override
    public int metoda1(int a, int b) {
        return a*b;
    }
    //abstract int metoda4(int a); //nie może być w klasie, która nie jest abstrakcyjna
}
