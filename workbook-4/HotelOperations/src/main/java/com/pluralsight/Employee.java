package com.pluralsight;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return (getReqularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public double getReqularHours() {
    if (hoursWorked <= 40) {
        return hoursWorked;
    } else {
        return 40;
        }
    }

    public double getOvertimeHours() {
    if (hoursWorked > 40) {
        return hoursWorked - 40;
    } else {
        return 0;
        }
    }
}
