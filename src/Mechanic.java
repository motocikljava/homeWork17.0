public class Mechanic <M extends transport>{
    protected String mecName;
    protected String mecSurname;
    protected String company;

    public Mechanic(String mecName, String mecSurname, String company) {
        this.mecName = mecName;
        this.mecSurname = mecSurname;
        this.company = company;
    }

    public String getMecName() {
        return mecName;
    }

    public String getMecSurname() {
        return mecSurname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mecName='" + mecName + '\'' +
                ", mecSurname='" + mecSurname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public boolean diagnostika(M m) {
return m.diagostika();
    }
    public void fixed(M m) {
        m.fixed();
    }
}
