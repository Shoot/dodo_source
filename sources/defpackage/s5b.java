package defpackage;

import android.widget.HorizontalScrollView;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
/* compiled from: TabLayoutRecyclerViewMediator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0005"}, d2 = {"Landroid/widget/HorizontalScrollView;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", "b", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: s5b  reason: default package */
/* loaded from: classes4.dex */
public final class s5b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HorizontalScrollView horizontalScrollView, TabLayout.g gVar) {
        int i;
        TabLayout.i iVar;
        if (gVar != null && (iVar = gVar.i) != null) {
            i = iVar.getLeft() - ((horizontalScrollView.getWidth() - iVar.getWidth()) / 2);
        } else {
            i = 0;
        }
        horizontalScrollView.scrollTo(i, 0);
    }
}
