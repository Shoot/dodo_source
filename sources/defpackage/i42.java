package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import defpackage.kr4;
/* compiled from: CustomTabsServiceConnection.java */
/* renamed from: i42  reason: default package */
/* loaded from: classes.dex */
public abstract class i42 implements ServiceConnection {
    private Context a;

    /* compiled from: CustomTabsServiceConnection.java */
    /* renamed from: i42$a */
    /* loaded from: classes.dex */
    class a extends e42 {
        a(kr4 kr4Var, ComponentName componentName, Context context) {
            super(kr4Var, componentName, context);
        }
    }

    public abstract void a(@NonNull ComponentName componentName, @NonNull e42 e42Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@NonNull Context context) {
        this.a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.a != null) {
            a(componentName, new a(kr4.a.x(iBinder), componentName, this.a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
