
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageAvg = 0,counter=0;
        String name="";
        
        while(scanner.hasNext()){
            String sValue = scanner.nextLine();
            String[] sArr = sValue.split(",");
            name =  (sArr[0].length()>name.length())?sArr[0]:name;
            ageAvg +=Integer.valueOf(sArr[1]);
            counter++;      
        }
        double  dAgeAvg = ageAvg /(counter*1.0);
        System.out.println("Longest name:" + name);
        System.out.println("Average of the birth years:" +dAgeAvg);
    }
}
