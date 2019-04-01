public class Array {
    public static void main(String[] args) {
        String[] sName=new String[] {"Eva", "Kris", "Dasha", "Lusa"};
        int[] sAge = new int[] {29, 27, 28, 28};
        String[] sCountry = new String[4];
        sCountry[0]="Ukraine";
        sCountry[1]="Ukraine";
        sCountry[2]="Canada";
        sCountry[3]="USA";
        greet(sName, sAge, sCountry);
        System.out.println(sum(5,4));


    }
    public static void greet(String[] array, int[] age, String[] country){
        for (int i=0; i<array.length ;i++) {
            System.out.println(String.format("Name: %s, Age: %d, Country %s",array[i], age[i], country[i]));
        }
    }
    public static int sum(int i, int k){
        return i+k;
    }
}
