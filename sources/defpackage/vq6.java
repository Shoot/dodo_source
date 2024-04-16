package defpackage;

import defpackage.he5;
import defpackage.je5;
import defpackage.le5;
/* compiled from: MutablePropertyReference1.java */
/* renamed from: vq6  reason: default package */
/* loaded from: classes3.dex */
public abstract class vq6 extends xq6 implements he5 {
    public vq6() {
    }

    @Override // defpackage.em0
    protected nd5 computeReflected() {
        return bc9.d(this);
    }

    @Override // defpackage.le5
    public Object getDelegate(Object obj) {
        return ((he5) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ je5.a getGetter() {
        mo62getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ ge5 getSetter() {
        mo63getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public vq6(Object obj) {
        super(obj);
    }

    @Override // defpackage.le5
    /* renamed from: getGetter  reason: collision with other method in class */
    public le5.a mo62getGetter() {
        ((he5) getReflected()).mo62getGetter();
        return null;
    }

    @Override // defpackage.he5
    /* renamed from: getSetter  reason: collision with other method in class */
    public he5.a mo63getSetter() {
        ((he5) getReflected()).mo63getSetter();
        return null;
    }

    public vq6(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
