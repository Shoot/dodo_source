package defpackage;

import java.lang.reflect.Array;
/* compiled from: ArrayBuilders.java */
/* renamed from: er  reason: default package */
/* loaded from: classes2.dex */
public final class er {

    /* compiled from: ArrayBuilders.java */
    /* renamed from: er$a */
    /* loaded from: classes2.dex */
    static class a {
        final /* synthetic */ Class a;
        final /* synthetic */ int b;
        final /* synthetic */ Object c;

        a(Class cls, int i, Object obj) {
            this.a = cls;
            this.b = i;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!q81.E(obj, this.a) || Array.getLength(obj) != this.b) {
                return false;
            }
            for (int i = 0; i < this.b; i++) {
                Object obj2 = Array.get(this.c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static Object a(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }
}
