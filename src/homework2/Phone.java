package homework2;

public class Phone implements RingAble {

    private String number;
    private String ModelName;
    private int weight;

    public Phone(String number, String modelName, int weight) {
        this.number = number;
        ModelName = modelName;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", ModelName='" + ModelName + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void ring() {
        System.out.println("Звонит телефон");
    }
}
