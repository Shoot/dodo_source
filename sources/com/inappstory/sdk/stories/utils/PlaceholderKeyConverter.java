package com.inappstory.sdk.stories.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class PlaceholderKeyConverter {
    public static String getPlaceholderNameFromKey(String str) {
        Matcher matcher = Pattern.compile("\\{\\{@placeholder:(.*?)\\}\\}").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
