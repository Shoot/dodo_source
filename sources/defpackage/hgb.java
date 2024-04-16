package defpackage;

import defpackage.sx6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.presentation.checkout.details.deferredtime.adapter.DeferredTimeViewHolder;
/* compiled from: TimeBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R2\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lhgb;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/details/deferredtime/adapter/DeferredTimeViewHolder;", "Lsx6$a$d;", "view", "data", "", "position", "", "g", "Lkotlin/Function4;", "", "", "", "a", "La94;", "onClick", "<init>", "(La94;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hgb  reason: default package */
/* loaded from: classes4.dex */
public final class hgb extends oyb<DeferredTimeViewHolder, sx6.a.d> {
    private final a94<Long, String, Boolean, Integer, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TimeBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hgb$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ sx6.a.d b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sx6.a.d dVar, int i) {
            super(0);
            this.b = dVar;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a94 a94Var = hgb.this.a;
            Long e = this.b.e();
            a94Var.q(Long.valueOf(e != null ? e.longValue() : 0L), this.b.f(), Boolean.valueOf(this.b.i()), Integer.valueOf(this.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hgb(a94<? super Long, ? super String, ? super Boolean, ? super Integer, Unit> a94Var) {
        z65.h(a94Var, "onClick");
        this.a = a94Var;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(DeferredTimeViewHolder deferredTimeViewHolder, sx6.a.d dVar, int i) {
        z65.h(deferredTimeViewHolder, "view");
        z65.h(dVar, "data");
        deferredTimeViewHolder.setTime(dVar.f());
        deferredTimeViewHolder.setOnClickListener(new a(dVar, i));
        deferredTimeViewHolder.setSelected(dVar.g());
        deferredTimeViewHolder.setProgress(dVar.b());
    }
}
