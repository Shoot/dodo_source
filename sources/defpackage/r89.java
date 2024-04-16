package defpackage;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.realm.c0;
/* compiled from: RealmObjectProxy.java */
/* renamed from: r89  reason: default package */
/* loaded from: classes3.dex */
public interface r89 extends o89 {

    /* compiled from: RealmObjectProxy.java */
    /* renamed from: r89$a */
    /* loaded from: classes3.dex */
    public static class a<E extends o89> {
        @SuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
        public int a;
        public final E b;

        public a(int i, E e) {
            this.a = i;
            this.b = e;
        }
    }

    c0 a();

    void b();
}
