import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz:");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz:");
        int n2 = input.nextInt();

        int i =n1;
        while(n1>=1) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("EBOB : " + i);
                break;
            }
            i--;
        }
        int k =1;
        while(k<=(n1*n2)){
            if (k % n1 == 0 && k % n2 == 0){
                System.out.println("EKOK : "+ k);
                break;
            }
            k++;
        }
    }
}



    /* ((((While döngüsü kullanmadan EBOB EKOK hesaplama))))

        for (int i =n1 ; n1>=1; i--){
          if (n1 % i == 0 && n2 % i ==0){
              System.out.println("EBOB :"+i);
              break;


          }

        }

        for (int k=1 ; k<=(n1*n2)  ;k++){
            if (k % n1 == 0 && k % n2 == 0){
                System.out.println("EKOK :"+k);
                break;


            }
        }
    }
}
}

     */
