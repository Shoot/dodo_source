package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsm6;", "Lkotlin/Function1;", "Lt45;", "", "inspectorInfo", "factory", "a", "(Lsm6;Lkotlin/jvm/functions/Function1;Ly84;)Lsm6;", "Lqn1;", "modifier", "b", "(Lqn1;Lsm6;)Lsm6;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: pn1  reason: default package */
/* loaded from: classes.dex */
public final class pn1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsm6$b;", "it", "", "a", "(Lsm6$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pn1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<sm6.b, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(sm6.b bVar) {
            z65.h(bVar, "it");
            return Boolean.valueOf(!(bVar instanceof on1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsm6;", "acc", "Lsm6$b;", "element", "a", "(Lsm6;Lsm6$b;)Lsm6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pn1$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<sm6, sm6.b, sm6> {
        final /* synthetic */ qn1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qn1 qn1Var) {
            super(2);
            this.a = qn1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final sm6 invoke(sm6 sm6Var, sm6.b bVar) {
            z65.h(sm6Var, "acc");
            z65.h(bVar, "element");
            boolean z = bVar instanceof on1;
            sm6.b bVar2 = bVar;
            if (z) {
                y84<sm6, qn1, Integer, sm6> o = ((on1) bVar).o();
                z65.f(o, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                bVar2 = pn1.b(this.a, (sm6) ((y84) unb.e(o, 3)).invoke(sm6.a, this.a, 0));
            }
            return sm6Var.f(bVar2);
        }
    }

    public static final sm6 a(sm6 sm6Var, Function1<? super t45, Unit> function1, y84<? super sm6, ? super qn1, ? super Integer, ? extends sm6> y84Var) {
        z65.h(sm6Var, "<this>");
        z65.h(function1, "inspectorInfo");
        z65.h(y84Var, "factory");
        return sm6Var.f(new on1(function1, y84Var));
    }

    public static final sm6 b(qn1 qn1Var, sm6 sm6Var) {
        z65.h(qn1Var, "<this>");
        z65.h(sm6Var, "modifier");
        if (sm6Var.i(a.a)) {
            return sm6Var;
        }
        qn1Var.w(1219399079);
        sm6 sm6Var2 = (sm6) sm6Var.h(sm6.a, new b(qn1Var));
        qn1Var.J();
        return sm6Var2;
    }
}
