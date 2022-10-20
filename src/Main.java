public class Main {
    public static int arr[] = {1,2,9,3,3,9,50,50,50,41,50};
    public static void main(String[] args) {

        int result[] = maxPocetVyskytu(arr);
        System.out.println("Maximum is: " + result[0]);
        System.out.println("Number of výskyt is: " + result[1]);
    }
    public static int[] maxPocetVyskytu(int[]  arr){
        int max = 0;
        int pocetVyskytu = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                pocetVyskytu++;
            }
            else if(arr[i] > max){
                max = arr[i];
                pocetVyskytu = 1;
            }
        }



        return new int[] {max, pocetVyskytu};
    }
}