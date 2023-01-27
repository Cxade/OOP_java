
import UnlockPhone.Unlock;

public class ActualUnlockMode {
    Unlock actualUnlockMode;

    public void switchUnlockMode(Unlock unlock){
        this.actualUnlockMode = unlock;
    }

    public Unlock getActualUnlockMode() {
        return actualUnlockMode;
    }
}
