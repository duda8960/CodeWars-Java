public class Main {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));    }
    public static int findIt(int[] a) {
        for(int i=0; i<a.length; i++){
            int count =0;
            for(int j=a.length-1;j>=0;j--){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count%2 !=0){
                return a[i];
            }
        }
        return a[0];
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] indice = new int[2];

        for(int i=0;i<numbers.length;i++){
            for(int j=0; j<=i;j++){
                if(numbers[i]+numbers[j]==target){
                    indice[0]=i;
                    indice[1]=j;
                }
            }
        }
        System.out.println(indice[0] +" " +indice[1]);
        return indice;
    }

}