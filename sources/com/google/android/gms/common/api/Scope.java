package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new d();
    final int a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        gh8.g(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    @NonNull
    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.t(parcel, 2, h(), false);
        ys9.b(parcel, a);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
