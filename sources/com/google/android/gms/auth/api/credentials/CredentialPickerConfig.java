package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new c();
    private final int a;
    private final boolean b;
    private final boolean c;
    @Deprecated
    private final boolean d;
    private final int e;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* loaded from: classes2.dex */
    public static class a {
        private boolean a = false;
        private boolean b = true;
        private int c = 1;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        if (i < 2) {
            this.d = z3;
            this.e = z3 ? 3 : 1;
            return;
        }
        this.d = i2 == 3;
        this.e = i2;
    }

    @Deprecated
    public final boolean h() {
        if (this.e == 3) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return this.b;
    }

    public final boolean p() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.c(parcel, 1, k());
        ys9.c(parcel, 2, p());
        ys9.c(parcel, 3, h());
        ys9.m(parcel, 4, this.e);
        ys9.m(parcel, 1000, this.a);
        ys9.b(parcel, a2);
    }

    private CredentialPickerConfig(a aVar) {
        this(2, aVar.a, aVar.b, false, aVar.c);
    }
}
