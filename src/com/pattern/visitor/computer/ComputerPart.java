package com.pattern.visitor.computer;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
