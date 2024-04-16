package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fnb;
import defpackage.ov0;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: OnDeliveryLocationSetToStateListenerImpl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lv77;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "T", "Lfnb;", "Lsk9;", Image.TYPE_HIGH, "(Lfnb;)Ljava/lang/Object;", "Lov0;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "g", "Le91;", "clientDeliveryLocation", "", "setDeliveryOrderType", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d$a;", "a", "(Le91;Z)Ljava/lang/Object;", "", "b", "Lt41;", "Lt41;", "checkoutDetailsService", "Lqi8;", "Lqi8;", "preferredOrderLocationService", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lt41;Lqi8;Lhq3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: v77  reason: default package */
/* loaded from: classes4.dex */
public final class v77 implements com.dodopizza.geo.feature.deliveryaddresslist.presentation.d {
    private final t41 a;
    private final qi8 b;
    private final hq3 c;
    private final Logger d;

    /* compiled from: OnDeliveryLocationSetToStateListenerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Pair;", "Lb41;", "Lov0;", "a", "()Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v77$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Pair<? extends b41, ? extends ov0>> {
        final /* synthetic */ ou2 b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ou2 ou2Var, boolean z) {
            super(0);
            this.b = ou2Var;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Pair<b41, ov0> invoke() {
            return v77.this.a.j(this.b, this.c);
        }
    }

    /* compiled from: OnDeliveryLocationSetToStateListenerImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lb41;", "Lov0;", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v77$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<Pair<? extends b41, ? extends ov0>, Unit> {
        final /* synthetic */ ou2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ou2 ou2Var) {
            super(1);
            this.b = ou2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends b41, ? extends ov0> pair) {
            invoke2((Pair<b41, ? extends ov0>) pair);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<b41, ? extends ov0> pair) {
            z65.h(pair, "it");
            v77.this.b.b(this.b);
        }
    }

    /* compiled from: OnDeliveryLocationSetToStateListenerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v77$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<Throwable, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "throwable");
            v77.this.d.error("can't set address to state", th);
        }
    }

    /* compiled from: OnDeliveryLocationSetToStateListenerImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lb41;", "Lov0;", "it", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d$a;", "a", "(Lkotlin/Pair;)Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v77$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<Pair<? extends b41, ? extends ov0>, d.a> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final d.a invoke(Pair<b41, ? extends ov0> pair) {
            z65.h(pair, "it");
            return new d.a(v77.this.g(pair.d()));
        }
    }

    public v77(t41 t41Var, qi8 qi8Var, hq3 hq3Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(qi8Var, "preferredOrderLocationService");
        z65.h(hq3Var, "featureService");
        this.a = t41Var;
        this.b = qi8Var;
        this.c = hq3Var;
        this.d = LoggerFactory.getLogger("OnDeliveryLocationSelectedListenerImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b g(ov0 ov0Var) {
        if (ov0Var instanceof ov0.a.c) {
            return a.b.e.a;
        }
        if (ov0Var instanceof ov0.a.C0471a) {
            return a.b.C0151a.a;
        }
        if (ov0Var instanceof ov0.a.b) {
            return a.b.c.a;
        }
        if (ov0Var instanceof ov0.a.d) {
            return a.b.d.a;
        }
        return a.b.C0152b.a;
    }

    private final <T> Object h(fnb<T> fnbVar) {
        if (fnbVar instanceof fnb.c) {
            sk9.a aVar = sk9.b;
            return sk9.b(((fnb.c) fnbVar).d());
        } else if (fnbVar instanceof fnb.b) {
            sk9.a aVar2 = sk9.b;
            return sk9.b(vk9.a(((fnb.b) fnbVar).d()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.d
    public Object a(e91 e91Var, boolean z) {
        z65.h(e91Var, "clientDeliveryLocation");
        ou2 c2 = ru2.c(e91Var);
        return h(hnb.a(hnb.b(hnb.c(fnb.a.a(new a(c2, z)), new b(c2)), new c()), new d()));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.d
    public void b() {
        if (this.c.a(bq3.Z5) || this.c.a(bq3.a6)) {
            this.a.l();
        }
    }
}
