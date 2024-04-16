package com.dodopizza.geo.feature.selectdeliveryaddress;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SelectDeliveryAddressPresenter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010(\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "", "", Image.TYPE_SMALL, "x", "v", "Le91;", "clientDeliveryLocation", "u", "Ltl5;", "currentLanguage", "w", "t", "onFirstViewAttach", "r", "Lhq3;", "a", "Lhq3;", "featureService", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/c;", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/geo/feature/selectdeliveryaddress/c;", "router", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", com.huawei.hms.push.e.a, "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "appRouter", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lhq3;Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;Lgc;Lcom/dodopizza/geo/feature/selectdeliveryaddress/c;Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SelectDeliveryAddressPresenter extends BasePresenter<Object> {
    private final hq3 a;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.b b;
    private final gc c;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.c d;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.a e;
    private final Logger f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "it", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function1<c.a, Unit> {
        a() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            SelectDeliveryAddressPresenter.this.e.a(a.AbstractC0149a.e.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "it", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<c.a, Unit> {
        b() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            SelectDeliveryAddressPresenter.this.e.a(a.AbstractC0149a.e.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "it", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<c.a, Unit> {
        c() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            SelectDeliveryAddressPresenter.this.e.a(a.AbstractC0149a.e.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "it", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<c.a, Unit> {
        d() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            SelectDeliveryAddressPresenter.this.e.a(a.AbstractC0149a.e.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "it", "", "a", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<c.a, Unit> {
        e() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            SelectDeliveryAddressPresenter.this.e.a(a.AbstractC0149a.e.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public SelectDeliveryAddressPresenter(hq3 hq3Var, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar, gc gcVar, com.dodopizza.geo.feature.selectdeliveryaddress.c cVar, com.dodopizza.geo.feature.selectdeliveryaddress.a aVar) {
        z65.h(hq3Var, "featureService");
        z65.h(bVar, "data");
        z65.h(gcVar, "analytics");
        z65.h(cVar, "router");
        z65.h(aVar, "appRouter");
        this.a = hq3Var;
        this.b = bVar;
        this.c = gcVar;
        this.d = cVar;
        this.e = aVar;
        this.f = LoggerFactory.getLogger("SelectDeliveryAddressPresenter");
    }

    private final void s() {
        b.a f = this.b.f();
        if (f instanceof b.a.c) {
            if (((b.a.c) this.b.f()).a()) {
                t();
            } else {
                x();
            }
        } else if (f instanceof b.a.C0153a) {
            u(((b.a.C0153a) this.b.f()).a());
        } else if (f instanceof b.a.C0154b) {
            w(((b.a.C0154b) this.b.f()).a(), ((b.a.C0154b) this.b.f()).b());
        }
    }

    private final void t() {
        this.d.e();
    }

    private final void u(e91 e91Var) {
        com.dodopizza.geo.feature.selectdeliveryaddress.c.j(this.d, com.dodopizza.geo.feature.selectdeliveryaddress.c.c.a(), e91Var, true, a.EnumC0142a.b, false, null, PresenterScopeKt.getPresenterScope(this), new a(), 32, null);
    }

    private final void v() {
        if (this.a.a(bq3.q6)) {
            com.dodopizza.geo.feature.selectdeliveryaddress.c.g(this.d, com.dodopizza.geo.feature.selectdeliveryaddress.c.c.a(), e91.d.a(), false, a.EnumC0142a.a, false, null, PresenterScopeKt.getPresenterScope(this), new b(), 32, null);
        } else {
            com.dodopizza.geo.feature.selectdeliveryaddress.c.j(this.d, com.dodopizza.geo.feature.selectdeliveryaddress.c.c.a(), e91.d.a(), false, a.EnumC0142a.a, false, null, PresenterScopeKt.getPresenterScope(this), new c(), 32, null);
        }
    }

    private final void w(e91 e91Var, tl5 tl5Var) {
        if (this.a.a(bq3.q6)) {
            this.d.f(com.dodopizza.geo.feature.selectdeliveryaddress.c.c.b(), e91Var, false, a.EnumC0142a.a, true, tl5Var, PresenterScopeKt.getPresenterScope(this), new d());
        } else {
            this.d.i(com.dodopizza.geo.feature.selectdeliveryaddress.c.c.b(), e91Var, false, a.EnumC0142a.a, true, tl5Var, PresenterScopeKt.getPresenterScope(this), new e());
        }
    }

    private final void x() {
        if (this.b.d()) {
            t();
        } else {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        s();
    }

    public final void r() {
        this.e.a(a.AbstractC0149a.e.a);
    }
}
