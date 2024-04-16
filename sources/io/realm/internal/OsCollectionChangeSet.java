package io.realm.internal;

import defpackage.xl7;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class OsCollectionChangeSet implements xl7, ku6 {
    private static long c = nativeGetFinalizerPtr();
    private final long a;
    private final boolean b;

    public OsCollectionChangeSet(long j, boolean z) {
        this.a = j;
        this.b = z;
        c.c.a(this);
    }

    private xl7.a[] g(int[] iArr) {
        if (iArr == null) {
            return new xl7.a[0];
        }
        int length = iArr.length / 2;
        xl7.a[] aVarArr = new xl7.a[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            aVarArr[i] = new xl7.a(iArr[i2], iArr[i2 + 1]);
        }
        return aVarArr;
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetRanges(long j, int i);

    public xl7.a[] a() {
        return g(nativeGetRanges(this.a, 2));
    }

    public xl7.a[] b() {
        return g(nativeGetRanges(this.a, 0));
    }

    public Throwable c() {
        return null;
    }

    public xl7.a[] d() {
        return g(nativeGetRanges(this.a, 1));
    }

    public boolean e() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.b;
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return c;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }

    public String toString() {
        if (this.a == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(b()) + "\nInsertion Ranges: " + Arrays.toString(d()) + "\nChange Ranges: " + Arrays.toString(a());
    }
}
