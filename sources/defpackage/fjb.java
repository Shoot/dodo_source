package defpackage;

import com.dodopizza.order.feature.product.card.presentation.pizza.topping.ToppingViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ToppingBinder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0018*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0013B!\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lfjb;", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/topping/ToppingViewHolder;", "T", "Loyb;", "Lkjb;", "view", "data", "", "position", "", Image.TYPE_HIGH, "(Lcom/dodopizza/order/feature/product/card/presentation/pizza/topping/ToppingViewHolder;Lkjb;I)V", "", "", "changes", "g", "(Lcom/dodopizza/order/feature/product/card/presentation/pizza/topping/ToppingViewHolder;Lkjb;ILjava/util/List;)V", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "onToppingChangedListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fjb  reason: default package */
/* loaded from: classes2.dex */
public final class fjb<T extends ToppingViewHolder> extends oyb<T, kjb> {
    public static final a b = new a(null);
    private final Function2<kjb, Boolean, Unit> a;

    /* compiled from: ToppingBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lfjb$a;", "", "", "ADDED_STATE_CHANGED", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fjb$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToppingBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/topping/ToppingViewHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fjb$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ fjb<T> a;
        final /* synthetic */ kjb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fjb<T> fjbVar, kjb kjbVar) {
            super(0);
            this.a = fjbVar;
            this.b = kjbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function2 function2 = ((fjb) this.a).a;
            kjb kjbVar = this.b;
            function2.invoke(kjbVar, Boolean.valueOf(!kjbVar.f()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fjb(Function2<? super kjb, ? super Boolean, Unit> function2) {
        z65.h(function2, "onToppingChangedListener");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(T t, kjb kjbVar, int i, List<? extends Object> list) {
        z65.h(t, "view");
        z65.h(kjbVar, "data");
        z65.h(list, "changes");
        if (list.contains("added_state_changed")) {
            if (kjbVar.f()) {
                t.setChecked();
            } else {
                t.setUnChecked();
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(T t, kjb kjbVar, int i) {
        String o;
        z65.h(t, "view");
        z65.h(kjbVar, "data");
        t.setImage(kjbVar.b());
        o = l0b.o(kjbVar.c());
        t.setTitle(o);
        t.setPrice(kjbVar.e());
        t.setOnCardClickListener(new b(this, kjbVar));
        if (kjbVar.f() && kjbVar.a()) {
            t.enableCard();
            t.setChecked();
        } else if (!kjbVar.a()) {
            t.setUnChecked();
            t.disableCard();
        } else {
            t.enableCard();
            t.setUnChecked();
        }
    }
}
