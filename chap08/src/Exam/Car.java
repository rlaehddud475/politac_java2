package Exam;
class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }


//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Car) {
//            Car other = (Car) obj;
//            return this.model.equals(other.model);
//        }
//        return false;
//    }

    public String getModel() {
        return model;
    }
}