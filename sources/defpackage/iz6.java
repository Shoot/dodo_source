package defpackage;

import defpackage.dlb;
/* compiled from: NoTransition.java */
/* renamed from: iz6  reason: default package */
/* loaded from: classes.dex */
public class iz6<R> implements dlb<R> {
    static final iz6<?> a = new iz6<>();
    private static final elb<?> b = new a();

    /* compiled from: NoTransition.java */
    /* renamed from: iz6$a */
    /* loaded from: classes.dex */
    public static class a<R> implements elb<R> {
        @Override // defpackage.elb
        public dlb<R> a(dl2 dl2Var, boolean z) {
            return iz6.a;
        }
    }

    public static <R> dlb<R> b() {
        return a;
    }

    public static <R> elb<R> c() {
        return (elb<R>) b;
    }

    @Override // defpackage.dlb
    public boolean a(Object obj, dlb.a aVar) {
        return false;
    }
}
