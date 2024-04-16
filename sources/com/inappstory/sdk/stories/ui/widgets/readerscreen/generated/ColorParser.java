package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.graphics.Color;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class ColorParser {
    public static Map<String, wp7<String, String>> colorsMap;
    static wp7<String, String> transparent;

    static {
        HashMap hashMap = new HashMap();
        colorsMap = hashMap;
        hashMap.put("black", new wp7("#000000", "#c1c1c1"));
        colorsMap.put("white", new wp7<>("#ffffff", "#ffc800"));
        colorsMap.put("red", new wp7<>("#ff1a36", "#eb5c57"));
        colorsMap.put("yellow", new wp7<>("#fff000", "#fbda61"));
        colorsMap.put("green", new wp7<>("#0be361", "#b4ed50"));
        colorsMap.put("violet", new wp7<>("#b300bc", "#0164fd"));
        colorsMap.put("blue", new wp7<>("#0761db", "#b4ed50"));
        colorsMap.put("grey", new wp7<>("#a8a8a8", "#e2e2e2"));
        transparent = new wp7<>("#00000000", "#00000000");
    }

    public static int getColor(String str, boolean z) {
        String str2;
        if (str != null && !str.isEmpty()) {
            try {
                if (str.charAt(0) == '#') {
                    return Color.parseColor(str);
                }
                if (colorsMap.containsKey(str)) {
                    if (z) {
                        str2 = colorsMap.get(str).b;
                    } else {
                        str2 = colorsMap.get(str).a;
                    }
                    return Color.parseColor(str2);
                } else if (str.startsWith("rgba")) {
                    String[] split = str.replaceAll("\\s", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("rgba", "").split(",");
                    return rgbaToColor(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Float.valueOf(Float.parseFloat(split[3])));
                } else if (str.startsWith("rgb")) {
                    String[] split2 = str.replaceAll("\\s", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("rgb", "").split(",");
                    return rgbaToColor(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]), Float.valueOf(1.0f));
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static wp7<String, String> getGradientColor(String str) {
        if (str != null && !str.isEmpty()) {
            if (colorsMap.containsKey(str)) {
                return colorsMap.get(str);
            }
            return transparent;
        }
        return transparent;
    }

    static int rgbaToColor(int i, int i2, int i3, Float f) {
        return Color.argb((int) (f.floatValue() * 255.0f), i, i2, i3);
    }
}
