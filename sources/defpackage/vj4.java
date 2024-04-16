package defpackage;

import com.dodopizza.order.feature.halves.constructor.presentation.adapter.HalfViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: HalfBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lvj4;", "Loyb;", "Lcom/dodopizza/order/feature/halves/constructor/presentation/adapter/HalfViewHolder;", "Lxj4;", "view", "data", "", "position", "", "g", "Lfka;", "a", "Lfka;", "side", "Lkotlin/Function1;", "Lwj4;", "b", "Lkotlin/jvm/functions/Function1;", "listener", "<init>", "(Lfka;Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vj4  reason: default package */
/* loaded from: classes2.dex */
public final class vj4 extends oyb<HalfViewHolder, xj4> {
    private final fka a;
    private final Function1<wj4, Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalfBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vj4$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ xj4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xj4 xj4Var) {
            super(0);
            this.b = xj4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            vj4.this.b.invoke(new wj4(this.b.b(), this.b.e(), this.b.d(), this.b.g(), this.b.h(), this.b.j()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vj4(fka fkaVar, Function1<? super wj4, Unit> function1) {
        z65.h(fkaVar, "side");
        z65.h(function1, "listener");
        this.a = fkaVar;
        this.b = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(HalfViewHolder halfViewHolder, xj4 xj4Var, int i) {
        z65.h(halfViewHolder, "view");
        z65.h(xj4Var, "data");
        halfViewHolder.setGravity(this.a);
        String c = xj4Var.c();
        if (c == null) {
            c = "";
        }
        halfViewHolder.setImage(c);
        halfViewHolder.setStopped(xj4Var.j());
        halfViewHolder.setListener(new a(xj4Var));
    }
}
