//(i)Create a function that will test if a string is a valid PIN or not via a regular expression.
//
//        A valid PIN has:
//
//
//
//        Exactly 4 or 6 characters.
//
//        Only numeric characters (0-9).
//
//        No whitespace.
//
//
//        Examples
//
//
//        validate("121317") ➞ true
//
//
//
//        validate("1234") ➞ true
//
//
//
//        validate("45135") ➞ false
//
//
//
//        validate("89abc1") ➞ false
//
//
//
//        validate("900876") ➞ true
//
//
//
//        validate(" 4983") ➞ false
//
//
//        Notes
//
//
//
//        Empty strings should return false when tested.

package WeeklyCodingChallenges;

public class ValidPin {

    public static boolean ValidPin(String pin)
    {


        if (pin.matches("\\d{4}|\\d{6}")) {
            return true;

        }
        else return false;


    }

    public static void main(String args[])
    {

        // Test Case 1:
        String pin1 = "132507";
        System.out.println(
                pin1 + ": "
                        + ValidPin(pin1));

        // Test Case 2:
        String pin2 = "201 305";
        System.out.println(
                pin2+ ": "
                        + ValidPin(pin2));

        // Test Case 3:
        String pin3 = " ";
        System.out.println(
                pin3 + ": "
                        + ValidPin(pin3));

        // Test Case 4:
        String pin4 = "2145";
        System.out.println(
                pin4 + ": "
                        + ValidPin(pin4));

        // Test Case 5:
        String pin5 = "21sde4";
        System.out.println(
                pin5 + ": "
                        + ValidPin(pin5));

        // Test Case 6:
        String pin6 = "Akldig";
        System.out.println(
                pin6 + ": "
                        + ValidPin(pin6));

    }
}

