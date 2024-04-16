package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new kic();
    public final int a;
    public final String b;

    public ClientIdentity(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.a == this.a && m57.a(clientIdentity.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @NonNull
    public final String toString() {
        int i = this.a;
        String str = this.b;
        return i + ":" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.t(parcel, 2, this.b, false);
        ys9.b(parcel, a);
    }
}
