package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new i();
    ArrayList<Integer> a;
    String b;
    String c;
    ArrayList<Integer> d;
    boolean e;
    String f;

    /* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
    @Deprecated
    /* loaded from: classes2.dex */
    public final class a {
        /* synthetic */ a(h hVar) {
        }

        @RecentlyNonNull
        public IsReadyToPayRequest a() {
            return IsReadyToPayRequest.this;
        }
    }

    IsReadyToPayRequest() {
    }

    @RecentlyNonNull
    public static IsReadyToPayRequest h(@RecentlyNonNull String str) {
        a k = k();
        IsReadyToPayRequest.this.f = (String) gh8.k(str, "isReadyToPayRequestJson cannot be null!");
        return k.a();
    }

    @RecentlyNonNull
    @Deprecated
    public static a k() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.o(parcel, 2, this.a, false);
        ys9.t(parcel, 4, this.b, false);
        ys9.t(parcel, 5, this.c, false);
        ys9.o(parcel, 6, this.d, false);
        ys9.c(parcel, 7, this.e);
        ys9.t(parcel, 8, this.f, false);
        ys9.b(parcel, a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IsReadyToPayRequest(ArrayList<Integer> arrayList, String str, String str2, ArrayList<Integer> arrayList2, boolean z, String str3) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = arrayList2;
        this.e = z;
        this.f = str3;
    }
}
