package homework2;

public class LandLinePhone extends Phone{

    private boolean isCallable;

    public LandLinePhone(String number, String modelName, int weight, boolean isCallable) {
        super(number, modelName, weight);
        this.isCallable = isCallable;
    }

    @Override
    public void ring() {
        System.out.println("Звонит стационарный телефон");
    }

    @Override
    public String toString() {
        return "LandLinePhone{" +
                "isCallable=" + isCallable +
                "} " + super.toString();
    }

    public boolean isCallable() {
        return isCallable;
    }

    public void setCallable(boolean callable) {
        isCallable = callable;
    }

}
