package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMapOptions;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: cs4  reason: default package */
/* loaded from: classes2.dex */
public interface cs4 extends IInterface {
    void I1(@NonNull ns4 ns4Var, GoogleMapOptions googleMapOptions, @NonNull Bundle bundle) throws RemoteException;

    void g() throws RemoteException;

    void o() throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onStart() throws RemoteException;

    void p(@NonNull Bundle bundle) throws RemoteException;

    void u() throws RemoteException;

    void w(@NonNull Bundle bundle) throws RemoteException;

    @NonNull
    ns4 x0(@NonNull ns4 ns4Var, @NonNull ns4 ns4Var2, @NonNull Bundle bundle) throws RemoteException;

    void y0(fpc fpcVar) throws RemoteException;
}
