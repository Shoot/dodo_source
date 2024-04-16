package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
/* compiled from: StartPaddingDividerItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$d0;", "", "b", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: rta  reason: default package */
/* loaded from: classes.dex */
public final class rta {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(RecyclerView.d0 d0Var) {
        ve0 ve0Var;
        if (d0Var instanceof ve0) {
            ve0Var = (ve0) d0Var;
        } else {
            ve0Var = null;
        }
        if (ve0Var != null) {
            return ve0Var.getHasBottomMargin();
        }
        return false;
    }
}
