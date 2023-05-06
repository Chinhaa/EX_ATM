/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt;

import java.io.Serializable;

/**
 *
 * @author dinhv
 */
public class Employee implements Comparable<Employee>,Serializable {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
        
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }
    
    /**
     *
     * @param employee
     * @return
     */
    @Override
    public int compareTo(Employee employee) {
        String[] employee1 = this.getName().split(" ");
        String[] employee2 = employee.getName().split(" ");
        String lastname1 = employee1[employee1.length - 1];
        String lastname2 = employee2[employee2.length - 1];
        return lastname1.compareTo(lastname2);
    }
    
}
