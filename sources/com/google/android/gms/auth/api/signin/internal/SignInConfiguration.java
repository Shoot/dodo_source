package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new dcd();
    private final String a;
    private GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.a = gh8.f(str);
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = this.b;
            if (googleSignInOptions == null) {
                if (signInConfiguration.b == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.b)) {
                return true;
            }
        }
        return false;
    }

    public final GoogleSignInOptions h() {
        return this.b;
    }

    public final int hashCode() {
        return new ym4().a(this.a).a(this.b).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.s(parcel, 5, this.b, i, false);
        ys9.b(parcel, a);
    }
}
