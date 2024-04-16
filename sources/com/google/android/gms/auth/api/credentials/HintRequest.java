package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new e();
    private final int a;
    private final CredentialPickerConfig b;
    private final boolean c;
    private final boolean d;
    private final String[] e;
    private final boolean f;
    private final String g;
    private final String h;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private boolean a;
        private boolean b;
        private String[] c;
        private CredentialPickerConfig d = new CredentialPickerConfig.a().a();
        private boolean e = false;
        private String f;
        private String g;

        public final HintRequest a() {
            if (this.c == null) {
                this.c = new String[0];
            }
            if (!this.a && !this.b && this.c.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new HintRequest(this);
        }

        public final a b(boolean z) {
            this.b = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        this.b = (CredentialPickerConfig) gh8.j(credentialPickerConfig);
        this.c = z;
        this.d = z2;
        this.e = (String[]) gh8.j(strArr);
        if (i < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
            return;
        }
        this.f = z3;
        this.g = str;
        this.h = str2;
    }

    @NonNull
    public final String[] h() {
        return this.e;
    }

    @NonNull
    public final CredentialPickerConfig k() {
        return this.b;
    }

    public final String p() {
        return this.h;
    }

    public final String t() {
        return this.g;
    }

    public final boolean u() {
        return this.c;
    }

    public final boolean v() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.s(parcel, 1, k(), i, false);
        ys9.c(parcel, 2, u());
        ys9.c(parcel, 3, this.d);
        ys9.u(parcel, 4, h(), false);
        ys9.c(parcel, 5, v());
        ys9.t(parcel, 6, t(), false);
        ys9.t(parcel, 7, p(), false);
        ys9.m(parcel, 1000, this.a);
        ys9.b(parcel, a2);
    }

    private HintRequest(a aVar) {
        this(2, aVar.d, aVar.a, aVar.b, aVar.c, aVar.e, aVar.f, aVar.g);
    }
}
