import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Admin on 15.08.2016.
 */
public class Main {
static Formatter x;
    static Scanner scn;

    public static void main(String[] args){
        try{
          x=new Formatter("res//1.txt");
            System.out.println("Сколько Вам лет ?");
            scn = new Scanner(System.in);
            int year = scn.nextInt();
            System.out.println("Где вы живёте ?");
            String town = scn.next();
            System.out.printf("Мне %s лет, я живу в %s",year,town);
            x.format("Мне %s лет, я живу в %s",year,town);
            x.close();

        }catch (Exception e){};





    }
}
