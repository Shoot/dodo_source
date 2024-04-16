package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: yr4  reason: default package */
/* loaded from: classes2.dex */
public interface yr4 extends IInterface {
    float A0() throws RemoteException;

    void D1(woc wocVar) throws RemoteException;

    void G1(kpc kpcVar) throws RemoteException;

    jmc I0(MarkerOptions markerOptions) throws RemoteException;

    void J0(ibd ibdVar) throws RemoteException;

    float L0() throws RemoteException;

    void P1(enc encVar) throws RemoteException;

    void R0(w7d w7dVar) throws RemoteException;

    void S1(ns4 ns4Var, int i, puc pucVar) throws RemoteException;

    @NonNull
    CameraPosition X() throws RemoteException;

    void Y0(int i, int i2, int i3, int i4) throws RemoteException;

    void Z0(@NonNull ns4 ns4Var) throws RemoteException;

    void clear() throws RemoteException;

    void d0(y0d y0dVar) throws RemoteException;

    void e1(rpc rpcVar) throws RemoteException;

    boolean f1(MapStyleOptions mapStyleOptions) throws RemoteException;

    void o0(@NonNull ns4 ns4Var) throws RemoteException;

    @NonNull
    ps4 t0() throws RemoteException;

    @NonNull
    dt4 x1() throws RemoteException;
}
