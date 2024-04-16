package defpackage;

import defpackage.l85;
/* compiled from: JacksonFeatureSet.java */
/* renamed from: m85  reason: default package */
/* loaded from: classes2.dex */
public final class m85<F extends l85> {
    protected int a;

    protected m85(int i) {
        this.a = i;
    }

    public static <F extends l85> m85<F> a(F[] fArr) {
        if (fArr.length <= 31) {
            int i = 0;
            for (F f : fArr) {
                if (f.a()) {
                    i |= f.i();
                }
            }
            return new m85<>(i);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
    }

    public m85<F> b(F f) {
        int i = f.i() | this.a;
        if (i == this.a) {
            return this;
        }
        return new m85<>(i);
    }
}
