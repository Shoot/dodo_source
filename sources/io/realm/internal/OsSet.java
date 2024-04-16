package io.realm.internal;
/* loaded from: classes3.dex */
public class OsSet implements ku6, em7 {
    private static final long e = nativeGetFinalizerPtr();
    private final long a;
    private final c b;
    private final OsSharedRealm c;
    private final Table d;

    public OsSet(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm p = uncheckedRow.o().p();
        this.c = p;
        long[] nativeCreate = nativeCreate(p.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.a = nativeCreate[0];
        c cVar = p.context;
        this.b = cVar;
        cVar.a(this);
        if (nativeCreate[1] != 0) {
            this.d = new Table(p, nativeCreate[1]);
        } else {
            this.d = null;
        }
    }

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeSize(long j);

    public long a() {
        return nativeSize(this.a);
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return e;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }
}
