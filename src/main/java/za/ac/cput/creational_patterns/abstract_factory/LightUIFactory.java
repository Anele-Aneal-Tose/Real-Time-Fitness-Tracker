package za.ac.cput.creational_patterns.abstract_factory;

public class LightUIFactory implements UIFactory{
    public Button createButton(){
        return new LightButton();
    }
    public Theme createTheme(){
        return new DarkTheme();
    }
}
