package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: inc  reason: default package */
/* loaded from: classes2.dex */
public final class inc extends c<gad> {
    public inc(Context context, Looper looper, c.b bVar, c.InterfaceC0218c interfaceC0218c) {
        super(context, looper, 121, n91.a(context), bVar, interfaceC0218c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @NonNull
    public final String B() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final String C() {
        return "com.google.android.gms.instantapps.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean P() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12200000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* bridge */ /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof gad) {
            return (gad) queryLocalInterface;
        }
        return new gad(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] s() {
        return new Feature[]{emc.a, emc.b, emc.c, emc.d};
    }
}
