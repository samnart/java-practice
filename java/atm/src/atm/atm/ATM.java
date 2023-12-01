package atm.atm;

import atm.test.MockHardware;
import atm.test.ServiceMock;

public class ATM {
    Hardware hardware;

    public ATM(Hardware hardware) {
        this.hardware = hardware;
    }

    public String login(String password) {
        String accountNumber;
        try {
            accountNumber = hardware.getAccountNumberFromCard(password);
        } catch (Exception e) {
            return "Login failed";
        }
        return "Logged in successfully" + accountNumber;
    }

    public void setService(ServiceMock serviceMock) {
    }

    public String balance(String number) {
        return number;
    }
}
