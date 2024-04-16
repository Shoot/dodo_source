package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.presentation.product.card.combo.ComboSlotViewHolder;
/* compiled from: ComboSlotBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B)\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ldi1;", "Lru/dodopizza/app/presentation/product/card/combo/ComboSlotViewHolder;", "T", "Loyb;", "Lfi1;", "view", "data", "", "position", "", "g", "(Lru/dodopizza/app/presentation/product/card/combo/ComboSlotViewHolder;Lfi1;I)V", "", "a", "Z", "isComboStopped", "Lkotlin/Function2;", "", "b", "Lkotlin/jvm/functions/Function2;", "entityClickListener", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: di1  reason: default package */
/* loaded from: classes4.dex */
public final class di1<T extends ComboSlotViewHolder> extends oyb<T, fi1> {
    private final boolean a;
    private final Function2<Integer, String, Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboSlotBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lru/dodopizza/app/presentation/product/card/combo/ComboSlotViewHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: di1$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ di1<T> a;
        final /* synthetic */ int b;
        final /* synthetic */ fi1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(di1<T> di1Var, int i, fi1 fi1Var) {
            super(0);
            this.a = di1Var;
            this.b = i;
            this.c = fi1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((di1) this.a).b.invoke(Integer.valueOf(this.b), this.c.g().getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboSlotBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lru/dodopizza/app/presentation/product/card/combo/ComboSlotViewHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: di1$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ di1<T> a;
        final /* synthetic */ int b;
        final /* synthetic */ fi1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(di1<T> di1Var, int i, fi1 fi1Var) {
            super(0);
            this.a = di1Var;
            this.b = i;
            this.c = fi1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((di1) this.a).b.invoke(Integer.valueOf(this.b), this.c.g().getId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public di1(boolean z, Function2<? super Integer, ? super String, Unit> function2) {
        z65.h(function2, "entityClickListener");
        this.a = z;
        this.b = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(T t, fi1 fi1Var, int i) {
        z65.h(t, "view");
        z65.h(fi1Var, "data");
        t.setSlotImage(fi1Var.g());
        t.setSlotDescription(fi1Var);
        t.setSlotExtraPrice(fi1Var);
        t.setSizeBadge(fi1Var);
        if (!this.a) {
            t.setSlotCardClickListener(new a(this, i, fi1Var));
            t.showSlotChangeProduct();
            t.setSlotChangeButtonClickListener(new b(this, i, fi1Var));
            t.isOnboardingNeedShow(true);
            if (!fi1Var.i()) {
                t.hideSlotChangeProduct();
            }
        } else {
            t.hideSlotChangeProduct();
        }
        t.setStopTextVisible(fi1Var.e());
    }
}
