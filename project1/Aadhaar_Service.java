package project1;

import java.util.HashMap;
import java.util.Map;

public class Aadhaar_Service {
    private  static Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("12345678",new Aadhaar("12345678","Jesika Dhiman",
                "Mr.Arvind Kumar","Uttarakhand"));
        aadhaarMap.put("12345674",new Aadhaar("12345674","Riya Saini",
                "Mr.XYZ","Uttarakhand"));

    }
    public Aadhaar getAadhaarByNumber(String Aadhaar_number){
        return  aadhaarMap.get(Aadhaar_number);
    }
}
