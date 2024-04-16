package defpackage;

import kotlin.Metadata;
/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Len5;", "Lum7;", "b", "La03;", "a", "La03;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: in5 */
/* loaded from: classes.dex */
public final class in5 {
    private static final a03 a = c03.b(1.0f, 0.0f, 2, null);

    public static final /* synthetic */ a03 a() {
        return a;
    }

    public static final um7 b(en5 en5Var) {
        z65.h(en5Var, "<this>");
        um7 g0 = en5Var.g0();
        if (g0 != null) {
            return g0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
