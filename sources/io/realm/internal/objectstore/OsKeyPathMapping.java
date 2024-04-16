package io.realm.internal.objectstore;

import io.realm.internal.c;
/* loaded from: classes3.dex */
public class OsKeyPathMapping implements ku6 {
    private static final long b = nativeGetFinalizerMethodPtr();
    public long a;

    public OsKeyPathMapping(long j) {
        this.a = -1L;
        this.a = nativeCreateMapping(j);
        c.c.a(this);
    }

    private static native long nativeCreateMapping(long j);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return b;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }
}
