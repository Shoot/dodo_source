package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateStrings.java */
/* loaded from: classes2.dex */
public class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j) {
        return b(j, Locale.getDefault());
    }

    static String b(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = l.b(locale).format(new Date(j));
            return format;
        }
        return l.f(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(long j) {
        return e(j, Locale.getDefault());
    }

    static String e(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = l.m(locale).format(new Date(j));
            return format;
        }
        return l.f(locale).format(new Date(j));
    }
}
