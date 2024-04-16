package defpackage;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: fragmentutils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/Fragment;", "T", "Landroid/os/Bundle;", "bundle", DateTokenConverter.CONVERTER_KEY, "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", "", "", "permissions", "", "a", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)Z", "text", "", "length", "", "b", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: y64  reason: default package */
/* loaded from: classes.dex */
public final class y64 {
    public static final boolean a(Fragment fragment, String... strArr) {
        z65.h(fragment, "<this>");
        z65.h(strArr, "permissions");
        for (String str : strArr) {
            if (iu1.a(fragment.requireContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static final void b(Fragment fragment, String str, int i) {
        z65.h(fragment, "<this>");
        z65.h(str, "text");
        Toast.makeText(fragment.getContext(), str, i).show();
    }

    public static /* synthetic */ void c(Fragment fragment, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        b(fragment, str, i);
    }

    public static final <T extends Fragment> T d(T t, Bundle bundle) {
        z65.h(t, "<this>");
        z65.h(bundle, "bundle");
        t.setArguments(bundle);
        return t;
    }
}
