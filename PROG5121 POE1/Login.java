public class Login { 
    private String username; 
    private String password; 
    private String firstName; 
    private String lastName; 
    private String cellNumber; 
 
    public boolean checkUserName(String username) { 
        return username.contains("_") && username.length() <= 5; 
    } 
 
    public boolean checkPasswordComplexity(String password) { 
        boolean hasCap = !password.equals(password.toLowerCase()); 
        boolean hasNum = password.matches(".*\\d.*"); 
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};\':\"\\\\|,.<>\\/?].*"); 
        return password.length() >= 8 && hasCap && hasNum && hasSpecial; 
    } 
 
    public boolean checkCellPhoneNumber(String cellNumber) { 
        return cellNumber.matches("^\\+\\d{1,3}\\d{1,10}$"); 
    } 
 
    public String registerUser(String user, String pass, String first, String last, String cell) { 
        if (!checkUserName(user)) { 
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length."; 
        } 
        if (!checkPasswordComplexity(pass)) { 
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character."; 
        } 
        if (!checkCellPhoneNumber(cell)) { 
            return "Cell phone number incorrectly formatted or does not contain international code."; 
        } 
 
        this.username = user; 
        this.password = pass; 
        this.firstName = first; 
        this.lastName = last; 
        this.cellNumber = cell; 
        return "Username and Password successfully captured."; 
    } 
 
    public boolean loginUser(String enteredUser, String enteredPass) { 
        return enteredUser.equals(this.username) && enteredPass.equals(this.password); 
    } 
 
    public String returnLoginStatus(boolean isLoggedIn) { 
        if (isLoggedIn) { 
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again."; 
        } else { 
            return "Username or password incorrect, please try again."; 
        } 
    } 
} 
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
 
public class LoginTest { 
    Login login = new Login(); 
 
    @Test 
    public void testUsernameCorrect() { 
        assertTrue(login.checkUserName("kyl_1")); 
    } 
 
    @Test 
    public void testUsernameIncorrect() { 
        assertFalse(login.checkUserName("kyle!!!!!!!")); 
    } 
 
    @Test 
    public void testPasswordSuccess() { 
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!")); 
    } 
 
    @Test 
    public void testPasswordFailure() { 
        assertFalse(login.checkPasswordComplexity("password")); 
    } 
} 