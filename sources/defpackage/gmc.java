package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: gmc  reason: default package */
/* loaded from: classes2.dex */
public class gmc implements IInterface {
    private final IBinder a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: protected */
    public gmc(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
