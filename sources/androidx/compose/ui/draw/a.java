package androidx.compose.ui.draw;

import kotlin.Metadata;
/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u000e"}, d2 = {"Lsm6;", "Lsp7;", "painter", "", "sizeToIntrinsics", "Lgb;", "alignment", "Lau1;", "contentScale", "", "alpha", "Lwc1;", "colorFilter", "a", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class a {
    public static final sm6 a(sm6 sm6Var, sp7 sp7Var, boolean z, gb gbVar, au1 au1Var, float f, wc1 wc1Var) {
        z65.h(sm6Var, "<this>");
        z65.h(sp7Var, "painter");
        z65.h(gbVar, "alignment");
        z65.h(au1Var, "contentScale");
        return sm6Var.f(new PainterElement(sp7Var, z, gbVar, au1Var, f, wc1Var));
    }

    public static /* synthetic */ sm6 b(sm6 sm6Var, sp7 sp7Var, boolean z, gb gbVar, au1 au1Var, float f, wc1 wc1Var, int i, Object obj) {
        boolean z2;
        float f2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 4) != 0) {
            gbVar = gb.a.a();
        }
        gb gbVar2 = gbVar;
        if ((i & 8) != 0) {
            au1Var = au1.a.b();
        }
        au1 au1Var2 = au1Var;
        if ((i & 16) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 32) != 0) {
            wc1Var = null;
        }
        return a(sm6Var, sp7Var, z2, gbVar2, au1Var2, f2, wc1Var);
    }
}
