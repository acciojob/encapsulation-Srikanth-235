package com.driver;

public class Main {
  public static void main(String args[]){
  RWOnly r = new RWOnly();
    r.setName("srikanth");
    r.setAge(10);
    r.setAddress("guntur");
    System.out.println(r.getName());
    System.out.println(r.getAge());
    System.out.println(r.getAddress());
  }

  
}
