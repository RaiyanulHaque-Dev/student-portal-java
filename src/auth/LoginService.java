package auth;

public class LoginService {
    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS_HASH = PasswordUtil.hashPassword("admin123");

    public static boolean authenticate (String username, String password){
        String hashed = PasswordUtil.hashPassword(password);

        return username.equals(ADMIN_USER) && hashed.equals(ADMIN_PASS_HASH);
    }
}
