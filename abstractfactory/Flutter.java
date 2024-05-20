package abstractfactory;

public class Flutter {

    public void setTheme(String color) {
        System.out.println("Sets theme to " + color);
    }

    public void setRefreshRate(int refreshRate) {
        System.out.println("Set the refresh rate to " + refreshRate);
    }


    public UiFactory createUiFactory(String type) {
        if (type == "Android") {
            return new AndroidUiFactory();
        } else {
            return new IosUiFactory();
        }
    }

}
