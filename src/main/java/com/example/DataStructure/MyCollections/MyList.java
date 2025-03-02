package main.java.com.example.DataStructure.MyCollections;

public interface MyList<T> extends MyCollection
{
    T get(int index);
    T remove(int index);
    void add(int index, T element);
}
