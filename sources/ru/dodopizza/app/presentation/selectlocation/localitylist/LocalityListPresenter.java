package ru.dodopizza.app.presentation.selectlocation.localitylist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import defpackage.hv0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LocalityListPresenter.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000700¢\u0006\u0004\b?\u0010@J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\t\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u0007008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00107\u001a\n 4*\u0004\u0018\u000103038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lhu5;", "", "G", "Lkotlin/Function1;", "", "Ln6a;", "localitiesConsumer", "D", "", "filter", "C", "newLocalities", "H", "", "localities", "E", "Lmv5;", "selectedLocality", "I", "F", "onFirstViewAttach", "view", "v", "w", "localityVO", "A", "B", "z", "y", "u", "Lh97;", "a", "Lh97;", "onboardingData", "Lut5;", "b", "Lut5;", "localityListData", "Lau5;", com.huawei.hms.opendevice.c.a, "Lau5;", "interactor", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "onboardingRouter", "Ll6;", com.huawei.hms.push.e.a, "Ll6;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "", "g", "Z", "isClickHappened", "x", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "(Lh97;Lut5;Lau5;Lf63;Ll6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalityListPresenter extends BasePresenter<hu5> {
    private final h97 a;
    private final ut5 b;
    private final au5 c;
    private final f63 d;
    private final l6<n6a> e;
    private final Logger f;
    private boolean g;

    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ln6a;", "it", "", "a", "(Ljava/util/Collection;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<Collection<? extends n6a>, Unit> {
        a() {
            super(1);
        }

        public final void a(Collection<? extends n6a> collection) {
            z65.h(collection, "it");
            LocalityListPresenter.this.H(collection);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends n6a> collection) {
            a(collection);
            return Unit.a;
        }
    }

    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ln6a;", "localities", "", "a", "(Ljava/util/Collection;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<Collection<? extends n6a>, Unit> {
        b() {
            super(1);
        }

        public final void a(Collection<? extends n6a> collection) {
            List F0;
            z65.h(collection, "localities");
            F0 = sc1.F0(collection);
            LocalityListPresenter localityListPresenter = LocalityListPresenter.this;
            localityListPresenter.H(F0);
            localityListPresenter.E(F0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends n6a> collection) {
            a(collection);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lmv5;", "filteredLocalities", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter$requestFilteredLocalities$1", f = "LocalityListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Collection<? extends mv5>, cv1<? super Unit>, Object> {
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
        public final Object invoke(Collection<mv5> collection, cv1<? super Unit> cv1Var) {
            return ((c) create(collection, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection collection = (Collection) this.b;
                ((hu5) LocalityListPresenter.this.getViewState()).ie(collection.isEmpty());
                LocalityListPresenter.this.e.r();
                LocalityListPresenter.this.e.addAll(collection);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter$requestFilteredLocalities$2", f = "LocalityListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LocalityListPresenter.this.f.error("Failed to filter localities", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ln6a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter$requestLocalities$1", f = "LocalityListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Collection<? extends n6a>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function1<Collection<? extends n6a>, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super Collection<? extends n6a>, Unit> function1, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.c, cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Collection<? extends n6a> collection, cv1<? super Unit> cv1Var) {
            return ((e) create(collection, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                this.c.invoke((Collection) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lpz3;", "", "Ln6a;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter$requestLocalities$2", f = "LocalityListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements y84<pz3<? super Collection<? extends n6a>>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Collection<? extends n6a>> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LocalityListPresenter.this.f.error("Couldn't receive the list of existing locations", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "countryName", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter$showCountryName$1", f = "LocalityListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((g) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((hu5) LocalityListPresenter.this.getViewState()).z0((String) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter$showCountryName$2", f = "LocalityListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LocalityListPresenter.this.f.error("Couldn't receive country name", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln6a;", "localityVO", "", "a", "(Ln6a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<n6a, Boolean> {
        public static final i a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(n6a n6aVar) {
            boolean z;
            z65.h(n6aVar, "localityVO");
            if ((n6aVar instanceof mv5) && ((mv5) n6aVar).i()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln6a;", "localityVO", "", "", "a", "(Ln6a;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<n6a, List<? extends String>> {
        final /* synthetic */ mv5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(mv5 mv5Var) {
            super(1);
            this.a = mv5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(n6a n6aVar) {
            List<String> e;
            z65.h(n6aVar, "localityVO");
            ((mv5) n6aVar).j(z65.c(n6aVar, this.a));
            e = jc1.e("selection_changed");
            return e;
        }
    }

    public /* synthetic */ LocalityListPresenter(h97 h97Var, ut5 ut5Var, au5 au5Var, f63 f63Var, l6 l6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(h97Var, ut5Var, au5Var, f63Var, (i2 & 16) != 0 ? new l6(null, 1, null) : l6Var);
    }

    private final void C(String str) {
        p(z77.a(y87.a(this.c.c(x(), str), new c(null)), new d(null)));
    }

    private final void D(Function1<? super Collection<? extends n6a>, Unit> function1) {
        o(wz3.h(wz3.F(this.c.d(x()), new e(function1, null)), new f(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(List<? extends n6a> list) {
        Iterator<? extends n6a> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                n6a next = it.next();
                if ((next instanceof mv5) && ((mv5) next).g()) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        ((hu5) getViewState()).i3(i2);
    }

    private final void F() {
        if (!this.a.j()) {
            ((hu5) getViewState()).s0();
        }
    }

    private final void G() {
        p(z77.a(y87.a(this.c.a(x()), new g(null)), new h(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Collection<? extends n6a> collection) {
        this.e.r();
        this.e.addAll(collection);
    }

    private final void I(mv5 mv5Var) {
        this.e.S(i.a, new j(mv5Var));
    }

    private final String x() {
        return this.b.a();
    }

    public final void A(mv5 mv5Var) {
        z65.h(mv5Var, "localityVO");
        if (!this.g) {
            this.g = true;
            tl5 b2 = this.c.b(x());
            mv5Var.j(true);
            I(mv5Var);
            this.d.l(this.b.b(), new hv0.b(thb.a(mv5Var), b2));
        }
    }

    public final void B() {
        ((hu5) getViewState()).hb();
        ((hu5) getViewState()).O0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((hu5) getViewState()).yc(this.e);
        F();
        G();
        D(new b());
    }

    public final void u() {
        this.d.e(a5a.a(new n4a(this.a.j(), this.a.c())));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: v */
    public void detachView(hu5 hu5Var) {
        super.detachView(hu5Var);
        this.g = false;
    }

    public final void w(String str) {
        z65.h(str, "filter");
        if (str.length() > 0) {
            C(str);
            return;
        }
        ((hu5) getViewState()).ie(false);
        D(new a());
    }

    public final void y() {
        if (!this.g) {
            this.d.d();
        }
    }

    public final void z() {
        ((hu5) getViewState()).B9();
        F();
    }

    public LocalityListPresenter(h97 h97Var, ut5 ut5Var, au5 au5Var, f63 f63Var, l6<n6a> l6Var) {
        z65.h(h97Var, "onboardingData");
        z65.h(ut5Var, "localityListData");
        z65.h(au5Var, "interactor");
        z65.h(f63Var, "onboardingRouter");
        z65.h(l6Var, "localities");
        this.a = h97Var;
        this.b = ut5Var;
        this.c = au5Var;
        this.d = f63Var;
        this.e = l6Var;
        this.f = LoggerFactory.getLogger("LocalityListPresenter");
    }
}
