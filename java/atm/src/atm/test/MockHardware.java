package atm.test;

import static org.junit.Assert.assertEquals;

public class MockHardware {
    private String account;
    private String password;
    private boolean shouldFail;
    public void returnAccount(String inputAccount) {
        this.account = inputAccount;
    }

    public void verifyPassword(String expectPassword) {
        assertEquals(expectPassword, this.password);

    }

    public void failLogin() {
    }
}
