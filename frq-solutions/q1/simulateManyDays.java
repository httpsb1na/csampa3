 public int simulateManyDays(int numBirds, int numDays) {
    int a = numDays; // Days left
    int b; // Food found
    while(a > 0 && b > 0){
      a--;
      b++;
    simulateOneDay(numBirds);
    }
    return b;
  }
}
