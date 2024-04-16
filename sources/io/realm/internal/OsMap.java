package io.realm.internal;
/* loaded from: classes3.dex */
public class OsMap implements ku6 {
    private static final long d = nativeGetFinalizerPtr();
    private final long a;
    private final c b;
    private final Table c;

    public OsMap(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm p = uncheckedRow.o().p();
        long[] nativeCreate = nativeCreate(p.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.a = nativeCreate[0];
        if (nativeCreate[1] != -1) {
            this.c = new Table(p, nativeCreate[1]);
        } else {
            this.c = null;
        }
        c cVar = p.context;
        this.b = cVar;
        cVar.a(this);
    }

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeSize(long j);

    public long a() {
        return nativeSize(this.a);
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return d;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }
}
