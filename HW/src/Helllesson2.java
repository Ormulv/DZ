import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Laptev on 15.03.2017.
 */
public class Helllesson2 {
    public static void main (String[] args){

        System.out.println("Задание №1");
        int p = 13;
        if (p % 2 ==0)
            System.out.println("четное");
        else
            System.out.println("нечетное");

        //2
        System.out.println(" ");
        System.out.println("Задание №2");
        double m = 9.9999;
        double n = 11.45;
        double x = 10;
        double a = Math.abs(x - m);
        double b = Math.abs(x - n);
        if (a  > b) {
            System.out.println(n+" ближе к 10");}
        else {
            System.out.println(m+" ближе к 10"); }
//3
        System.out.println("");
        System.out.println("Задание №3");
        double aa = 111;
        double bb = 1232;
        double cc = 336;
        double x1, x2;
        double dd = (bb * bb) - (4 * aa * cc);
        if (dd == 0) {
            x1 = -1 * (bb / (2 * aa));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + x1);
        } else {
            if (dd > 0) {
                x1 = (-1 * bb + Math.sqrt(dd)) / (2 * aa);
                x2 = (-1 * bb - Math.sqrt(dd)) / (2 * aa);
                System.out.println("Уравнение имеет 2 квадратных корня: " + x1 + " и " + x2);
            } else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
        /System.out.println();
        }
    }

