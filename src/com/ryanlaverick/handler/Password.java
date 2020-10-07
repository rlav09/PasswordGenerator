package com.ryanlaverick.handler;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Password {

  private String acceptedCharacters;
  private char[] charArray;

  public Password() {
    this.acceptedCharacters = "abcdefghijklmnopqrstuvwxyz";
    this.charArray = acceptedCharacters.toCharArray();
  }

  public String init(int len) {
    StringBuilder stringBuilder = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < len; i++) {
      int randomPos = ThreadLocalRandom.current().nextInt(charArray.length);
      char selectedChar = charArray[randomPos];

      if (Character.isAlphabetical(selectedChar)) {
        if (random.nextBoolean()) {
          selectedChar = Character.toUpperCase(selectedChar);
        }
      }

      stringBuilder.append(selectedChar);
    }

    return stringBuilder.toString().trim();
  }

}
