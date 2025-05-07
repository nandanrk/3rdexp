public class MainMod {

                    // Person class
                    static class Person {
                        String name;
                        String dob; // Format: DD-MM-YYYY or YYYY-MM-DD
                
                        public Person(String name, String dob) {
                            this.name = name;
                            this.dob = dob;
                        }
                
                        public void displayPersonName() {
                            System.out.println("Name: " + name);
                        }
                
                        public void displayAge() {
                            int birthYear = 0;
                            if (dob.contains("-")) {
                                String[] parts = dob.split("-");
                                if (dob.indexOf('-') == 4) {
                                    // Format: YYYY-MM-DD
                                    birthYear = Integer.parseInt(parts[0]);
                                } else {
                                    // Format: DD-MM-YYYY
                                    birthYear = Integer.parseInt(parts[2]);
                                }
                            }
                            int currentYear = 2025; // You can replace with dynamic year logic if needed
                            int age = currentYear - birthYear;
                            System.out.println("Age: " + age);
                        }
                    }
                
                    // Employee class inheriting from Person
                    static class Employee extends Person {
                        int empId;
                        double salary;
                
                        public Employee(String name, String dob, int empId, double salary) {
                            super(name, dob);
                            this.empId = empId;
                            this.salary = salary;
                        }
                
                        public void displayEmployeeDetails() {
                            displayPersonName();
                            displayAge();
                            System.out.println("Employee ID: " + empId);
                            System.out.println("Salary: " + salary);
                        }
                    }
                
                    // Main method
                    public static void main(String[] args) {
                        Employee emp = new Employee("Alice", "15-08-1995", 101, 55000.50);
                        emp.displayEmployeeDetails();
                    }
                }
                