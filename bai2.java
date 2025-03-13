/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan7;
import java.util.Scanner;
    abstract class  person {
protected String name;
protected String address;
public person(String name, String address){
    this.name=name;
    this.address=address;
}
    public abstract void setname(String name);
     public abstract String getaddress();
public abstract void setaddress(String address);
public abstract void display();

public String getname(){
    return name;
}
}

 class employee extends person{
    private int salary;
    public employee(String name,String address,int salary){
    super(name,address);
    this.salary=salary;
}
    @Override
    public void setname(String name){
    this.name=name;
}
    @Override
    public void setaddress(String address){
    this.address=address;
}
   @Override
public String getaddress(){
    return address;
}
    @Override
    public void display(){
  System.out.println("employee: " + name);
        System.out.println("address: " + address);
        System.out.println("salary: " + salary);
    }
}
    class customer extends person{
 private int balance;
    public customer(String address,int balance){
      super(name,address);
    this.balance=balance;
}
  @Override
    public void setname(String name){
    this.name=name;
}
    @Override
    public void setaddress(String address){
    this.address=address;
}
   @Override
public String getaddress(){
    return address;
}
    @Override
    public void display(){
       System.out.println("customer: " + name);
        System.out.println("address: " + address);
        System.out.println("balance: " + balance);
    }
    }
public class bai2{
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name:");
        System.out.print("name: ");
        String empname = scanner.nextLine();
        System.out.print("address: ");
        String empaddress = scanner.nextLine();
        System.out.print("salary: ");
        int empsalary = scanner.nextInt();
        scanner.nextLine();

        employee emp = new employee(empname,empaddress,empsalary);
        System.out.println("thong tin employee:");
        emp.display();

        System.out.println("nhap customer:");
        System.out.print("name: ");
        String cusname = scanner.nextLine();
        System.out.print("address: ");
        String cusaddress = scanner.nextLine();
        System.out.print("balance: ");
        int cusbalance = scanner.nextInt();
        
        customer cus = new customer(cusname,cusaddress,cusbalance);
        System.out.println("thong tin customer:");
        cus.display();
}
}