package project1;

public class Aadhaar {

  private   String aadhaar_number;
  private   String name;
  private   String father_name;
  private   String Address;

    public Aadhaar(String aadhaar_number, String name, String father_name, String address) {
        this.aadhaar_number = aadhaar_number;
        this.name = name;
        this.father_name = father_name;
        Address = address;
    }

    public String getAadhaar_number() {
        return aadhaar_number;
    }

    public String getName() {
        return name;
    }


    public String getFather_name() {
        return father_name;
    }


    public String getAddress() {
        return Address;
    }



    @Override
    public String toString() {
        return "Aadhaar{" +
                "aadhaar_number='" + aadhaar_number + '\'' +
                ", name='" + name + '\'' +
                ", father_name='" + father_name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
