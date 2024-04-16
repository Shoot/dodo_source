package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new v2d();
    @NonNull
    private final String a;
    @NonNull
    private final String b;

    public IdToken(@NonNull String str, @NonNull String str2) {
        gh8.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        gh8.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (m57.a(this.a, idToken.a) && m57.a(this.b, idToken.b)) {
            return true;
        }
        return false;
    }

    @NonNull
    public final String h() {
        return this.a;
    }

    @NonNull
    public final String k() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, h(), false);
        ys9.t(parcel, 2, k(), false);
        ys9.b(parcel, a);
    }
}
