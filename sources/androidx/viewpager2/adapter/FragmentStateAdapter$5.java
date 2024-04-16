package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements g {
    final /* synthetic */ Handler a;
    final /* synthetic */ Runnable b;

    @Override // androidx.lifecycle.g
    public void d(@NonNull op5 op5Var, @NonNull d.a aVar) {
        if (aVar == d.a.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            op5Var.getLifecycle().d(this);
        }
    }
}
