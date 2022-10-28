public class SmartPhonesMain {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        Android android = new Android();

        iPhone.showInfo();
        System.out.println("************************************");
        android.showInfo();

    }
}
