package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixVH;
/* compiled from: PhonePrefixBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lk48;", "Loyb;", "Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixVH;", "La58;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "listener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: k48  reason: default package */
/* loaded from: classes4.dex */
public final class k48 extends oyb<PhonePrefixVH, a58> {
    private final Function1<a58, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhonePrefixBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k48$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ a58 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a58 a58Var) {
            super(0);
            this.b = a58Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k48.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k48(Function1<? super a58, Unit> function1) {
        z65.h(function1, "listener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(PhonePrefixVH phonePrefixVH, a58 a58Var, int i) {
        z65.h(phonePrefixVH, "view");
        z65.h(a58Var, "data");
        phonePrefixVH.setCountryName(a58Var.d());
        phonePrefixVH.setPrefix(a58Var.e());
        phonePrefixVH.setCheckMarkVisibility(a58Var.g());
        phonePrefixVH.setFlag(a58Var.c());
        phonePrefixVH.setOnClickListener(new a(a58Var));
        phonePrefixVH.setHasBottomMargin(a58Var.f());
    }
}
