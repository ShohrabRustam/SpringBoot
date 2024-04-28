package com.example.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private  int lid;
    private  String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getLid() {
        return lid;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile(){
        System.out.println("Compiling .............");
    }

}
