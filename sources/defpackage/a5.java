package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.profile.adapter.activeorder.ActiveOrderViewHolder;
/* compiled from: ActiveOrderBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"La5;", "Loyb;", "Lru/dodopizza/app/presentation/profile/adapter/activeorder/ActiveOrderViewHolder;", "Lwl7;", "data", "view", "", Image.TYPE_HIGH, "i", "", "position", "g", "Lahb;", "a", "Lahb;", "timerFormatter", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "onOrderClicked", "<init>", "(Lahb;Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a5  reason: default package */
/* loaded from: classes4.dex */
public final class a5 extends oyb<ActiveOrderViewHolder, wl7> {
    private final ahb a;
    private final Function1<wl7, Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveOrderBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a5$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ wl7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wl7 wl7Var) {
            super(0);
            this.b = wl7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a5.this.b.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a5(ahb ahbVar, Function1<? super wl7, Unit> function1) {
        z65.h(ahbVar, "timerFormatter");
        z65.h(function1, "onOrderClicked");
        this.a = ahbVar;
        this.b = function1;
    }

    private final void h(wl7 wl7Var, ActiveOrderViewHolder activeOrderViewHolder) {
        if (wl7Var.b().f()) {
            activeOrderViewHolder.setTimer(wl7Var.c());
            i(activeOrderViewHolder, wl7Var);
        } else if (wl7Var.b().c()) {
            activeOrderViewHolder.setCheckMark();
        } else {
            activeOrderViewHolder.hideAdditionalInfo();
        }
    }

    private final void i(ActiveOrderViewHolder activeOrderViewHolder, wl7 wl7Var) {
        if (wl7Var.a().E() == jk7.e.i()) {
            activeOrderViewHolder.setSubTitle(R.string.sorry_for_late_on_delivery);
        } else {
            activeOrderViewHolder.setSubTitle(R.string.sorry_for_late_in_restaurant);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(ActiveOrderViewHolder activeOrderViewHolder, wl7 wl7Var, int i) {
        z65.h(activeOrderViewHolder, "view");
        z65.h(wl7Var, "data");
        bc7 a2 = wl7Var.a();
        activeOrderViewHolder.setTimerFormatter(this.a);
        activeOrderViewHolder.setOnClickListener(new a(wl7Var));
        activeOrderViewHolder.setOrderNumber(R.string.order_and_number, a2.e());
        activeOrderViewHolder.setTitle(wl7Var.b().e(), wl7Var.b().a());
        activeOrderViewHolder.setProgress(wl7Var.b().g(), wl7Var.b().b());
        h(wl7Var, activeOrderViewHolder);
    }
}
