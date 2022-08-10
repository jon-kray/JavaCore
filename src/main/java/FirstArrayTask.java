public class FirstArrayTask {
    public static boolean isSuccess(int numbers) {
        return (numbers % 2) == 0;
    }
    public static int getCountEvenNumbers(int[] array){
        int completeResult = 0;
        for (int EvenNumber : array) {
            if (FirstArrayTask.isSuccess(EvenNumber)) {
                completeResult++;

            }
        }
        return completeResult;
    }

}
