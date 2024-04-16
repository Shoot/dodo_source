package defpackage;
/* compiled from: StreamReadCapability.java */
/* renamed from: vya  reason: default package */
/* loaded from: classes2.dex */
public enum vya implements l85 {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false);
    
    private final boolean a;
    private final int b = 1 << ordinal();

    vya(boolean z) {
        this.a = z;
    }

    @Override // defpackage.l85
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.l85
    public int i() {
        return this.b;
    }
}
