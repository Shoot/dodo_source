package defpackage;
/* compiled from: GlideSuppliers.java */
/* renamed from: eg4  reason: default package */
/* loaded from: classes.dex */
public final class eg4 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: GlideSuppliers.java */
    /* renamed from: eg4$a */
    /* loaded from: classes.dex */
    class a<T> implements b<T> {
        private volatile T a;
        final /* synthetic */ b b;

        a(b bVar) {
            this.b = bVar;
        }

        @Override // defpackage.eg4.b
        public T get() {
            if (this.a == null) {
                synchronized (this) {
                    try {
                        if (this.a == null) {
                            this.a = (T) eh8.d(this.b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.a;
        }
    }

    /* compiled from: GlideSuppliers.java */
    /* renamed from: eg4$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
