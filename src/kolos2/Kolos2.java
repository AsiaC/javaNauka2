/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import static kolos2.I.m2;
import kolos2.TypyGeneryczne.Apple;
import kolos2.TypyGeneryczne.BoxForFigures;
import kolos2.TypyGeneryczne.BoxOnSteroids;
import kolos2.TypyGeneryczne.Circle;
import kolos2.TypyGeneryczne.FruitBox;
import kolos2.TypyGeneryczne.Orange;
import kolos2.TypyGeneryczne.Rectangle;
import kolos2.TypyGeneryczne.Square;

/**
 *
 * @author Asia
 */
public class Kolos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        X1 [] xList={
        new Klasa1(),
        new KlasaKlasa1()};
        */
        /*
        KlasaIJ a=new KlasaIJ();
        System.out.println("metoda m: ");
        a.m();
        System.out.println("");
        System.out.println("metoda m3: ");
        a.m3();
        System.out.println("");
        System.out.println("zmienna statyczna:");
        System.out.println(KlasaIJ.CONST_VALUE);
        System.out.println("");
        System.out.println("metoda m2: ");
        m2();
                */
        /*
        W2 b=new W2();
        b.m();
        
        KKK2 c=new KKK2();
        c.m();
          */
        /*
        Box<Integer>intBox=new Box<>();
        Box rawBox=new Box();
        Box<String>stringBox=new Box<>();
        Box rawBox2=stringBox;
        
        ArrayList<Integer> ints=new ArrayList<>(); //nie może być typ int
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);//wzraca wszystkie
        System.out.println(cars.get(0)); //zwraca pierwszy lelment
        cars.set(0,"Opel"); //podmieni volvo
        System.out.println(cars);
        cars.remove(2); //usuwa
        System.out.println(cars);
        cars.size();
        
        for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
        }
        System.out.println("sort:");
        Collections.sort(cars); 
        for (String i : cars) {
        System.out.println(i);
        }
        
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(3);
        
        List<Integer> linkedList=new LinkedList<>();
        linkedList.add(30);
        
        */
        
        /*
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit(); //trzeba rzutować bo nie wiemy jaki typ dlatego lepiej użyć klasy generycznej zamist Fruit
        FruitBox fruitBox2 = new FruitBox(new Apple());
        
        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<Apple>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<Orange>(new Orange()); //mozna też inaczej: BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());
        Orange fruit = orangeBox.getFruit(); //nie trzeba rzutować bo wczesniej określamy typ
                      
        BoxOnSteroids boxWithoutType = new BoxOnSteroids(new Apple());
        BoxOnSteroids<Apple> boxWithApple = boxWithoutType;
        BoxOnSteroids<Orange> boxWithOrange = boxWithoutType;
        Apple apple = boxWithApple.getFruit();
        Orange orange = boxWithOrange.getFruit(); 
        
        
        BoxForFigures<Circle> circleBox = new BoxForFigures<>(new Circle());
        //BoxForFigures<Apple> appleBox; // complilation error //nie bo nie implementuje ineterfacu Figure
        
        Rectangle rectangle = new Square();
//BoxForFigures<Rectangle> rectangleBox = new BoxForFigures<Square>(new Square()); // compilation error
        */
        
        Kolo a=new Kolo("pierwsze");
        Kolo b=new Kolo("drugie");
        Kolo c=new Kolo("trzecie");
        List <Kolo> listaTylkoKola = new ArrayList<>();
        listaTylkoKola.add(a);
        listaTylkoKola.add(b);
        listaTylkoKola.add(c);
        
        DuzeKolo A=new DuzeKolo("PIERWSZE");
        DuzeKolo B=new DuzeKolo("DRUGIE");
        List <? extends Kolo> listaPrzynajmniejKola = new ArrayList<>();
        listaPrzynajmniejKola.add(null); //kompiltor nie pozwala na wstawienie obiektu!! mozna tylko wartośc null przypisać
       // listaPrzynajmniejKola.add(a);

        Box3<PowerUser3> pub=new Box3<>();
        Box3<User3> us=new Box3<>();
        K3.m(us);
        K3.m(pub);
        
        Box3<? extends User3> box = new Box3<PowerUser3>();
        box.set(null);
       
        a4b4c4d4 zad7=new a4b4c4d4();
        List<A4> la4=new ArrayList<>();
        List<B4> lb4=new ArrayList<>();
        List<C4> lc4=new ArrayList<>();
        List<D4> ld4=new ArrayList<>();
        List<E4> le4=new ArrayList<>();
        zad7.m(le4);
        zad7.m(ld4);
        zad7.m(lc4);
        List<D4> lld4=new LinkedList<>();
        List<E4> lle4=new LinkedList<>();
        zad7.m(lle4);
        zad7.m(lld4);
    }
    
}
