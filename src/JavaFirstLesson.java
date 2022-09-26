package src;

import java.util.Random;

public class JavaFirstLesson {
    public static void main(String[] args) {

        byte aMinus = -128;//1 byte
        byte bPlus = 127;//8

        short shortMinus = -32768;//2 byte
        short shortPlus = 32767;//16

        int intMinus = -2147483648;//4 byte
        int intPlus = 2147483647;//

        long longMinus = -922337203;//8 byte (?)
        long longPlus = 922337203;

        float floatMinus = -3.4f;//4 byte
        float floatPlus = 3.4f;

        double doubleMinus = -1.7f+308;//8 byte
        double doublePlus = 1.7f + 308;

        char charOne = 'a';//2 byte

        boolean booleanFalse = false;
        boolean booleanTrue = true;

        String text = "Result:";

        int a = 10;
        int b = 23;
        boolean c = true;
        boolean d = false;

        if(a>=b){
            System.out.println(c);
        }else{
            System.out.println(d);
        }



//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a>=b);

        //добиться переполнения
        System.out.println(bPlus*bPlus);
        System.out.println(aMinus%shortPlus);
        System.out.println(text+shortMinus+intMinus);
        System.out.println(text+(doubleMinus-floatMinus));

        int a1 = 50;
        int a2 = 45;
        int random_int = (int)Math.random();

        System.out.println(text+(a1+a2-random_int));
    }
}
