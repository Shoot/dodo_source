package com.inappstory.sdk.utils;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class StringsUtils {
    @NonNull
    public static String getNonNull(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
