package ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: PhonePrefixListPresenter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0014J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lu48;", "", "w", "", "filter", "v", "", "Lj48;", "La58;", "x", "y", "onFirstViewAttach", "prefix", "u", "onBackPressed", "t", "Lb7a;", "a", "Lb7a;", "request", "Lr48;", "b", "Lr48;", "interactor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "<init>", "(Lb7a;Lr48;Lf63;)V", DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PhonePrefixListPresenter extends BasePresenter<u48> {
    public static final a d = new a(null);
    private final b7a a;
    private final r48 b;
    private final f63 c;

    /* compiled from: PhonePrefixListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter$a;", "", "", "SELECT_PHONE_PREFIX_RESULT", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhonePrefixListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lj48;", "prefixes", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListPresenter$showFilteredPrefixes$1", f = "PhonePrefixListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<List<? extends j48>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.d, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<j48> list, cv1<? super Unit> cv1Var) {
            return ((b) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((u48) PhonePrefixListPresenter.this.getViewState()).u(PhonePrefixListPresenter.this.y((List) this.b, this.d));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhonePrefixListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lj48;", "prefixes", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListPresenter$showPrefixes$1", f = "PhonePrefixListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<List<? extends j48>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<j48> list, cv1<? super Unit> cv1Var) {
            return ((c) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((u48) PhonePrefixListPresenter.this.getViewState()).u(PhonePrefixListPresenter.this.x((List) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(((j48) t).b(), ((j48) t2).b());
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(((j48) t).b(), ((j48) t2).b());
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhonePrefixListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La58;", "it", "", "a", "(La58;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<a58, Boolean> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(a58 a58Var) {
            boolean z;
            z65.h(a58Var, "it");
            if (!a58Var.g() && !z65.c(a58Var.c(), PhonePrefixListPresenter.this.a.a())) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhonePrefixListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La58;", "phonePrefix", "", "isLastSuggested", "a", "(La58;Z)La58;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function2<a58, Boolean, a58> {
        public static final g a = new g();

        g() {
            super(2);
        }

        public final a58 a(a58 a58Var, boolean z) {
            z65.h(a58Var, "phonePrefix");
            return a58.b(a58Var, null, null, null, false, z, 15, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ a58 invoke(a58 a58Var, Boolean bool) {
            return a(a58Var, bool.booleanValue());
        }
    }

    public PhonePrefixListPresenter(b7a b7aVar, r48 r48Var, f63 f63Var) {
        z65.h(b7aVar, "request");
        z65.h(r48Var, "interactor");
        z65.h(f63Var, "router");
        this.a = b7aVar;
        this.b = r48Var;
        this.c = f63Var;
    }

    private final void v(String str) {
        p(y87.a(this.b.c(), new b(str, null)));
    }

    private final void w() {
        p(y87.a(this.b.c(), new c(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<a58> x(List<j48> list) {
        List y0;
        int w;
        List<a58> F0;
        y0 = sc1.y0(list, new d());
        List<j48> list2 = y0;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (j48 j48Var : list2) {
            arrayList.add(b58.e(j48Var, z65.c(j48Var.a(), this.a.b())));
        }
        F0 = sc1.F0(q6c.a(q6c.b(q6c.d(arrayList, new f())), g.a));
        return F0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<a58> y(List<j48> list, String str) {
        List y0;
        int w;
        int w2;
        List<a58> F0;
        y0 = sc1.y0(list, new e());
        List<j48> list2 = y0;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (j48 j48Var : list2) {
            arrayList.add(b58.e(j48Var, z65.c(j48Var.a(), this.a.b())));
        }
        ArrayList<a58> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (b58.b((a58) obj, str)) {
                arrayList2.add(obj);
            }
        }
        w2 = lc1.w(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(w2);
        for (a58 a58Var : arrayList2) {
            arrayList3.add(b58.f(a58Var, str));
        }
        F0 = sc1.F0(arrayList3);
        return F0;
    }

    public final void onBackPressed() {
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        w();
    }

    public final void t(String str) {
        if (str != null && str.length() != 0) {
            v(str);
        } else {
            w();
        }
    }

    public final void u(a58 a58Var) {
        z65.h(a58Var, "prefix");
        this.c.i(R.id.select_phone_prefix_result, new j28(a58Var.e().toString(), a58Var.c()));
    }
}
