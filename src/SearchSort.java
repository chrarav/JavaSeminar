public class SearchSort {

    public static void main(String[] args) {

        int [] scores = {65, 43, 54, 84, 83, 78, 75 };

        for(int i=0;i<scores.length;i++){
            System.out.print("Score of "+i+"-th student: ");
            for(int j=1;j<scores[i];j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
