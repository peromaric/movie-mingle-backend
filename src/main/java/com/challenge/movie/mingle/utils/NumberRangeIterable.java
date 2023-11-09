package com.challenge.movie.mingle.utils;

import jakarta.validation.constraints.NotNull;

import java.util.Iterator;

public class NumberRangeIterable implements Iterable<Integer> {
    private final int from;
    private final int to;

    public NumberRangeIterable(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int current = from;

            @Override
            public boolean hasNext() {
                return current <= to;
            }

            @Override
            public Integer next() {
                return current++;
            }
        };
    }
}
