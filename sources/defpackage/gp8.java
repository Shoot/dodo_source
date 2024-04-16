package defpackage;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: gp8  reason: default package */
/* loaded from: classes2.dex */
public final class gp8 {
    private final ps4 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gp8(ps4 ps4Var) {
        this.a = ps4Var;
    }

    @NonNull
    public VisibleRegion a() {
        try {
            return this.a.f0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
