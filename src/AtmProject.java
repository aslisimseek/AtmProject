import java.util.Scanner;

public class AtmProject {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String systemUsername = "asli";
            String systemPassword = "asli1234";
            int systemBalance = 1000;
            int right = 3;
            int select;
            while (right > 0) {
                System.out.print("User Name..:");
                String userNAme = scanner.nextLine();
                System.out.print("Password..:");
                String password = scanner.nextLine();

                if (userNAme.equals(systemUsername) && password.equals(systemPassword)) {
                    System.out.println("Succesfully Login.Welcome ASlI BANK!");

                    System.out.println("1-Cash Deposite\n" +
                            "2-Drawing Cash\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit Yap");

                    System.out.print("Please Enter your selection : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Cash Amount..:");
                            int cashAdd = scanner.nextInt();
                            systemBalance += cashAdd;
                            System.out.println("Cash Amount..:" + systemBalance);
                            break;
                        case 2:
                            System.out.println("Drawing Cash..:");
                            int cashDrawing = scanner.nextInt();
                            systemBalance -= cashDrawing;
                            System.out.println("Drawing Cash..:" + systemBalance);
                            if (cashDrawing > systemBalance) {
                                System.out.println("Bakiye yetersiz.");
                                break;
                            }
                        case 3:
                            System.out.println("Balance Inquiry..:" + systemBalance);
                            break;


                        default:
                            System.out.println("See you later..");
                            break;
                    }
                    break;
                } else {
                    right--;
                    System.out.println("You entered wrong.Please try again! Remainder Rights...:" + right);

                }
            }
        }
    }

