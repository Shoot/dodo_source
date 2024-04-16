package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    final zzs a;
    final List<ClientIdentity> b;
    final String c;
    static final List<ClientIdentity> d = Collections.emptyList();
    static final zzs e = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.a = zzsVar;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!m57.a(this.a, zzjVar.a) || !m57.a(this.b, zzjVar.b) || !m57.a(this.c, zzjVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 1, this.a, i, false);
        ys9.x(parcel, 2, this.b, false);
        ys9.t(parcel, 3, this.c, false);
        ys9.b(parcel, a);
    }
}
