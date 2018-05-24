package com.javaee.bsu.anonym;

public class Runner {
    public static void main(String[] args) {
        String ob = "qweRtRRR";
        WrapperString wrFirst = new WrapperString(ob);
        WrapperString wrLast = new WrapperString(ob) {
          @Override
          public String replace(char oldChar, char newChar) {
              char[] array = new char[getStr().length()];
              getStr().getChars(0, getStr().length(), array, 0);
              for (int i = 0; i < array.length - 1; i++) {
                  if (array[i] == oldChar) {
                    array[i] = newChar;
                    break;
                  }
              }
              return new String(array);
            }
        };
    }
}
