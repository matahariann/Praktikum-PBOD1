package org.parent;

public class Parent {
    protected String name;
    protected int age;
    protected String address;
    protected String ID;

    public void getDetails(){
        System.out.println("Name\t\t: " + name);
        System.out.println("Age\t\t: " + age);
        System.out.println("Address\t\t: " + address);
        System.out.println("ID\t\t: " + ID);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    
    public String getAddress(){
        return this.address;
    }

    public String getID(){
        return this.ID;
    }

}


