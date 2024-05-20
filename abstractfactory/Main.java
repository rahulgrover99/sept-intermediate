package abstractfactory;

public class Main {

    public static void main(String[] args) {


        Flutter flutter = new Flutter();




        flutter.setRefreshRate(12);
        UiFactory uiFactory = flutter.createUiFactory("Android");
        uiFactory.createButton();
        uiFactory.createDropdown();

    }

}
