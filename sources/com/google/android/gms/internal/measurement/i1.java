package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.t0;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final /* synthetic */ class i1 {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[t0.b.values().length];
        a = iArr;
        try {
            iArr[t0.b.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[t0.b.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[t0.b.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[t0.b.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[t0.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
