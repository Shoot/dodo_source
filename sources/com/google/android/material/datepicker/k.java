package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
/* compiled from: TimeSource.java */
/* loaded from: classes2.dex */
class k {
    private static final k c = new k(null, null);
    private final Long a;
    private final TimeZone b;

    private k(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k c() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
