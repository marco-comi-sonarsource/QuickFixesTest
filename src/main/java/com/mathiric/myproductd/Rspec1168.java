package com.mathiric.myproductd;

import com.mathiric.common.Color;
import java.util.*;

import java.util.List;

public class Rspec1168 {

    public static List<Color> getColorsAsList() {
        return null;                             // Noncompliant
    }

    public static Color[] getColors() {
        return null;                             // Noncompliant
    }

    public static void main(String[] args) {
        Color[] results = getColors();

        if (results != null) {                   // Nullity test required to prevent NPE
            for (Color result: results) {
                /* ... */
            }
        }
    }
}
