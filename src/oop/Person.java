package oop;

public class Person {
    private String name = "Sam";
    private int age;
    private String favColor;

    public Person() {
    }

    public Person(String name, int age, String favColor) {
        this.name = name;
        this.age = age;
        this.favColor = favColor;
        System.out.println("My name is "+this.name);
        System.out.println("My age is "+this.age);
        System.out.println("My favorite color "+this.favColor);
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getFavColor() {
//        return favColor;
//    }
//
//    public void setFavColor(String favColor) {
//        this.favColor = favColor;
//    }
}
