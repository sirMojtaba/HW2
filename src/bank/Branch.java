package bank;

public class Branch {
    private String code;
    private String city;
    private int rate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Branch(String code, String city, int rate) {
        this.code = code;
        this.city = city;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", rate=" + rate +
                '}';
    }
}
