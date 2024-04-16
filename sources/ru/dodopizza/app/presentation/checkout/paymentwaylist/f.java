package ru.dodopizza.app.presentation.checkout.paymentwaylist;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.et7;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.a;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.d;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.f;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.j;
/* compiled from: PaymentMethodListRouter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u001b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/f;", "Lut7;", "Let7$b;", "emailVO", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "presenter", "", "a", "", "taxPayerId", "b", "Lbu7;", "result", com.huawei.hms.opendevice.c.a, "Lf63;", "Lf63;", "checkoutRouter", "Lkotlin/Function1;", "Lwk9;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a;", "Lkotlin/jvm/functions/Function1;", "emailForChecksResultListener", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/j;", "taxPayerIdResultListener", "<init>", "(Lf63;)V", DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class f implements ut7 {
    public static final a d = new a(null);
    private final f63 a;
    private final Function1<PaymentMethodListPresenter, wk9<ru.dodopizza.app.presentation.checkout.paymentwaylist.a>> b;
    private final Function1<PaymentMethodListPresenter, wk9<ru.dodopizza.app.presentation.checkout.paymentwaylist.j>> c;

    /* compiled from: PaymentMethodListRouter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/f$a;", "", "", "RESULT_EMAIL_FOR_CHECKS", "I", "RESULT_SELECT_PAYMENT_METHOD", "RESULT_TAX_PAYER_ID", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PaymentMethodListRouter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "presenter", "Lwk9;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a;", "b", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;)Lwk9;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<PaymentMethodListPresenter, wk9<ru.dodopizza.app.presentation.checkout.paymentwaylist.a>> {
        public static final b a = new b();

        b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(PaymentMethodListPresenter paymentMethodListPresenter, ru.dodopizza.app.presentation.checkout.paymentwaylist.a aVar) {
            ok3 ok3Var;
            z65.h(paymentMethodListPresenter, "$presenter");
            z65.h(aVar, "resultData");
            if (aVar instanceof a.C0548a) {
                ok3Var = new d.b((a.C0548a) aVar);
            } else if (z65.c(aVar, a.b.a)) {
                ok3Var = d.e.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            paymentMethodListPresenter.w(ok3Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final wk9<ru.dodopizza.app.presentation.checkout.paymentwaylist.a> invoke(final PaymentMethodListPresenter paymentMethodListPresenter) {
            z65.h(paymentMethodListPresenter, "presenter");
            return new wk9() { // from class: ru.dodopizza.app.presentation.checkout.paymentwaylist.g
                @Override // defpackage.wk9
                public final void onResult(Object obj) {
                    f.b.c(PaymentMethodListPresenter.this, (a) obj);
                }
            };
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListRouterImpl$onNavigateToEmailForChecks$$inlined$listenOnce$1$2", f = "PaymentMethodListRouter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.f$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0553a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0553a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.checkout.paymentwaylist.f.c.a.C0553a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.checkout.paymentwaylist.f$c$a$a r0 = (ru.dodopizza.app.presentation.checkout.paymentwaylist.f.c.a.C0553a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.checkout.paymentwaylist.f$c$a$a r0 = new ru.dodopizza.app.presentation.checkout.paymentwaylist.f$c$a$a
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
                    boolean r2 = r5 instanceof ru.dodopizza.app.presentation.checkout.paymentwaylist.a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.checkout.paymentwaylist.f.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
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
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends j6 implements Function2<ru.dodopizza.app.presentation.checkout.paymentwaylist.a, cv1<? super Unit>, Object> {
        public d(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ru.dodopizza.app.presentation.checkout.paymentwaylist.a aVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, aVar, cv1Var);
            return b;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/checkout/paymentwaylist/f$e", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public e(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(ru.dodopizza.app.presentation.checkout.emailforchecks.c.class.getModifiers())) {
                String name = ru.dodopizza.app.presentation.checkout.emailforchecks.c.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + ru.dodopizza.app.presentation.checkout.emailforchecks.c.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, ru.dodopizza.app.presentation.checkout.emailforchecks.c] */
        @Override // defpackage.s64
        public ru.dodopizza.app.presentation.checkout.emailforchecks.c a() {
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

    /* compiled from: PaymentMethodListRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/c;", "a", "()Lru/dodopizza/app/presentation/checkout/emailforchecks/c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.f$f  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0554f extends ej5 implements Function0<ru.dodopizza.app.presentation.checkout.emailforchecks.c> {
        final /* synthetic */ et7.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0554f(et7.b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ru.dodopizza.app.presentation.checkout.emailforchecks.c invoke() {
            return ru.dodopizza.app.presentation.checkout.emailforchecks.c.n.a(new gf3(this.a.b(), this.a.d()));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListRouterImpl$onNavigateToTaxPayerId$$inlined$listenOnce$1$2", f = "PaymentMethodListRouter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.f$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0555a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0555a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.checkout.paymentwaylist.f.g.a.C0555a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.checkout.paymentwaylist.f$g$a$a r0 = (ru.dodopizza.app.presentation.checkout.paymentwaylist.f.g.a.C0555a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.checkout.paymentwaylist.f$g$a$a r0 = new ru.dodopizza.app.presentation.checkout.paymentwaylist.f$g$a$a
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
                    boolean r2 = r5 instanceof ru.dodopizza.app.presentation.checkout.paymentwaylist.j
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.checkout.paymentwaylist.f.g.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g(oz3 oz3Var) {
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
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends j6 implements Function2<ru.dodopizza.app.presentation.checkout.paymentwaylist.j, cv1<? super Unit>, Object> {
        public h(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ru.dodopizza.app.presentation.checkout.paymentwaylist.j jVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, jVar, cv1Var);
            return b;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/checkout/paymentwaylist/f$i", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public i(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(ru.dodopizza.app.presentation.checkout.taxpayerid.c.class.getModifiers())) {
                String name = ru.dodopizza.app.presentation.checkout.taxpayerid.c.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + ru.dodopizza.app.presentation.checkout.taxpayerid.c.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, ru.dodopizza.app.presentation.checkout.taxpayerid.c] */
        @Override // defpackage.s64
        public ru.dodopizza.app.presentation.checkout.taxpayerid.c a() {
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

    /* compiled from: PaymentMethodListRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/c;", "a", "()Lru/dodopizza/app/presentation/checkout/taxpayerid/c;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function0<ru.dodopizza.app.presentation.checkout.taxpayerid.c> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ru.dodopizza.app.presentation.checkout.taxpayerid.c invoke() {
            return ru.dodopizza.app.presentation.checkout.taxpayerid.c.m.a(new v7b(this.a));
        }
    }

    /* compiled from: PaymentMethodListRouter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "presenter", "Lwk9;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/j;", "b", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;)Lwk9;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function1<PaymentMethodListPresenter, wk9<ru.dodopizza.app.presentation.checkout.paymentwaylist.j>> {
        public static final k a = new k();

        k() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(PaymentMethodListPresenter paymentMethodListPresenter, ru.dodopizza.app.presentation.checkout.paymentwaylist.j jVar) {
            ok3 ok3Var;
            z65.h(paymentMethodListPresenter, "$presenter");
            z65.h(jVar, "resultData");
            if (jVar instanceof j.a) {
                ok3Var = new d.k(((j.a) jVar).a());
            } else if (z65.c(jVar, j.b.a)) {
                ok3Var = d.e.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            paymentMethodListPresenter.w(ok3Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final wk9<ru.dodopizza.app.presentation.checkout.paymentwaylist.j> invoke(final PaymentMethodListPresenter paymentMethodListPresenter) {
            z65.h(paymentMethodListPresenter, "presenter");
            return new wk9() { // from class: ru.dodopizza.app.presentation.checkout.paymentwaylist.h
                @Override // defpackage.wk9
                public final void onResult(Object obj) {
                    f.k.c(PaymentMethodListPresenter.this, (j) obj);
                }
            };
        }
    }

    public f(f63 f63Var) {
        z65.h(f63Var, "checkoutRouter");
        this.a = f63Var;
        this.b = b.a;
        this.c = k.a;
    }

    @Override // defpackage.ut7
    public void a(et7.b bVar, PaymentMethodListPresenter paymentMethodListPresenter) {
        z65.h(bVar, "emailVO");
        z65.h(paymentMethodListPresenter, "presenter");
        this.a.e(new e(false, new C0554f(bVar)));
        f63 f63Var = this.a;
        wz3.C(uz3.a.a(new c(f63Var.k(R.id.email_for_checks_result)), new d(this.b.invoke(paymentMethodListPresenter))), PresenterScopeKt.getPresenterScope(paymentMethodListPresenter));
    }

    @Override // defpackage.ut7
    public void b(String str, PaymentMethodListPresenter paymentMethodListPresenter) {
        z65.h(str, "taxPayerId");
        z65.h(paymentMethodListPresenter, "presenter");
        this.a.e(new i(false, new j(str)));
        f63 f63Var = this.a;
        wz3.C(uz3.a.a(new g(f63Var.k(R.id.tax_payer_result)), new h(this.c.invoke(paymentMethodListPresenter))), PresenterScopeKt.getPresenterScope(paymentMethodListPresenter));
    }

    @Override // defpackage.ut7
    public void c(bu7 bu7Var) {
        z65.h(bu7Var, "result");
        this.a.i(R.id.select_payment_method_result, bu7Var);
    }
}
