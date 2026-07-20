import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int appchoice = 1;
        User[] userArray = new User[10];

        while (appchoice != 0) {
            System.out.println("welcome to task manager");
            System.out.println("1.start");
            System.out.println("0.close");
            System.out.println("enter your apppchoice");
            int choice = new Integer(sc.nextLine());

            if (choice > 1) {
                System.out.println("invalid option");
            }

            try {
                appchoice = new Integer(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Enter number only.");
                continue;
            }

            if (appchoice == 0) {
                continue;
            }

            System.out.println("enter your username");
            String username = sc.nextLine();
            System.out.println("enter your password");
            String password = sc.nextLine();

            int result = Utilities.login(userArray, username, password);
            User currentUser = null;

            if (result == -2) {
                System.out.println("invalid password");
            } else if (result == -1) {
                System.out.println("creating a user");
                User user = new User();
                user.username = username;
                user.password = password;

                for (int i = 0; i < userArray.length; i++) {
                    if (userArray[i] == null) {
                        userArray[i] = user;
                        currentUser = user;
                        break;
                    }
                }
            } else {
                currentUser = userArray[result];
            }

            if (currentUser == null) {
                continue;
            }

            int useroption = 0;//starts running not equal to 5

            while (useroption != 5) {

                System.out.println("what you all do");
                System.out.println("1.create");
                System.out.println("2.read");
                System.out.println("3.update");
                System.out.println("4.delete");
                System.out.println("5.exit");
                System.out.println("enter your option");

                try {
                    useroption = new Integer(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Invalid option");
                    continue;
                }

                int userChoice = 0;// inside read option

                if (useroption == 1) {
                    String con = " ";
                    while (!con.equals("no")) {

                        System.out.println("enter your task name");
                        String name = sc.nextLine();

                        System.out.println("do you want to create description");
                        String des = sc.nextLine();
                        String description = "";

                        if (des.equals("yes")) {
                            System.out.println("enter your description");
                            description = sc.nextLine();
                        }

                        boolean cr = currentUser.createTask(name, description);

                        if (cr == true) {
                            System.out.println("task created successfully");
                        } else {
                            System.out.println("error in creating task");
                        }

                        System.out.println("do you want to continue to create ");
                        con = sc.nextLine();
                    }
                } else if (useroption == 2) {

                    while (userChoice != 4) {

                        System.out.println("read all task");
                        System.out.println("1.TO DO");
                        System.out.println("2.IN PROGRESS");
                        System.out.println("3.DONE");
                        System.out.println("4.exit");

                        try {
                            userChoice = new Integer(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Invalid choice");
                            continue;
                        }

                        if (userChoice == 1) {
                            for (int i = 0; i < currentUser.listOfTasks.length; i++) {
                                if (currentUser.listOfTasks[i] != null &&
                                        currentUser.listOfTasks[i].getStatus().equals("To-Do")) {

                                    System.out.println("Task Name: " + currentUser.listOfTasks[i].getName());
                                    System.out.println("Description: " + currentUser.listOfTasks[i].getDescription());
                                    System.out.println("Status: " + currentUser.listOfTasks[i].getStatus());
                                }
                            }
                        } else if (userChoice == 2) {
                            for (int i = 0; i < currentUser.listOfTasks.length; i++) {
                                if (currentUser.listOfTasks[i] != null &&
                                        currentUser.listOfTasks[i].getStatus().equals("In-Progress")) {

                                    System.out.println("Task Name: " + currentUser.listOfTasks[i].getName());
                                    System.out.println("Description: " + currentUser.listOfTasks[i].getDescription());
                                    System.out.println("Status: " + currentUser.listOfTasks[i].getStatus());
                                } else {
                                    System.out.println("no task is created");
                                    break;
                                }
                            }
                        } else if (userChoice == 3) {
                            for (int i = 0; i < currentUser.listOfTasks.length; i++) {
                                if (currentUser.listOfTasks[i] != null &&
                                        currentUser.listOfTasks[i].getStatus().equals("Done")) {

                                    System.out.println("Task Name: " + currentUser.listOfTasks[i].getName());
                                    System.out.println("Description: " + currentUser.listOfTasks[i].getDescription());
                                    System.out.println("Status: " + currentUser.listOfTasks[i].getStatus());
                                }
                            }
                        }
                    }
                } else if (useroption == 3) {
                    String update = " ";
                    while (!update.equals("no")) {

                        if (currentUser.listOfTasks[0] != null)// {

                            for (int i = 0; i < currentUser.listOfTasks.length; i++) {
                                if (currentUser.listOfTasks[i] != null) {
                                    System.out.print(i + 1);
                                    System.out.print("." + currentUser.listOfTasks[i].getName());
                                    System.out.print(" | " + currentUser.listOfTasks[i].getDescription());
                                    System.out.println(" | " + currentUser.listOfTasks[i].getStatus());
                                } else {
                                    break;
                                }
                            }

                        System.out.println("enter task number you want to update");

                        int taskNo;
                        try {
                            taskNo = new Integer(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Invalid task number");
                            continue;
                        }

                        if (taskNo <= 0 || taskNo > currentUser.listOfTasks.length ||
                                currentUser.listOfTasks[taskNo - 1] == null) {
                            System.out.println("Invalid task number");
                            continue;
                        }

                        System.out.println("1.update name");
                        System.out.println("2.update description");
                        System.out.println("3.update status");


                        try {
                            choice = new Integer(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Invalid option");
                            continue;
                        }

                        if (choice == 1) {
                            System.out.println("enter a new name");
                            String name = sc.nextLine();
                            currentUser.listOfTasks[taskNo - 1].setName(name);
                        } else if (choice == 2) {
                            System.out.println("enter a new description");
                            String description = sc.nextLine();
                            currentUser.listOfTasks[taskNo - 1].setDescription(description);
                        } else if (choice == 3) {
                            System.out.println("---Status---");
                            System.out.println("1.To-Do.");
                            System.out.println("2.In-Progress.");
                            System.out.println("3.Done");

                            String option1 = sc.nextLine();

                            if (option1.equals("1")) {
                                currentUser.listOfTasks[taskNo - 1].setStatus("To-Do");
                            } else if (option1.equals("2")) {
                                currentUser.listOfTasks[taskNo - 1].setStatus("In-Progress");
                            } else if (option1.equals("3")) {
                                currentUser.listOfTasks[taskNo - 1].setStatus("Done");
                            }
                        } else {
                            System.out.println("there is no task");
                        }

                        System.out.println("do you want to continue to update ");
                        update = sc.nextLine();
                    }
                } else if (useroption == 4) {
                    String delete = " ";
                    while (!delete.equals("no")) {

                        if (currentUser.listOfTasks[0] != null) {

                            for (int i = 0; i < currentUser.listOfTasks.length; i++) {
                                if (currentUser.listOfTasks[i] != null) {
                                    System.out.print(i + 1);
                                    System.out.print("." + currentUser.listOfTasks[i].getName());
                                    System.out.print(" | " + currentUser.listOfTasks[i].getDescription());
                                    System.out.println(" | " + currentUser.listOfTasks[i].getStatus());
                                } else {
                                    break;
                                }
                            }

                            System.out.println("enter task number you want to delete");

                            int taskNo;
                            try {
                                taskNo = new Integer(sc.nextLine());
                            } catch (Exception e) {
                                System.out.println("Invalid task number");
                                continue;
                            }

                            if (taskNo <= 0 || taskNo > currentUser.listOfTasks.length ||
                                    currentUser.listOfTasks[taskNo - 1] == null) {
                                System.out.println("Invalid task number");
                                continue;
                            }

                            currentUser.listOfTasks[taskNo - 1] = null;
                            System.out.println("Deleted successfully");

                        } else {
                            System.out.println("There is no task");
                        }

                        System.out.println("do you want to continue to delete");
                        delete = sc.nextLine();
                    }
                } else if (useroption == 5) {
                    System.out.println("thank you for using");
                }
            }
        }
    }
}