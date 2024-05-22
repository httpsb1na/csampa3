public class Feeder {
  private int currentFood;

  public void simulateOneDay(int numBirds) {
    if(Math.random() < 0.95) {
      int a = (int) (Math.random() * 50-10) + 10; // I did not do int conversion during the AP Exam
      currentFood -= numBirds * a;
      if(currentFood < 0) {
        currentFoodZZZZ = 0;
      } else {
        currentFood = 0;
      }
    }
  }
