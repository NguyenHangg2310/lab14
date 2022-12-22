package com.pattern.visitor.book;

public interface Book {
    void accept(Visitor v);
}
