package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.m57;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements tk9, ReflectedParcelable {
    final int a;
    private final int b;
    private final String c;
    private final PendingIntent d;
    private final ConnectionResult e;
    @NonNull
    public static final Status f = new Status(-1);
    @NonNull
    public static final Status g = new Status(0);
    @NonNull
    public static final Status h = new Status(14);
    @NonNull
    public static final Status i = new Status(8);
    @NonNull
    public static final Status j = new Status(15);
    @NonNull
    public static final Status k = new Status(16);
    @NonNull
    public static final Status m = new Status(17);
    @NonNull
    public static final Status l = new Status(18);
    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i2, int i3, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = pendingIntent;
        this.e = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.a != status.a || this.b != status.b || !m57.a(this.c, status.c) || !m57.a(this.d, status.d) || !m57.a(this.e, status.e)) {
            return false;
        }
        return true;
    }

    public ConnectionResult h() {
        return this.e;
    }

    public int hashCode() {
        return m57.b(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public PendingIntent k() {
        return this.d;
    }

    public int p() {
        return this.b;
    }

    public String t() {
        return this.c;
    }

    @NonNull
    public String toString() {
        m57.a c = m57.c(this);
        c.a(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, x());
        c.a(CommonCode.MapKey.HAS_RESOLUTION, this.d);
        return c.toString();
    }

    public boolean u() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public boolean v() {
        if (this.b <= 0) {
            return true;
        }
        return false;
    }

    public void w(@NonNull Activity activity, int i2) throws IntentSender.SendIntentException {
        if (!u()) {
            return;
        }
        PendingIntent pendingIntent = this.d;
        gh8.j(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, p());
        ys9.t(parcel, 2, t(), false);
        ys9.s(parcel, 3, this.d, i2, false);
        ys9.s(parcel, 4, h(), i2, false);
        ys9.m(parcel, 1000, this.a);
        ys9.b(parcel, a);
    }

    @NonNull
    public final String x() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        return dk1.a(this.b);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent, null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i2) {
        this(1, i2, str, connectionResult.p(), connectionResult);
    }

    @Override // defpackage.tk9
    @NonNull
    public Status d() {
        return this;
    }
}
