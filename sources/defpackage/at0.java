package defpackage;

import defpackage.et7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.CashMethodVH;
/* compiled from: CashMethodBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lat0;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/CashMethodVH;", "Let7$c$a;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: at0  reason: default package */
/* loaded from: classes4.dex */
public final class at0 extends oyb<CashMethodVH, et7.c.a> {
    private final Function1<et7.c.a, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CashMethodBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: at0$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ et7.c.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(et7.c.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            at0.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public at0(Function1<? super et7.c.a, Unit> function1) {
        z65.h(function1, "onClick");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(CashMethodVH cashMethodVH, et7.c.a aVar, int i) {
        z65.h(cashMethodVH, "view");
        z65.h(aVar, "data");
        cashMethodVH.setPaymentWay(aVar.a(), aVar.c(), aVar.b());
        cashMethodVH.setOnClickListener(new a(aVar));
    }
}
