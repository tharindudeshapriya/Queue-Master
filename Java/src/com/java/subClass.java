package com.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;

public class subClass{//inheritance

    public void success(String name, long nic, String num, int day) {//success msg

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};//week days
        try { //write a file for people count in a week
            BufferedWriter writer = new BufferedWriter(new FileWriter(days[day] + "id.txt", true));//write file

            writer.append("\t\t\t\t\t\t\t\t\tName: " + name);
            writer.append("\n");
            writer.append("\t\t\t\t\t\t\t\t\tNIC: " + nic);
            writer.append("\n");
            writer.append("\t\t\t\t\t\t\t\t\tT.No: " + num);
            writer.append("\n");
            writer.append("\t\t\t\t\t\t---------------------------------------");
            writer.append("\n");
            writer.append("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("File error");
        }
        System.out.println();
        System.out.print("\t\t\t\t\t* Successfully Added !!!\n");
        System.out.println();

    }

    public void create() { //create file
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};//week days
        for (int i = 0; i < 7; i++) {
            try {//create monday txt file
                File file = new File(days[i] + "id.txt");
                if (file.exists()) {
                    break;
                } else {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(days[i] + "id.txt", true));//write file topic
                    writer.append("\n");
                    writer.append("\t\t\t\t\t\t+--------------------------------------+\n");
                    writer.append("\t\t\t\t\t\t\t\t\t" + days[i].toUpperCase() + " LIST\t\t\t\t\n");
                    writer.append("\t\t\t\t\t\t+--------------------------------------+\n");
                    writer.append("\n");
                    writer.close();
                }
            } catch (Exception e) {
                System.out.println("File error");
            }

        }
    }

    public void read(int day) {//id file read method
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        try {//read token.txt file
            File idFile = new File(days[day - 1] + "id.txt");
            Scanner f1scan = new Scanner(idFile);
            while (f1scan.hasNextLine()) {
                String readData = f1scan.nextLine();
                System.out.println(readData);
            }
            f1scan.close();
        } catch (Exception e) {
            System.out.println();
            System.out.println("\t\t\t\t\t* " + days[day - 1] + " txt File doesn\'t exist!!!!");
            teamproject back = new teamproject();
            back.Id();
        }
        Scanner menui = new Scanner(System.in);
        System.out.println();
        System.out.print("Do you want to go ID queue menu press enter: ");
        try {
            String menuInput = menui.nextLine();
            if (Objects.equals(menuInput, "")) {
                teamproject back = new teamproject();
                back.Id(); //go to id menu
            }
        } catch (Exception e) {
            System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
            System.out.println();
            teamproject back = new teamproject();
            back.Id();
        }
    }

    public void delete(int day) {// delete id txt files
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        File obj = new File(days[day - 1] + "id.txt");
        System.out.println();
        if (obj.delete()) {
            System.out.println("\t\t\t\t\t* Deleted the " + days[day - 1] + " txt file!!!!");

        } else {
            System.out.println("\t\t\t\t\t* " + days[day - 1] + " txt File doesn\'t exist!!!!");
        }
        teamproject back = new teamproject();
        back.Id();
    }

    public void deleteAll() {// delete id txt files all
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println();
        for (int i = 0; i < 7; i++) {
            File obj = new File(days[i] + "id.txt");
            if (obj.delete()) {
                System.out.println("\t\t===============================100%===============================");
            } else {
                System.out.println("\t\t\t\t\t*" + days[i] + " File doesn\'t exist!!!!");
                System.out.println();
            }
        }
        System.out.println("\n\t\t\t* Successfully all ID txt files deleted !!!");
        teamproject back = new teamproject();
        back.Id();
    }
}

class developers {
    private String dInfo = "1.) Dilhan Pathum" +
            "\t He is undergraduated at Department of Computer Science and Infomatics from Uva Wellassa University.\n" +
            " \t He is 22 years old. He is from Gampaha. He studied at Bandaranayaka College-Gampaha. He did \n" +
            " \t Advanced Levels in Physical Science stream. ";

    private String kInfo = "2.) Chalakshana kaushani" +
            "\t She is undergraduated at Department of Computer Science and Infomatics from Uva Wellassa University.\n" +
            " \t She is 23 years old. She is from Kurunegala. She studied at Anuradhapura Central College. She did \n" +
            " \t Advanced Levels in Bio Science stream. ";

    private String tInfo = "3.) Tharindu Deshapriya" +
            "\t He is undergraduated at Department of Computer Science and Infomatics from Uva Wellassa University.\n" +
            " \t He is 23 years old. He is from Kandy. He studied at Dharmaraja College-Kandy. He did \n" +
            " \t Advanced Levels in Physical Science stream. ";

    private String sInfo = "4.) Shamini Sivarasa" +
            "\t She is undergraduated at Department of Computer Science and Infomatics from Uva Wellassa University.\n" +
            " \t She is 23 years old. She is from Jaffna. She studied at Methodist Girls' High School - Jaffna. She did \n" +
            " \t Advanced Levels in Physical Science stream. ";

