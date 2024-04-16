package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.presentation.selectpizzeria.combined.filters.views.PizzeriaFilterViewHolder;
/* compiled from: PizzeriaFilterBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lj88;", "Loyb;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/filters/views/PizzeriaFilterViewHolder;", "Lr88;", "view", "data", "", "position", "", "g", "", "", "changes", "f", "Lkotlin/Function2;", "a", "Lkotlin/jvm/functions/Function2;", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function2;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: j88  reason: default package */
/* loaded from: classes4.dex */
public final class j88 extends oyb<PizzeriaFilterViewHolder, r88> {
    private final Function2<r88, Integer, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaFilterBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j88$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ r88 b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r88 r88Var, int i) {
            super(0);
            this.b = r88Var;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            j88.this.h().invoke(this.b, Integer.valueOf(this.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j88(Function2<? super r88, ? super Integer, Unit> function2) {
        z65.h(function2, "onClick");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(PizzeriaFilterViewHolder pizzeriaFilterViewHolder, r88 r88Var, int i, List<? extends Object> list) {
        z65.h(pizzeriaFilterViewHolder, "view");
        z65.h(r88Var, "data");
        z65.h(list, "changes");
        super.a(pizzeriaFilterViewHolder, r88Var, i, list);
        b(pizzeriaFilterViewHolder, r88Var, i);
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(PizzeriaFilterViewHolder pizzeriaFilterViewHolder, r88 r88Var, int i) {
        z65.h(pizzeriaFilterViewHolder, "view");
        z65.h(r88Var, "data");
        pizzeriaFilterViewHolder.setFilterName(r88Var.a().k());
        if (r88Var.b()) {
            pizzeriaFilterViewHolder.setCheckedState();
        } else {
            pizzeriaFilterViewHolder.setUncheckedState();
        }
        pizzeriaFilterViewHolder.setOnClickListener(new a(r88Var, i));
    }

    public final Function2<r88, Integer, Unit> h() {
        return this.a;
    }
}
