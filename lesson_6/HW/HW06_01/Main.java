import java.util.Scanner;

import UnlockPhone.FaceIDUnlock;
import UnlockPhone.FingerprintUnlock;
import UnlockPhone.NoPasswordUnlock;
import UnlockPhone.PinUnlock;

public class Main {
    public static void main(String[] args) {
        ActualUnlockMode modeUnlockPhone = new ActualUnlockMode();

        System.out.println(
                "Введите число от 1 до 3, где:\n" +
                        "1 - Установить PIN-код \n" +
                        "2 - Установить разблокировку по отпечатку пальца\n" +
                        "3 - Установить разброкировку по лицу\n" +
                        "4 - Установить разблокировку без пароля");
        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Задайте PIN-код");
                int pin = sc.nextInt();
                PinUnlock pinUnlock = new PinUnlock(pin);
                modeUnlockPhone.switchUnlockMode(pinUnlock);
                break;
            case 2:
                sc.nextLine();
                System.out.println("Задайте отпечаток пальца");
                String finger = sc.nextLine();
                FingerprintUnlock fingerprintUnlock = new FingerprintUnlock(finger);
                modeUnlockPhone.switchUnlockMode(fingerprintUnlock);
                break;
            case 3:
                sc.nextLine();
                System.out.println("Покажите лицо для настройки");
                String face = sc.nextLine();
                FaceIDUnlock faceIDUnlock = new FaceIDUnlock(face);
                modeUnlockPhone.switchUnlockMode(faceIDUnlock);
                break;
            case 4:
                System.out.println("Выбран метод входа без пароля");
                NoPasswordUnlock noPasswordUnlock = new NoPasswordUnlock();
                modeUnlockPhone.switchUnlockMode(noPasswordUnlock);
                break;

            default:
            System.out.println("Метод входа не выбран! По умолчанию установлен вход без пароля.");
            NoPasswordUnlock noPassword = new NoPasswordUnlock();
            modeUnlockPhone.switchUnlockMode(noPassword);
                break;
        }

        modeUnlockPhone.getActualUnlockMode().unlock();
        sc.close();
    }
}
