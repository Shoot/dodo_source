package com.hcaptcha.sdk;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
abstract class HCaptchaStateListener implements Parcelable {
    public abstract void a(HCaptchaException hCaptchaException);

    public abstract void b();

    public abstract void c(String str);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
