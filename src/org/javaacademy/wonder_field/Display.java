package org.javaacademy.wonder_field;

public class Display {

  private String rightAnswer;
  private char[] charsOnDisplay;

  public void init(String rightAnswer) {
    this.rightAnswer = rightAnswer;
    this.charsOnDisplay = new char[rightAnswer.length()];
    for (int i = 0; i < charsOnDisplay.length ; i++) {
      charsOnDisplay[i] = '_';
    }
  }

  public void printChars() {
    System.out.println(charsOnDisplay);
  }
}
