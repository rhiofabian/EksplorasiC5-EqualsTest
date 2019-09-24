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
        Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",75000,1987,12,15);
        Employee bob = new Employee("Bob Brandson",50000,1989,10,1);

        println("alice1 == alice2 : " + (alice1 == alice2));
        println("alice1 == alice3 : " + (alice1 == alice3));
        println("alice1.equals(alice3) : " + alice1.equals(alice3));
        println("alice1.equals(bob) : " + alice1.equals(bob));
        println("bob.toString() : " + bob);
        
        Manager carl = new Manager("Carl Cracker",80000,1987,12,15);
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
    
