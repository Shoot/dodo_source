package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.c;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: blc  reason: default package */
/* loaded from: classes2.dex */
public final class blc extends c {
    private final m8b I;

    public blc(Context context, Looper looper, n91 n91Var, m8b m8bVar, pq1 pq1Var, q77 q77Var) {
        super(context, looper, 270, n91Var, pq1Var, q77Var);
        this.I = m8bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @NonNull
    public final String B() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final String C() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final boolean F() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof qkc) {
            return (qkc) queryLocalInterface;
        }
        return new qkc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] s() {
        return ikc.b;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle x() {
        return this.I.b();
    }
}
