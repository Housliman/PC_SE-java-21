package labs.pm.data;

public enum Rating {
  NOT_RATED("🌑🌑🌑🌑🌑"),
  ONE_STAR("⭐🌑🌑🌑🌑"),
  TWO_STAR("⭐⭐🌑🌑🌑"),
  THREE_STAR("⭐⭐⭐🌑🌑"),
  FOUR_STAR("⭐⭐⭐⭐🌑"),
  FIVE_STAR("⭐⭐⭐⭐⭐");
  // NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
  // ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
  // TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
  // THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
  // FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
  // FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");

  private String stars;

  Rating(String stars) {
    this.stars = stars;
  }
  public String getStars() {
    return stars;
  }
}
