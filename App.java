import java.util.Arrays;

class App {
  public static void main(String args[]) {
    int[] scores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
    App.findMedian(scores);
    App.findMean(scores);
    App.findScore(scores);

  }

  private static void findMedian(int[] scores) {
    Arrays.sort(scores);
    double findMedian;
    int totalElements = scores.length;
    if (totalElements % 2 == 0) {
      int sumOfMiddleElements = scores[totalElements / 2] + scores[totalElements / 2 - 1];
      findMedian = ((double) sumOfMiddleElements) / 2;
    } else {
      findMedian = (double) scores[scores.length / 2];
    }
    System.out.println("Median value is " + findMedian);
  }

  private static void findMean(int[] scores) {
    int sum = 0;
    int length = scores.length;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    double findMean = sum / length;
    System.out.println("Mean value is " + findMean);
  }

  private static void findScore(int[] scores) {
    Arrays.sort(scores);
    int length = scores.length;
    System.out.println("Highest score is " + scores[length-1]);  
    System.out.println("Lowest score is " + scores[0]); 
     
  }
}
