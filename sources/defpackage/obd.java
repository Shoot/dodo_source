package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.c;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: obd  reason: default package */
/* loaded from: classes2.dex */
public final class obd extends c<uzc> {
    public obd(Context context, Looper looper, n91 n91Var, pq1 pq1Var, q77 q77Var) {
        super(context, looper, 126, n91Var, pq1Var, q77Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String C() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean P() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return d.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* bridge */ /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof uzc) {
            return (uzc) queryLocalInterface;
        }
        return new uzc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] s() {
        return bnc.e;
    }
}
