package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.a68;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PizzeriasFiltersService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lma8;", "Lka8;", "", "Lb68;", "pizzerias", "", "Lr88;", e.a, c.a, "Lh88;", "a", "filter", "", DateTokenConverter.CONVERTER_KEY, "f", "b", "Lfa8;", "Lfa8;", "repository", "<init>", "(Lfa8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ma8  reason: default package */
/* loaded from: classes4.dex */
public final class ma8 implements ka8 {
    private final fa8 a;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ma8$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((r88) t).a().i()), Integer.valueOf(((r88) t2).a().i()));
            return d;
        }
    }

    public ma8(fa8 fa8Var) {
        z65.h(fa8Var, "repository");
        this.a = fa8Var;
    }

    @Override // defpackage.ka8
    public List<h88> a() {
        List<h88> F0;
        F0 = sc1.F0(this.a.a());
        return F0;
    }

    @Override // defpackage.ka8
    public void b() {
        this.a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.util.Collection, java.util.ArrayList] */
    @Override // defpackage.ka8
    public List<b68> c(Collection<b68> collection) {
        List<b68> F0;
        z65.h(collection, "pizzerias");
        ea9 ea9Var = new ea9();
        ea9Var.a = collection;
        for (h88 h88Var : this.a.a()) {
            if (h88Var == h88.c) {
                ?? arrayList = new ArrayList();
                for (Object obj : (Iterable) ea9Var.a) {
                    b68 b68Var = (b68) obj;
                    if ((b68Var.h() instanceof a68.c) || (b68Var.h() instanceof a68.b)) {
                        arrayList.add(obj);
                    }
                }
                ea9Var.a = arrayList;
            }
            if (h88Var == h88.f) {
                ?? arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) ea9Var.a) {
                    b68 b68Var2 = (b68) obj2;
                    if (b68Var2.g().W() && b68Var2.g().T()) {
                        arrayList2.add(obj2);
                    }
                }
                ea9Var.a = arrayList2;
            }
            if (h88Var == h88.d) {
                ?? arrayList3 = new ArrayList();
                for (Object obj3 : (Iterable) ea9Var.a) {
                    if (((b68) obj3).g().N()) {
                        arrayList3.add(obj3);
                    }
                }
                ea9Var.a = arrayList3;
            }
            if (h88Var == h88.e) {
                ?? arrayList4 = new ArrayList();
                for (Object obj4 : (Iterable) ea9Var.a) {
                    if (((b68) obj4).g().P()) {
                        arrayList4.add(obj4);
                    }
                }
                ea9Var.a = arrayList4;
            }
        }
        F0 = sc1.F0((Iterable) ea9Var.a);
        return F0;
    }

    @Override // defpackage.ka8
    public void d(h88 h88Var) {
        z65.h(h88Var, "filter");
        this.a.d(h88Var);
    }

    @Override // defpackage.ka8
    public List<r88> e(Collection<b68> collection) {
        List<r88> y0;
        z65.h(collection, "pizzerias");
        ArrayList arrayList = new ArrayList();
        h88 h88Var = h88.c;
        arrayList.add(new r88(h88Var, this.a.g(h88Var)));
        Collection<b68> collection2 = collection;
        Collection<b68> collection3 = collection2;
        if (!collection3.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b68) it.next()).g().N()) {
                    h88 h88Var2 = h88.d;
                    arrayList.add(new r88(h88Var2, this.a.g(h88Var2)));
                    break;
                }
            }
        }
        if (!collection3.isEmpty()) {
            Iterator<T> it2 = collection2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((b68) it2.next()).g().P()) {
                    h88 h88Var3 = h88.e;
                    arrayList.add(new r88(h88Var3, this.a.g(h88Var3)));
                    break;
                }
            }
        }
        if (!collection3.isEmpty()) {
            Iterator<T> it3 = collection2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                b68 b68Var = (b68) it3.next();
                if (b68Var.g().W() && b68Var.g().T()) {
                    h88 h88Var4 = h88.f;
                    arrayList.add(new r88(h88Var4, this.a.g(h88Var4)));
                    break;
                }
            }
        }
        y0 = sc1.y0(arrayList, new a());
        return y0;
    }

    @Override // defpackage.ka8
    public void f(h88 h88Var) {
        z65.h(h88Var, "filter");
        this.a.f(h88Var);
    }
}
