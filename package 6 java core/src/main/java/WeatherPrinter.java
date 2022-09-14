import java.util.Date;

public class WeatherPrinter {

    private float KtoC(float kelvin){
        return (kelvin - 273.15f) ;
    }
    public void print(WeatherList weatherList) {

        for (int i = 0; i < 5; i++) {
            float temp=this.KtoC(weatherList.list[i*8].main.temp);
            String date= new Date(weatherList.list[i*8].dt*1000).toString();
            String str=String.format("| В городе Saint-Petersburg на дату %s ожидается cloud, температура %s|",date,temp);
            System.out.println(str);
        }
    }
}
