package project1;

import java.util.Scanner;

public class Pan_Aadhaar_matcher_App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Aadhaar_Service aadhaar_service=new Aadhaar_Service();
        Pan_Service pan_service=new Pan_Service();

        System.out.println("Enter the Aadhaar number: ");
        String aadhaar=scanner.nextLine();

        Aadhaar aadhaar1=aadhaar_service.getAadhaarByNumber(aadhaar);
        Pan pan=pan_service.getPanByAadhaarNumber(aadhaar);
        try {
                if(aadhaar!=null && pan!=null) {
                    System.out.println("Aadhaar Detail = " + aadhaar1);
                    System.out.println("Pan Detail = " + pan);
                }
                else{
                    throw  new RuntimeException("No match found ");
                }


        }
        catch (Exception e){
            System.out.println(e.toString());
        }



    }
}
