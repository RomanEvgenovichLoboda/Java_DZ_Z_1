import java.text.MessageFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть дату народження\t");
        Scanner scanner = new Scanner(System.in);
        String birthdateStr = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(birthdateStr);
        String[] arr = new String[tokenizer.countTokens()];
        int item = 0;
        while (tokenizer.hasMoreTokens()){
            arr[item++]= tokenizer.nextToken();
        }
        int day = Integer.parseInt(arr[0]);
        String month = arr[1];
        String zodiac;
        if(month.toLowerCase().contains("груд") && day >= 22 || month.toLowerCase().contains("січ") && day <= 20){ zodiac = "Козеріг";}
        else if(month.toLowerCase().contains("січ") && day >= 21 || month.toLowerCase().contains("лют") && day <= 20){ zodiac = "Водолій";}
        else if(month.toLowerCase().contains("лют") && day >= 21 || month.toLowerCase().contains("бер") && day <= 20){ zodiac = "Риби";}
        else if(month.toLowerCase().contains("бер") && day >= 21 || month.toLowerCase().contains("квіт") && day <= 20){ zodiac = "Овен";}
        else if(month.toLowerCase().contains("квіт") && day >= 21 || month.toLowerCase().contains("трав") && day <= 21){ zodiac = "Телець";}
        else if(month.toLowerCase().contains("трав") && day >= 22 || month.toLowerCase().contains("черв") && day <= 21){ zodiac = "Близнюки";}
        else if(month.toLowerCase().contains("черв") && day >= 22 || month.toLowerCase().contains("лип") && day <= 22){ zodiac = "Рак";}
        else if(month.toLowerCase().contains("лип") && day >= 23 || month.toLowerCase().contains("серп") && day <= 23){ zodiac = "Лев";}
        else if(month.toLowerCase().contains("серп") && day >= 24 || month.toLowerCase().contains("верес") && day <= 22){ zodiac = "Діва";}
        else if(month.toLowerCase().contains("верес") && day >= 23 || month.toLowerCase().contains("жовт") && day <= 22){ zodiac = "Терези";}
        else if(month.toLowerCase().contains("жовт") && day >= 23 || month.toLowerCase().contains("листопад") && day <= 22){ zodiac = "Скорпіон";}
        else if(month.toLowerCase().contains("листопад") && day >= 23 || month.toLowerCase().contains("груд") && day <= 21){ zodiac = "Стрілець";}
        else { zodiac = "Помилка";}
        String year;
        switch (Integer.parseInt(arr[2])%12){
            case 0-> year = "Мавпи";
            case 1-> year = "Півня";
            case 2 -> year = "Собаки";
            case 3 -> year = "Свині";
            case 4 -> year = "Щура";
            case 5 -> year = "Бика";
            case 6 -> year = "Тигра";
            case 7 -> year = "Кролика";
            case 8 -> year = "Дракона";
            case 9 -> year = "Змії";
            case 10 -> year = "Коня";
            case 11 -> year = "Кози";
            default -> year = "Помилка";
        }
        System.out.println(MessageFormat.format("Знак: {0}\tРік: {1}",zodiac,year));
    }
}