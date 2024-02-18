package homework2;

public class MobilePhone extends Phone {

    private double screenSize;
    private boolean isFoldable;

    public MobilePhone(String number, String modelName, int weight, double screenSize, boolean isFoldable) {
        super(number, modelName, weight);
        this.screenSize = screenSize;
        this.isFoldable = isFoldable;
    }

    public void sendMessage(String message, String number) {
        System.out.printf("Отправлено СМС с содержанием: \"%s\" на номер %s", message, number);
    }

    @Override
    public void ring() {
        System.out.println("Звонит мобильный телефон");
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "screenSize=" + screenSize +
                ", isFoldable=" + isFoldable +
                "} " + super.toString();
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public void setFoldable(boolean foldable) {
        isFoldable = foldable;
    }
}
