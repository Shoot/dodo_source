package defpackage;

import com.dodopizza.order.feature.personaloffer.presentantion.adapter.failstate.PersonalOffersFailStateViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: PersonalOffersFailStateBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lu08;", "Loyb;", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/failstate/PersonalOffersFailStateViewHolder;", "Lt08;", "view", "data", "", "position", "", "f", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "onRetryClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u08  reason: default package */
/* loaded from: classes2.dex */
public final class u08 extends oyb<PersonalOffersFailStateViewHolder, t08> {
    private final Function0<Unit> a;

    public u08(Function0<Unit> function0) {
        z65.h(function0, "onRetryClicked");
        this.a = function0;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(PersonalOffersFailStateViewHolder personalOffersFailStateViewHolder, t08 t08Var, int i) {
        z65.h(personalOffersFailStateViewHolder, "view");
        z65.h(t08Var, "data");
        personalOffersFailStateViewHolder.setOnRetryClickListener(this.a);
    }
}
