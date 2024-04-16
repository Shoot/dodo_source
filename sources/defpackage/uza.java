package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: StringResources.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "id", "", "a", "(ILqn1;I)Ljava/lang/String;", "", "", "formatArgs", "b", "(I[Ljava/lang/Object;Lqn1;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: uza  reason: default package */
/* loaded from: classes.dex */
public final class uza {
    public static final String a(int i, qn1 qn1Var, int i2) {
        if (tn1.K()) {
            tn1.V(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = hk9.a(qn1Var, 0).getString(i);
        z65.g(string, "resources.getString(id)");
        if (tn1.K()) {
            tn1.U();
        }
        return string;
    }

    public static final String b(int i, Object[] objArr, qn1 qn1Var, int i2) {
        z65.h(objArr, "formatArgs");
        if (tn1.K()) {
            tn1.V(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = hk9.a(qn1Var, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
        z65.g(string, "resources.getString(id, *formatArgs)");
        if (tn1.K()) {
            tn1.U();
        }
        return string;
    }
}
