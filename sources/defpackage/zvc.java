package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.c;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: zvc  reason: default package */
/* loaded from: classes2.dex */
public final class zvc extends c {
    public zvc(Context context, Looper looper, n91 n91Var, pq1 pq1Var, q77 q77Var) {
        super(context, looper, 258, n91Var, pq1Var, q77Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @NonNull
    public final String B() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final String C() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final boolean F() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean P() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        if (queryLocalInterface instanceof cxc) {
            return (cxc) queryLocalInterface;
        }
        return new cxc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] s() {
        return imc.i;
    }
}
