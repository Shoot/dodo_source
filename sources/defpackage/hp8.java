package defpackage;

import com.dodopizza.controlling.feature.ratingapplied.presentation.PromoActionViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PromoActionBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lhp8;", "Loyb;", "Lcom/dodopizza/controlling/feature/ratingapplied/presentation/PromoActionViewHolder;", "Lmp8;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "listener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hp8  reason: default package */
/* loaded from: classes.dex */
public final class hp8 extends oyb<PromoActionViewHolder, mp8> {
    private final Function1<mp8, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoActionBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hp8$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ mp8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(mp8 mp8Var) {
            super(0);
            this.b = mp8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            hp8.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hp8(Function1<? super mp8, Unit> function1) {
        z65.h(function1, "listener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(PromoActionViewHolder promoActionViewHolder, mp8 mp8Var, int i) {
        String F;
        String F2;
        z65.h(promoActionViewHolder, "view");
        z65.h(mp8Var, "data");
        promoActionViewHolder.showImage(mp8Var.a());
        promoActionViewHolder.setTitle(mp8Var.c());
        promoActionViewHolder.setOnClickListener(new a(mp8Var));
        if (mp8Var.b() == null) {
            F = l0b.F(mp8Var.d(), "http://", "", false, 4, null);
            F2 = l0b.F(F, "https://", "", false, 4, null);
            promoActionViewHolder.setUrl(F2);
            return;
        }
        promoActionViewHolder.setUrl(mp8Var.b().intValue());
    }
}
