public class truck extends transport implements Competing{
    public truck(String mark, String model, double engineVolume) {
        super(mark, model, engineVolume);
    }

    @Override
    public void Start() {
        System.out.println("начинаю движение");
    }

    public void End() {
        System.out.println("заканчиваю движение");
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
