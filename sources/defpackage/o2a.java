package defpackage;
/* compiled from: SecretBytes.java */
/* renamed from: o2a  reason: default package */
/* loaded from: classes2.dex */
public final class o2a {
    private final mk0 a;

    private o2a(mk0 mk0Var) {
        this.a = mk0Var;
    }

    public static o2a a(byte[] bArr, q2a q2aVar) {
        if (q2aVar != null) {
            return new o2a(mk0.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.a.c();
    }
}
