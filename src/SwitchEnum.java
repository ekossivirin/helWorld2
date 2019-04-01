import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEnum {
    public static void main(String[] args) throws IOException {

        Season season;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        switch(input.toLowerCase()){
            case "january":
            case "february":
            case "december":
                season = Season.WINTER;
                System.out.println("It's " + season + " time!");
                break;
            case "march":
            case "april":
            case "may":
                season =Season.SPRING;
                System.out.println("It's " + season + " time!");
                break;
            case "june":
            case "july":
            case "august":
                season=Season.SUMMER;
                System.out.println("It's " + season + " time!");
                break;
            case "september":
            case "october":
            case "november":
                season=Season.AUTUMN;
                System.out.println("It's " + season + " time!");
                break;
                default:
                    System.out.println("No such month!");
        }

    }
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}

