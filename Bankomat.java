package bankomat;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Bankomat  {    
public static void writeToFile() throws IOException{
    
    
    FileWriter Potwierdzenie = null;
    try { 
        Potwierdzenie = new FileWriter("C:\\***");
        Potwierdzenie.write("Z Twojego rachunku wypłacono środki.");
        Potwierdzenie.write(" ");
        Potwierdzenie.write("Twoje saldo po operacji wynosi " + Saldo);
    
    }finally{
        if(Potwierdzenie != null){
            Potwierdzenie.close();
        }
        
        
    }
}   
public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
     int Saldo = 100000;
     int wyplata;
     int wplata;
     int num, sh, potw;
    
    
        while(true){
            System.out.println("Witamy w Bankomacie Banku Studenckiego");   
            System.out.println("1. Wypłata");
            System.out.println("2. Wpłata");
            System.out.println("3. Saldo");
            System.out.println("4. Wyjście");
            num = in.nextInt();
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            switch(num)
            {
                case 1:
                    System.out.println("Kwota zdeponowana na Rachunku wynosi: " + Saldo + " zł");
                    System.out.println("Podaj kwotę którą chcesz wypłacić");
                    System.out.println("1. 20 zł");
                    System.out.println("2. 50 zł");
                    System.out.println("3. 100 zł");
                    System.out.println("4. 200 zł");
                    System.out.println("5. 500 zł");
                    System.out.println("6. Inna(proszę podać kwotę)");
                    sh = in.nextInt();
                    System.out.println(" ");
                    System.out.println(" ");
                        switch(sh)
                        {
                            case 1:
                                if(Saldo > 20){
                                Saldo = Saldo - 20;
                                }else{
                                    System.out.println("Nie posiadasz tyle środków na koncie, podaj poprawna kwotę");
                                    break;
                                }
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Proszę odebrać pieniądze");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę 20 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 2:
                                if(Saldo > 50){
                                Saldo = Saldo - 50;
                                }else{
                                    System.out.println("Nie posiadasz tyle środków na koncie, podaj poprawna kwotę");
                                    break;
                                }
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Proszę odebrać pieniądze");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę 50 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 3:
                                if(Saldo > 100){
                                Saldo = Saldo - 100;
                                }else{
                                    System.out.println("Nie posiadasz tyle środków na koncie, podaj poprawna kwotę");
                                    break;
                                }
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Proszę odebrać pieniądze");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę 100 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 4:
                                if(Saldo > 200){
                                Saldo = Saldo - 200;
                                }else{
                                    System.out.println("Nie posiadasz tyle środków na koncie, podaj poprawna kwotę");
                                    break;
                                }
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Proszę odebrać pieniądze");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę 200 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 5:
                                if(Saldo > 500){
                                Saldo = Saldo - 500;
                                }else{
                                    System.out.println("Nie posiadasz tyle środków na koncie, podaj poprawna kwotę");
                                    break;
                                }
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Proszę odebrać pieniądze");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę 500 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 6: 
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("Proszę podać kwotę: ");
                                wyplata = in.nextInt();
                                if(wyplata <= Saldo){
                                Saldo = Saldo - wyplata;
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Proszę odebrać pieniądze");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę" + wyplata + "zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                                }
                                if(wyplata > Saldo){
                                    System.out.println("Na rachunku nie ma tylu dostępnych środków");
                                    System.out.println("Proszę podać kwotę jeszcze raz ");
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    wyplata = in.nextInt();
                                    if(wyplata <= Saldo){
                                    Saldo = Saldo - wyplata;
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                    System.out.println("Proszę odebrać pieniądze");
                                    System.out.println("Czy Wydrukować potwierdzenie? ");
                                    System.out.println("1. Tak ");
                                    System.out.println("2. Nie ");
                                        potw = in.nextInt();
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        switch(potw)
                                        {
                                            case 1:
                                                FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Z rachunku wypłacono kwotę" + wyplata + "zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                                System.out.println("Proszę odebrać potwierdzenie ");
                                                System.out.println("Dziekuje. Miłego Dnia ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                break;
                                            case 2:
                                                System.out.println("Dziekuje. Miłego Dnia ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                break;
                                        }break;
                                    }
                                    if(wyplata > Saldo){
                                        System.out.println("Kwota niestety znów nie jest poparwna. Za samo 500+ nie wyzyjesz ");
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        break;
                                    }
                        }
                
                    }break;
                case 2:
                    System.out.println("Kwota zdeponowana na Rachunku wynosi: " + Saldo + " zł");
                    System.out.println("Podaj kwotę którą chcesz wpłacić");
                    System.out.println("1. 20 zł");
                    System.out.println("2. 50 zł");
                    System.out.println("3. 100 zł");
                    System.out.println("4. 200 zł");
                    System.out.println("5. 500 zł");
                    System.out.println("6. Inna(proszę podać kwotę)");
                    sh = in.nextInt();
                    System.out.println(" ");
                    System.out.println(" ");
                        switch(sh)
                        {
                            case 1:
                                Saldo = Saldo + 20;
                                System.out.println("Proszę umieśić pieniądze w miejscu oznaczonym strzałką");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Na rachunek wpłacono kwotę 20 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 2:
                                Saldo = Saldo + 50;
                                System.out.println("Proszę umieśić pieniądze w miejscu oznaczonym strzałką");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Na rachunek wpłacono kwotę 50 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break; 
                                    }break;
                            case 3:
                                Saldo = Saldo + 100;
                                System.out.println("Proszę umieśić pieniądze w miejscu oznaczonym strzałką");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Na rachunek wpłacono kwotę 100 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 4:
                                Saldo = Saldo + 200;
                                System.out.println("Proszę umieśić pieniądze w miejscu oznaczonym strzałką");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Na rachunek wpłacono kwotę 200 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                            case 5:
                                Saldo = Saldo + 500;
                                System.out.println("Proszę umieśić pieniądze w miejscu oznaczonym strzałką");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Na rachunek wpłacono kwotę 500 zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                                    
                            case 6:
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("Proszę podać kwotę którą chcesz wpłacić ");
                                wplata = in.nextInt();
                                Saldo = Saldo + wplata;
                                System.out.println("Proszę umieśić pieniądze w miejscu oznaczonym strzałką");
                                System.out.println("Saldo po operacji wynosi: " + Saldo + " zł");
                                System.out.println("Czy Wydrukować potwierdzenie? ");
                                System.out.println("1. Tak ");
                                System.out.println("2. Nie ");
                                    potw = in.nextInt();
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    switch(potw)
                                    {
                                        case 1:
                                            FileWriter Potwierdzenie = null;
                                            try{
                                                Potwierdzenie = new FileWriter("File directory");
                                                Potwierdzenie.write("Na rachunek wpłacono kwotę" + wplata + "zł Obecne Saldo wynosi " + Saldo + " zł. Data operacji: 11.09.2001 ");
                                            }finally{
                                                if(Potwierdzenie != null){
                                                    Potwierdzenie.close();
                                                }
                                            }
                                            System.out.println("Proszę odebrać potwierdzenie ");
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.println("Dziekuje. Miłego Dnia ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            break;
                                    }break;
                                
                        }
                case 3:
                    System.out.println("Twoj stan konta na ten moment wynosi " + Saldo + " zł");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                    
                case 4:
                    System.exit(0);
            }
              
            
        }
    }
}
