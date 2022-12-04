public abstract class transport {
    protected String mark;
    protected String model;
     double engineVolume;

    public transport(String mark, String model, double engineVolume) {
        if (mark != null) {
            this.mark = mark;
        } else {
            this.mark = "unknown mark";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "unknown model";
        }

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;

        }
    }

    public String getMark() {
            return mark;
    }


    @Override
    public String toString() {
        return "transport{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + getEngineVolume() +
                '}';
    }

    public String getModel() {
            return model;
    }


        public double getEngineVolume () {
            return engineVolume;
        }

        public void setEngineVolume ( double engineVolume){
            this.engineVolume = engineVolume;
        }

    public abstract void Start();

    public abstract void End();
    public static void seprator(){
        System.out.println("=========================================================");
    }
}


