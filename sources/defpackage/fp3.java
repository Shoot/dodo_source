package defpackage;

import defpackage.sx6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.presentation.checkout.details.deferredtime.adapter.DeferredTimeViewHolder;
/* compiled from: FasterTimeBinder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lfp3;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/details/deferredtime/adapter/DeferredTimeViewHolder;", "Lsx6$a$c;", "view", "data", "", "position", "", "g", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fp3  reason: default package */
/* loaded from: classes4.dex */
public final class fp3 extends oyb<DeferredTimeViewHolder, sx6.a.c> {
    private final Function2<String, Integer, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FasterTimeBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fp3$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ sx6.a.c b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sx6.a.c cVar, int i) {
            super(0);
            this.b = cVar;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fp3.this.a.invoke(this.b.e(), Integer.valueOf(this.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fp3(Function2<? super String, ? super Integer, Unit> function2) {
        z65.h(function2, "onClick");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(DeferredTimeViewHolder deferredTimeViewHolder, sx6.a.c cVar, int i) {
        z65.h(deferredTimeViewHolder, "view");
        z65.h(cVar, "data");
        deferredTimeViewHolder.setTime(cVar.e());
        deferredTimeViewHolder.setOnClickListener(new a(cVar, i));
        deferredTimeViewHolder.setSelected(cVar.g());
        deferredTimeViewHolder.setProgress(cVar.b());
    }
}
