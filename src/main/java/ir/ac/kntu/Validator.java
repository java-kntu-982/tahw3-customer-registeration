package ir.ac.kntu;

/**
 * @author yourname
 */
// Attention :
// This is a Utility Class, meaning that creating an Object of it doesn't make much sense!
// Therefore the Constructor has been made private!
public final class Validator{

    public static boolean checkName(String name) {
        //check whether the name has the length of 3 or more
        throw new UnsupportedOperationException("Delete this line!-checkName");
    }

    public static boolean checkEmail(String email) {
        // check whether the email is in this format   ------@-----.com
        throw new UnsupportedOperationException("Delete this line!-checkEmail");
    }

    public static boolean checkMobile(String mobile) {
        // check if the given String has the format of a phone number
        throw new UnsupportedOperationException("Delete this line!-checkPhone");
    }


    //This method has been written for you, No need to change
    public static boolean checkNationalCode(String nationalCode) {
        if (nationalCode.length() == 8) {
            nationalCode = "00".concat(nationalCode);
        } else if (nationalCode.length() == 9) {
            nationalCode = "0".concat(nationalCode);
        } else if (nationalCode.length() < 8) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (nationalCode.charAt(i) - '0') * (10 - i);
        }
        int control = 0;
        if (sum % 11 < 2) {
            control = sum % 11;
        } else {
            control = 11 - (sum % 11);
        }
        return (nationalCode.charAt(9) - '0') == control;
    }


    //This is a Utility Class, So you must not be able to create objects from it
    private Validator() {
    }
}
