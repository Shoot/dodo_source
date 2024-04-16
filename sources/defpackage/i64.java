package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
/* compiled from: Fragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "", "a", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: i64  reason: default package */
/* loaded from: classes.dex */
public final class i64 {
    public static final void a(Fragment fragment, String str, Bundle bundle) {
        z65.h(fragment, "<this>");
        z65.h(str, "requestKey");
        z65.h(bundle, "result");
        fragment.getParentFragmentManager().z1(str, bundle);
    }
}
