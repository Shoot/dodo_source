package ru.dodopizza.app.presentation.checkout.taxpayerid;

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
import ru.dodopizza.app.presentation.checkout.paymentwaylist.j;
import ru.dodopizza.app.presentation.checkout.taxpayerid.a;
import ru.dodopizza.app.presentation.checkout.taxpayerid.b;
import ru.dodopizza.app.presentation.checkout.taxpayerid.d;
/* compiled from: TaxPayerIdPresenter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J0\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\fH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000eH\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lf8b;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "", "taxPayerId", "", "D", "Lkotlin/Function1;", "Lko3;", "", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "Lbua;", "t", "b", "Ljava/lang/String;", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lb8b;", DateTokenConverter.CONVERTER_KEY, "Lb8b;", "validator", "<init>", "(Ljava/lang/String;Lf63;Lb8b;)V", e.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TaxPayerIdPresenter extends MoxyFSMPresenter<f8b, d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> {
    public static final a e = new a(null);
    private final String b;
    private final f63 c;
    private final b8b d;

    /* compiled from: TaxPayerIdPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter$a;", "", "", "RESULT_TAX_PAYER_ID", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TaxPayerIdPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaxPayerIdPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>.a<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>, Unit> {
            final /* synthetic */ TaxPayerIdPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TaxPayerIdPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/checkout/taxpayerid/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0557a extends ej5 implements Function2<a.C0211a, a.C0560a, bua<? extends d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>> {
                final /* synthetic */ TaxPayerIdPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0557a(TaxPayerIdPresenter taxPayerIdPresenter) {
                    super(2);
                    this.a = taxPayerIdPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> invoke(a.C0211a c0211a, a.C0560a c0560a) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(c0560a, "<anonymous parameter 1>");
                    ((f8b) this.a.getViewState()).H9(this.a.b);
                    TaxPayerIdPresenter taxPayerIdPresenter = this.a;
                    ((f8b) this.a.getViewState()).Q0(taxPayerIdPresenter.D(taxPayerIdPresenter.b));
                    return new bua<>(d.b.a, new a.b(this.a.b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TaxPayerIdPresenter taxPayerIdPresenter) {
                super(1);
                this.a = taxPayerIdPresenter;
            }

            public final void a(ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>.a<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> aVar) {
                z65.h(aVar, "$this$state");
                C0557a c0557a = new C0557a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.C0560a.class, (Function2) unb.e(c0557a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>.a<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaxPayerIdPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0558b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>.a<ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>, Unit> {
            final /* synthetic */ TaxPayerIdPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TaxPayerIdPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "a", "(Lru/dodopizza/app/presentation/checkout/taxpayerid/b$a;Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<b.a, a.b, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>> {
                final /* synthetic */ TaxPayerIdPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(TaxPayerIdPresenter taxPayerIdPresenter) {
                    super(2);
                    this.a = taxPayerIdPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> invoke(b.a aVar, a.b bVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((f8b) this.a.getViewState()).a();
                    this.a.c.i(R.id.tax_payer_result, j.b.a);
                    return new bua<>(d.a.a, a.C0560a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TaxPayerIdPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$d;", "event", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "a", "(Lru/dodopizza/app/presentation/checkout/taxpayerid/b$d;Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0559b extends ej5 implements Function2<b.d, a.b, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>> {
                final /* synthetic */ TaxPayerIdPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0559b(TaxPayerIdPresenter taxPayerIdPresenter) {
                    super(2);
                    this.a = taxPayerIdPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> invoke(b.d dVar, a.b bVar) {
                    z65.h(dVar, "event");
                    z65.h(bVar, "data");
                    ((f8b) this.a.getViewState()).Q0(this.a.D(dVar.a()));
                    return new bua<>(d.b.a, bVar.a(dVar.a()));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TaxPayerIdPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$b;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "a", "(Lru/dodopizza/app/presentation/checkout/taxpayerid/b$b;Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter$b$b$c */
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<b.C0561b, a.b, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>> {
                final /* synthetic */ TaxPayerIdPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(TaxPayerIdPresenter taxPayerIdPresenter) {
                    super(2);
                    this.a = taxPayerIdPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> invoke(b.C0561b c0561b, a.b bVar) {
                    z65.h(c0561b, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    ((f8b) this.a.getViewState()).Q0(false);
                    a.b a = bVar.a("");
                    ((f8b) this.a.getViewState()).H9(a.b());
                    return new bua<>(d.b.a, a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TaxPayerIdPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/a;", "a", "(Lru/dodopizza/app/presentation/checkout/taxpayerid/b$c;Lru/dodopizza/app/presentation/checkout/taxpayerid/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter$b$b$d */
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<b.c, a.b, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>> {
                final /* synthetic */ TaxPayerIdPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(TaxPayerIdPresenter taxPayerIdPresenter) {
                    super(2);
                    this.a = taxPayerIdPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> invoke(b.c cVar, a.b bVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    ((f8b) this.a.getViewState()).a();
                    this.a.c.i(R.id.tax_payer_result, new j.a(bVar.b()));
                    return new bua<>(d.a.a, a.C0560a.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0558b(TaxPayerIdPresenter taxPayerIdPresenter) {
                super(1);
                this.a = taxPayerIdPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>.a<ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>> map = aVar.b().get(b.a.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(aVar2, 2));
                C0559b c0559b = new C0559b(this.a);
                if (!aVar.b().containsKey(b.d.class)) {
                    aVar.b().put(b.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>> map2 = aVar.b().get(b.d.class);
                z65.e(map2);
                map2.put(a.b.class, (Function2) unb.e(c0559b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.C0561b.class)) {
                    aVar.b().put(b.C0561b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>> map3 = aVar.b().get(b.C0561b.class);
                z65.e(map3);
                map3.put(a.b.class, (Function2) unb.e(cVar, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>> map4 = aVar.b().get(b.c.class);
                z65.e(map4);
                map4.put(a.b.class, (Function2) unb.e(dVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>.a<ru.dodopizza.app.presentation.checkout.taxpayerid.d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        b() {
            super(1);
        }

        public final void a(ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(TaxPayerIdPresenter.this);
            Map<Class<? extends d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>>>> c = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c.put(d.c.class, aVar2.a());
            C0558b c0558b = new C0558b(TaxPayerIdPresenter.this);
            Map<Class<? extends d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.taxpayerid.a, bua<? extends d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>>>>> c2 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            c0558b.invoke(aVar3);
            c2.put(d.b.class, aVar3.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    public TaxPayerIdPresenter(String str, f63 f63Var, b8b b8bVar) {
        z65.h(str, "taxPayerId");
        z65.h(f63Var, "router");
        z65.h(b8bVar, "validator");
        this.b = str;
        this.c = f63Var;
        this.d = b8bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(String str) {
        if (str.length() == 0 || this.d.a(str)) {
            return true;
        }
        return false;
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a> t() {
        return new bua<>(d.c.a, a.C0560a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<d, ru.dodopizza.app.presentation.checkout.taxpayerid.a>, Unit> v() {
        return new b();
    }
}
