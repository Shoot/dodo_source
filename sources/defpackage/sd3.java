package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.geo.feature.suggestions.presentation.a;
import com.dodopizza.geo.feature.suggestions.presentation.b;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ep9;
import defpackage.ny2;
import defpackage.zo9;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EditDeliveryAddressMapRoutingHandlerImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002JB\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J0\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007H\u0016R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#¨\u0006'"}, d2 = {"Lsd3;", "Lpd3;", "Lep9;", "strategyResult", "", "i", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "", Image.TYPE_HIGH, "", "formattedAddress", LocalityEntity.FIELD_COUNTRY_CODE, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lqw1;", "pinCoordinates", "Lkotlin/Function2;", "Le91;", "action", "a", DateTokenConverter.CONVERTER_KEY, "clientDeliveryLocation", "isFromState", "isNew", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "b", com.huawei.hms.opendevice.c.a, "Lf63;", "Lf63;", "geoRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "appRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "<init>", "(Lf63;Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sd3  reason: default package */
/* loaded from: classes2.dex */
public final class sd3 implements pd3 {
    public static final a d = new a(null);
    private static final int e = dy8.geo_suggestions_result;
    private static final int f = dy8.geo_edit_address_result;
    private static final int g = dy8.geo_onboarding_result;
    private final f63 a;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.a b;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.b c;

    /* compiled from: EditDeliveryAddressMapRoutingHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lsd3$a;", "", "", "SUGGESTIONS_RESULT_ID", "I", "a", "()I", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sd3$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return sd3.e;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sd3$b */
    /* loaded from: classes2.dex */
    public static final class b implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: sd3$b$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.geo.feature.selectdeliveryaddress.routingholders.EditDeliveryAddressMapRoutingHandlerImpl$openSuggestionsAndListen$$inlined$listenOnce$1$2", f = "EditDeliveryAddressMapRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: sd3$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0663a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0663a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
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
                    boolean r0 = r6 instanceof defpackage.sd3.b.a.C0663a
                    if (r0 == 0) goto L13
                    r0 = r6
                    sd3$b$a$a r0 = (defpackage.sd3.b.a.C0663a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    sd3$b$a$a r0 = new sd3$b$a$a
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sd3$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends j6 implements Function2<com.dodopizza.geo.feature.suggestions.presentation.b, cv1<? super Unit>, Object> {
        public c(Object obj) {
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

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"sd3$d", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sd3$d */
    /* loaded from: classes2.dex */
    public static final class d implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public d(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(com.dodopizza.geo.feature.suggestions.presentation.a.class.getModifiers())) {
                String name = com.dodopizza.geo.feature.suggestions.presentation.a.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + com.dodopizza.geo.feature.suggestions.presentation.a.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dodopizza.geo.feature.suggestions.presentation.a, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public com.dodopizza.geo.feature.suggestions.presentation.a a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* compiled from: EditDeliveryAddressMapRoutingHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/a;", "a", "()Lcom/dodopizza/geo/feature/suggestions/presentation/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sd3$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<com.dodopizza.geo.feature.suggestions.presentation.a> {
        final /* synthetic */ String b;
        final /* synthetic */ qw1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, qw1 qw1Var) {
            super(0);
            this.b = str;
            this.c = qw1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.dodopizza.geo.feature.suggestions.presentation.a invoke() {
            String str;
            a.C0158a c0158a = com.dodopizza.geo.feature.suggestions.presentation.a.n;
            ny2.a aVar = ny2.K;
            int a = sd3.d.a();
            String a2 = sd3.this.c.a();
            dt5 b = sd3.this.c.b();
            if (b != null) {
                str = b.getId();
            } else {
                str = null;
            }
            return c0158a.a(ny2.a.d(aVar, a, a2, this.b, str, this.c, sd3.this.c.i(), false, false, false, 448, null));
        }
    }

    public sd3(f63 f63Var, com.dodopizza.geo.feature.selectdeliveryaddress.a aVar, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
        z65.h(f63Var, "geoRouter");
        z65.h(aVar, "appRouter");
        z65.h(bVar, "data");
        this.a = f63Var;
        this.b = aVar;
        this.c = bVar;
    }

    private final boolean h(com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
        b.a f2 = bVar.f();
        if (f2 instanceof b.a.c) {
            if (!((b.a.c) bVar.f()).a() && !bVar.d()) {
                return false;
            }
            return true;
        } else if ((f2 instanceof b.a.C0153a) || (f2 instanceof b.a.C0154b)) {
            return false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void i(ep9 ep9Var) {
        if (ep9Var instanceof ep9.a) {
            this.b.a(((ep9.a) ep9Var).a());
        } else if (ep9Var instanceof ep9.b) {
            this.b.b();
        } else if (ep9Var instanceof ep9.d) {
            this.a.i(f, ((ep9.d) ep9Var).a());
        } else if (ep9Var instanceof ep9.e) {
            this.a.i(g, ((ep9.e) ep9Var).a());
        } else {
            boolean z = ep9Var instanceof ep9.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function2 function2, com.dodopizza.geo.feature.suggestions.presentation.b bVar) {
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
        this.a.e(new d(false, new e(str, qw1Var)));
        wz3.C(uz3.a.a(new b(this.a.k(e)), new c(new wk9() { // from class: rd3
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                sd3.j(Function2.this, (com.dodopizza.geo.feature.suggestions.presentation.b) obj);
            }
        })), qx1Var);
    }

    @Override // defpackage.pd3
    public void b(e91 e91Var, boolean z, boolean z2, boolean z3, a.b bVar) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(bVar, "stateError");
        i(this.c.e().F(new zo9.b(e91Var, z, z2, z3, h(this.c), bVar)));
    }

    @Override // defpackage.pd3
    public void c(e91 e91Var, boolean z) {
        z65.h(e91Var, "clientDeliveryLocation");
        i(this.c.e().s0(e91Var, z, h(this.c)));
    }

    @Override // defpackage.pd3
    public void d() {
        i(this.c.e().d0(h(this.c)));
    }
}
