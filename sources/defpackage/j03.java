package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DepthSortedSet.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001e"}, d2 = {"Lj03;", "", "Len5;", "node", "", "b", "", "a", "f", e.a, DateTokenConverter.CONVERTER_KEY, "", "toString", "Z", "extraAssertions", "", "", "Lrn5;", c.a, "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Lrmb;", "Lrmb;", "set", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j03  reason: default package */
/* loaded from: classes.dex */
public final class j03 {
    private final boolean a;
    private final rn5 b;
    private final Comparator<en5> c;
    private final rmb<en5> d;

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"j03$a", "Ljava/util/Comparator;", "Len5;", "Lkotlin/Comparator;", "l1", "l2", "", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: j03$a */
    /* loaded from: classes.dex */
    public static final class a implements Comparator<en5> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(en5 en5Var, en5 en5Var2) {
            z65.h(en5Var, "l1");
            z65.h(en5Var2, "l2");
            int j = z65.j(en5Var.I(), en5Var2.I());
            if (j != 0) {
                return j;
            }
            return z65.j(en5Var.hashCode(), en5Var2.hashCode());
        }
    }

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Len5;", "", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: j03$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Map<en5, Integer>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<en5, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public j03(boolean z) {
        rn5 a2;
        this.a = z;
        a2 = yn5.a(fo5.c, b.a);
        this.b = a2;
        a aVar = new a();
        this.c = aVar;
        this.d = new rmb<>(aVar);
    }

    private final Map<en5, Integer> c() {
        return (Map) this.b.getValue();
    }

    public final void a(en5 en5Var) {
        z65.h(en5Var, "node");
        if (en5Var.C0()) {
            if (this.a) {
                Integer num = c().get(en5Var);
                if (num == null) {
                    c().put(en5Var, Integer.valueOf(en5Var.I()));
                } else {
                    if (num.intValue() != en5Var.I()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.d.add(en5Var);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(en5 en5Var) {
        z65.h(en5Var, "node");
        boolean contains = this.d.contains(en5Var);
        if (this.a && contains != c().containsKey(en5Var)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return contains;
    }

    public final boolean d() {
        return this.d.isEmpty();
    }

    public final en5 e() {
        en5 first = this.d.first();
        z65.g(first, "node");
        f(first);
        return first;
    }

    public final boolean f(en5 en5Var) {
        z65.h(en5Var, "node");
        if (en5Var.C0()) {
            boolean remove = this.d.remove(en5Var);
            if (this.a) {
                Integer remove2 = c().remove(en5Var);
                if (remove) {
                    int I = en5Var.I();
                    if (remove2 == null || remove2.intValue() != I) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (remove2 != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String obj = this.d.toString();
        z65.g(obj, "set.toString()");
        return obj;
    }
}
