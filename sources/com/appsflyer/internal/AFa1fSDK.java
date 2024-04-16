package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
@Deprecated
/* loaded from: classes.dex */
public final class AFa1fSDK {
    public final String[] valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        private final boolean AFInAppEventParameterName;
        final String AFKeystoreWrapper;

        AFa1vSDK(String str, boolean z) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventParameterName = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean AFKeystoreWrapper() {
            return this.AFInAppEventParameterName;
        }
    }

    /* loaded from: classes.dex */
    static final class AFa1wSDK implements IInterface {
        private final IBinder AFInAppEventParameterName;

        AFa1wSDK(IBinder iBinder) {
            this.AFInAppEventParameterName = iBinder;
        }

        final boolean AFKeystoreWrapper() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.AFInAppEventParameterName.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFInAppEventParameterName;
        }

        public final String values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFInAppEventParameterName.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    AFa1fSDK() {
    }

    public AFa1fSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.valueOf = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null && compile.matcher(str).matches()) {
                arrayList.add(str.toLowerCase());
            } else {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            }
        }
        if (arrayList.contains("all")) {
            this.valueOf = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.valueOf = null;
        } else {
            this.valueOf = (String[]) arrayList.toArray(new String[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AFa1vSDK AFInAppEventType(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aFa1zSDK, 1)) {
                    if (!aFa1zSDK.values) {
                        aFa1zSDK.values = true;
                        IBinder poll = aFa1zSDK.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            AFa1wSDK aFa1wSDK = new AFa1wSDK(poll);
                            return new AFa1vSDK(aFa1wSDK.values(), aFa1wSDK.AFKeystoreWrapper());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1zSDK);
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(aFa1zSDK);
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes.dex */
    static final class AFa1zSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventType;
        boolean values;

        private AFa1zSDK() {
            this.AFInAppEventType = new LinkedBlockingQueue<>(1);
            this.values = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventType.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        /* synthetic */ AFa1zSDK(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
