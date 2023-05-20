package com.driver;

public class Main {
  RWOnly myName = new RWOnly("Shivam");
  System.out.println(myName.getName());
  myName.setName("Ayush");
  System.out.println(myName.getName());
}