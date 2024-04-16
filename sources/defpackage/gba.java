package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lb94;", "", "T", "Lq2;", "parentValue", "childValue", "a", "(Lq2;Lq2;)Lq2;"}, k = 3, mv = {1, 8, 0})
/* renamed from: gba  reason: default package */
/* loaded from: classes.dex */
public final class gba extends ej5 implements Function2<q2<b94<? extends Boolean>>, q2<b94<? extends Boolean>>, q2<b94<? extends Boolean>>> {
    public static final gba a = new gba();

    public gba() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a */
    public final q2<b94<? extends Boolean>> invoke(q2<b94<? extends Boolean>> q2Var, q2<b94<? extends Boolean>> q2Var2) {
        String b;
        b94<? extends Boolean> a2;
        z65.h(q2Var2, "childValue");
        if (q2Var == null || (b = q2Var.b()) == null) {
            b = q2Var2.b();
        }
        if (q2Var == null || (a2 = q2Var.a()) == null) {
            a2 = q2Var2.a();
        }
        return new q2<>(b, a2);
    }
}
