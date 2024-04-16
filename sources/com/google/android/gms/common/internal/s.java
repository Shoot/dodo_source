package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class s implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, getServiceRequest.a);
        ys9.m(parcel, 2, getServiceRequest.b);
        ys9.m(parcel, 3, getServiceRequest.c);
        ys9.t(parcel, 4, getServiceRequest.d, false);
        ys9.l(parcel, 5, getServiceRequest.e, false);
        ys9.w(parcel, 6, getServiceRequest.f, i, false);
        ys9.e(parcel, 7, getServiceRequest.g, false);
        ys9.s(parcel, 8, getServiceRequest.h, i, false);
        ys9.w(parcel, 10, getServiceRequest.i, i, false);
        ys9.w(parcel, 11, getServiceRequest.j, i, false);
        ys9.c(parcel, 12, getServiceRequest.k);
        ys9.m(parcel, 13, getServiceRequest.l);
        ys9.c(parcel, 14, getServiceRequest.m);
        ys9.t(parcel, 15, getServiceRequest.h(), false);
        ys9.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Scope[] scopeArr = GetServiceRequest.o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.p;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 2:
                    i2 = SafeParcelReader.v(parcel, t);
                    break;
                case 3:
                    i3 = SafeParcelReader.v(parcel, t);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    iBinder = SafeParcelReader.u(parcel, t);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, t, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, t);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.e(parcel, t, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.i(parcel, t, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.i(parcel, t, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 13:
                    i4 = SafeParcelReader.v(parcel, t);
                    break;
                case 14:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 15:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
