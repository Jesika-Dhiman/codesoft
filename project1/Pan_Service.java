package project1;

import java.util.HashMap;
import java.util.Map;

public class Pan_Service {
    private  static Map<String ,Pan> panMap=new HashMap<>();
    static {
        panMap.put("ABCD1234SE",new Pan("ABCD1234SE","12345678",
                "PNB","Mutal funds,stocks"));
        panMap.put("ABCD1234S4",new Pan("ABCD1234S4","12345674",
                "SBI","stocks"));
    }
    public Pan getPanByAadhaarNumber(String aadhaar_number){
        for(Pan pan: panMap.values())
        {
            if(pan.getAadhaar_number().equals(aadhaar_number))
            {
              return  pan;
            }
        }
        return  null;
    }
}
