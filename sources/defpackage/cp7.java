package defpackage;

import com.dodopizza.order.feature.checkout.presentation.PackagingTypeHolder;
import defpackage.ok9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PackagingTypeBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcp7;", "Loyb;", "Lcom/dodopizza/order/feature/checkout/presentation/PackagingTypeHolder;", "Lok9;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cp7  reason: default package */
/* loaded from: classes2.dex */
public final class cp7 extends oyb<PackagingTypeHolder, ok9> {
    private final Function1<ok9, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PackagingTypeBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cp7$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ ok9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ok9 ok9Var) {
            super(0);
            this.b = ok9Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            cp7.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cp7(Function1<? super ok9, Unit> function1) {
        z65.h(function1, "onClick");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(PackagingTypeHolder packagingTypeHolder, ok9 ok9Var, int i) {
        int i2;
        z65.h(packagingTypeHolder, "view");
        z65.h(ok9Var, "data");
        packagingTypeHolder.setClickListener(new a(ok9Var));
        if (ok9Var instanceof ok9.b) {
            i2 = r09.order_receiving_type_alert_dine_in;
        } else if (ok9Var instanceof ok9.c) {
            i2 = r09.order_receiving_type_takeaway;
        } else if (ok9Var instanceof ok9.a) {
            i2 = r09.order_receiving_type_table_delivery;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        packagingTypeHolder.setText(i2);
    }
}
