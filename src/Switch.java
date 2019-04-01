public class Switch {
    public static void main(String[] args) {
        String grade="zxc";
        switch (grade){
            case "A": case "A+": case "A-":
                System.out.println("You're awesome");
                break;
            case "B": case "B+": case "B-":
                System.out.println("You're good");
                break;
            case "C": case "C+": case"C-":
                System.out.println("You're bad");
                break;
            case "D": case "D+": case "D-":
                System.out.println("You've failed");
                break;
            default:
                System.out.println("Nothing to say");
                break;
        }
    }
}
