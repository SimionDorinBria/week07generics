package main.java.com.siit.generics;

import java.util.Set;

/**
 * Generics
 * <p>
 * Starting from the following given interface:
 * <p>
 * public interface IRepository<T> {
 * <p>
 * void save(T obj);
 * <p>
 * void remove(T obj);
 * <p>
 * int count();
 * <p>
 * Set<T> listAll();
 * }
 * <p>
 * Implement one ordered repository and another one which is sorted. Write a client which uses both
 * these repositories (you should call al the methods and validate that they work).
 *
 * @param <T>
 */

public interface IRepository<T> {

    void save(T obj);

    void remove(T obj);

    int count();

    Set<T> listAll();
}