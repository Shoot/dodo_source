package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes2.dex */
public class u implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.e(parcel, 2, remoteMessage.a, false);
        ys9.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t) != 2) {
                SafeParcelReader.A(parcel, t);
            } else {
                bundle = SafeParcelReader.a(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
