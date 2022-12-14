public class Truck extends transport implements Competing{
    private LoadCapacity loadCapacity;
    public Truck(String mark, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(mark, model, engineVolume);
        this.loadCapacity= loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void Start() {
        System.out.println("начинаю движение");
    }

    public void End() {
        System.out.println("заканчиваю движение");
    }

    @Override
    public void Type() {
        if (loadCapacity == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println("Грузоподъёмность от : " + loadCapacity.getFrom() + " до " + loadCapacity.getTo());
        }
    }


    public void pitStop() {
        System.out.println("совершаю пит стоп");
    }

    @Override
    public void bestLapTime(String time) {
        System.out.println("лучшее время круга " + time);
    }

    @Override
    public void maxSpeed(String speed) {
        System.out.println("максимальная скорость " + speed);
    }
}
