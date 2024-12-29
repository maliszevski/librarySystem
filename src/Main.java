import AppLogic.AppLogic;
import Library.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        AppLogic appLogic = new AppLogic(scanner);
        boolean isRunning = true;
        appLogic.run(isRunning);


            }
        }
