package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.m;
import kotlin.Metadata;
/* compiled from: ColorResources.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"", "id", "Luc1;", "a", "(ILqn1;I)J", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: fd1  reason: default package */
/* loaded from: classes.dex */
public final class fd1 {
    public static final long a(int i, qn1 qn1Var, int i2) {
        long b;
        if (tn1.K()) {
            tn1.V(-1777644873, i2, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        Context context = (Context) qn1Var.k(m.g());
        if (Build.VERSION.SDK_INT >= 23) {
            b = ed1.a.a(context, i);
        } else {
            b = yc1.b(context.getResources().getColor(i));
        }
        if (tn1.K()) {
            tn1.U();
        }
        return b;
    }
}
