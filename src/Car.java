public class Car extends transport implements Competing {
private TypeKuzov typeKuzov;
    public Car(String mark, String model, double engineVolume, TypeKuzov typeKuzov) {
        super(mark, model, engineVolume);
        this.typeKuzov=typeKuzov;
    }

    public TypeKuzov getTypeKuzov() {
        return typeKuzov;
    }

    public void setTypeKuzov(TypeKuzov typeKuzov) {
        this.typeKuzov = typeKuzov;
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
    public void Type() {
        if (typeKuzov == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println(typeKuzov.name());
        }
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
