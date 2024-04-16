package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
/* compiled from: FragmentContainer.java */
/* renamed from: e64  reason: default package */
/* loaded from: classes.dex */
public abstract class e64 {
    @NonNull
    @Deprecated
    public Fragment b(@NonNull Context context, @NonNull String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View c(int i);

    public abstract boolean d();
}
