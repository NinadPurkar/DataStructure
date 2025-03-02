package main.java.com.example.DataStructure.lists;

import main.java.com.example.DataStructure.MyCollections.MyList;

public class ArrayList<T> implements MyList<T>
{

    private Object[] elements;
    private int size;

    public ArrayList()
    {
        this.elements = new Object[10];
        this.size = 0;
    }

    @Override
    public T get(int index)
    {
        if(index < 0)
        {
            return null;
        }
        else
        {
            return (T) elements[index];
        }
    }

    @Override
    public T remove(int index)
    {

        if(index<0 || index >=size)
        {
            throw new IndexOutOfBoundsException("Index"+index+"is out of bound");
        }

        T removedElement =  (T) elements[index];
        //shift to the left
        for(int i = index;i<size-1;i++)
        {
            elements[i] = elements[i + 1];
        }
        // also free up the size
        elements[size-1]= null;
        size--;

        return removedElement;
    }

    @Override
    public void add(int index, T element)
    {
        if(index<0 ||index>=size)
        {
            throw new IndexOutOfBoundsException("Array index is out of bound bhaiya");
        }

    }

    @Override
    public boolean add(Object element)
    {
        if(size==elements.length)
        {
            resize();
        }
        elements[size++] = (T)element;
        return true;
    }

    public void resize()
    {
        int newCapacity = size * 2;
        Object [] newelements = new Object[newCapacity];
        for(int i=0;i<size;i++)
        {
            newelements[i] = elements[i];
        }
        elements = newelements;
    }

    @Override
    public boolean remove(Object element) {
        for(int i=0;i<size;i++)
        {
            if(elements[i] ==  (T)element)
            {
                T removedelement = remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object element) {
        for(int i=0;i<size;i++)
        {
            if(elements[i] == (T)element)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear()
    {
        for(int i=0;i<size;i++)
        {
            elements[i] = null;
        }
        size =0;
    }
}
