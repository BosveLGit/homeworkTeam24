package homework2;

public class main {
    public static void main(String[] args) {

        Phone phoneNokia = new Phone("077712345", "Nokia", 100);
        Phone phoneLG = new Phone("07779765", "LG", 150);

        System.out.println("PHONE:");
        System.out.println(phoneNokia);
        System.out.println(phoneLG);

        LandLinePhone phoneLL1 = new LandLinePhone("053345612", "LG", 400, true);
        LandLinePhone phoneLL2 = new LandLinePhone("053398712", "LG", 500, true);

        System.out.println("-------------------");
        System.out.println("LandLinePhone:");
        System.out.println(phoneLL1);
        System.out.println(phoneLL2);

        MobilePhone iPhone = new MobilePhone("077865432", "iPhone", 175, 5.9, true);
        MobilePhone Samsung = new MobilePhone("077836524", "Samsung", 145, 6.2, true);

        System.out.println("-------------------");
        System.out.println("MobilePhone:");
        System.out.println(iPhone);
        System.out.println(Samsung);

        System.out.println("-------------------");
        aboutPhone(phoneNokia);
        aboutPhone(phoneLL1);
        aboutPhone(iPhone);

        iPhone.setScreenSize(6.5);
        Samsung.setNumber("77536996");

        System.out.println("-------------------");
        System.out.println(iPhone);
        System.out.println(Samsung);

        Samsung.sendMessage("Это тестовая СМСка", iPhone.getNumber());

    }

    public static void aboutPhone(RingAble ringAble) {
        ringAble.ring();
    }

}
