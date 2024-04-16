package defpackage;
/* compiled from: StreamWriteCapability.java */
/* renamed from: yya  reason: default package */
/* loaded from: classes2.dex */
public enum yya implements l85 {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);
    
    private final boolean a;
    private final int b = 1 << ordinal();

    yya(boolean z) {
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
