package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes2.dex */
final class n {
    private final Messenger a;
    private final zze b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (i6d.a(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (i6d.a(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new zze(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zze zzeVar = this.b;
        if (zzeVar != null) {
            zzeVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
