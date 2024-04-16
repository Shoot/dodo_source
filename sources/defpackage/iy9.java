package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.ox1;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SearchInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u001a"}, d2 = {"Liy9;", "Lhy9;", "Lox1;", "Lky9;", DateTokenConverter.CONVERTER_KEY, "", "Lqd6;", e.a, "Lwx;", "a", "Lah6;", "Lah6;", "menuService", "Le78;", "b", "Le78;", "pizzaConceptService", "Lzd6;", com.huawei.hms.opendevice.c.a, "Lzd6;", "menuItemDescriptionUpdater", "Lze6;", "Lze6;", "menuItemVOConverter", "<init>", "(Lah6;Le78;Lzd6;Lze6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: iy9  reason: default package */
/* loaded from: classes4.dex */
public final class iy9 implements hy9, ox1 {
    private final ah6 a;
    private final e78 b;
    private final zd6 c;
    private final ze6 d;

    /* compiled from: SearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lky9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.search.SearchInteractorImpl$getAvailableMenu$1", f = "SearchInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: iy9$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super ky9>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ky9> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return iy9.this.d();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: iy9$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((dd6) t).e()), Integer.valueOf(((dd6) t2).e()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: iy9$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((qd6) t2).l()), Integer.valueOf(((qd6) t).l()));
            return d;
        }
    }

    public iy9(ah6 ah6Var, e78 e78Var, zd6 zd6Var, ze6 ze6Var) {
        z65.h(ah6Var, "menuService");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(zd6Var, "menuItemDescriptionUpdater");
        z65.h(ze6Var, "menuItemVOConverter");
        this.a = ah6Var;
        this.b = e78Var;
        this.c = zd6Var;
        this.d = ze6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ky9 d() {
        List<dd6> y0;
        int w;
        List y02;
        y0 = sc1.y0(this.a.m(), new b());
        ArrayList arrayList = new ArrayList();
        for (dd6 dd6Var : y0) {
            y02 = sc1.y0(this.a.d(dd6Var), new c());
            pc1.C(arrayList, y02);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((qd6) obj).f())) {
                arrayList2.add(obj);
            }
        }
        List<qd6> e = e(arrayList2);
        w = lc1.w(e, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (qd6 qd6Var : e) {
            arrayList3.add(this.d.a(qd6Var, true));
        }
        return new ky9(arrayList3, this.b.a());
    }

    private final List<qd6> e(List<? extends qd6> list) {
        int w;
        ArrayList<qd6> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((qd6) obj) instanceof qd6.d)) {
                arrayList.add(obj);
            }
        }
        zd6 zd6Var = this.c;
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (qd6 qd6Var : arrayList) {
            arrayList2.add(zd6Var.a(qd6Var));
        }
        return arrayList2;
    }

    @Override // defpackage.hy9
    public wx<ky9> a() {
        return c(new a(null));
    }

    public <T> wx<T> c(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
