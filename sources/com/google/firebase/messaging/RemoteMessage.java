package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
/* loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new u();
    Bundle a;
    private Map<String, String> b;

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    @NonNull
    public Map<String, String> h() {
        if (this.b == null) {
            this.b = b.a.a(this.a);
        }
        return this.b;
    }

    public String k() {
        return this.a.getString(RemoteMessageConst.FROM);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        u.c(this, parcel, i);
    }
}
