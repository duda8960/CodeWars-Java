public class Twosum {
        /*
        Write a function that takes an array of numbers (integers for the tests) and a target number.
        It should find two different items in the array that, when added together, give the target value.
        The indices of these items should then be returned in a tuple / list (depending on your language)
        like so: (index1, index2).

        For the purposes of this kata, some tests may have multiple answers;
        any valid solutions will be accepted.

        The input will always be valid:
        * numbers will be an array of length 2 or greater,
        * all items will be numbers;
        * target will always be the sum of two different items from that array).

         */
        public static int[] twoSum(int[] numbers, int target) {
            int[] indice = new int[2];

            for(int i=0;i<numbers.length;i++){
                for(int j=numbers.length-1; j>i;j--){
                    if(numbers[i]+numbers[j]==target){
                        indice[0]=i;
                        indice[1]=j;
                    }
                }
            }
            return indice;
        }
}
