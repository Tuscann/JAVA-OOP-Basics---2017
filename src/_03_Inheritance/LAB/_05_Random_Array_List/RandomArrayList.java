package _03_Inheritance.LAB._05_Random_Array_List;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<S> extends ArrayList
{
//    void removeElemnt(){
//
//    }
//
//    public String getRandomElement()
//    {
//        Random rand = new Random();
//
//        int  n = rand.nextInt(5) + 1;
//        String ramdom= ;
//
//
//        System.out.printf("%d%n",n);
//
//
//
//     return "kamen";
//    }
    private Random rnd;

    public Object getRandomElement () {
        int index = this.rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.remove(super.size() - 1  ));
        return element;
    }


}
