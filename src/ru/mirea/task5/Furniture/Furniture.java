package ru.mirea.task5.Furniture;

import java.lang.*;

public abstract class Furniture {
    protected String company;

    public Furniture(String company){
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
    public abstract void dispInfo();
}
