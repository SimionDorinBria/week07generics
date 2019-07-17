package main.java.com.siit.generics;

import java.util.Set;
import java.util.TreeSet;

public class Sorted<T extends Comparable> implements IRepository<T> {
    private Set<T> sorted = new TreeSet<>();

    public Sorted() {
    }

    public Set<T> getSorted() {
        return sorted;
    }

    public void setSorted(Set<T> sorted) {
        this.sorted = sorted;
    }

    @Override
    public void save(T obj) {
        sorted.add(obj);
    }

    @Override
    public void remove(T obj) {
        sorted.remove(obj);
    }

    @Override
    public int count() {
        return sorted.size();
    }

    @Override
    public Set<T> listAll() {
        return sorted;
    }

    @Override
    public String toString() {
        return "Sorted repository";
    }
}