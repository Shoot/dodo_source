package com.google.android.gms.instantapps;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public class LaunchData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LaunchData> CREATOR = new y1d();
    private final Intent a;
    private final String b;
    private final String c;
    final BitmapTeleporter d;
    private final Bitmap e;

    public LaunchData(@NonNull Intent intent, @NonNull String str, @NonNull String str2, @NonNull BitmapTeleporter bitmapTeleporter) {
        Bitmap bitmap;
        this.a = intent;
        this.b = str;
        this.c = str2;
        this.d = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            bitmap = bitmapTeleporter.h();
        } else {
            bitmap = null;
        }
        this.e = bitmap;
    }

    public String h() {
        return this.c;
    }

    public Intent k() {
        return this.a;
    }

    public String p() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 2, k(), i, false);
        ys9.t(parcel, 3, p(), false);
        ys9.t(parcel, 4, h(), false);
        ys9.s(parcel, 5, this.d, i, false);
        ys9.b(parcel, a);
    }
}
