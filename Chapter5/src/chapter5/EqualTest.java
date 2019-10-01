/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author Rhio
 */
public class EqualTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams",75000,1987,12,15); // membuat objek alice dari class employee
        Employee alice2 = alice1; //membuat objek alice2 dengan diisi oleh objek alice1 dari class employee
        Employee alice3 = new Employee("Alice Adams",75000,1987,12,15); // membuat objek alice3 dari class employee
        Employee bob = new Employee("Bob Brandson",50000,1989,10,1); // membuat objek bob dari class employee

        println("alice1 == alice2 : " + (alice1 == alice2)); // menampilkan hasil EqualTest
        println("alice1 == alice3 : " + (alice1 == alice3)); // menampilkan hasil EqualTest
        println("alice1.equals(alice3) : " + alice1.equals(alice3)); // menampilkan hasil EqualTest
        println("alice1.equals(bob) : " + alice1.equals(bob)); // menampilkan hasil EqualTest dengan objek bob
        println("bob.toString() : " + bob); // membuat isi objek bob kedalam satu string lalu ditampilkan
        
        Manager carl = new Manager("Carl Cracker",80000,1987,12,15);
        /* 
            error: incompatible types: Employee cannot be converted to Manager
            error diatas terjadi karena mencoba membuat objek Manager baru namun
            dari class Employee
            solusi: harus sesuai saat membuat objek dari suatu class.
        */
        /* beda dengan Employee alice3 = new Manager("Alicer Adams"75000,1987,12,15);
           Disini tidak akan error karena manager merupakan objek dari class Employee
        */
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        println("boss.toString() : " + boss);
        println("carl.equals(boss) : "+ carl.equals(boss));
        println("alice1.hashCode() : " + alice1.hashCode());
        println("alice3.hashCode() : " + alice3.hashCode());
        println("bob.hashCode() : " + bob.hashCode());
        println("carl.hashCode() : " + carl.hashCode());
    }
    private static void println(String p){
        System.out.println(p);
    }
 }
    
