package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\r\u0010\u000eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lon1;", "Lsm6$b;", "Lu45;", "Lkotlin/Function1;", "Lsm6;", DateTokenConverter.CONVERTER_KEY, "Ly84;", "o", "()Ly84;", "factory", "Lt45;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Ly84;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: on1  reason: default package */
/* loaded from: classes.dex */
class on1 extends u45 implements sm6.b {
    private final y84<sm6, qn1, Integer, sm6> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public on1(Function1<? super t45, Unit> function1, y84<? super sm6, ? super qn1, ? super Integer, ? extends sm6> y84Var) {
        super(function1);
        z65.h(function1, "inspectorInfo");
        z65.h(y84Var, "factory");
        this.d = y84Var;
    }

    @Override // defpackage.sm6
    public /* synthetic */ sm6 f(sm6 sm6Var) {
        return rm6.a(this, sm6Var);
    }

    @Override // defpackage.sm6
    public /* synthetic */ Object h(Object obj, Function2 function2) {
        return tm6.b(this, obj, function2);
    }

    @Override // defpackage.sm6
    public /* synthetic */ boolean i(Function1 function1) {
        return tm6.a(this, function1);
    }

    public final y84<sm6, qn1, Integer, sm6> o() {
        return this.d;
    }
}
