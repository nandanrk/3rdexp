public class Main {

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
                
                   
                
                    // Main method
                    public static void main(String[] args) {
                        Person emp = new Person("Alice", "15-08-1995");
                        emp.displayPersonName();
                    }
                }
                