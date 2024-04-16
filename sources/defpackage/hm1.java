package defpackage;

import java.util.Set;
/* compiled from: ComponentContainer.java */
/* renamed from: hm1  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm1 {
    public static Object a(im1 im1Var, su8 su8Var) {
        bs8 d = im1Var.d(su8Var);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    public static Object b(im1 im1Var, Class cls) {
        return im1Var.e(su8.b(cls));
    }

    public static gs2 c(im1 im1Var, Class cls) {
        return im1Var.h(su8.b(cls));
    }

    public static bs8 d(im1 im1Var, Class cls) {
        return im1Var.d(su8.b(cls));
    }

    public static Set e(im1 im1Var, su8 su8Var) {
        return (Set) im1Var.b(su8Var).get();
    }

    public static Set f(im1 im1Var, Class cls) {
        return im1Var.f(su8.b(cls));
    }
}
