package main.java.com.siit.generics;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ordered<T> implements IRepository<T> {
    private Set<T> ordered = new LinkedHashSet<>();

    public Ordered() {
    }

    public Set<T> getOrdered() {
        return ordered;
    }

    public void setOrdered(Set<T> ordered) {
        this.ordered = ordered;
    }

    @Override
    public void save(T obj) {
        ordered.add(obj);
    }

    @Override
    public void remove(T obj) {
        ordered.remove(obj);
    }

    @Override
    public int count() {
        return ordered.size();
    }

    @Override
    public Set<T> listAll() {
        return ordered;
    }

    @Override
    public String toString() {
        return "Ordered repository";
    }
}