    private String mInfo = "5.) Miyuni Tharushika" +
            "\t She is undergraduated at Department of Computer Science and Infomatics from Uva Wellassa University.\n" +
            " \t She is 23 years old. She is from Matara. She studied at Sri Sumangala College - Weligama. She did \n" +
            " \t Advanced Levels in Physical Science stream. ";


    public String getInfoD() {
        return dInfo;
    }

    public String getInfoK() {
        return kInfo;
    }

    public String getInfoT() {
        return tInfo;
    }

    public String getInfoS() {
        return sInfo;
    }

    public String getInfoM() {
        return mInfo;
    }


}
abstract class userGuideAll {//abstract for user Guide menu
    abstract void allGuide();

    public void afterGuideMassage() {

        System.out.print(" Do you want to go User Guide menu please press enter :  ");
    }

}

class idGuide extends userGuideAll {
    void allGuide() {
        System.out.println();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t1) Create ID Queue -----> ID Queue  ");//Id queue Guide
        System.out.println();
        System.out.println("This is a recommended method for create your queue. It is simple and easy task. We create this queue by using last number of NIC number.");
        System.out.println("If you enter Number 1 you can continue making queue. In this step you must enter the numbers that count of customers.");
        System.out.println("\tYou should enter--");
        System.out.println("\t\tFirst Customer Name");
        System.out.println("\t\tSecond Customer NIC Number");
        System.out.println("\t\tThen Telephone Number");
        System.out.println();
        System.out.println("Second Option is Read ID txt files. You can read list of customers according to days. This day is select by using last number of NIC number.");
        System.out.println("If last number is 0 or 1 customer goes to MondayID queue. Queues of Other days build likewise.\n " +
                "Relevant number of days given by Read ID List step.\n" +
                " You enter the number. Then it shows list of customers and their details. ");
        System.out.println();
        System.out.println("Next Option is Delete ID.txt files.");
        System.out.println("In this option you can delete list of customers according to days. Also you can delete all the customer lists.");
        System.out.println();
        System.out.println();
    }

}

class tokenGuide extends userGuideAll {
    void allGuide() {
        System.out.println();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t2) Create Token Queue -----> Token Queue  ");//token queue guide
        System.out.println();
        System.out.println("Here you can give the customer a date and number to come as a Token. There a queue is formed with a certain number of people per day and given numbers.");
        System.out.println("First you have to enter the number of people per day. Then you create the list of them.");
        System.out.println("\tSo,You should enter--");
        System.out.println("\t\tFirst Customer Name");
        System.out.println("\t\tThen Customer NIC Number");
        System.out.println("At the same time, the system will give you the token number of the respective customers According to the oder in which you enter the data.");
        System.out.println("You can issue tokens in this way for every day of the week to customers.");
        System.out.println();
        System.out.println("Token can be issued for the next week as well.");
        System.out.println();
        System.out.println("The second option in Token Queue is Read toke.txt file.\n " +
                "It gives all the details of customers who got the token for the week and How many customers in the queue as a txt file. ");
        System.out.println();
        System.out.println("You can use third option to delete tokens when you no longer need them.");
        System.out.println();
        System.out.println();
    }
}

class appointmentGuide extends userGuideAll {

    void allGuide() {
        System.out.println();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t3) Create Appointment Queue -----> Appointment Queue  ");//appointment queue guide
        System.out.println();
        System.out.println("This method is very useful for customers. Customers can book date and time earlier.");
        System.out.println("First you can see available slots of days. In this option you need to enter week number of month.\n " +
                "Then you can see days,hours and book or available slots in week.");
        System.out.println("\t\t>>You can book 4 slots in one hour of one day.<<");
        System.out.println();
        System.out.println("In second Option you can book a slot. \n As before you should enter the week number.\n Then enter the day. \n " +
                "Next enter the hour.\n Then slot number. There is 4 slots in one hour. You can choose one as you like. ");
        System.out.println("After you select your slot,");
        System.out.println("\tYou should enter--");
        System.out.println("\t\tFirst Customer Name");
        System.out.println("\t\tSecond Customer NIC Number");
        System.out.println("\t\tThen Telephone Number");
        System.out.println("Now you can see their Appointment details.");
        System.out.println();
        System.out.println("In Third option you can see all bookings. ");
        System.out.println();
        System.out.println("If you want to clear the bookings you should use the fourth option which is Erase a bookings.");
        System.out.println();
        System.out.println();

    }

}

class errorMassege {//using Polymorphism
    public void msg1(int x){
        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
    }
    public void msg1(String y){
        System.out.print("\n\t\t\t\t!!!----You entered wrong input----!!!");
        System.out.print("\n\t\t\t\t!!!----Please enter correct number----!!!");
    }
}
