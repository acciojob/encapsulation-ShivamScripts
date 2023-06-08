package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly myName = new RWOnly();
    myName.setName("Shivam");
    System.out.println(myName.getName());
  }
}