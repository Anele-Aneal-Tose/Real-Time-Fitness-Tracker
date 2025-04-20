package za.ac.cput.creational_patterns.abstract_factory;

public interface UIFactory {
    Button createButton();
    Theme createTheme();
}
//interface Button{
//    void render();
//}
//interface Theme{
//    void apply();
//}
class LightButton implements Button{
    public void render(){
        System.out.println("Rendering Light Button");
    }
}
class DarkButton implements Button{
    public void render(){
        System.out.println("Rendering Dark Button");
    }
}
class LightTheme implements Theme {
    public void apply(){
        System.out.println("Applying Light Theme");
    }
}
class DarkTheme implements Theme {
    public void apply(){
        System.out.println("Applying Dark Theme");
    }
}
//public class LightUIFactory implements UIFactory {
//    public Button createButton(){
//        return new LightButton();
//    }
//    public Theme createTheme(){
//        return new DarkTheme();
//    }
//}
