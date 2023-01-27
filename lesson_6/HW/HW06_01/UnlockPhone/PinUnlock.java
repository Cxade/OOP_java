package UnlockPhone;

import java.util.Scanner;

public class PinUnlock implements Unlock {
    private int pin;

    public PinUnlock(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock() {
        System.out.println("Введите PIN");
        Scanner sc = new Scanner(System.in);
        int finger = sc.nextInt();
        if (finger == pin) {
            System.out.println("Здравствуйте!");
        } else {
            System.out.println("Вход не выполнен!");
        }
        sc.close();
    }
}
