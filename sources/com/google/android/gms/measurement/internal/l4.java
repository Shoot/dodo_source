package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.b;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class l4 extends com.google.android.gms.common.internal.b<lxc> {
    public l4(Context context, Looper looper, b.a aVar, b.InterfaceC0220b interfaceC0220b) {
        super(context, looper, 93, aVar, interfaceC0220b, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @NonNull
    public final String B() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final String C() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return com.google.android.gms.common.d.a;
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ lxc p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof lxc) {
            return (lxc) queryLocalInterface;
        }
        return new g4(iBinder);
    }
}
