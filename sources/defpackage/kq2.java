package defpackage;
/* compiled from: DefaultInterfaceTemporal.java */
/* renamed from: kq2  reason: default package */
/* loaded from: classes3.dex */
public abstract class kq2 extends lq2 implements p8b {
    public p8b N(t8b t8bVar) {
        return t8bVar.a(this);
    }

    public p8b i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j, x8bVar);
    }

    public p8b s(r8b r8bVar) {
        return r8bVar.o(this);
    }
}
