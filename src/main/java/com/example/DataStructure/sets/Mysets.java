package main.java.com.example.DataStructure.sets;

import main.java.com.example.DataStructure.MyCollections.MySet;

public class Mysets implements MySet
{
    private int size = 0;

    @Override
    public boolean add(Object element) {
        return false;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty()
    {
        if(this.size == 0)
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    public void clear()
    {
        this.size =0;
        return;
    }

}
