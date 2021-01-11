package com.mark.helloworld;

import com.mark.helloworld.services.HumansService;
import com.mark.helloworld.utils.HumanList;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumansService humansService = new HumansService();
        for (int i = 0; i < 3; i++) {
            System.out.println("name=");
            String name = sc.nextLine();
            System.out.println("surname=");
            String surname = sc.nextLine();
            System.out.println("patronymic=");
            String patronymic = sc.nextLine();

            Human h = new Human(name, surname, patronymic);
            humansService.addHuman(h);
        }
       HumanList result = humansService.getHumansList();

        for (int i = 0; i < result.size(); i++) {
            Human h = result.get(i);
            result.delete(2);
            System.out.println(h.getName()+" "+h.getSurname()+" "+h.getPatronymic());
        }

        HumansService service = new HumansService();
        service.findByName();
        service.findBySurname();





        }
}
