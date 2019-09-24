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
    
public class Manager extends Employee {
//         Nama : Rhio Adjie Fabian (Pembuat Manager.java)
//         Deklarasi class Manager yaitu termasuk subclass dari Employee
//         Hubungan antara dua class diatas yaitu Employee adalah superclass dan Manager adalah subclass
    private double bonus; // Inisiasi variable double
    public Manager(String name, double salary, int year, int month, int day){
//         Constructor dari class Manager 
//         Constructor adalah method yang akan dijalankan pertama kali dijalankan disuatu class
        super(name, salary, year, month, day);
//         Memakai method super karena class Manager adalah suatu subclass
//         di kasus ini class Manager akan memakai constructor dari superclass yaitu Employee
//         jadi untuk dapat memakainya haruslah menggunakan keyword super()
//         Kasus tidak memakai super pada constructor
//         Employee(name, salary, year, month, day);
//         Muncul pesan error seperti dibawah ini
//         error: constructor Employee in class Employee cannot be applied to given types;
//         public Manager(String name, double salary, int year, int month, int day){
//         required: String,double,int,int,int
//         found: no arguments
//         reason: actual and formal argument lists differ in length
//         jadi diperlukan keyword super untuk mengakses suatu constructor disuperclass untuk dipakai di subclass
        bonus = 0;  // Assign variable bonus
    }
    public double getSalary() {     // method bertipe double
        double baseSalary = super.getSalary();
//         pemakaian kembali keyword super
//         dalam kasus ini super digunakan untuk memanggil method pada superclass yaitu getSalary
//         Kasus tidak memakai keyword super pada method
//         double baseSalary = getSalary();
//         Hasil sama dengan memakai keyword super
        return baseSalary + bonus;  // nilai pengembalian
    }
    public void setBonus(double bonus){
        this.bonus = bonus;     // Menset field bonus dengan value dari parameter setBonus
//        pemakaian this karena untuk membedakan variabel yang dideklrasi pada class teretentu
//        kondisi pemakaian this jika nama field sama dengan nama parameter
//        kondisi tidak memakai keyword this
//        bonus = bonus;
//        Hasil nya chapter5.Manager[name=Carl Cracker,salary=80000.0,hireDay=1987-12-15][bonus =0.0]
//        kondisi memakai this
//        Hasil nya chapter5.Manager[name=Carl Cracker,salary=80000.0,hireDay=1987-12-15][bonus =5000.0]
//        Dilihat bahwa nilai bonus nya berbeda, jadi keyword this dipergunakan untuk pembeda variabel
    }
    public boolean equals(Object otherObject){  // terdapat parameter bertipe object
        if(!super.equals(otherObject))  return false;
//        Memeriksa apakah objek class dari superclass sama dengan Objek yang ada pada parameter
        Manager other = (Manager) otherObject;
//        proses casting objek other
//        super equals checked that this and other belong to the same class
        return bonus == other.bonus;
    } 
    public int hashCode(){
//        bob.hashCode() : -624019882
//        carl.hashCode() : -341762419
        return super.hashCode() + 17 * new Double(bonus).hashCode(); 
//        Keyword super
//        Hasil jika memakai super
//        bob.hashCode() : -624019882
//        carl.hashCode() : -341762419
//        Hasil jika tidak memakai super
//        Exception in thread "main" java.lang.StackOverflowError
//	  at chapter5.Manager.hashCode(Manager.java:67)
//        Program mungkin kebingunang untuk mengeksekusi kode
//        Jadi solusi nya memakai keyword this
    }
    public String toString(){
        return super.toString() + "[bonus =" + bonus + "]";
        // Memakai kembali method toString yang ada di superclass
    }
}
