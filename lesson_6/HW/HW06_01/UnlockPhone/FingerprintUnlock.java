package UnlockPhone;

import java.util.Scanner;

public class FingerprintUnlock implements Unlock {
    private String fingerprint;

    public FingerprintUnlock(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock() {
        System.out.println("Приложите палец");
        Scanner sc = new Scanner(System.in);
        String finger = sc.nextLine();
        if (finger.equals(fingerprint)) {
            System.out.println("Здравствуйте!");
        } else {
            System.out.println("Вход не выполнен!");
        }
        sc.close();
    }
}
