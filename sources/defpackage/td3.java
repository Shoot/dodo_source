package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.suggestions.presentation.b;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import defpackage.j6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: EditDeliveryAddressMapRoutingHandlerImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J0\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001d"}, d2 = {"Ltd3;", "Lpd3;", "", "formattedAddress", LocalityEntity.FIELD_COUNTRY_CODE, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lqw1;", "pinCoordinates", "Lkotlin/Function2;", "Le91;", "", "action", "a", DateTokenConverter.CONVERTER_KEY, "clientDeliveryLocation", "", "isFromState", "isNew", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "b", com.huawei.hms.opendevice.c.a, "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: td3  reason: default package */
/* loaded from: classes4.dex */
public final class td3 implements pd3 {
    public static final c b = new c(null);
    private final f63 a;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: td3$a */
    /* loaded from: classes4.dex */
    public static final class a implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: td3$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0674a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.geo.EditDeliveryAddressMapRoutingHandlerImpl$openSuggestionsAndListen$$inlined$listenOnce$1$2", f = "EditDeliveryAddressMapRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: td3$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0675a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0675a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0674a.this.emit(null, this);
                }
            }

            public C0674a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.td3.a.C0674a.C0675a
                    if (r0 == 0) goto L13
                    r0 = r6
                    td3$a$a$a r0 = (defpackage.td3.a.C0674a.C0675a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    td3$a$a$a r0 = new td3$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.suggestions.presentation.b
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.td3.a.C0674a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0674a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: td3$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends j6 implements Function2<com.dodopizza.geo.feature.suggestions.presentation.b, cv1<? super Unit>, Object> {
        public b(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(com.dodopizza.geo.feature.suggestions.presentation.b bVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, bVar, cv1Var);
            return b;
        }
    }

    /* compiled from: EditDeliveryAddressMapRoutingHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ltd3$c;", "", "", "RESULT_ID", "I", "SELECT_DELIVERABLE_PLACE_WITHOUT_CHANGE_ID", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: td3$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public td3(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function2 function2, com.dodopizza.geo.feature.suggestions.presentation.b bVar) {
        z65.h(function2, "$action");
        z65.h(bVar, "result");
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            function2.invoke(aVar.a(), aVar.b());
        }
    }

    @Override // defpackage.pd3
    public void a(String str, String str2, qx1 qx1Var, qw1 qw1Var, final Function2<? super e91, ? super String, Unit> function2) {
        z65.h(str, "formattedAddress");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(qw1Var, "pinCoordinates");
        z65.h(function2, "action");
        g63.b(this.a, "select_location_fragment", j6a.a.f(j6a.h, null, str2, true, R.id.select_deliverable_place_without_change_id, str, qw1Var, null, 64, null));
        wz3.C(uz3.a.a(new a(this.a.k(R.id.select_deliverable_place_without_change_id)), new b(new wk9() { // from class: qd3
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                td3.f(Function2.this, (b) obj);
            }
        })), qx1Var);
    }

    @Override // defpackage.pd3
    public void b(e91 e91Var, boolean z, boolean z2, boolean z3, a.b bVar) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(bVar, "stateError");
        if (fv3.a(z2, z, z3)) {
            this.a.f(h56.c(null, 1, null));
        } else {
            this.a.i(R.id.select_delivery_location_details_id, new c.a.C0131a(e91Var, z2, z, z3));
        }
    }

    @Override // defpackage.pd3
    public void c(e91 e91Var, boolean z) {
        z65.h(e91Var, "clientDeliveryLocation");
        this.a.i(R.id.select_delivery_location_details_id, new c.a.b(e91Var, z));
    }

    @Override // defpackage.pd3
    public void d() {
        this.a.d();
    }
}
