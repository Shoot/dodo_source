package io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
@Keep
/* loaded from: classes3.dex */
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(OsSharedRealm osSharedRealm, ao0 ao0Var) {
        super(osSharedRealm);
        if (ao0Var.c()) {
            this.handler = new Handler(Looper.myLooper());
        } else {
            this.handler = null;
        }
    }

    @Override // io.realm.internal.RealmNotifier
    public boolean post(Runnable runnable) {
        Handler handler = this.handler;
        if (handler != null && handler.post(runnable)) {
            return true;
        }
        return false;
    }
}
