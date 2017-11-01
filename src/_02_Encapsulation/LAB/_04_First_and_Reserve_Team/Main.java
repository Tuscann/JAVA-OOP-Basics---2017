package _02_Encapsulation.LAB._04_First_and_Reserve_Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Team team= new Team("Leed");

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            Integer age = Integer.parseInt(input[2]);
            Double salary = Double.parseDouble(input[3]);

            try{
                team.addPlayer(new Person(firstName,lastName,age,salary));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",team.getReserveTeam().size());



    }
}
