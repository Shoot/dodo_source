package com.dodopizza.geo.feature.deliveryaddresslist.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gv2;
import defpackage.k9a;
import defpackage.y6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryAddressListPresenter.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L¢\u0006\u0004\b]\u0010^J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0002J%\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b&\u0010'J \u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010)\u001a\u00020\nH\u0002J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010-\u001a\u00020\u0003H\u0014J\u0006\u0010.\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0017J\u000e\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020+J\u0006\u00102\u001a\u00020\u0003J\u001e\u00107\u001a\u00020\u00032\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204J\u0016\u0010:\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u0002082\u0006\u00109\u001a\u00020!J\u0006\u0010;\u001a\u00020\u0003R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010Z\u001a\n W*\u0004\u0018\u00010V0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010T¨\u0006_"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lew2;", "", "T", "", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "addresses", "F", "V", "", "isAddressFromState", "Le91;", "location", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "locationType", "S", "R", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "result", "oldLocation", "G", "H", "Lou2;", "place", "D", "W", "K", "deliverablePlace", "muteClearCartDialog", "Y", "Lk9a$a;", "I", "Lk9a$b;", "request", "U", "Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "J", "(Lk9a$b;Ljava/lang/Object;)V", "newLocation", "setToState", "E", "Lgv2;", "X", "onFirstViewAttach", "onBackPressed", "P", "deliveryAddressVO", "N", "M", "vo", "", "listSize", "selectedAddressIndex", "Q", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "setDeliveryLocationToStateRequest", "L", "O", "Liv2;", "a", "Liv2;", "args", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a;", "b", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a;", "interactor", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", com.huawei.hms.push.e.a, "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "routingHandler", "f", "Lou2;", "placeToDelete", "g", "Z", "inProgress", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "i", "useAddressListWithSelection", "<init>", "(Liv2;Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a;Lgc;Lhq3;Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryAddressListPresenter extends BasePresenter<ew2> {
    private final iv2 a;
    private final com.dodopizza.geo.feature.deliveryaddresslist.presentation.a b;
    private final gc c;
    private final hq3 d;
    private final com.dodopizza.geo.feature.deliveryaddresslist.presentation.c e;
    private ou2 f;
    private boolean g;
    private final Logger h;
    private final boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "addresses", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$deletePlace$1", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<List<? extends a.C0129a>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<a.C0129a> list, cv1<? super Unit> cv1Var) {
            return ((a) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.V((List) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$deletePlace$2", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ew2) DeliveryAddressListPresenter.this.getViewState()).e();
                DeliveryAddressListPresenter.this.h.warn("Failed to delete address", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "addresses", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$handleDeliveryLocationDetailsChanged$1", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<List<? extends a.C0129a>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ e91 d;
        final /* synthetic */ e91 e;
        final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e91 e91Var, e91 e91Var2, boolean z, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = e91Var;
            this.e = e91Var2;
            this.f = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, this.e, this.f, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<a.C0129a> list, cv1<? super Unit> cv1Var) {
            return ((c) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.V((List) this.b);
                DeliveryAddressListPresenter.this.c.a(y6.a.c(DeliveryAddressListPresenter.this.a.a(), true, this.d, this.e));
                if (this.f && DeliveryAddressListPresenter.this.d.a(bq3.H5)) {
                    DeliveryAddressListPresenter.this.Y(ru2.c(this.d), true);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$handleDeliveryLocationDetailsChanged$2", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
                DeliveryAddressListPresenter.this.h.error("Failed to save delivery location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "result", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<c.a, Unit> {
        final /* synthetic */ e91 b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e91 e91Var, boolean z) {
            super(1);
            this.b = e91Var;
            this.c = z;
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "result");
            DeliveryAddressListPresenter.this.G(aVar, this.b, this.c, a.EnumC0142a.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "result", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<c.a, Unit> {
        final /* synthetic */ boolean b;
        final /* synthetic */ a.EnumC0142a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z, a.EnumC0142a enumC0142a) {
            super(1);
            this.b = z;
            this.c = enumC0142a;
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "result");
            DeliveryAddressListPresenter.this.H(aVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "result", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function1<c.a, Unit> {
        final /* synthetic */ boolean b;
        final /* synthetic */ a.EnumC0142a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z, a.EnumC0142a enumC0142a) {
            super(1);
            this.b = z;
            this.c = enumC0142a;
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "result");
            DeliveryAddressListPresenter.this.H(aVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "addresses", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$requestAddresses$1", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<List<? extends a.C0129a>, cv1<? super Unit>, Object> {
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
        public final Object invoke(List<a.C0129a> list, cv1<? super Unit> cv1Var) {
            return ((h) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.F((List) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$requestAddresses$2", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.h.error("Failed to get list of addresses", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$setDeliveryLocationToState$1", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ k9a.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k9a.b bVar, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ew2) DeliveryAddressListPresenter.this.getViewState()).Pg(ru2.c(this.c.c()));
                DeliveryAddressListPresenter.this.W();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$setDeliveryLocationToState$2", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<sk9<? extends a.b>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ k9a.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k9a.b bVar, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.d = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(this.d, cv1Var);
            kVar.b = obj;
            return kVar;
        }

        public final Object i(Object obj, cv1<? super Unit> cv1Var) {
            return ((k) create(sk9.a(obj), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(sk9<? extends a.b> sk9Var, cv1<? super Unit> cv1Var) {
            return i(sk9Var.k(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.J(this.d, ((sk9) this.b).k());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$setDeliveryLocationToState$3", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((l) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ew2) DeliveryAddressListPresenter.this.getViewState()).Ef();
                DeliveryAddressListPresenter.this.h.error("Error select new DeliverablePlace with new locality", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$setDeliveryLocationToState$4", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.K();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$trySelectedDeliverablePlace$1", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ ou2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ou2 ou2Var, cv1<? super n> cv1Var) {
            super(1, cv1Var);
            this.c = ou2Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new n(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((n) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ew2) DeliveryAddressListPresenter.this.getViewState()).Pg(this.c);
                DeliveryAddressListPresenter.this.W();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$trySelectedDeliverablePlace$2", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<k9a.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z, cv1<? super o> cv1Var) {
            super(2, cv1Var);
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(this.d, cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(k9a.a aVar, cv1<? super Unit> cv1Var) {
            return ((o) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressListPresenter.this.I((k9a.a) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter$trySelectedDeliverablePlace$3", f = "DeliveryAddressListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ew2) DeliveryAddressListPresenter.this.getViewState()).Ef();
                DeliveryAddressListPresenter.this.K();
                DeliveryAddressListPresenter.this.h.error("Error handleSelectedAddress", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DeliveryAddressListPresenter(iv2 iv2Var, com.dodopizza.geo.feature.deliveryaddresslist.presentation.a aVar, gc gcVar, hq3 hq3Var, com.dodopizza.geo.feature.deliveryaddresslist.presentation.c cVar) {
        z65.h(iv2Var, "args");
        z65.h(aVar, "interactor");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(cVar, "routingHandler");
        this.a = iv2Var;
        this.b = aVar;
        this.c = gcVar;
        this.d = hq3Var;
        this.e = cVar;
        this.h = LoggerFactory.getLogger("DeliveryAddressListPresenter");
        this.i = hq3Var.a(bq3.Y5);
    }

    private final void D(ou2 ou2Var) {
        this.c.a(y6.a.b(ck1.s));
        p(z77.a(y87.a(this.b.d(ou2Var), new a(null)), new b(null)));
    }

    private final void E(e91 e91Var, e91 e91Var2, boolean z) {
        p(z77.a(y87.a(this.b.c(e91Var), new c(e91Var, e91Var2, z, null)), new d(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(List<a.C0129a> list) {
        this.c.a(y6.a.h(ck1.q, list.size()));
        if (list.isEmpty()) {
            ((ew2) getViewState()).Zb(this.i);
        } else {
            V(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(c.a aVar, e91 e91Var, boolean z, a.EnumC0142a enumC0142a) {
        if (!(aVar instanceof c.a.C0132c)) {
            if (aVar instanceof c.a.C0131a) {
                a.EnumC0142a enumC0142a2 = a.EnumC0142a.a;
                boolean z2 = true;
                if (enumC0142a == enumC0142a2) {
                    this.c.a(y6.a.e(this.a.a(), true));
                }
                e91 a2 = ((c.a.C0131a) aVar).a();
                if (!z && enumC0142a != enumC0142a2) {
                    z2 = false;
                }
                E(a2, e91Var, z2);
            } else if (aVar instanceof c.a.b) {
                D(ru2.c(((c.a.b) aVar).a()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        mh5.a(Unit.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(c.a aVar, boolean z, a.EnumC0142a enumC0142a) {
        if (!(aVar instanceof c.a.C0132c)) {
            if (aVar instanceof c.a.C0131a) {
                e91 a2 = ((c.a.C0131a) aVar).a();
                T();
                if (z || enumC0142a == a.EnumC0142a.a) {
                    ((ew2) getViewState()).Pg(ru2.c(a2));
                }
            } else if (aVar instanceof c.a.b) {
                T();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        mh5.a(Unit.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(k9a.a aVar, boolean z) {
        if (aVar instanceof k9a.a.C0407a) {
            K();
            com.dodopizza.geo.feature.deliveryaddresslist.presentation.c cVar = this.e;
            e91 a2 = ((k9a.a.C0407a) aVar).a();
            z65.e(a2);
            cVar.d(a2, false, false, a.b.C0152b.a);
        } else if (aVar instanceof k9a.a.e) {
            U(((k9a.a.e) aVar).a());
        } else if (aVar instanceof k9a.a.c) {
            U(((k9a.a.c) aVar).a());
        } else if (aVar instanceof k9a.a.d) {
            if (z) {
                U(((k9a.a.d) aVar).a());
            } else {
                K();
                ((ew2) getViewState()).q(((k9a.a.d) aVar).a());
            }
        } else if (aVar instanceof k9a.a.b) {
            K();
            ((ew2) getViewState()).Ef();
            ((ew2) getViewState()).Ig(((k9a.a.b) aVar).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mh5.a(Unit.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(k9a.b bVar, Object obj) {
        boolean z;
        if (sk9.i(obj)) {
            a.b bVar2 = (a.b) obj;
            com.dodopizza.geo.feature.deliveryaddresslist.presentation.c cVar = this.e;
            e91 c2 = bVar.c();
            if (bVar.e() == k9a.b.a.b) {
                z = true;
            } else {
                z = false;
            }
            cVar.d(c2, true, z, bVar2.a());
        }
        if (sk9.d(obj) != null) {
            ((ew2) getViewState()).Ef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        ((ew2) getViewState()).g();
        this.g = false;
    }

    private final void R(boolean z, e91 e91Var) {
        this.e.c(e91Var, this.a.e(), z, PresenterScopeKt.getPresenterScope(this), this.a.a(), new e(e91Var, z));
    }

    private final void S(boolean z, e91 e91Var, a.EnumC0142a enumC0142a) {
        if (this.d.a(bq3.q6)) {
            this.e.b(e91Var, this.a.e(), z, this.a.c(), this.a.b(), PresenterScopeKt.getPresenterScope(this), enumC0142a, this.a.a(), new f(z, enumC0142a));
        } else {
            this.e.a(e91Var, this.a.e(), z, this.a.c(), this.a.b(), PresenterScopeKt.getPresenterScope(this), enumC0142a, this.a.a(), new g(z, enumC0142a));
        }
    }

    private final void T() {
        p(z77.a(y87.a(this.b.b(), new h(null)), new i(null)));
    }

    private final void U(k9a.b bVar) {
        p(o77.a(z77.a(y87.a(r77.a(this.b.e(bVar), new j(bVar, null)), new k(bVar, null)), new l(null)), new m(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(List<a.C0129a> list) {
        List<? extends gv2> r0;
        if (this.i) {
            r0 = sc1.r0(X(list), gv2.c.a);
            ((ew2) getViewState()).u3(r0);
            return;
        }
        ((ew2) getViewState()).u3(X(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        ((ew2) getViewState()).f();
        this.g = true;
    }

    private final List<gv2> X(List<a.C0129a> list) {
        int w;
        gv2 aVar;
        List<a.C0129a> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (a.C0129a c0129a : list2) {
            if (this.i) {
                aVar = new gv2.b(c0129a.d(), c0129a.b(), c0129a.c(), c0129a.e(), c0129a.e(), true, false);
            } else {
                aVar = new gv2.a(c0129a.d(), c0129a.a(), c0129a.b(), c0129a.c(), c0129a.e());
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(ou2 ou2Var, boolean z) {
        p(z77.a(y87.a(r77.a(this.b.a(ou2Var), new n(ou2Var, null)), new o(z, null)), new p(null)));
    }

    public final void L(EditDeliveryAddressMapPresenter.a aVar, k9a.b bVar) {
        z65.h(aVar, "result");
        z65.h(bVar, "setDeliveryLocationToStateRequest");
        if (aVar instanceof EditDeliveryAddressMapPresenter.a.b) {
            this.c.a(y6.a.g(y6.b.b));
            U(bVar);
            return;
        }
        this.c.a(y6.a.g(y6.b.c));
        ((ew2) getViewState()).Ef();
    }

    public final void M() {
        ou2 ou2Var = this.f;
        if (ou2Var != null) {
            D(ou2Var);
        }
    }

    public final void N(gv2 gv2Var) {
        ou2 b2;
        e91 e2;
        Boolean a2;
        z65.h(gv2Var, "deliveryAddressVO");
        if (!this.g && (b2 = gv2Var.b()) != null && (e2 = ru2.e(b2)) != null && (a2 = gv2Var.a()) != null) {
            if (this.d.a(bq3.S5)) {
                S(a2.booleanValue(), e2, a.EnumC0142a.b);
            } else {
                R(a2.booleanValue(), e2);
            }
            this.c.a(y6.a.f(this.a.a(), true));
        }
    }

    public final void O() {
        if (this.g) {
            return;
        }
        this.c.a(y6.a.a(this.a.a(), true));
        S(false, this.b.f(), a.EnumC0142a.a);
    }

    public final void P(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        this.f = ou2Var;
        ((ew2) getViewState()).Dd();
    }

    public final void Q(gv2 gv2Var, int i2, int i3) {
        ou2 b2;
        z65.h(gv2Var, "vo");
        if (!this.g && (b2 = gv2Var.b()) != null) {
            this.c.a(y6.a.d(this.a.a(), i2, i3));
            Y(b2, false);
        }
    }

    public final void onBackPressed() {
        this.e.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.c.a(zw9.a.c(ck1.q));
        T();
    }
}
