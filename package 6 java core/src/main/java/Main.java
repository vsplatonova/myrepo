import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

/*1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
2. Подобрать источник самостоятельно.
Можно использовать api accuweather, порядок следующий: зарегистрироваться, зарегистрировать тестовое
приложение для получения api ключа.
3. Реализовать корректный вывод информации о текущей погоде. Создать класс WeatherResponse и десериализовать ответ сервера. Выводить пользователю только текстовое описание погоды и температуру в градусах Цельсия.
4. Реализовать корректный выход из программы
5. Реализовать вывод погоды на следующие 5 дней в формате
| В городе CITY на дату DATE ожидается WEATHER_TEXT, температура - TEMPERATURE |
*/
public class Main {

    public static void main(String[] args) throws IOException{
        try {
            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .followRedirects(true)
                    .retryOnConnectionFailure(true)
                    .build();


            Request request = new Request.Builder()
                    .url(" https://api.openweathermap.org/data/2.5/forecast?lat=59.9339&lon=30.3061&appid=5681e51afb5d788b294ff44dcd10c36f")
                    .get()
                    .build();

            Response responseWithToken = client.newCall(request).execute();

            String responseBody = responseWithToken.body().string();

            WeatherList weather = new WeatherResponse().showResult(responseBody);



            WeatherPrinter weatherPrinter=new WeatherPrinter();
            weatherPrinter.print(weather);
        } catch (JsonProcessingException e){}









    }
}