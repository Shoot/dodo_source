package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.jr4;
/* compiled from: CustomTabsClient.java */
/* renamed from: e42  reason: default package */
/* loaded from: classes.dex */
public class e42 {
    private final kr4 a;
    private final ComponentName b;
    private final Context c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e42(kr4 kr4Var, ComponentName componentName, Context context) {
        this.a = kr4Var;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(@NonNull Context context, String str, @NonNull i42 i42Var) {
        i42Var.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, i42Var, 33);
    }

    private jr4.a b(d42 d42Var) {
        return new a(d42Var);
    }

    private j42 d(d42 d42Var, PendingIntent pendingIntent) {
        boolean Z;
        jr4.a b = b(d42Var);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                Z = this.a.k0(b, bundle);
            } else {
                Z = this.a.Z(b);
            }
            if (!Z) {
                return null;
            }
            return new j42(this.a, b, this.b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public j42 c(d42 d42Var) {
        return d(d42Var, null);
    }

    public boolean e(long j) {
        try {
            return this.a.n1(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomTabsClient.java */
    /* renamed from: e42$a */
    /* loaded from: classes.dex */
    public class a extends jr4.a {
        private Handler a = new Handler(Looper.getMainLooper());

        a(d42 d42Var) {
        }

        @Override // defpackage.jr4
        public Bundle Y(@NonNull String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // defpackage.jr4
        public void N1(Bundle bundle) throws RemoteException {
        }

        @Override // defpackage.jr4
        public void B1(int i, Bundle bundle) {
        }

        @Override // defpackage.jr4
        public void K1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // defpackage.jr4
        public void q0(String str, Bundle bundle) throws RemoteException {
        }

        @Override // defpackage.jr4
        public void O1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        }
    }
}
