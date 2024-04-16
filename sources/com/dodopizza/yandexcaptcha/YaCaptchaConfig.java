package com.dodopizza.yandexcaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
/* compiled from: YaCaptchaConfig.kt */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/yandexcaptcha/YaCaptchaConfig;", "Landroid/os/Parcelable;", "siteKey", "", "apiEndpoint", "locale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiEndpoint", "()Ljava/lang/String;", "getLocale", "getSiteKey", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class YaCaptchaConfig implements Parcelable {
    public static final Parcelable.Creator<YaCaptchaConfig> CREATOR = new a();
    private final String apiEndpoint;
    private final String locale;
    private final String siteKey;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<YaCaptchaConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final YaCaptchaConfig createFromParcel(Parcel parcel) {
            z65.h(parcel, "in");
            return new YaCaptchaConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final YaCaptchaConfig[] newArray(int i) {
            return new YaCaptchaConfig[i];
        }
    }

    public YaCaptchaConfig() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getSiteKey() {
        return this.siteKey;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        z65.h(parcel, "parcel");
        parcel.writeString(this.siteKey);
        parcel.writeString(this.apiEndpoint);
        parcel.writeString(this.locale);
    }

    public YaCaptchaConfig(String str, String str2, String str3) {
        z65.h(str, "siteKey");
        z65.h(str2, "apiEndpoint");
        z65.h(str3, "locale");
        this.siteKey = str;
        this.apiEndpoint = str2;
        this.locale = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ YaCaptchaConfig(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "10000000-ffff-ffff-ffff-000000000001"
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = "https://captcha-api.yandex.ru/captcha.js"
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L22
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "Locale.getDefault()"
            defpackage.z65.g(r3, r4)
            java.lang.String r3 = r3.getLanguage()
            java.lang.String r4 = "Locale.getDefault().language"
            defpackage.z65.g(r3, r4)
        L22:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.yandexcaptcha.YaCaptchaConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
