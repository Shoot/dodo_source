package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.et7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.PaymentMethodVH;
/* compiled from: PaymentMethodBinder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB5\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lgt7;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/PaymentMethodVH;", "Let7$c$b;", "view", "data", "", "position", "", "i", "", "", "changes", Image.TYPE_HIGH, "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onClick", "Lkotlin/Function2;", "", "b", "Lkotlin/jvm/functions/Function2;", "onChecked", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gt7  reason: default package */
/* loaded from: classes4.dex */
public final class gt7 extends oyb<PaymentMethodVH, et7.c.b> {
    public static final a c = new a(null);
    private final Function1<et7.c.b, Unit> a;
    private final Function2<et7.c.b, Boolean, Unit> b;

    /* compiled from: PaymentMethodBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lgt7$a;", "", "", "CHECKBOX_ENABLED_CHANGED", "Ljava/lang/String;", "CHECKED_CHANGED", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gt7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt7$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<Boolean, Unit> {
        final /* synthetic */ et7.c.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(et7.c.b bVar) {
            super(1);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.a;
        }

        public final void invoke(boolean z) {
            gt7.this.b.invoke(this.b, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt7$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ et7.c.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(et7.c.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            gt7.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gt7(Function1<? super et7.c.b, Unit> function1, Function2<? super et7.c.b, ? super Boolean, Unit> function2) {
        z65.h(function1, "onClick");
        z65.h(function2, "onChecked");
        this.a = function1;
        this.b = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void a(PaymentMethodVH paymentMethodVH, et7.c.b bVar, int i, List<? extends Object> list) {
        z65.h(paymentMethodVH, "view");
        z65.h(bVar, "data");
        z65.h(list, "changes");
        if (list.contains("checked_changed")) {
            paymentMethodVH.setChecked(bVar.e());
        }
        if (list.contains("checkbox_enabled_changed")) {
            paymentMethodVH.setCheckboxEnabled(bVar.d());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: i */
    public void b(PaymentMethodVH paymentMethodVH, et7.c.b bVar, int i) {
        z65.h(paymentMethodVH, "view");
        z65.h(bVar, "data");
        paymentMethodVH.setPaymentWay(bVar.a(), bVar.c(), bVar.b());
        if (bVar.f()) {
            paymentMethodVH.showCheckbox();
            paymentMethodVH.setOnCheckedListener(new b(bVar));
            paymentMethodVH.setChecked(bVar.e());
        }
        paymentMethodVH.setOnClickListener(new c(bVar));
        paymentMethodVH.setCheckboxEnabled(bVar.d());
        paymentMethodVH.hideSavingCardOption();
    }
}
