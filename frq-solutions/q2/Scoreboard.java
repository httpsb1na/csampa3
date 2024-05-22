public class Scoreboard {
  private boolean active1;
  private boolean active2 = false;;
  private String team1;
  private String team2;
  private int score1;
  private int score2;

  public Scoreboard(String team1, String team2) {
    this.team1 = team1;
    this.team2 = team2;
  }

  public int recordPlay(int score) { // i think i forgot to return score, maybe..
    if(score == 0) {
      if(active1 = false) {
        active1 = false;
        active2 = true;
      } else if(active2) {
        active2 = false;
        active1 = true;
      } else {
        if(active1) {
          score1 += score;
        } else {
          score2 += score;
    }
      }
    }
    return score;
  }

  public String getScore() {
    if(active1) {
      return score1 + "-" + score2 + "-" + team1;
    } else {
      return score1 + "-" + score2 + "-" + team2;
    }
  }
}
