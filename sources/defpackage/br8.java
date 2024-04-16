package defpackage;

import defpackage.me5;
/* compiled from: PropertyReference2.java */
/* renamed from: br8  reason: default package */
/* loaded from: classes3.dex */
public abstract class br8 extends dr8 implements me5 {
    public br8(Class cls, String str, String str2, int i) {
        super(em0.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.em0
    protected nd5 computeReflected() {
        return bc9.g(this);
    }

    @Override // defpackage.me5
    public me5.a getGetter() {
        ((me5) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return h0(obj, obj2);
    }
}
