public class car extends transport implements Competing {

    public car(String mark, String model, double engineVolume) {
        super(mark, model, engineVolume);
    }

    @Override
    public void Start() {
        System.out.println("начинаю движение");
    }
    @Override
    public void End() {
        System.out.println("заканчиваю движение");
    }

    @Override
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
