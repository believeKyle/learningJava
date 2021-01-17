package com.kyle.corejava;

import java.util.Date;

public class Employee implements Comparable<Employee>,Cloneable{

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        //super(name);
        this.name = name;
        //super(name);
        this.salary = salary;
        this.hireDay = new Date();
        //hireDay = LocalDate.of(year,month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee)super.clone();
        cloned.hireDay = (Date)hireDay.clone();
        return cloned;
    }
}
