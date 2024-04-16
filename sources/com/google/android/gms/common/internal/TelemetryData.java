package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new pic();
    private final int a;
    private List b;

    public TelemetryData(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final int h() {
        return this.a;
    }

    public final List k() {
        return this.b;
    }

    public final void p(@NonNull MethodInvocation methodInvocation) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.x(parcel, 2, this.b, false);
        ys9.b(parcel, a);
    }
}
