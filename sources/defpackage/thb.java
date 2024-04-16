package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ToSortedLocalitiesVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a(\u0010\u000b\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lmv5;", "Lila;", "a", "", "Ldt5;", "selectedLocality", "b", "", "isLastTop", "isSelected", "isCurrentLocality", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: thb  reason: default package */
/* loaded from: classes4.dex */
public final class thb {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: thb$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((dt5) t).c()), Integer.valueOf(((dt5) t2).c()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: thb$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Comparator {
        final /* synthetic */ dt5 a;

        public b(dt5 dt5Var) {
            this.a = dt5Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str;
            int d;
            String name = ((dt5) t2).getName();
            dt5 dt5Var = this.a;
            String str2 = null;
            if (dt5Var != null) {
                str = dt5Var.getName();
            } else {
                str = null;
            }
            Boolean valueOf = Boolean.valueOf(z65.c(name, str));
            String name2 = ((dt5) t).getName();
            dt5 dt5Var2 = this.a;
            if (dt5Var2 != null) {
                str2 = dt5Var2.getName();
            }
            d = mk1.d(valueOf, Boolean.valueOf(z65.c(name2, str2)));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToSortedLocalitiesVO.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldt5;", "it", "", "a", "(Ldt5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: thb$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<dt5, Boolean> {
        final /* synthetic */ dt5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(dt5 dt5Var) {
            super(1);
            this.a = dt5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(dt5 dt5Var) {
            boolean z;
            String str;
            z65.h(dt5Var, "it");
            if (!dt5Var.e()) {
                String name = dt5Var.getName();
                dt5 dt5Var2 = this.a;
                if (dt5Var2 != null) {
                    str = dt5Var2.getName();
                } else {
                    str = null;
                }
                if (!z65.c(name, str)) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToSortedLocalitiesVO.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldt5;", "locality", "", "isLastTop", "Lmv5;", "a", "(Ldt5;Z)Lmv5;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: thb$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function2<dt5, Boolean, mv5> {
        final /* synthetic */ dt5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(dt5 dt5Var) {
            super(2);
            this.a = dt5Var;
        }

        public final mv5 a(dt5 dt5Var, boolean z) {
            z65.h(dt5Var, "locality");
            return thb.d(dt5Var, z, false, z65.c(dt5Var, this.a), 2, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ mv5 invoke(dt5 dt5Var, Boolean bool) {
            return a(dt5Var, bool.booleanValue());
        }
    }

    public static final ila a(mv5 mv5Var) {
        z65.h(mv5Var, "<this>");
        return new ila(mv5Var.d(), mv5Var.f(), mv5Var.e().toString(), mv5Var.c(), 0, false, 48, null);
    }

    public static final Collection<mv5> b(Collection<? extends dt5> collection, dt5 dt5Var) {
        List y0;
        List y02;
        z65.h(collection, "<this>");
        y0 = sc1.y0(collection, new a());
        y02 = sc1.y0(y0, new b(dt5Var));
        return q6c.a(q6c.b(q6c.d(y02, new c(dt5Var))), new d(dt5Var));
    }

    private static final mv5 c(dt5 dt5Var, boolean z, boolean z2, boolean z3) {
        return new mv5(dt5Var.getId(), dt5Var.d(), dt5Var.getName(), dt5Var.a(), z, z2, z3);
    }

    static /* synthetic */ mv5 d(dt5 dt5Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return c(dt5Var, z, z2, z3);
    }
}
