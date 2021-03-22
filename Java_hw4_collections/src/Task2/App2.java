package Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Map<String, String> authInfo = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = -1;
            while (choice != 0) {
                choice = menu(scanner);
                actions(authInfo, scanner, choice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("1. Add a new user;");
        System.out.println("2. Delete an existing user;");
        System.out.println("3. Check if the user exists;");
        System.out.println("4. Change the login of an existing user;");
        System.out.println("5. Change the password of an existing user;");
        System.out.println("0. Exit.");
        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void actions(Map<String, String> authInfo, Scanner scanner, int i) {
        try {
            switch (i) {
                case 0:
                    break;
                case 1: {
                    System.out.println("Please enter the login:");
                    String login = scanner.next();
                    System.out.println("Please enter the password:");
                    String psw = scanner.next();
                    authInfo.put(login, psw);
                    break;
                }
                case 2: {
                    String login = loginCheck(authInfo, scanner);
                    if (login.equals("")) break;
                    if (loginPasswordCheck(authInfo, scanner, login)) {
                        authInfo.remove(login);
                        System.out.println("The user has been removed successfully!");
                        break;
                    }
                    break;
                }
                case 3: {
                    if (!loginCheck(authInfo, scanner).equals(""))
                        System.out.println("Yes, the user with this login is in the list:)");
                    break;
                }
                case 4: {
                    String login = loginCheck(authInfo, scanner);
                    if (login.equals("")) break;
                    if (loginPasswordCheck(authInfo, scanner, login)) {
                        System.out.println("Please enter the new login:");
                        String newLogin = scanner.next();
                        if (!login.equals(newLogin)) {
                            authInfo.put(newLogin, authInfo.remove(login));
                            System.out.println("The login has been changed successfully!");
                        }else {
                            System.out.println("You've entered the same login");
                        }
                        break;
                    }
                    break;
                }
                case 5: {
                    String login = loginCheck(authInfo, scanner);
                    if (login.equals("")) break;
                    if (loginPasswordCheck(authInfo, scanner, login)) {
                        System.out.println("Please enter the new password:");
                        String newPassword = scanner.next();
                        authInfo.put(login, newPassword);
                        System.out.println("The password has been changed successfully!");
                        break;
                    }
                    break;
                }
                case 777: {
                    System.out.println(authInfo);
                    break;
                }
                default: {
                    System.out.println("You've entered a wrong symbol or number");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String loginCheck(Map<String, String> authInfo, Scanner scanner) {
        System.out.println("Please enter the login:");
        String login = scanner.next();
        if (authInfo.containsKey(login))
            return login;
        System.out.println("There isn't any user with this login in the list:(");
        return "";
    }

    public static boolean loginPasswordCheck(Map<String, String> authInfo, Scanner scanner, String login) {
        System.out.println("Please enter the password:");
        String psw = scanner.next();
        if (authInfo.get(login).equals(psw))
            return true;
        else
            System.out.println("The password, you've entered to the \"" + login + "\" is wrong!");
        return false;
    }
}
