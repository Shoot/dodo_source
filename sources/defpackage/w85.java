package defpackage;

import java.beans.ConstructorProperties;
import java.beans.Transient;
/* compiled from: Java7SupportImpl.java */
/* renamed from: w85  reason: default package */
/* loaded from: classes2.dex */
public class w85 extends v85 {
    private final Class<?> b = ConstructorProperties.class;

    @Override // defpackage.v85
    public vq8 a(ll llVar) {
        ConstructorProperties b;
        ol r = llVar.r();
        if (r != null && (b = r.b(ConstructorProperties.class)) != null) {
            String[] value = b.value();
            int q = llVar.q();
            if (q < value.length) {
                return vq8.a(value[q]);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.v85
    public Boolean b(al alVar) {
        Transient b = alVar.b(Transient.class);
        if (b != null) {
            return Boolean.valueOf(b.value());
        }
        return null;
    }

    @Override // defpackage.v85
    public Boolean c(al alVar) {
        if (alVar.b(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
