package com.mathiric.myproductd;

//public record Person(String name, int age) {}

final class Person { // Non compliant
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return this.name;}

    public int getAge() {return this.age;}

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() { return (this.age * 5);}

    @Override
    public String toString() { return "my age is "+this.age;}
}