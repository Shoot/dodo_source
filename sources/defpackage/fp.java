package defpackage;

import androidx.lifecycle.d;
import com.dodopizza.android.applicationstate.AppStateManager;
/* compiled from: AppStateManager_Factory.java */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp implements no3<AppStateManager> {
    private final as8<d> a;

    public fp(as8<d> as8Var) {
        this.a = as8Var;
    }

    public static fp a(as8<d> as8Var) {
        return new fp(as8Var);
    }

    public static AppStateManager c(d dVar) {
        return new AppStateManager(dVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AppStateManager get() {
        return c(this.a.get());
    }
}
