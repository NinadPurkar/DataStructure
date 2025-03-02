package main.java.com.example.DataStructure.MyCollections;

public interface MyCollection <T>
{

    //add method
    boolean add(T element);

    //remove method
    boolean remove(T element);

    // Give size of collection
    int size();

    // return if the collection is empty
    boolean isEmpty();

    //check if the element is present in collection
    boolean contains(T element);

    // clear all element from the collection
    void clear();
}
