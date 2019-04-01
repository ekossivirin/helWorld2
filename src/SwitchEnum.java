import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEnum {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        Season season=null;
        switch(input.toLowerCase()){
            case "january":
            case "february":
            case "december":
                season = Season.WINTER;
                break;
            case "march":
            case "april":
            case "may":
                season =Season.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season=Season.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season=Season.AUTUMN;
                break;
                default:
                    System.out.println("No such month!");
        }
        if (season!=null) {
            System.out.println("It's " + season + " time!");
        }

    }
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}

