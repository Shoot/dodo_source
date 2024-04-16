package defpackage;

import android.content.Context;
/* compiled from: LibraryVersionComponent.java */
/* renamed from: ep5  reason: default package */
/* loaded from: classes2.dex */
public class ep5 {

    /* compiled from: LibraryVersionComponent.java */
    /* renamed from: ep5$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        String a(T t);
    }

    public static bm1<?> b(String str, String str2) {
        return bm1.l(cp5.a(str, str2), cp5.class);
    }

    public static bm1<?> c(final String str, final a<Context> aVar) {
        return bm1.m(cp5.class).b(d03.k(Context.class)).f(new rm1() { // from class: dp5
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                cp5 d;
                d = ep5.d(str, aVar, im1Var);
                return d;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ cp5 d(String str, a aVar, im1 im1Var) {
        return cp5.a(str, aVar.a((Context) im1Var.a(Context.class)));
    }
}
