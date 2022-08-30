package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fah = ((float) (temperatureCelsius*9)/5)+32;
        System.out.println(fah);
    }
}
