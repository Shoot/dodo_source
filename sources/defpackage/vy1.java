package defpackage;

import com.dodopizza.onboarding.feature.selectcountry.presentation.CountryVH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: CountrySelectorBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lvy1;", "Loyb;", "Lcom/dodopizza/onboarding/feature/selectcountry/presentation/CountryVH;", "Lzy1;", "view", "data", "", "position", "", "f", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vy1  reason: default package */
/* loaded from: classes2.dex */
public final class vy1 extends oyb<CountryVH, zy1> {
    private final Function1<zy1, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CountrySelectorBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vy1$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ zy1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(zy1 zy1Var) {
            super(0);
            this.b = zy1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            vy1.this.g().invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vy1(Function1<? super zy1, Unit> function1) {
        z65.h(function1, "onClick");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(CountryVH countryVH, zy1 zy1Var, int i) {
        z65.h(countryVH, "view");
        z65.h(zy1Var, "data");
        countryVH.setOnClickListener(new a(zy1Var));
        countryVH.setName(zy1Var.c());
        countryVH.setFlag(zy1Var.b());
    }

    public final Function1<zy1, Unit> g() {
        return this.a;
    }
}
