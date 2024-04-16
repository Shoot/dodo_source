package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PrizotekaCalculator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lhk8;", "", "", "Ljk8;", "levels", "Lhn6;", "totalSum", "Lik8;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hk8  reason: default package */
/* loaded from: classes2.dex */
public final class hk8 {
    public static final hk8 a = new hk8();

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hk8$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Double.valueOf(((jk8) t2).b()), Double.valueOf(((jk8) t).b()));
            return d;
        }
    }

    private hk8() {
    }

    public final ik8 a(Collection<jk8> collection, hn6 hn6Var) {
        List y0;
        String str;
        String str2;
        z65.h(collection, "levels");
        z65.h(hn6Var, "totalSum");
        y0 = sc1.y0(collection, new a());
        Iterator it = y0.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kc1.v();
                }
                jk8 jk8Var = (jk8) next;
                if (Double.compare(hn6Var.a(), jk8Var.b()) >= 0) {
                    if (i2 == 0) {
                        str = jk8Var.c();
                        str2 = jk8Var.a();
                    } else {
                        str = l0b.F(jk8Var.c(), "{0}", un6.a(rn6.d(new hn6(((jk8) y0.get(i2 - 1)).b(), hn6Var.c()), hn6Var)), false, 4, null);
                        str2 = jk8Var.a();
                    }
                    i = (collection.size() - i2) - 1;
                } else {
                    i2 = i3;
                }
            } else {
                str = "";
                str2 = "";
                break;
            }
        }
        return new ik8(str, str2, i);
    }
}
