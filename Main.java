import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
//        int[] array = {50, -20, 0, 30, 40, 60, 10};
//            if (array.length >= 2 && array[0] == array[array.length - 1]) {
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//        }
//    }
//}

        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println(" how many numbers of array   :");
        int number1 = scanner.nextInt();

        int [] num1 = new int[number1];
        double average = 0;


        for (int i = 0; i < number1; i++) {
            System.out.println(" Enter the numbers (1) : ");
            num1[i]= scanner.nextInt();
            average = average + num1[i];
         }
        double avg = average / num1.length;
        System.out.println("The average of the said array is: " + average / num1.length);


        for (int i = 0; i < number1 ; i++) {
            if (num1[i] > avg){
                System.out.println(num1[i]);
            }
        }
    }
}



        //3
//        int [] num = {20,30,40};
//        int max = num [0];
//        for (int i = 0; i < 3; i++) {
//            if (num[i] > max) {
//               max = num [i];
//            }
//    }  System.out.println("Larger value between first and last element: " + max);
//
//
//    }
//      }

        //4
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(20);
//        num.add(30);
//        num.add(40);
//
//        System.out.println(num);
//
//        Collections.swap(num,0,num.size()-1);
//
//        System.out.println("New array after swapping the first and last elements: "+ num);
//    }
//}
//
        //5
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(2); //2,3,40,1,5,9,4,10,7]
//        num.add(3);
//        num.add(40);
//        num.add(1);
//        num.add(5);
//        num.add(9);
//        num.add(4);
//        num.add(10);
//        num.add(7);
//
//        ArrayList<Integer> odd = new ArrayList<>();
//        ArrayList<Integer> even = new ArrayList<>();
//
//
//        for (Integer n : num) {
//            if (n % 2 != 0) {
//                odd.add(n);
//            } else {
//                even.add(n);
//            }
//        }
//        odd.addAll(even);
//        System.out.println(odd);
//    }
//}


        //6
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" how many array num1  :");
//        int number1 = scanner.nextInt();
//        int [] num1 = new int[number1];
//
//        for (int i = 0; i < number1; i++) {
//            System.out.println(" Enter the numbers (1) : ");
//            num1 [i]= scanner.nextInt();
//        }
//
//        System.out.println(" how many array num2  :");
//        int number2 = scanner.nextInt();
//        int [] num2 = new int[number2];
//
//        for (int i = 0; i < number2; i++) {
//            System.out.println(" Enter the numbers (2) : ");
//            num2 [i]= scanner.nextInt();
//        } if (Arrays.equals(num1, num2)){
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//    }
//}




