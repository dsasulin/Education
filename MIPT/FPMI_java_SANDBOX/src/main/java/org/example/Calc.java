package org.example;

import java.util.Arrays;

public class Calc {

    public static String fun(String str) {
        String res,op,op2;
        int[] elems,elems1,simple;
        op ="";
        op2="";
        res = "";
        int elempos =0;
        int charindex = 0;
        int elems1Pos =0;
        int strLen;

        strLen = str.length()-1;
        // Проверяем первый и последний элемент. Это цифра или нет. Первая может быть отрицательной
        if ( (str.charAt(0) == '+' ||  str.charAt(0) == '/' || str.charAt(0) == '*') ||
                (str.charAt(strLen) == '+' ||  str.charAt(strLen) == '/' || str.charAt(strLen) == '*' || str.charAt(strLen) == '-' )) {
            res = "error: incorrect expression";
            return res;
        }
        // создаем строку с операциями
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*'){
                op = op + str.charAt(i);
                if (str.charAt(i+1) == '-'){
                    i++;
                }
            }
        }

        //заполняем массив со всеми элементами
        elems = new int[op.length()+1];
        for (int i = 1 ; i < str.length();i++){
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*'){
                elems[elempos] = Integer.parseInt(str.substring(charindex,i));
                elempos++;
                charindex=i+1;
            }
        }
        //добавляем последний элемент

        elems[elempos] = Integer.parseInt(str.substring(charindex, str.length()));

        // возвращаем значение есть только одна операция
        if (op.length()==1){
            if (op.charAt(0) == '+'){
                int i = elems[0] + elems[1];
                return "" +i;
            }
            if (op.charAt(0) == '-'){
                int i = elems[0] - elems[1];
                return ""+ i;
            }
            if (op.charAt(0) == '/'){
                int i = elems[0] / elems[1];
                return ""+ i;
            }
            if (op.charAt(0) == '*'){
                int i = elems[0] * elems[1];
                return ""+ i;
            }
        }


        //создаем массив для хранения результатов после умножения и деления
        elems1 = new int[op.length()+1];
        int cnt=0;

        //проходим по всем операциям и выполняем действия только для умножить и делить
        for (int k = 0; k < op.length();k++){
            if  (op.charAt(k) =='*' && cnt == 0) {
                elems1[elems1Pos] = elems[k] * elems[k + 1];
                cnt++;
                continue;
            }
            if  (op.charAt(k) =='*' && cnt >0) {
                elems1[elems1Pos] = elems1[elems1Pos] * elems[k + 1];
                cnt++;
                continue;
            }
            if  (op.charAt(k) =='/' && cnt == 0) {
                elems1[elems1Pos] = elems[k]/elems[k+1];
                cnt++;
                continue;
            }
            if  (op.charAt(k) =='/' && cnt >0) {
                elems1[elems1Pos] = elems1[elems1Pos]/elems[k+1];
                cnt++;
                continue;
            }
            if  (op.charAt(k) =='+' ||  op.charAt(k) =='-' ) {
                if (k==0) {
                    elems1[elems1Pos] = elems[k];
                    elems1Pos++;
                    cnt = 0;
                    op2=op2+op.charAt(k);
                }
                if  (k > 0 && (op.charAt(k-1) != '+' && op.charAt(k-1) != '-')) {
                    elems1Pos++;
                    elems1[elems1Pos] = elems[k+1];
                    cnt = 0;
                    op2 = op2 + op.charAt(k);
                }
                if  (k > 0 && (op.charAt(k-1) == '+' || op.charAt(k-1) == '-')) {
                    elems1[elems1Pos] = elems[k];
                    elems1Pos++;
                    cnt = 0;
                    op2 = op2 + op.charAt(k);
                }
                if  (k>0 && k == op.length()-1 && (op.charAt(k-1) == '+' || op.charAt(k-1)== '-' )) {
                    elems1[elems1Pos] = elems[k+1];
                    elems1Pos++;
                    cnt = 0;
                }

            }

            }

        for (int j = 0 ; j< elems1.length;j++){
            System.out.println(" " + j + " elem is " +elems1[j]);
        }

        System.out.println(op2);
        int finalcalc = 0;
        for (int z = 0; z < op2.length(); z++){
            if (z==0 && op2.charAt(z) == '+'){
                finalcalc = elems1[0]+elems1[1];
            }
            if (z > 0 && op2.charAt(z) == '+'){
                finalcalc = finalcalc + elems1[z+1];
            }
            if (z==0 && op2.charAt(z) == '-'){
                finalcalc = elems1[0]-elems1[1];
            }
            if (z > 0 && op2.charAt(z) == '-'){
                finalcalc = finalcalc - elems1[z+1];
            }
        }

        System.out.println("Final = " + finalcalc);

        return res;
    }
}
