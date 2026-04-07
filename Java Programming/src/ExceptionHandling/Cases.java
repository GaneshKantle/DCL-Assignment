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
        //        try {
        //            System.out.println(10/0);
        //        }
        //        catch(ArithmeticException e){
        //            System.out.println("Array Index Out of Bounds Exception");
        //        }
        //        finally{
        //            System.out.println("Arthmetic Exception");
        //        }


        // Case 8--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try {
        //            System.out.println(10/0);
        //        }


        // Case 9--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        catch() {
        //            System.out.println(10/0);
        //        }


        // Case 10--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try{
        //        }
        //        System.out.println();
        //        catch() {
        //            System.out.println(10/0);
        //        }


        // Case 11--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try{
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }
        //        System.out.println();
        //        finally{
        //        }
        //        }


        // Case 12--------------------------------------------------------------------------------
        // Compile Time Success--------------------------------------------------------------------
        //        try{
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }
        //        try{
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }


        // Case 13--------------------------------------------------------------------------------
        // Compile Time Success--------------------------------------------------------------------
        //        try{
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }
        //        try{
        //        }
        //        finally() {
        //            System.out.println(10/0);
        //        }


        // Case 14--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try{
        //        }
        //        System.out.println();
        //        catch() {
        //            System.out.println(10/0);
        //        }
        //
        //        finally() {
        //            System.out.println(10/0);
        //        }


        // Case 15--------------------------------------------------------------------------------
        // Compile Time Success--------------------------------------------------------------------
        //        try{
        //            try{
        //            }
        //            finally() {
        //                System.out.println(10/0);
        //            }
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }


        // Case 16--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try{
        //
        //            try{
        //            }
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }


        // Case 17--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try{
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }
        //        finally {
        //            finally{
        //            }
        //        }


        // Case 18--------------------------------------------------------------------------------
        // Compile Time Error--------------------------------------------------------------------
        //        try{
        //            finally() {
        //                System.out.println(10/0);
        //            }
        //        }
        //        catch() {
        //            System.out.println(10/0);
        //        }


        // Case 19-------------------------------------------------------------------------------
        // Compile Time Success--------------------------------------------------------------------
        //        try{
        //
        //        }
        //        finally {
        //            try{
        //
        //            }
        //            catch(){
        //            }
        //        }

    }
}