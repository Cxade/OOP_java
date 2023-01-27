package UnlockPhone;

public class NoPasswordUnlock implements Unlock {

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован!");
    }
}
