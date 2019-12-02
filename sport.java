package Number3;

import java.util.ArrayList;
import java.util.Scanner;

public class sport {
    public static ArrayList<members> memb;
    public static ArrayList<members> getMembers() {
        return memb;
    }
    public static void main(String{} args) {
        //TODO Auto-generated method stub
        memb = new ArrayList<members>();
        memb.add(new members("James","John","Male","UK","23/08/1996",29));
        memb.add(new members("Michael","Scott","Female","UK","05/11/1986",32));
        memb.add(new members("Jim","Halpert","Male","UK","09/05/1999",20));
        memb.add(new members("Dwight","Schrute","Female","UK","08/08/1988",31));
        memb.add(new members("Andy","Creed","Male","UK","11/04/2000",19));
        memb.add(new members("Stanley","Smith","Male","UK","16/12/1991",27));
        memb.add(new members("David","Luiz","Male","UK","25/01/1994",25));
        memb.add(new members ("Andy", "Pinato", "Female", "UK", "14/09/1985", 25));
        memb.add(new members("Candy", "Cent", "Male", "UK", "01/01/1989", 30));
        memb.add(new members ("Mike", "Pinato", "Female", "UK", "29/07/1989", 30));
        memb.add(new members("Sam", "carlos", "Male", "UK", "16/07/1988", 30));
        memb.add(new members("Alex ", "Diez", "Female", "UK", "18/09/1988",27));
        memb.add(new members("Alejandro", "Rodrigo", "Male", "UK", "06/02/1999", 24));
        memb.add(new members("Javier ", "Serra", "Female", "UK", "24/12/1997", 45));
        memb.add(new members("Esther", "Pina", "Male", "UK", "05/02/1970", 19));
        memb.add(new members("Pablo", "Moya", "Male", "UK", "11/10/1992", 26));
        memb.add(new members("Javier","Halpert","Female","UK","09/05/1999",20));
        memb.add(new members ("Pina", "Pinato", "Male", "UK", "29/07/1989", 30));
        memb.add(new members("Stanley ", "Jo", "Male", "UK", "24/12/1997", 45));
        memb.add(new members("Alex ", "Diez", "Female", "UK", "18/09/1988", 27));
        memb.add(new members("Smith ", "Jones", "Male", "UK", "18/09/1988", 18));
        memb.add(new members("Elley ", "Jo", "Female", "UK", "24/12/1997", 22));
        memb.add(new members("Alex ", "Diez", "Female", "UK", "18/09/1988", 24));
        memb.add(new members("Jane ", "Jones","Female","UK","18/09/1988",24));

        int x = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("What kind of team would you like to create ?");
                System.out.println("Enter 'M' (for MAlE over 25) or 'm' (for male under 25)");
                System.out.println("Enter 'F' (for FEMAlE over 25) or 'f' (for female under 25)");
                System.out.println("Enter 'X' (for MIX over 25) or 'x' (for mix under 25)");
                String typeOfTeam = input.nextLine();
                System.out.println("Numbers of people in the team ? ");
                int teamSize = input.nextInt();

                team team = new team();
                x = 2;
                if (typeOfTeam.contentEquals("M") ||
                        typeOfTeam.contentEquals("m") ||
                        typeOfTeam.contentEquals("F") ||
                        typeOfTeam.contentEquals("f") ||
                        typeOfTeam.contentEquals("X") ||
                        typeOfTeam.contentEquals("x")) {
                    try {
                        team.createTeam(typeOfTeam, teamsize);
                    } catch (Exception e) {
                        System.out.println("There are not enough members available to create a team of " + teamSize);
                        System.out.println("Please try again");
                        System.out.println();
                        x = 1;
                    }
                } else {
                    System.out.println("Invalid kind of team option entered try again !");
                    System.out.println();
                    x = 1;
                }
            } catch (Exception e) {
                System.out.println("Please enter valid inputs for number of team");
                System.out.println();
                                        }
                            }
            while (x == 1);
        }

    }
