import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  System.out.println(" Weight (kg) =");  //الوزن
        double kg = scanner.nextDouble();

        System.out.println("height (m) = ");  //اضف الطول
        double m = scanner.nextDouble();

        double bmi = kg / (m * m) ;  //حسابة كتلة الجسم
        System.out.println("BMI = " + bmi); */

         /* System.out.println("Obtained mark ="); //الدرجه
        double mark =scanner.nextDouble();
        double total = 100; //مجموع الدرجات
        double percentage = (mark / total) * 100;
        System.out.println("percentage  ="+ percentage ); */

         /* System.out.println(" Amount in USD :");
        Double usd = scanner.nextDouble();

        System.out.println("Exchange Rate (USD to EUR)");
        double rate = scanner.nextDouble();
        double eur = usd * rate;
        scanner.nextLine();
        System.out.println("Amount in EUR = "+ eur); */

       /* System.out.println("Sentence :");
        String Sentence = scanner.nextLine();

        System.out.println("Start index :");
        int start = scanner.nextInt();

        System.out.println("end index :");
        int end =scanner.nextInt();

        String result = Sentence.substring(start, end);
        System.out.println(result); */

        System.out.println("String 1");
        String str1 = scanner.nextLine();

        System.out.println("String 2");
        String str2 = scanner.nextLine();
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are aqual (ignoring case).");
        }else {
            System.out.println("Strings are Not aqual");
        }
















    }
}