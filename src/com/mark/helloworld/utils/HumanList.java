package com.mark.helloworld.utils;

import com.mark.helloworld.Human;

import java.util.Arrays;

public class HumanList {
    private Human[] humans = new Human[0];

    public void add(Human h){
        humans = Arrays.copyOf(humans, humans.length+1);
        humans[humans.length-1]=h;
    }

    public Human get(int index){
        return humans[index];
    }

    public void set(int index, Human value){
        humans[index]=value;
    }
    public void delete(int index){
        for (int i = 0; i < humans.length-1; i++) {
            if (i >= index-1){
                humans[i]=humans[i+1];
            }
        }
        humans = Arrays.copyOf(humans, humans.length-1);
    }

    public int size(){
        return humans.length;
    }

}
