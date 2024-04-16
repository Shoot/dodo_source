package defpackage;

import im.threads.ui.fragments.ChatFragment;
import java.io.Serializable;
/* compiled from: RootNameLookup.java */
/* renamed from: bo9  reason: default package */
/* loaded from: classes2.dex */
public class bo9 implements Serializable {
    protected transient zi5<k81, vq8> a = new zi5<>(20, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);

    public vq8 a(Class<?> cls, w76<?> w76Var) {
        k81 k81Var = new k81(cls);
        vq8 vq8Var = this.a.get(k81Var);
        if (vq8Var != null) {
            return vq8Var;
        }
        vq8 e0 = w76Var.i().e0(w76Var.P(cls).k());
        if (e0 == null || !e0.e()) {
            e0 = vq8.a(cls.getSimpleName());
        }
        this.a.b(k81Var, e0);
        return e0;
    }

    protected Object readResolve() {
        return new bo9();
    }
}
