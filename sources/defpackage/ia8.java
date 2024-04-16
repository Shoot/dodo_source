package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PizzeriasFiltersRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lia8;", "Lga8;", "Li88;", "filter", "", "f", DateTokenConverter.CONVERTER_KEY, "", "a", "", "g", "b", "", "Ljava/util/Set;", "checkedFilters", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ia8  reason: default package */
/* loaded from: classes2.dex */
public final class ia8 implements ga8 {
    private final Set<i88> a = new LinkedHashSet();

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ia8$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((i88) t).i()), Integer.valueOf(((i88) t2).i()));
            return d;
        }
    }

    @Override // defpackage.ga8
    public Collection<i88> a() {
        List y0;
        y0 = sc1.y0(this.a, new a());
        return y0;
    }

    @Override // defpackage.ga8
    public void b() {
        this.a.clear();
    }

    @Override // defpackage.ga8
    public void d(i88 i88Var) {
        z65.h(i88Var, "filter");
        this.a.remove(i88Var);
    }

    @Override // defpackage.ga8
    public void f(i88 i88Var) {
        z65.h(i88Var, "filter");
        this.a.add(i88Var);
    }

    @Override // defpackage.ga8
    public boolean g(i88 i88Var) {
        z65.h(i88Var, "filter");
        return this.a.contains(i88Var);
    }
}
