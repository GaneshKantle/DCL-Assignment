public class Pratice {
//    public static void main(String[] args) {
//        char c;
//        for(int i=1; i<=7; i++){
//            c='p';
//            for(int j=1; j<=8-i; j++){
//                System.out.print((char)(c)+" ");
//                c++;
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        for (int i = 1; i <= 7; i++) {
//            char c;
//            c = 'Z';
//            for (int j = 1; j <= 7 - i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print((c) + " ");
//                c--;
//            }
//            System.out.println();
//        }
//    }
public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) {
        char c;
        c = 'A';
        for (int j = i-1; j <= 6; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= 8-i; j++) {
            System.out.print((c) + " ");
            c++;
        }
        System.out.println();
    }
}
}