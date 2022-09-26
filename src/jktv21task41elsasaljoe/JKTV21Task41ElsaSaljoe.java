/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task41elsasaljoe;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV21Task41ElsaSaljoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Первый вариант с библиотекой Рандом        
        Random random = new Random();
        System.out.println();
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);
            System.out.print(nums[i] + " ");
            if ((i % 10) == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        
        
        //Второй вариант с подключением рандома через библиотеку Math
        //В отличие от первого, данные массива выводятся более корректно
        int[] array;
        array = new int[100];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100));
            if ((i % 10) == 0){
                System.out.println();
            }
            System.out.print(array [i] + " ");
        }
    }
    
}
