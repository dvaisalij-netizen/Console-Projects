public class Utilities {
    public static int login(User[] arr, String username, String password) {
            if (arr[0] != null) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null) {
                        if (arr[i].username.equals(username)) {
                            if (arr[i].password.equals(password)) {
                                return i;
                            } else {
                                return -2;
                            }
                        }
                    } else {
                        return -1;
                    }
                }
            }
            return -1;
        }
    }

