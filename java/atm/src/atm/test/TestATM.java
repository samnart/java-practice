package atm.test;
import static org.junit.jupiter.api.Assertions.*;

import atm.atm.ATM;
import atm.atm.Hardware;
import org.junit.Test;
import org.junit.jupiter.api.*;
//import atm.ATM;

public class TestATM {
    @Test
    void successfulLogin() {
        MockHardware hardMock = new MockHardware();
        ATM atm = new ATM(hardMock);
        hardMock.returnAccount("555777");
        String msg = atm.login("12345");
        assertEquals("Logged in", msg);;
        hardMock.verifyPassword("12345");
    }

    @Test
    void failedLogin() {
        MockHardware hardMock = new MockHardware();
        ATM atm = new ATM(hardMock);
        hardMock.failLogin();
        String msg = atm.login("12345");
        assertEquals("login failed", msg);;
//        hardMock.verifyPassword("12345");
    }

    @Test
    void getBalance() {
        MockHardware hardMock = new MockHardware();
        ATM atm = new ATM(hardMock);
        ServiceMock serviceMock = new ServiceMock();
        atm.setService(serviceMock);
        hardMock.returnAccount("555777");
        serviceMock.setBalanceToReturn(5);
        String message = atm.balance("12345");

        serviceMock.verifyReceivedAccount("555777");

        assertEquals("Your balance is 5 Euros", message);
    }
}
