public class CreatePhoneNumber {
    /*
    Write a function that accepts an array of 10 integers (between 0 and 9),
    that returns a string of those numbers in the form of a phone number.

    Example
    create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) # => returns "(123) 456-7890"
    The returned format must be correct in order to complete this challenge.

    Don't forget the space after the closing parentheses!
    */
    public static String createPhoneNumber(int[] numbers) {
        String str= "(";
        for(int i =0; i<3; i++){
            str =str +numbers[i];

        }
        str=str+") ";
        for(int j=3; j<6;j++){
            str= str+numbers[j];
        }
        str = str+"-";

        for(int k = 6; k<numbers.length; k++){
            str =str+numbers[k];
        }
        return str;
    }
}
