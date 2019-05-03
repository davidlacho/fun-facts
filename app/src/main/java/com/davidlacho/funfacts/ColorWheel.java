package com.davidlacho.funfacts;

import android.graphics.Color;
import java.util.Random;

/**
 * Created by david.lacho on 2019-05-03
 */
public class ColorWheel {
  int ColorCounter = -1;

  public String[] colors = {
      "#39add1", // light blue
      "#3079ab", // dark blue
      "#c25975", // mauve
      "#e15258", // red
      "#f9845b", // orange
      "#838cc7", // lavender
      "#7d669e", // purple
      "#53bbb4", // aqua
      "#51b46d", // green
      "#e0ab18", // mustard
      "#637a91", // dark gray
      "#f092b0", // pink
      "#b7c0c7"  // light gray
  };

  public int nextColor() {
    ColorCounter++;

    if (ColorCounter == colors.length) {
      ColorCounter = 0;
    }

    return  Color.parseColor(colors[ColorCounter]);
  }

}
