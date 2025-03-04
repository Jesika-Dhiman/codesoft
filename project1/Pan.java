package project1;

public class Pan {

    private   String pan_number;
    private    String aadhaar_number;
    private String bank_Detail;
    private String investment;

    public Pan(String pan_number, String aadhaar_number, String bank_Detail, String investment) {
        this.pan_number = pan_number;
        this.aadhaar_number = aadhaar_number;
        this.bank_Detail = bank_Detail;
        this.investment = investment;
    }

    public String getPan_number() {
        return pan_number;
    }



    public String getAadhaar_number() {
        return aadhaar_number;
    }



    public String getBank_Detail() {
        return bank_Detail;
    }



    public String getInvestment() {
        return investment;
    }



    @Override
    public String toString() {
        return "Pan{" +
                "pan_number='" + pan_number + '\'' +
                ", aadhaar_number='" + aadhaar_number + '\'' +
                ", bank_Detail='" + bank_Detail + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
