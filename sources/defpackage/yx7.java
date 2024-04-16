package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PerfMetricValidator.java */
/* renamed from: yx7  reason: default package */
/* loaded from: classes2.dex */
public abstract class yx7 {
    @NonNull
    private static List<yx7> a(@NonNull wx7 wx7Var, @NonNull Context context) {
        ArrayList arrayList = new ArrayList();
        if (wx7Var.m()) {
            arrayList.add(new uw3(wx7Var.n()));
        }
        if (wx7Var.i()) {
            arrayList.add(new rw3(wx7Var.j(), context));
        }
        if (wx7Var.f0()) {
            arrayList.add(new ow3(wx7Var.e0()));
        }
        if (wx7Var.h()) {
            arrayList.add(new qw3(wx7Var.o()));
        }
        return arrayList;
    }

    public static boolean b(@NonNull wx7 wx7Var, @NonNull Context context) {
        List<yx7> a = a(wx7Var, context);
        if (a.isEmpty()) {
            sh.e().a("No validators found for PerfMetric.");
            return false;
        }
        for (yx7 yx7Var : a) {
            if (!yx7Var.c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                if (str.length() <= 40) {
                    if (str2.length() <= 100) {
                        if (str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        }
                        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (dr1 dr1Var : dr1.values()) {
            if (dr1Var.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (er1 er1Var : er1.values()) {
            if (er1Var.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
