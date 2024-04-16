package kotlin.time;

import kotlin.Metadata;
/* compiled from: DurationUnitJvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u001a \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¨\u0006\u0007"}, d2 = {"", "value", "Ll93;", "sourceUnit", "targetUnit", "b", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes3.dex */
class c {
    public static final long a(long j, l93 l93Var, l93 l93Var2) {
        z65.h(l93Var, "sourceUnit");
        z65.h(l93Var2, "targetUnit");
        return l93Var2.i().convert(j, l93Var.i());
    }

    public static final long b(long j, l93 l93Var, l93 l93Var2) {
        z65.h(l93Var, "sourceUnit");
        z65.h(l93Var2, "targetUnit");
        return l93Var2.i().convert(j, l93Var.i());
    }
}
