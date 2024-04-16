package defpackage;

import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: DefaultInterfaceTemporalAccessor.java */
/* renamed from: lq2  reason: default package */
/* loaded from: classes3.dex */
public abstract class lq2 implements q8b {
    @Override // defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (G(u8bVar)) {
                return u8bVar.s();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar != v8b.g() && w8bVar != v8b.a() && w8bVar != v8b.e()) {
            return w8bVar.a(this);
        }
        return null;
    }

    @Override // defpackage.q8b
    public int w(u8b u8bVar) {
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }
}
