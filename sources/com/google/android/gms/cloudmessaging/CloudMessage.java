package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new mqc();
    @NonNull
    final Intent a;

    public CloudMessage(@NonNull Intent intent) {
        this.a = intent;
    }

    @NonNull
    public Intent h() {
        return this.a;
    }

    public String k() {
        String stringExtra = this.a.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return this.a.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer p() {
        if (this.a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 1, this.a, i, false);
        ys9.b(parcel, a);
    }
}
