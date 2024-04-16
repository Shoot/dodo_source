package ru.dodopizza.app.presentation.addresslist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ko3;
import defpackage.n8;
import defpackage.su2;
import defpackage.y6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.addresslist.a;
import ru.dodopizza.app.presentation.addresslist.b;
import ru.dodopizza.app.presentation.addresslist.f;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListPresenter.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001QBE\u0012\u0006\u00100\u001a\u00020-\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020201\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F¢\u0006\u0004\bO\u0010PJ\u0016\u0010\u0006\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J&\u0010\u000f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J&\u0010 \u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\r\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J&\u0010\"\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\r\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\nH\u0002J0\u0010)\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040'\u0012\u0004\u0012\u00020\n0&j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`(H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u000e\u0010,\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010N\u001a\n K*\u0004\u0018\u00010J0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lru/dodopizza/app/presentation/addresslist/h;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "Lbua;", "S", "", "Ln8$a;", "addresses", "", "N", "Lru/dodopizza/app/presentation/addresslist/b$b;", "event", "data", "P", "", "selectedAddressIndex", "addressListSize", "Lru/dodopizza/app/presentation/addresslist/i$a;", "result", "Q", "Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "U", "Lou2;", "deliverablePlace", "V", "loadedDeliverablePlace", "X", "W", "Lru/dodopizza/app/presentation/addresslist/b$a;", "R", "Lru/dodopizza/app/presentation/addresslist/b$c;", "O", "M", "L", "K", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a;", "T", "Lgc;", "b", "Lgc;", "analytics", "Lcl2;", "Ln8;", com.huawei.hms.opendevice.c.a, "Lcl2;", "dataSet", "Lru/dodopizza/app/presentation/addresslist/d;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/presentation/addresslist/d;", "interactor", "Ly8;", com.huawei.hms.push.e.a, "Ly8;", "addressListRouter", "Lhq3;", "f", "Lhq3;", "featureService", "Ldt5;", "g", "Ldt5;", "currentLocality", "Ls8;", Image.TYPE_HIGH, "Ls8;", "args", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "i", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lgc;Lcl2;Lru/dodopizza/app/presentation/addresslist/d;Ly8;Lhq3;Ldt5;Ls8;)V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddressListPresenter extends MoxyFSMPresenter<ru.dodopizza.app.presentation.addresslist.h, ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> {
    private final gc b;
    private final cl2<n8> c;
    private final ru.dodopizza.app.presentation.addresslist.d d;
    private final y8 e;
    private final hq3 f;
    private final dt5 g;
    private final s8 h;
    private final Logger i;

    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a$a;", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: AddressListPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a$a;", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.addresslist.AddressListPresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0508a extends a {
            public static final C0508a a = new C0508a();

            private C0508a() {
                super(null);
            }
        }

        /* compiled from: AddressListPresenter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a$b;", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lru/dodopizza/app/presentation/addresslist/i$b;", "a", "Lru/dodopizza/app/presentation/addresslist/i$b;", "()Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "<init>", "(Lru/dodopizza/app/presentation/addresslist/i$b;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends a {
            private final i.b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i.b bVar) {
                super(null);
                z65.h(bVar, "request");
                this.a = bVar;
            }

            public final i.b a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                i.b bVar = this.a;
                return "DialogOkAction(request=" + bVar + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$handleSelectAddress$1", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ b.C0511b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b.C0511b c0511b, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = c0511b;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.X(this.c.b());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$handleSelectAddress$2", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<i.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ b.C0511b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b.C0511b c0511b, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = c0511b;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(i.a aVar, cv1<? super Unit> cv1Var) {
            return ((c) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.Q(this.d.c(), this.d.a(), (i.a) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$handleSelectAddress$3", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
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
                AddressListPresenter.this.i.error("Error handleSelectedAddress", (Throwable) this.b);
                AddressListPresenter.this.W();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$loadInitialData$1", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.i.warn("Failed to track address list screen event. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ln8$a;", "addresses", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$loadInitialData$2", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<List<? extends n8.a>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<n8.a> list, cv1<? super Unit> cv1Var) {
            return ((f) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.N((List) this.b);
                AddressListPresenter.this.y(new bua(f.c.a, a.C0510a.a));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$loadInitialData$3", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.i.error("Failed to load initial addresses", (Throwable) this.b);
                ((ru.dodopizza.app.presentation.addresslist.h) AddressListPresenter.this.getViewState()).A8();
                AddressListPresenter.this.y(new bua(f.a.a, a.C0510a.a));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$loadInitialData$4", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
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
                ((ru.dodopizza.app.presentation.addresslist.h) AddressListPresenter.this.getViewState()).L4();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class i extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddressListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>, Unit> {
            final /* synthetic */ AddressListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/addresslist/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/addresslist/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.addresslist.AddressListPresenter$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0509a extends ej5 implements Function2<a.C0211a, a.C0510a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                final /* synthetic */ AddressListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0509a(AddressListPresenter addressListPresenter) {
                    super(2);
                    this.a = addressListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(a.C0211a c0211a, a.C0510a c0510a) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(c0510a, "<anonymous parameter 1>");
                    return this.a.S();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends m94 implements Function2<b.a, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                b(Object obj) {
                    super(2, obj, AddressListPresenter.class, "handleSimpleBack", "handleSimpleBack(Lru/dodopizza/app/presentation/addresslist/AddressListEvent$BackPressed;Lru/dodopizza/app/presentation/addresslist/AddressListData;)Lru/dodopizza/app/infrastracture/functional/State;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(b.a aVar, ru.dodopizza.app.presentation.addresslist.a aVar2) {
                    z65.h(aVar, "p0");
                    z65.h(aVar2, "p1");
                    return ((AddressListPresenter) this.receiver).R(aVar, aVar2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddressListPresenter addressListPresenter) {
                super(1);
                this.a = addressListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                z65.h(aVar, "$this$state");
                C0509a c0509a = new C0509a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.C0510a.class, (Function2) unb.e(c0509a, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map2 = aVar.b().get(b.a.class);
                z65.e(map2);
                map2.put(a.C0510a.class, (Function2) unb.e(bVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddressListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>, Unit> {
            final /* synthetic */ AddressListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class a extends m94 implements Function2<b.a, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                a(Object obj) {
                    super(2, obj, AddressListPresenter.class, "handleSimpleBack", "handleSimpleBack(Lru/dodopizza/app/presentation/addresslist/AddressListEvent$BackPressed;Lru/dodopizza/app/presentation/addresslist/AddressListData;)Lru/dodopizza/app/infrastracture/functional/State;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(b.a aVar, ru.dodopizza.app.presentation.addresslist.a aVar2) {
                    z65.h(aVar, "p0");
                    z65.h(aVar2, "p1");
                    return ((AddressListPresenter) this.receiver).R(aVar, aVar2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AddressListPresenter addressListPresenter) {
                super(1);
                this.a = addressListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map = aVar.b().get(b.a.class);
                z65.e(map);
                map.put(a.C0510a.class, (Function2) unb.e(aVar2, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddressListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>, Unit> {
            final /* synthetic */ AddressListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class a extends m94 implements Function2<b.a, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                a(Object obj) {
                    super(2, obj, AddressListPresenter.class, "handleSimpleBack", "handleSimpleBack(Lru/dodopizza/app/presentation/addresslist/AddressListEvent$BackPressed;Lru/dodopizza/app/presentation/addresslist/AddressListData;)Lru/dodopizza/app/infrastracture/functional/State;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(b.a aVar, ru.dodopizza.app.presentation.addresslist.a aVar2) {
                    z65.h(aVar, "p0");
                    z65.h(aVar2, "p1");
                    return ((AddressListPresenter) this.receiver).R(aVar, aVar2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AddressListPresenter addressListPresenter) {
                super(1);
                this.a = addressListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map = aVar.b().get(b.a.class);
                z65.e(map);
                map.put(a.C0510a.class, (Function2) unb.e(aVar2, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddressListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/addresslist/f;", "Lru/dodopizza/app/presentation/addresslist/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>, Unit> {
            final /* synthetic */ AddressListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class a extends m94 implements Function2<b.C0511b, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                a(Object obj) {
                    super(2, obj, AddressListPresenter.class, "handleSelectAddress", "handleSelectAddress(Lru/dodopizza/app/presentation/addresslist/AddressListEvent$DeliverablePlaceSelected;Lru/dodopizza/app/presentation/addresslist/AddressListData;)Lru/dodopizza/app/infrastracture/functional/State;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(b.C0511b c0511b, ru.dodopizza.app.presentation.addresslist.a aVar) {
                    z65.h(c0511b, "p0");
                    z65.h(aVar, "p1");
                    return ((AddressListPresenter) this.receiver).P(c0511b, aVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends m94 implements Function2<b.a, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                b(Object obj) {
                    super(2, obj, AddressListPresenter.class, "handleSimpleBack", "handleSimpleBack(Lru/dodopizza/app/presentation/addresslist/AddressListEvent$BackPressed;Lru/dodopizza/app/presentation/addresslist/AddressListData;)Lru/dodopizza/app/infrastracture/functional/State;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(b.a aVar, ru.dodopizza.app.presentation.addresslist.a aVar2) {
                    z65.h(aVar, "p0");
                    z65.h(aVar2, "p1");
                    return ((AddressListPresenter) this.receiver).R(aVar, aVar2);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AddressListPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class c extends m94 implements Function2<b.c, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>> {
                c(Object obj) {
                    super(2, obj, AddressListPresenter.class, "handleEnterNewAddress", "handleEnterNewAddress(Lru/dodopizza/app/presentation/addresslist/AddressListEvent$EnterNewAddress;Lru/dodopizza/app/presentation/addresslist/AddressListData;)Lru/dodopizza/app/infrastracture/functional/State;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b */
                public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> invoke(b.c cVar, ru.dodopizza.app.presentation.addresslist.a aVar) {
                    z65.h(cVar, "p0");
                    z65.h(aVar, "p1");
                    return ((AddressListPresenter) this.receiver).O(cVar, aVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AddressListPresenter addressListPresenter) {
                super(1);
                this.a = addressListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.C0511b.class)) {
                    aVar.b().put(b.C0511b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map = aVar.b().get(b.C0511b.class);
                z65.e(map);
                map.put(a.C0510a.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map2 = aVar.b().get(b.a.class);
                z65.e(map2);
                map2.put(a.C0510a.class, (Function2) unb.e(bVar, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>> map3 = aVar.b().get(b.c.class);
                z65.e(map3);
                map3.put(a.C0510a.class, (Function2) unb.e(cVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>.a<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        i() {
            super(1);
        }

        public final void a(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(AddressListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.addresslist.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(f.d.class, aVar2.a());
            b bVar = new b(AddressListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.addresslist.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(f.e.class, aVar3.a());
            c cVar = new c(AddressListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.addresslist.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(f.a.class, aVar4.a());
            d dVar = new d(AddressListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.addresslist.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.addresslist.a, bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>>>>> c5 = ko3Var.c();
            ko3.a aVar5 = new ko3.a();
            dVar.invoke(aVar5);
            c5.put(f.c.class, aVar5.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$setDeliverablePlaceWithNewLocality$1", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((j) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.K();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListPresenter$setDeliverablePlaceWithNewLocality$2", f = "AddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressListPresenter.this.i.error("Error select new DeliverablePlace with new locality", (Throwable) this.b);
                AddressListPresenter.this.W();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AddressListPresenter(gc gcVar, cl2<n8> cl2Var, ru.dodopizza.app.presentation.addresslist.d dVar, y8 y8Var, hq3 hq3Var, dt5 dt5Var, s8 s8Var) {
        z65.h(gcVar, "analytics");
        z65.h(cl2Var, "dataSet");
        z65.h(dVar, "interactor");
        z65.h(y8Var, "addressListRouter");
        z65.h(hq3Var, "featureService");
        z65.h(dt5Var, "currentLocality");
        z65.h(s8Var, "args");
        this.b = gcVar;
        this.c = cl2Var;
        this.d = dVar;
        this.e = y8Var;
        this.f = hq3Var;
        this.g = dt5Var;
        this.h = s8Var;
        this.i = LoggerFactory.getLogger("AddressListPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        y(new bua(f.b.a, a.C0510a.a));
        this.e.g();
    }

    private final void L(ou2 ou2Var) {
        y(new bua(f.b.a, a.C0510a.a));
        this.e.f(new su2.a(ou2Var));
    }

    private final void M() {
        y(new bua(f.b.a, a.C0510a.a));
        this.e.f(su2.c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(List<n8.a> list) {
        List r0;
        List e2;
        List q0;
        this.b.a(y6.a.h(a9.a(this.h.b()), list.size()));
        if (this.f.a(bq3.H5)) {
            cl2<n8> cl2Var = this.c;
            e2 = jc1.e(n8.b.a);
            q0 = sc1.q0(e2, list);
            cl2Var.addAll(q0);
            return;
        }
        cl2<n8> cl2Var2 = this.c;
        r0 = sc1.r0(list, n8.b.a);
        cl2Var2.addAll(r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> O(b.c cVar, ru.dodopizza.app.presentation.addresslist.a aVar) {
        if (this.f.a(bq3.X)) {
            this.e.i();
            this.b.a(y6.a.a(a9.a(this.h.b()), true));
        } else {
            this.b.a(y6.a.a(a9.a(this.h.b()), false));
            this.e.h();
        }
        return x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> P(b.C0511b c0511b, ru.dodopizza.app.presentation.addresslist.a aVar) {
        p(z77.a(y87.a(r77.a(this.d.a(c0511b.b()), new b(c0511b, null)), new c(c0511b, null)), new d(null)));
        return x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i2, int i3, i.a aVar) {
        this.b.a(y6.a.d(a9.a(this.h.b()), i3, i2));
        if (aVar instanceof i.a.C0514a) {
            M();
        } else if (aVar instanceof i.a.e) {
            L(((i.a.e) aVar).a());
        } else if (aVar instanceof i.a.c) {
            U(((i.a.c) aVar).a());
        } else if (aVar instanceof i.a.d) {
            ((ru.dodopizza.app.presentation.addresslist.h) getViewState()).q7(((i.a.d) aVar).a());
        } else if (aVar instanceof i.a.b) {
            V(((i.a.b) aVar).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mh5.a(Unit.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> R(b.a aVar, ru.dodopizza.app.presentation.addresslist.a aVar2) {
        M();
        return x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> S() {
        p(z77.a(this.d.c(), new e(null)));
        y(new bua(f.e.a, a.C0510a.a));
        p(o77.a(z77.a(y87.a(this.d.b(), new f(null)), new g(null)), new h(null)));
        return x();
    }

    private final void U(i.b bVar) {
        p(z77.a(y87.a(this.d.d(bVar), new j(null)), new k(null)));
    }

    private final void V(ou2 ou2Var) {
        ((ru.dodopizza.app.presentation.addresslist.h) getViewState()).bg(ou2Var);
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        y(new bua(f.c.a, a.C0510a.a));
        ((ru.dodopizza.app.presentation.addresslist.h) getViewState()).Ye();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(ou2 ou2Var) {
        y(new bua(f.e.a, a.C0510a.a));
        ((ru.dodopizza.app.presentation.addresslist.h) getViewState()).r7(ou2Var);
    }

    public final void T(a aVar) {
        z65.h(aVar, "result");
        if (aVar instanceof a.b) {
            this.b.a(y6.a.g(y6.b.b));
            U(((a.b) aVar).a());
            return;
        }
        this.b.a(y6.a.g(y6.b.c));
        W();
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a> t() {
        return new bua<>(f.d.a, a.C0510a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<ru.dodopizza.app.presentation.addresslist.f, ru.dodopizza.app.presentation.addresslist.a>, Unit> v() {
        return new i();
    }
}
