package ro.ulbs.proiectaresoftware.students;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        List<Integer> x = new ArrayList<>();
        List<Integer> y =  new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();






        Random rand = new Random();



        for(int i = 0;i< 5;i++){

            x.add(rand.nextInt(11));



        }
         for(int j = 0;j<7;j++){

             y.add(rand.nextInt(11) );


         }


        xPlusY.addAll(x);
        xPlusY.addAll(y);

        System.out.println("xPlusY: " + xPlusY );



        zSet.addAll(x);
        zSet.retainAll(y);

        System.out.println("zSet: " + zSet);



        xMinusY.addAll(x);
        xMinusY.removeAll(y);


        System.out.println("xMinusY: " + xMinusY);


        xPlusYLimitedByP.addAll(x);
        xPlusYLimitedByP.addAll(y);

        Iterator<Integer> it = xPlusYLimitedByP.iterator();

        while(it.hasNext()){

            int v = it.next();

            if(v>p){

                it.remove();

            }
        }
        System.out.println("xPlusYLimitedByP: "+xPlusYLimitedByP);

    }









}
