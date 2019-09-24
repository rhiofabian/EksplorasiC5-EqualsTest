/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.time.*;
import java.util.Objects;
import java.lang.String;

/**
 *
 * @author Rhio
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireday = LocalDate.of(year, month, day);
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public LocalDate getHireDay(){
        return this.hireday;
    }
    public void raiseSalary(double p){
        double raise = salary * p / 100;
        salary += raise;
    }
    public boolean equals(Object otherObject){
        //a quick test to see if the objects are identical
        if(this == otherObject) return true;

        //must return false if the explicit parameter is null
        if(otherObject == null) return false;

        //if the classes don't match, they can't be equal
        if(getClass() != otherObject.getClass()) return false;

        //now we know otherObject is non-null Employee
        Employee other = (Employee) otherObject;

        //test whether the fields have identical values
        return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireday,other.hireday);
    }
    public int hashCode(){
        return Objects.hash(name,salary,hireday);
    }
    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireday + "]";
    }
}
