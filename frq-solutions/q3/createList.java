  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for (String w : wordList) {
      if (w.startsWith(target)) {
        result.add(w.substring(target.length()));
      }
    }
    return result;
  }
}
