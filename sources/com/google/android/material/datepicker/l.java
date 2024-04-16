package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: UtcDates.java */
/* loaded from: classes2.dex */
class l {
    static AtomicReference<k> a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j) {
        Calendar k = k();
        k.setTimeInMillis(j);
        return d(k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar d(Calendar calendar) {
        Calendar l = l(calendar);
        Calendar k = k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    private static java.text.DateFormat e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    static k g() {
        k kVar = a.get();
        if (kVar == null) {
            return k.c();
        }
        return kVar;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar i() {
        Calendar a2 = g().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(h());
        return a2;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone j() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        return timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}
