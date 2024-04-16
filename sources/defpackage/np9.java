package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import kotlin.Metadata;
/* compiled from: Row.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¨\u0006\n"}, d2 = {"Lnp9;", "Lmp9;", "Lsm6;", "", "weight", "", "fill", "a", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: np9  reason: default package */
/* loaded from: classes.dex */
public final class np9 implements mp9 {
    public static final np9 a = new np9();

    private np9() {
    }

    @Override // defpackage.mp9
    public sm6 a(sm6 sm6Var, float f, boolean z) {
        z65.h(sm6Var, "<this>");
        if (f > 0.0d) {
            return sm6Var.f(new LayoutWeightElement(f, z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }
}
