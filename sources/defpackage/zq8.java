package defpackage;

import defpackage.je5;
import defpackage.le5;
/* compiled from: PropertyReference1.java */
/* renamed from: zq8  reason: default package */
/* loaded from: classes3.dex */
public abstract class zq8 extends dr8 implements le5 {
    public zq8() {
    }

    @Override // defpackage.em0
    protected nd5 computeReflected() {
        return bc9.f(this);
    }

    @Override // defpackage.le5
    public Object getDelegate(Object obj) {
        return ((le5) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ je5.a getGetter() {
        mo62getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public zq8(Object obj) {
        super(obj);
    }

    @Override // defpackage.le5
    /* renamed from: getGetter */
    public le5.a mo62getGetter() {
        ((le5) getReflected()).mo62getGetter();
        return null;
    }

    public zq8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
