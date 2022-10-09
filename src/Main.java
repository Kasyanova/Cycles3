/*
Напишите программу:


        1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

        2. Посчитайте среднее арифметическое элементов массива.

        3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
*/

package com.max.idea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int arrayL = in.nextInt(); //длина массива

        double[] myArray = new double[arrayL]; //задать длину массива
        for (int i=0;i<myArray.length;i++){
            System.out.println("Введите значение элемента "+i+" : ");
            myArray[i] = in.nextDouble();//присвоить значение каждому следующему элементу массива, начиная с нулевого
        }

        //посчитать среднее арифметическое массива
        double sum = 0;
        for (int i=0;i<myArray.length;i++){
            sum = sum + myArray[i];
        }
        double avg = sum/myArray.length;

        //вывести все элементы массива, умноженные на среднее арифметическое
        for (int i=0;i<myArray.length;i++){
            myArray[i] = myArray[i]*avg;
            System.out.println(myArray[i]);
        }
    }
}