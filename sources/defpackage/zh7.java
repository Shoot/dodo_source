package defpackage;

import com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingTagViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: OrderRatingTagBinder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lzh7;", "Loyb;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingTagViewHolder;", "Lr69;", "view", "data", "", "position", "", "g", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "checkedListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zh7  reason: default package */
/* loaded from: classes.dex */
public final class zh7 extends oyb<OrderRatingTagViewHolder, r69> {
    private final Function2<r69, Boolean, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingTagBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zh7$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Boolean, Unit> {
        final /* synthetic */ r69 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r69 r69Var) {
            super(1);
            this.b = r69Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.a;
        }

        public final void invoke(boolean z) {
            zh7.this.a.invoke(this.b, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zh7(Function2<? super r69, ? super Boolean, Unit> function2) {
        z65.h(function2, "checkedListener");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(OrderRatingTagViewHolder orderRatingTagViewHolder, r69 r69Var, int i) {
        z65.h(orderRatingTagViewHolder, "view");
        z65.h(r69Var, "data");
        orderRatingTagViewHolder.setTitle(r69Var.b());
        orderRatingTagViewHolder.setChecked(r69Var.c());
        orderRatingTagViewHolder.setCheckedListener(new a(r69Var));
    }
}
