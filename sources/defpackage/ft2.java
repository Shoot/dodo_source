package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.checkout.deferredtime.adapter.DeferredTimeIntervalViewHolder;
/* compiled from: DeferredTimeIntervalBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lft2;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/deferredtime/adapter/DeferredTimeIntervalViewHolder;", "Lms2;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "clickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ft2  reason: default package */
/* loaded from: classes4.dex */
public final class ft2 extends oyb<DeferredTimeIntervalViewHolder, ms2> {
    private final Function1<ms2, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeferredTimeIntervalBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft2$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ ms2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ms2 ms2Var) {
            super(0);
            this.b = ms2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ft2.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ft2(Function1<? super ms2, Unit> function1) {
        z65.h(function1, "clickListener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(DeferredTimeIntervalViewHolder deferredTimeIntervalViewHolder, ms2 ms2Var, int i) {
        z65.h(deferredTimeIntervalViewHolder, "view");
        z65.h(ms2Var, "data");
        deferredTimeIntervalViewHolder.setIntervalTitle(ms2Var.e());
        if (ms2Var.f()) {
            deferredTimeIntervalViewHolder.setDisabled();
        } else {
            deferredTimeIntervalViewHolder.setEnabled();
        }
        if (ms2Var.g()) {
            deferredTimeIntervalViewHolder.setSelected();
        } else {
            deferredTimeIntervalViewHolder.setUnselected();
        }
        ks2 c = ms2Var.c();
        if (c != null && c.a().length() > 0) {
            deferredTimeIntervalViewHolder.showIntervalComment();
            deferredTimeIntervalViewHolder.setIntervalComment(c.a());
        } else {
            deferredTimeIntervalViewHolder.hideIntervalComment();
        }
        deferredTimeIntervalViewHolder.setOnItemClickListener(new a(ms2Var));
    }
}
