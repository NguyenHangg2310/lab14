package com.pattern.visitor.book;

public class BusinessBook implements Book{
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "The publisher of business book";
    }
}
