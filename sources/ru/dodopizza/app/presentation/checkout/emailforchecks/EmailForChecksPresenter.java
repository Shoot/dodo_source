package ru.dodopizza.app.presentation.checkout.emailforchecks;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.huawei.hms.push.e;
import defpackage.ko3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.emailforchecks.a;
import ru.dodopizza.app.presentation.checkout.emailforchecks.b;
import ru.dodopizza.app.presentation.checkout.emailforchecks.d;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.a;
/* compiled from: EmailForChecksPresenter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J0\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\fH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000eH\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lkf3;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "", "email", "", "E", "Lkotlin/Function1;", "Lko3;", "", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "Lbua;", "t", "b", "Ljava/lang/String;", com.huawei.hms.opendevice.c.a, "Z", "isSubscribedToNews", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "<init>", "(Ljava/lang/String;ZLf63;)V", e.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmailForChecksPresenter extends MoxyFSMPresenter<kf3, d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> {
    public static final a e = new a(null);
    private final String b;
    private final boolean c;
    private final f63 d;

    /* compiled from: EmailForChecksPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter$a;", "", "", "RESULT_EMAIL_FOR_CHECKS", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EmailForChecksPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EmailForChecksPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>.a<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>, Unit> {
            final /* synthetic */ EmailForChecksPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EmailForChecksPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/checkout/emailforchecks/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0532a extends ej5 implements Function2<a.C0211a, a.b, bua<? extends d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>> {
                final /* synthetic */ EmailForChecksPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0532a(EmailForChecksPresenter emailForChecksPresenter) {
                    super(2);
                    this.a = emailForChecksPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> invoke(a.C0211a c0211a, a.b bVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((kf3) this.a.getViewState()).Sg(this.a.b);
                    ((kf3) this.a.getViewState()).sc(this.a.c);
                    EmailForChecksPresenter emailForChecksPresenter = this.a;
                    ((kf3) this.a.getViewState()).Q0(emailForChecksPresenter.E(emailForChecksPresenter.b));
                    return new bua<>(d.b.a, new a.C0535a(this.a.b, this.a.c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(EmailForChecksPresenter emailForChecksPresenter) {
                super(1);
                this.a = emailForChecksPresenter;
            }

            public final void a(ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>.a<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> aVar) {
                z65.h(aVar, "$this$state");
                C0532a c0532a = new C0532a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(c0532a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>.a<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EmailForChecksPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0533b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>.a<ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>, Unit> {
            final /* synthetic */ EmailForChecksPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EmailForChecksPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/b$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "a", "(Lru/dodopizza/app/presentation/checkout/emailforchecks/b$a;Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<b.a, a.C0535a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>> {
                final /* synthetic */ EmailForChecksPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(EmailForChecksPresenter emailForChecksPresenter) {
                    super(2);
                    this.a = emailForChecksPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> invoke(b.a aVar, a.C0535a c0535a) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(c0535a, "<anonymous parameter 1>");
                    ((kf3) this.a.getViewState()).a();
                    this.a.d.i(R.id.email_for_checks_result, a.b.a);
                    return new bua<>(d.a.a, a.b.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EmailForChecksPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/b$c;", "event", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "a", "(Lru/dodopizza/app/presentation/checkout/emailforchecks/b$c;Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0534b extends ej5 implements Function2<b.c, a.C0535a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>> {
                final /* synthetic */ EmailForChecksPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0534b(EmailForChecksPresenter emailForChecksPresenter) {
                    super(2);
                    this.a = emailForChecksPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> invoke(b.c cVar, a.C0535a c0535a) {
                    z65.h(cVar, "event");
                    z65.h(c0535a, "data");
                    ((kf3) this.a.getViewState()).Q0(this.a.E(cVar.a()));
                    return new bua<>(d.b.a, a.C0535a.b(c0535a, cVar.a(), false, 2, null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EmailForChecksPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/b$e;", "event", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "a", "(Lru/dodopizza/app/presentation/checkout/emailforchecks/b$e;Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$b$c */
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<b.e, a.C0535a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>> {
                public static final c a = new c();

                c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> invoke(b.e eVar, a.C0535a c0535a) {
                    z65.h(eVar, "event");
                    z65.h(c0535a, "data");
                    return new bua<>(d.b.a, a.C0535a.b(c0535a, null, eVar.a(), 1, null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EmailForChecksPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/b$b;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "a", "(Lru/dodopizza/app/presentation/checkout/emailforchecks/b$b;Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$b$d */
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<b.C0536b, a.C0535a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>> {
                final /* synthetic */ EmailForChecksPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(EmailForChecksPresenter emailForChecksPresenter) {
                    super(2);
                    this.a = emailForChecksPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> invoke(b.C0536b c0536b, a.C0535a c0535a) {
                    z65.h(c0536b, "<anonymous parameter 0>");
                    z65.h(c0535a, "data");
                    ((kf3) this.a.getViewState()).Q0(false);
                    a.C0535a b = a.C0535a.b(c0535a, "", false, 2, null);
                    ((kf3) this.a.getViewState()).Sg(b.c());
                    return new bua<>(d.b.a, b);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EmailForChecksPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/b$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/d;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "a", "(Lru/dodopizza/app/presentation/checkout/emailforchecks/b$d;Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter$b$b$e */
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<b.d, a.C0535a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>> {
                final /* synthetic */ EmailForChecksPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(EmailForChecksPresenter emailForChecksPresenter) {
                    super(2);
                    this.a = emailForChecksPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> invoke(b.d dVar, a.C0535a c0535a) {
                    z65.h(dVar, "<anonymous parameter 0>");
                    z65.h(c0535a, "data");
                    ((kf3) this.a.getViewState()).a();
                    this.a.d.i(R.id.email_for_checks_result, new a.C0548a(c0535a.c(), c0535a.d()));
                    return new bua<>(d.a.a, a.b.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0533b(EmailForChecksPresenter emailForChecksPresenter) {
                super(1);
                this.a = emailForChecksPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>.a<ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>> map = aVar.b().get(b.a.class);
                z65.e(map);
                map.put(a.C0535a.class, (Function2) unb.e(aVar2, 2));
                C0534b c0534b = new C0534b(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>> map2 = aVar.b().get(b.c.class);
                z65.e(map2);
                map2.put(a.C0535a.class, (Function2) unb.e(c0534b, 2));
                c cVar = c.a;
                if (!aVar.b().containsKey(b.e.class)) {
                    aVar.b().put(b.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>> map3 = aVar.b().get(b.e.class);
                z65.e(map3);
                map3.put(a.C0535a.class, (Function2) unb.e(cVar, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.C0536b.class)) {
                    aVar.b().put(b.C0536b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>> map4 = aVar.b().get(b.C0536b.class);
                z65.e(map4);
                map4.put(a.C0535a.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.d.class)) {
                    aVar.b().put(b.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>> map5 = aVar.b().get(b.d.class);
                z65.e(map5);
                map5.put(a.C0535a.class, (Function2) unb.e(eVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>.a<ru.dodopizza.app.presentation.checkout.emailforchecks.d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        b() {
            super(1);
        }

        public final void a(ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(EmailForChecksPresenter.this);
            Map<Class<? extends d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>>>> c = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c.put(d.c.class, aVar2.a());
            C0533b c0533b = new C0533b(EmailForChecksPresenter.this);
            Map<Class<? extends d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.emailforchecks.a, bua<? extends d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>>>>> c2 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            c0533b.invoke(aVar3);
            c2.put(d.b.class, aVar3.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    public EmailForChecksPresenter(String str, boolean z, f63 f63Var) {
        z65.h(str, "email");
        z65.h(f63Var, "router");
        this.b = str;
        this.c = z;
        this.d = f63Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(String str) {
        return hbb.c(str);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a> t() {
        return new bua<>(d.c.a, a.b.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<d, ru.dodopizza.app.presentation.checkout.emailforchecks.a>, Unit> v() {
        return new b();
    }
}
