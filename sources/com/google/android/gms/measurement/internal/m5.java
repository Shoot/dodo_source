package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.m;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final /* synthetic */ class m5 {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[m.e.values().length];
        b = iArr;
        try {
            iArr[m.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[m.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[m.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[m.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[had.values().length];
        a = iArr2;
        try {
            iArr2[had.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[had.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[had.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[had.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
