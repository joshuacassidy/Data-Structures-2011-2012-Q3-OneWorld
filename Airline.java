public class Airline implements Comparable<Airline>  {

    private String companyName, location;

    public Airline(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int compareTo(Airline o) {
        return companyName.compareTo(o.getCompanyName());
    }

    @Override
    public String toString() {
        return "Airline{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
