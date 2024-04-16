package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new pzc();
    private String a;

    public MapStyleOptions(@NonNull String str) {
        gh8.k(str, "json must not be null");
        this.a = str;
    }

    @NonNull
    public static MapStyleOptions h(@NonNull Context context, int i) throws Resources.NotFoundException {
        try {
            return new MapStyleOptions(new String(ms4.c(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String obj = e.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + obj);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.b(parcel, a);
    }
}
