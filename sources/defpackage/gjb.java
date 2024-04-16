package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.product.card.variable.topping.ToppingViewHolder;
/* compiled from: ToppingBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B!\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lgjb;", "Loyb;", "Lru/dodopizza/app/presentation/product/card/variable/topping/ToppingViewHolder;", "Ljjb;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "onToppingChangedListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gjb  reason: default package */
/* loaded from: classes4.dex */
public final class gjb extends oyb<ToppingViewHolder, jjb> {
    public static final b b = new b(null);
    private final Function2<jjb, Boolean, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToppingBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gjb$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ jjb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(jjb jjbVar) {
            super(0);
            this.b = jjbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function2 function2 = gjb.this.a;
            jjb jjbVar = this.b;
            function2.invoke(jjbVar, Boolean.valueOf(!jjbVar.f()));
        }
    }

    /* compiled from: ToppingBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lgjb$b;", "", "", "ADDED_STATE_CHANGED", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gjb$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gjb(Function2<? super jjb, ? super Boolean, Unit> function2) {
        z65.h(function2, "onToppingChangedListener");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(ToppingViewHolder toppingViewHolder, jjb jjbVar, int i, List<? extends Object> list) {
        z65.h(toppingViewHolder, "view");
        z65.h(jjbVar, "data");
        z65.h(list, "changes");
        if (list.contains("added_state_changed")) {
            if (jjbVar.f()) {
                toppingViewHolder.setChecked();
            } else {
                toppingViewHolder.setUnChecked();
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(ToppingViewHolder toppingViewHolder, jjb jjbVar, int i) {
        String o;
        z65.h(toppingViewHolder, "view");
        z65.h(jjbVar, "data");
        toppingViewHolder.setImage(jjbVar.b());
        o = l0b.o(jjbVar.c());
        toppingViewHolder.setTitle(o);
        toppingViewHolder.setPrice(jjbVar.e());
        toppingViewHolder.setOnCardClickListener(new a(jjbVar));
        if (jjbVar.f() && jjbVar.a()) {
            toppingViewHolder.enableCard();
            toppingViewHolder.setChecked();
        } else if (!jjbVar.a()) {
            toppingViewHolder.setUnChecked();
            toppingViewHolder.disableCard();
        } else {
            toppingViewHolder.enableCard();
            toppingViewHolder.setUnChecked();
        }
    }
}
