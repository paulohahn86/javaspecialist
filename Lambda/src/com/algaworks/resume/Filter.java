package com.algaworks.resume;

@FunctionalInterface
public interface Filter<T> {

    boolean evaluate(T object);

}
