package UnlockPhone;

import java.util.Scanner;

public class FaceIDUnlock implements Unlock {
    private String faceID;

    public FaceIDUnlock(String faceID) {
        this.faceID = faceID;
    }

    @Override
    public void unlock() {
        System.out.println("Покажите лицо");
        Scanner sc = new Scanner(System.in);
        String finger = sc.nextLine();
        if (finger.equals(faceID)) {
            System.out.println("Здравствуйте!");
        } else {
            System.out.println("Вход не выполнен!");
        }
        sc.close();
    }

}
