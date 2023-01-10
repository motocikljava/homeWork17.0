import java.util.*;

public class Mechanic <M extends transport>{
    protected String mecName;
    protected String mecSurname;
    protected String company;
    private static Map<Mechanic, Set<transport>> serviceMachin = new HashMap<>();


    public Mechanic(String mecName, String mecSurname, String company) {
        this.mecName = mecName;
        this.mecSurname = mecSurname;
        this.company = company;


    }
    public void SerTr (M avto) {
       Set<transport> transportSet = serviceMachin.getOrDefault(this, new HashSet<>());
       transportSet.add(avto);
       serviceMachin.put(this,transportSet);

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
