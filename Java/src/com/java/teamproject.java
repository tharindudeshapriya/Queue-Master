package com.java;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;



public class teamproject extends subClass {
    public static void Id() {//create id queue
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println("\t\t\t\t\t\t|\t\tID QUEUE\t\t|");//id main menu
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println();

        Scanner num = new Scanner(System.in);
        System.out.println("1.Continue ID queue ");
        System.out.println("2.Read ID.txt files ");
        System.out.println("3.Delete ID.txt files ");
        System.out.println("4.Go to main menu ");
        System.out.println();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("What do you choose from here(enter Number): ");
        try {
            int id = num.nextInt();
            switch (id) {
                case 1:
                    break;

                case 2://read files for id queue
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t+---------------------------+");
                    System.out.println("\t\t\t\t\t\t|\t\tREAD ID LIST\t\t|");//id main menu
                    System.out.println("\t\t\t\t\t\t+---------------------------+");
                    System.out.println();
                    System.out.println("1.Read MondayID List(0,1) \t\t\t 5.Read FridayID List(7)");
                    System.out.println("2.Read TuesdayID List(2,3) \t\t\t 6.Read SaturdayID List(8)");
                    System.out.println("3.Read WednesdayID List(5) \t\t\t 7.Read SundayID List(9)");
                    System.out.println("4.Read ThursdayID List(6)");
                    System.out.println("9.Go to ID Queue Menu");
                    System.out.println();
                    System.out.print("What you want to read (Enter Number): ");
                    Scanner read = new Scanner(System.in);
                    try {
                        int num2 = read.nextInt();
                        teamproject dayRead = new teamproject();
                        switch (num2) {
                            case 1 ->//read monday list
                                    dayRead.read(1);
                            case 2 ->//read tuesday list
                                    dayRead.read(2);
                            case 3 ->//read wednesday list
                                    dayRead.read(3);
                            case 4 ->//read thursday list
                                    dayRead.read(4);
                            case 5 -> //read friday list
                                    dayRead.read(5);
                            case 6 -> //read saturday list
                                    dayRead.read(6);
                            case 7 -> //read sunday list
                                    dayRead.read(7);
                            case 9 ->// go to id menu
                                    Id();
                            default -> {
                                errorMassege msg=new errorMassege();
                                msg.msg1(num2);//call Polymorphism method
                                System.out.println();
                                Id();
                            }
                        }
                    } catch (Exception e) {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
                        System.out.println();
                        Id();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t+---------------------------+");
                    System.out.println("\t\t\t\t\t\t|\t\tDELETE ID LIST\t\t|");//id main menu
                    System.out.println("\t\t\t\t\t\t+---------------------------+");
                    System.out.println();
                    System.out.println("1.Delete MondayID List \t\t\t\t 5.Delete FridayID List");
                    System.out.println("2.Delete TuesdayID List \t\t\t 6.Delete SaturdayID List");
                    System.out.println("3.Delete WednesdayID List \t\t\t 7.Delete SundayID List");
                    System.out.println("4.Delete ThursdayID List \t\t\t 8.Delete All ID List");
                    System.out.println("9.Go to ID Queue Menu");
                    System.out.println();
                    System.out.print("What you want to delete (Enter Number): ");
                    Scanner delete = new Scanner(System.in);
                    try {
                        int num2 = delete.nextInt();
                        teamproject dayDelete = new teamproject();
                        switch (num2) {
                            case 1 ->//delete monday list
                                    dayDelete.delete(1);
                            case 2 ->//delete tuesday list
                                    dayDelete.delete(2);
                            case 3 ->//delete wednesday list
                                    dayDelete.delete(3);
                            case 4 ->//delete thursday list
                                    dayDelete.delete(4);
                            case 5 -> //delete friday list
                                    dayDelete.delete(5);
                            case 6 -> //delete saturday list
                                    dayDelete.delete(6);
                            case 7 -> //delete sunday list
                                    dayDelete.delete(7);
                            case 8 -> { //delete sunday list
                                teamproject all = new teamproject();
                                all.deleteAll();
                            }
                            case 9 ->// go to id menu
                                    Id();
                            default -> {
                                errorMassege msg=new errorMassege();
                                msg.msg1(num2);////call Polymorphism method
                                System.out.println();
                                Id();
                            }
                        }
                    } catch (Exception e) {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
                        System.out.println();
                        Id();
                    }

                    break;
                case 4:
                    main(null);
                    break;
                default:
                    errorMassege msg=new errorMassege();
                    msg.msg1(id);//call Polymorphism method
                    System.out.println();
                    Id();
                    break;
            }

        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
            System.out.println();
            Id();
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many customers add now: ");
        try {
            int in = input.nextInt();
            teamproject make = new teamproject();//files create
            make.create();

            for (int i = 0; in > i; i++) {
                System.out.println();
                Scanner add = new Scanner(System.in);
                String[] iName = new String[in];
                System.out.print("Enter Customer Name: ");//get customer information
                iName[i] = add.nextLine();

                System.out.println();
                System.out.println("\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("\t\t|NIC\tLast\tDigit ===============>>>>>>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t |");
                System.out.println("\t\t|\t\t0,1\t==>\tMonday\t\t\t2,3\t==>\tTuesday\t\t4,5\t==>\tWednesday\t\t6\t==>\tThursday\t\t7\t==>\tFriday\t\t8\t==> Saturday\t\t9\t==>Sunday|\t\t");
                System.out.println("\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                long[] nic = new long[in];
                System.out.print("Enter Your NIC Number(without 'V'): ");
                nic[i] = add.nextLong();
                int lastDigit = (int) (nic[i] % 10);//get customer nic

                Scanner add1 = new Scanner(System.in);
                String[] number = new String[in];
                System.out.print("Enter Customer Telephone Number: ");//get customer phone number
                number[i] = add1.nextLine();

                teamproject set = new teamproject();//IdInformation class object
                if (lastDigit == 0 || lastDigit == 1) {
                    //monday
                    int monday = 0;
                    set.success(iName[i], nic[i], number[i], monday);

                } else if (lastDigit == 2 || lastDigit == 3) {
                    //tuesday
                    int tuesday = 1;
                    set.success(iName[i], nic[i], number[i], tuesday);

                } else if (lastDigit == 4 || lastDigit == 5) {
                    //wednesday
                    int wednesday = 2;
                    set.success(iName[i], nic[i], number[i], wednesday);

                } else if (lastDigit == 6) {
                    //thursday
                    int thursday = 3;
                    set.success(iName[i], nic[i], number[i], thursday);

                } else if (lastDigit == 7) {
                    //friday
                    int friday = 4;
                    set.success(iName[i], nic[i], number[i], friday);

                } else if (lastDigit == 8) {
                    //saturday
                    int saturday = 5;
                    set.success(iName[i], nic[i], number[i], saturday);

                } else {
                    //sunday
                    int sunday = 6;
                    set.success(iName[i], nic[i], number[i], sunday);
                }
            }
            Id();

        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.println();
            Id();
        }

    }

    public static void token() {//this is token function
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println("\t\t\t\t\t\t|\t\tToken Queue\t\t|");//Title display
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println();

        System.out.println("1.Continue token queue ");
        System.out.println("2.Read token.txt file ");
        System.out.println("3.Delete token.txt file ");
        System.out.println("4.Go to main menu ");
        System.out.println();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("What do you choose from here(enter Number): ");
        try {
            int token = input.nextInt();
            switch (token) {
                case 1:
                    break;

                case 2:
                    try {//read token.txt file
                        File tokenFile = new File("token.txt");
                        Scanner fscan = new Scanner(tokenFile);
                        while (fscan.hasNextLine()) {
                            String readData = fscan.nextLine();
                            System.out.println(readData);
                        }
                        fscan.close();
                    } catch (Exception e) {
                        System.out.println();
                        System.out.println("\t\t\t\t\t* File doesn\'t exist!!!!");
                        token();
                    }
                    Scanner menu = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Do you want to go token menu press enter: ");
                    try {
                        String menuInput = menu.nextLine();
                        if (menuInput == "") {
                            token();
                        }
                    } catch (Exception e) {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        token();
                    }

                    break;
                case 3://delete token txt file
                    File obj = new File("token.txt");
                    if (obj.delete()) {
                        System.out.println();
                        System.out.println("\t\t\t\t\t* Deleted the token txt file!!!!");
                        token();

                    } else {
                        System.out.println();
                        System.out.println("\t\t\t\t\t* File doesn\'t exist!!!!");
                        token();
                    }
                    break;
                case 4:
                    main(null);
                    break;
                default:
                    errorMassege msg=new errorMassege();
                    msg.msg1(token);////call Polymorphism method
                    System.out.println();
                    token();
                    break;
            }

        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
            System.out.println();
            token();
        }

        try { //check exception
            System.out.println();
            System.out.print("How many people should be there per day: ");
            int members = input.nextInt();

            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String[] week = {"First Week", "Second Week", "Third Week", "Fourth Week"};

            for (int i = 0; i < 4; i++) {//this is week loop
                System.out.println("\n" + week[i] + " ------------->");


                try { //write a file for week
                    BufferedWriter writer = new BufferedWriter(new FileWriter("token.txt", true));
                    writer.write("\n" + week[i] + " ------------->");
                    writer.newLine();
                    writer.close();
                } catch (Exception e) {
                    System.out.println("File error");

                }


                int count = 0;

                loop:
                for (int j = 0; j < 7; j++) {       //these are days of week loop
                    System.out.println("\t\t\t\t\t\t\t" + days[j] + " " + "Token Queue");
                    System.out.println("\t\t\t\t\t\t---------------------------");


                    try { //write a file for days
                        BufferedWriter writer = new BufferedWriter(new FileWriter("token.txt", true));
                        writer.write("\t\t\t\t\t\t\t" + days[j] + " " + "Token Queue");
                        writer.newLine();
                        writer.write("\t\t\t\t\t\t---------------------------");
                        writer.newLine();
                        writer.close();
                    } catch (Exception e) {
                        System.out.println("File error");
                    }


                    for (int k = 0; k < members; k++) {     //get customers information and give the token number
                        Scanner scan = new Scanner(System.in);
                        String[] cname = new String[members]; //using array to store customers name
                        System.out.print("\t\t\t\t\tEnter customer name: ");
                        cname[k] = scan.nextLine();

                        String[] nic = new String[members];//using array to store customers nic number
                        System.out.print("\t\t\t\t\tEnter customer NIC number: ");
                        nic[k] = scan.nextLine();

                        String[] no = new String[members];//using array to store customers telephone number
                        System.out.print("\t\t\t\t\tEnter customer Telephone number: ");
                        no[k] = scan.nextLine();


                        //print customer's name and token number
                        System.out.println("\t\t\t\t\t* " + cname[k] + "\'s" + " " + "token number is: " + (k + 1));
                        System.out.println();
                        count++;


                        try { //write a file for token numbers
                            BufferedWriter writer = new BufferedWriter(new FileWriter("token.txt", true));
                            writer.write("\t\t\t\t\tName: " + cname[k]);
                            writer.newLine();
                            writer.write("\t\t\t\t\tNIC: " + nic[k]);
                            writer.newLine();
                            writer.write("\t\t\t\t\tT.No: " + no[k]);
                            writer.newLine();
                            writer.write("\t\t\t\t\tToken No: " + (k + 1));
                            writer.newLine();
                            writer.newLine();
                            writer.close();
                        } catch (Exception e) {
                            System.out.println("File error");
                        }


                    }

                    Scanner sp = new Scanner(System.in);
                    System.out.println("1. Go to next week");
                    System.out.println("2. Go to token queue menu");
                    System.out.println("3. Continue this week");
                    System.out.print("What do you choose from here(enter Number): ");
                    int stop = sp.nextInt();
                    switch (stop) {
                        case 1:
                            break loop;
                        case 2:
                            System.out.println("\n\t\t* " + count + " " + " peoples are in line in the " + week[i]);

                            try { //write a file for people count in a week
                                BufferedWriter writer = new BufferedWriter(new FileWriter("token.txt", true));
                                writer.write("\n\t\t* %d  peoples are in line in the %s".formatted(count, week[i]));
                                writer.newLine();
                                writer.close();

                            } catch (Exception e) {
                                System.out.println("File error");
                            }
                            token();
                            break;
                        default:
                            System.out.println();
                            continue loop;
                    }
                }
                System.out.println("\n\t\t* " + count + " " + " peoples are in line in the " + week[i]);

                try { //write a file for people count in a week
                    BufferedWriter writer = new BufferedWriter(new FileWriter("token.txt", true));
                    writer.write("\n\t\t* %d  peoples are in line in the %s".formatted(count, week[i]));
                    writer.newLine();
                    writer.close();

                } catch (Exception e) {
                    System.out.println("File error");
                }

                total += count;

            }
            System.out.println();
            System.out.println("\n\t*** " + total + " " + " peoples are in line in this month");
            try { //write a file for total of month
                BufferedWriter writer = new BufferedWriter(new FileWriter("token.txt", true));
                writer.newLine();
                writer.write("\n\t*** %d  peoples are in line in this month".formatted(total));
                writer.newLine();

            } catch (Exception e) {
                System.out.println("File error");
            }
        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct answer----!!!");
            System.out.println();
            token();
        }


    }

    public static void appointment() {


        try {
            File arrayText = new File("Appointment_array.txt");
            if (arrayText.createNewFile()) {
                System.out.println("File created: " + arrayText.getName());
            }
        } catch (Exception e) {
        }
        Scanner apMenuInput = new Scanner(System.in);
        //Display main menu
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t\t+-------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\tAppointment Queue\t\t|");        //Display Title
        System.out.println("\t\t\t\t\t\t+-------------------------------+");
        System.out.println();
        System.out.println("1.Display available slots ");
        System.out.println("2.Book a slot ");
        System.out.println("3.Show bookings ");
        System.out.println("4.Erase bookings for this month");
        System.out.println("5.Back to main menu\n ");
        System.out.print("Choose a number from here(enter a Number): ");
        try {
            int men = apMenuInput.nextInt();
            switch (men) {
                case 1 -> {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
                    int[][][][] ap = new int[4][5][8][4]; // week,days,hours,slots
                    char i1, i2, i3, i4;
                    int j1, j2, j3, j4;
                    try {
                        BufferedReader arrayReader = new BufferedReader(new FileReader("Appointment_array.txt"));
                        String arrayLine = arrayReader.readLine();
                        while (arrayLine != null) {

                            i1 = arrayLine.charAt(0);
                            i2 = arrayLine.charAt(1);
                            i3 = arrayLine.charAt(2);
                            i4 = arrayLine.charAt(3);

                            j1 = Integer.parseInt(String.valueOf(i1));
                            j2 = Integer.parseInt(String.valueOf(i2));
                            j3 = Integer.parseInt(String.valueOf(i3));
                            j4 = Integer.parseInt(String.valueOf(i4));

                            ap[j1][j2][j3][j4] = 1;
                            arrayLine = arrayReader.readLine();
                        }
                        arrayReader.close();
                    } catch (Exception e) {
                    }

                    Scanner scanAS = new Scanner(System.in);
                    System.out.print("Enter week number [1,2,3,4] :- ");
                    int week = scanAS.nextInt();

                    while (week > 4 || week < 1) {
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!\n");
                        System.out.print("\nEnter week number [1,2,3,4] :- ");
                        week = scanAS.nextInt();
                    }

                    int w = week - 1;
                    System.out.format("\n\nAvailable slots for week %d\n", w + 1);
                    System.out.print("\t ");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\t\t\t      " + days[i]);             // display days
                    }
                    System.out.println("\n\nHour\tSlot");            //display hour,slot
                    int d, h, s;
                    for (h = 0; h < 8; h++) {
                        //System.out.printf("\n %d ",(h+1));
                        System.out.printf("\n0%d:00 ", (h + 8));       //display hour
                        for (s = 0; s < 4; s++) {
                            if (s == 0) {
                                System.out.print("\t" + (s + 1));     //display slot
                            } else {
                                System.out.print("\t\t" + (s + 1));
                            }
                            for (d = 0; d < 5; d++) {
                                if (ap[w][d][h][s] == 1) {
                                    System.out.print("\t\t\t   Booked");
                                } else {                                      //display availability
                                    System.out.print("\t\t\t---------");
                                }
                            }
                            System.out.println();
                        }
                    }
                    System.out.print("Press 'Enter' to go to Appointment menu : ");       //back to appointment menu
                    Scanner inputCase1 = new Scanner(System.in);
                    String toMenu = inputCase1.nextLine();

                    appointment();

                }
                case 2 -> {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                    Scanner apScan = new Scanner(System.in);
                    int uweek = 0, udate = 0, uhour = 0, uslot = 0;

                    System.out.print("Enter the week [1,2,3,4] :-");
                    uweek = apScan.nextInt() - 1;
                    while (uweek > 3 || uweek < 0) {
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!\n");
                        System.out.print("\nEnter week number [1,2,3,4] :- ");
                        uweek = apScan.nextInt() - 1;
                        ;
                    }

                    System.out.print("Enter the day [ MON:- 1, Tue:- 2, WED:- 3, THU:- 4, FRI:- 5 ] :- ");
                    udate = apScan.nextInt() - 1;
                    while (udate > 4 || udate < 0) {
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!\n");
                        System.out.print("\nEnter the day [ MON:- 1, Tue:- 2, WED:- 3, THU:- 4, FRI:- 5 ] :- ");
                        udate = apScan.nextInt() - 1;
                        ;
                    }

                    System.out.print("Enter hour:\n [ex:-  08:00 :8  \\ 09:00 :9 \\ 10:00 :10 \\ 11:00 :11 \\ 12:00 :12 \n\t\t13:00 :13 \\ 14:00 :14 \\ 15:00 :15  ]\nAnswer : ");
                    uhour = apScan.nextInt() - 8;
                    while (uhour > 7 || uhour < 0) {
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!\n");
                        System.out.print("\nEnter hour:\n [ex:-  08:00 :8  \\ 09:00 :9 \\ 10:00 :10 \\ 11:00 :11 \\ 12:00 :12 \n\t\t13:00 :13 \\ 14:00 :14 \\ 15:00 :15  ]\nAnswer : ");
                        uhour = apScan.nextInt() - 8;
                        ;
                    }

                    System.out.print("Enter slot number [1,2,3,4,} :-");
                    uslot = apScan.nextInt() - 1;
                    while (uslot > 3 || uslot < 0) {
                        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!\n");
                        System.out.print("\nEnter slot number [1,2,3,4,} :-");
                        uslot = apScan.nextInt() - 1;
                        ;
                    }

                    Scanner apsScan = new Scanner(System.in);
                    System.out.print("Enter your Name:-");                                //get name
                    String uName = apsScan.nextLine();

                    System.out.print("Enter your NIC:-");
                    String uNIC = apsScan.nextLine();
                    int uNameLen = uNIC.length();
                    while (uNameLen < 10 || uNameLen > 12 || uNameLen == 11) {
                        System.out.print("\n\t\t\t\t!!!----Please enter a valid NIC number----!!!\n");
                        System.out.print("\nEnter your NIC:-");
                        uNIC = apsScan.nextLine();
                        uNameLen = uNIC.length();
                    }

                    System.out.print("Enter your TP Number:-");
                    String uTP = apsScan.nextLine();
                    int uTPLen = uTP.length();
                    while (uTPLen != 10) {
                        System.out.print("\n\t\t\t\t!!!----Please enter a valid TP number ----!!!\n");
                        System.out.print("\nEnter your TP Number:-");
                        uTP = apsScan.nextLine();
                        uTPLen = uTP.length();
                    }


                    String min = null;
                    if(uslot == 0){ min = ":00"; }
                    if(uslot == 1){ min = ":15"; }
                    if(uslot == 2){ min = ":30"; }
                    if(uslot == 3){ min = ":45"; }


                    String toWrite = String.valueOf(uweek) + String.valueOf(udate) + String.valueOf(uhour) + String.valueOf(uslot) + "\t-\t" + uName + "," + uNIC + "," + uTP + "\n";
                    System.out.println("\n\nYour Appointment details\n");
                    System.out.printf("Name \t:- %s \n", uName);
                    System.out.printf("NIC \t:- %s \n", uNIC);
                    System.out.printf("TP \t\t:- %s \n", uTP);
                    System.out.printf("Week :- %d \t", uweek + 1);
                    System.out.printf("Date :- %d \n", udate + 1);
                    System.out.printf("Time :- %d%s \t\n\n", uhour + 8, min);
                    try {
                        FileWriter apWrite = new FileWriter("Appointment_array.txt", true);
                        apWrite.write(toWrite);
                        apWrite.close();
                    } catch (Exception e) {
                    }

                    System.out.print("Press 'Enter' to go to Appointment menu : ");       //back to appointment menu
                    Scanner inputCase2 = new Scanner(System.in);
                    String toMenucase2 = inputCase2.nextLine();

                    appointment();

                }
                case 3 -> {
                    try {
                        BufferedReader arrayReader3 = new BufferedReader(new FileReader("Appointment_array.txt"));
                        String arrayLine3 = arrayReader3.readLine();
                        while (arrayLine3 != null) {
                            System.out.println(arrayLine3);
                            arrayLine3 = arrayReader3.readLine();
                        }
                        arrayReader3.close();
                    } catch (Exception e) {
                    }
                    System.out.print("\nPress 'Enter' to go to Appointment menu : ");       //back to appointment menu
                    Scanner inputCase3 = new Scanner(System.in);
                    String toMenucase3 = inputCase3.nextLine();

                    appointment();

                }
                case 4 -> {
                    Scanner delScan = new Scanner(System.in);
                    File delArrayTxt = new File("Appointment_array.txt");
                    System.out.println("\nEnter the admin password to delete the file: ");
                    String delPass = delScan.nextLine();
                    if (Objects.equals(delPass, "12345")) {
                        System.out.print("\nAre you sure want to delete 'Appointment_array.txt' file [ y |n ][: ");
                        String delAns = delScan.nextLine();
                        if (Objects.equals(delAns, "y")) {
                            if (delArrayTxt.delete())                      //returns Boolean value
                            {
                                System.out.println(delArrayTxt.getName() + " deleted");   //getting and printing the file name
                            } else {
                                System.out.println("failed");
                            }
                        } else {
                            errorMassege msg=new errorMassege();
                            msg.msg1(delAns);//call Polymorphism method
                            appointment();
                        }
                    } else {
                        System.out.println("You have entered a wrong password!!! please try again...");
                        appointment();
                    }
                    System.out.print("\nPress 'Enter' to go to Appointment menu : ");       //back to appointment menu
                    Scanner inputCase4 = new Scanner(System.in);
                    String toMenucase4 = inputCase4.nextLine();

                    appointment();

                }
                case 5 -> {
                    try {
                        main(null);
                    } catch (Exception e) {
                    }
                }
                default -> {
                    System.out.print("\n\t\t\t\t!!!----You entered wrong number----!!!");
                    System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
                    System.out.println();
                    appointment();
                }

            }
        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong number----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
            System.out.println();
            appointment();
        }


    }

    public static void custom() {

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println("\t\t\t\t\t\t|\t\tCUSTOM MENU\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println();

        System.out.println("\t\t**!!! We hope to reach this option in next update !!!**");
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        main(null);
    }

    public static void developersInfo() {// this is developersInfo function

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        System.out.println("\t\t\t\t\t\t+-----------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\tDevelopers Information\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------------------+");
        System.out.println();
        System.out.println("1.Dilhan Pathum - UWU/CST/20/009 ");
        System.out.println("2.Chalakshana Kaushani - UWU/CST/20/096 ");
        System.out.println("3.Tharindu Deshapriya - UWU/CST/20/113");
        System.out.println("4.Shamini Sivarasa - UWU/CST/20/112");
        System.out.println("5.Miyuni Tharushika - UWU/CST/20/059");
        System.out.println("6.Back to main menu\n ");
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        System.out.print("Enter the person's number to read more details: ");
        Scanner scan=new Scanner(System.in);
        try {
            int dName = scan.nextInt();
            developers our = new developers();
            switch (dName) {
                case 1:
                    System.out.println(our.getInfoD());//print pathum's info
                    Scanner inputnum = new Scanner(System.in);
                    System.out.println();
                    System.out.print(" Do you want to go main menu please press enter :  ");
                    String menuInput = inputnum.nextLine();
                    if (menuInput == "") {
                        developersInfo();
                    } else {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        developersInfo();
                    }
                    break;

                case 2:
                    System.out.println(our.getInfoK());//print kaushi's info
                    Scanner inputnum2 = new Scanner(System.in);
                    System.out.println();
                    System.out.print(" Do you want to go main menu please press enter :  ");
                    String menuInput2 = inputnum2.nextLine();
                    if (menuInput2 == "") {
                        developersInfo();
                    } else {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        developersInfo();
                    }
                    break;

                case 3:
                    System.out.println(our.getInfoT());//print tharindu's info
                    Scanner inputnum3 = new Scanner(System.in);
                    System.out.println();
                    System.out.print(" Do you want to go main menu please press enter :  ");
                    String menuInput3 = inputnum3.nextLine();
                    if (menuInput3 == "") {
                        developersInfo();
                    } else {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        developersInfo();
                    }
                    break;

                case 4:
                    System.out.println(our.getInfoS());//print shamini's info
                    Scanner inputnum4 = new Scanner(System.in);
                    System.out.println();
                    System.out.print(" Do you want to go main menu please press enter :  ");
                    String menuInput4 = inputnum4.nextLine();
                    if (menuInput4 == "") {
                        developersInfo();
                    } else {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        developersInfo();
                    }
                    break;

                case 5:
                    System.out.println(our.getInfoM());//print miyuni's info
                    Scanner inputnum5 = new Scanner(System.in);
                    System.out.println();
                    System.out.print(" Do you want to go main menu please press enter :  ");
                    String menuInput5 = inputnum5.nextLine();
                    if (menuInput5 == "") {
                        developersInfo();
                    } else {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        developersInfo();
                    }
                    break;

                case 6:
                    System.out.println();
                    main(null);

                default:
                    errorMassege msg=new errorMassege();
                    msg.msg1(dName);//call Polymorphism method
                    System.out.println();
                    developersInfo();
            }
        }catch (Exception e){
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
            System.out.println();
            developersInfo();
        }

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        Scanner inputnum = new Scanner(System.in);
        System.out.print(" Do you want to go main menu please press enter :  ");
        String menuInput = inputnum.nextLine();
        if (menuInput == "") {
            main(null);
        } else {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.println();
            main(null);
        }


    }


    public static void userGuide() { //this is user guide function

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t+-----------------------+");
        System.out.println("\t\t\t\t\t\t\t\t|\t\tUser Guide\t\t|");
        System.out.println("\t\t\t\t\t\t\t\t+-----------------------+");
        System.out.println();

        System.out.println("*.You can provide prompt service to your customer by using this system. It is possible to reduce the long queues for the customers to get the goods.");

        System.out.println("Select the relevant number in the main menu that appear the first.*");
        System.out.println();
        System.out.println("1. Create ID Queue Guide");
        System.out.println("2. Create Token Queue Guide");
        System.out.println("3. Create Appointment Queue Guide");
        System.out.println("4. Go to Main Menu");
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("What do you choose from here(enter Number): ");

        try {
            int num = input.nextInt();
            switch (num) {
                case 1://Id queue Guide
                    idGuide obj1=new idGuide();
                    obj1.allGuide();
                    obj1.afterGuideMassage();
                    Scanner inputnum = new Scanner(System.in);
                    try {
                        String menuInput = inputnum.nextLine();
                        if (menuInput == "") {
                            userGuide();
                        }
                    } catch (Exception e) {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        userGuide();
                    }
                    break;

                case 2://token queue guide
                    tokenGuide obj2=new tokenGuide();
                    obj2.allGuide();
                    obj2.afterGuideMassage();
                    Scanner input1 = new Scanner(System.in);
                    try {
                        String menuInput = input1.nextLine();
                        if (menuInput == "") {
                            userGuide();
                        }
                    } catch (Exception e) {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        userGuide();
                    }
                    break;

                case 3:
                    appointmentGuide obj3=new appointmentGuide();
                    obj3.allGuide();
                    obj3.afterGuideMassage();
                    Scanner input2 = new Scanner(System.in);
                    String menuInput1 = input2.nextLine();
                    if (menuInput1 == "") {
                        userGuide();
                    } else {
                        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
                        System.out.println();
                        userGuide();
                    }
                    break;

                case 4:
                    main(null);
                    break;

                default:
                    userGuide();
                    break;
            }


        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
            System.out.println();
            userGuide();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    //Create scanner object
        //main menu
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t+><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t+><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t\tQueue Master\t\t\t\t\t\t\t\t\t\t\t |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t+><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t+><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><+");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println("\t\t\t\t\t\t|\t\tMain Menu\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------+");
        System.out.println();

        //Menu options
        System.out.print("\t1. Create ID Queue(Recommended) \t\t\t 5. User Guide \n");
        System.out.print("\t2. Create Token Queue \t\t\t\t\t\t 6. Developers Info \n");
        System.out.print("\t3. Create Appointment Queue \t\t\t\t 7. Exit \n");
        System.out.print("\t4. Create Custom Queue \n");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tVersion 3.0.6.691");
        System.out.println();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println();

        System.out.print("What do you choose from here(enter Number): ");
        try {//check exception
            int finput = scan.nextInt();

            switch (finput) {
                case 1:
                    Id();//go to id queue
                    break;
                case 2:
                    token();//go to token queue
                    break;
                case 3:
                    appointment();//go to appointment queue
                    break;
                case 4:
                    custom();//go to custom queue
                    break;
                case 5:
                    userGuide();//go to userGuide
                    break;
                case 6:
                    developersInfo();//go to developersInfo
                    break;
                case 7:
                    //exit
                    System.out.println("\n\n\t\t\t\t............Thank you for using our service!!!..........\n");
                    System.exit(0);
                    break;

                default:
                    errorMassege msg=new errorMassege();
                    msg.msg1(finput);//call Polymorphism method
                    System.out.println();
                    main(null);
            }

        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
            System.out.println();
            main(null);
        }
    }

}

