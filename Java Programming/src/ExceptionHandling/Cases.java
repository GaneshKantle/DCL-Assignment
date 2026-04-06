package ExceptionHandling;

public class Cases {
    public static void main(String[] args) {

// Case 1--------------------------------------------------------------------------------
// Compile Time Success--------------------------------------------------------------------
//        try {
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Arthmetic Exception");
//        }


// Case 2--------------------------------------------------------------------------------
// Compile Time Success--------------------------------------------------------------------
//        try {
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Arthmetic Exception");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Index Out of Bounds Exception");
//        }


// Case -3-------------------------------------------------------------------------------
// Compile Time Error--------------------------------------------------------------------
//        try {
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Arthmetic Exception");
//        }
//        catch(ArithmeticException e){
//            System.out.println("Array Index Out of Bounds Exception");
//        }


// Case 4--------------------------------------------------------------------------------
// Compile Time Error--------------------------------------------------------------------
//        try {
//            System.out.println(10/0);
//        }
//        finally{
//            System.out.println("Arthmetic Exception");
//        }
//        catch(ArithmeticException e){
//            System.out.println("Array Index Out of Bounds Exception");
//        }


// Case 5--------------------------------------------------------------------------------
// Compile Time Success--------------------------------------------------------------------
//        try {
//            System.out.println(10/0);
//        }
//        finally{
//            System.out.println("Arthmetic Exception");
//        }


// Case 6--------------------------------------------------------------------------------
// Compile Time Error--------------------------------------------------------------------
//        try {
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Arthmetic Exception");
//        }
//        catch(ArithmeticException y){
//            System.out.println("Array Index Out of Bounds Exception");
//        }


// Case 7--------------------------------------------------------------------------------
// Compile Time Success--------------------------------------------------------------------
        try {
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Array Index Out of Bounds Exception");
        }
        finally{
            System.out.println("Arthmetic Exception");
        }


// Case 8--------------------------------------------------------------------------------
// Compile Time Error--------------------------------------------------------------------
        try {
            System.out.println(10/0);
        }

    }
}
