package main.java.com.example.Test;

import main.java.com.example.DataStructure.lists.ArrayList;

public class TestArrayList {

    public static void main(String gg[])
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        temp.add(1);
        temp.add(5);
        temp.add(8);
        temp.add(9);

        for(int i=0;i<temp.size();i++)
        {
            System.out.println(temp.get(i));
        }

        System.out.println("2 index element"+temp.remove(2));
        for(int i=0;i<temp.size();i++)
        {
            System.out.println(temp.get(i));
        }
    }
}
