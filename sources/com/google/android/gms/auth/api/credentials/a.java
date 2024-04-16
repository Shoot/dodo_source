package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.e(parcel, t, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.j(parcel, t, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(parcel, t);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 9:
                    str5 = SafeParcelReader.f(parcel, t);
                    break;
                case 10:
                    str6 = SafeParcelReader.f(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i) {
        return new Credential[i];
    }
}
