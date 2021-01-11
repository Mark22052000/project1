package com.mark.helloworld.services;

import com.mark.helloworld.Human;
import com.mark.helloworld.utils.HumanList;

import java.util.Scanner;

public class HumansService {
    Scanner sc = new Scanner(System.in);
    HumanList humans = new HumanList();

    public void addHuman(Human h){
        humans.add(h);
    }

    public void findBySurname(){
        System.out.println("Enter the Surname:");
        String surname = sc.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            Human h = humans.get(i);
            if (h. equals(surname)){
                System.out.println(h);
            }
        }
    }
    public void findByName(){
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            Human h = humans.get(i);
            if (h. equals(name)){
                System.out.println(h);
            }
        }
    }

    public HumanList getHumansList(){
        HumanList humansList = new HumanList();
        for (int i = 0; i < humans.size(); i++) {
            Human h = humans.get(i);
            humansList.add(h);
        }
        return humansList;
    }






}
