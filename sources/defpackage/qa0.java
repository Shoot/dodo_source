package defpackage;

import defpackage.cb5;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/* compiled from: BeanUtil.java */
/* renamed from: qa0  reason: default package */
/* loaded from: classes2.dex */
public class qa0 {
    public static String a(y85 y85Var) {
        String str;
        String str2;
        String name = y85Var.u().getName();
        if (c(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else if (!d(name)) {
            return null;
        } else {
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, q81.D(y85Var), str2);
    }

    public static Object b(y85 y85Var) {
        Class<?> u = y85Var.u();
        Class<?> T = q81.T(u);
        if (T != null) {
            return q81.l(T);
        }
        if (!y85Var.N() && !y85Var.c()) {
            if (u == String.class) {
                return "";
            }
            if (y85Var.f0(Date.class)) {
                return new Date(0L);
            }
            if (y85Var.f0(Calendar.class)) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(0L);
                return gregorianCalendar;
            }
            return null;
        }
        return cb5.a.NON_EMPTY;
    }

    private static boolean c(String str) {
        return str.startsWith("java.time.");
    }

    private static boolean d(String str) {
        return str.startsWith("org.joda.time.");
    }
}
