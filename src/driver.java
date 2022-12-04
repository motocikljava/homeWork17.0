
public class driver <A extends transport>{
    String driverSecName;
    char category;
    int experience;

    public driver(String driverSecName, char category, int experience) {
        if (driverSecName != null) {
            this.driverSecName = driverSecName;
        }
        if (category != 0) {
            this.category = category;
        }
        if (experience != 0) {
            this.experience = experience;
        }

    }

    public void driveStart(A transport) {
        System.out.println("водитель " + getDriverSecName() + " управляет автомобилем "
                + transport.getMark() + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "driver{" +
                "driverSecName='" + driverSecName;
    }

    public String getDriverSecName() {
        return driverSecName;
    }

    public void setDriverSecName(String driverSecName) {
        this.driverSecName = driverSecName;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
