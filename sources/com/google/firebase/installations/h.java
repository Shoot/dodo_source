package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class h {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static h d;
    private final u91 a;

    private h(u91 u91Var) {
        this.a = u91Var;
    }

    public static h c() {
        return d(e4b.a());
    }

    public static h d(u91 u91Var) {
        if (d == null) {
            d = new h(u91Var);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull zy7 zy7Var) {
        if (TextUtils.isEmpty(zy7Var.b()) || zy7Var.h() + zy7Var.c() < b() + b) {
            return true;
        }
        return false;
    }
}
