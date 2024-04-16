package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: m3d  reason: default package */
/* loaded from: classes2.dex */
public interface m3d extends IInterface {
    void B0(Status status, byte[] bArr) throws RemoteException;

    void l1(Status status, RetrieveBytesResponse retrieveBytesResponse) throws RemoteException;
}
