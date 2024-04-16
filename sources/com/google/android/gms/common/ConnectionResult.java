package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.m57;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int SUCCESS = 0;
    final int a;
    private final int b;
    private final PendingIntent c;
    private final String d;
    @NonNull
    public static final ConnectionResult e = new ConnectionResult(0);
    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static String v(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.b == connectionResult.b && m57.a(this.c, connectionResult.c) && m57.a(this.d, connectionResult.d)) {
            return true;
        }
        return false;
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        return m57.b(Integer.valueOf(this.b), this.c, this.d);
    }

    public String k() {
        return this.d;
    }

    public PendingIntent p() {
        return this.c;
    }

    public boolean t() {
        if (this.b != 0 && this.c != null) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        m57.a c = m57.c(this);
        c.a(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, v(this.b));
        c.a(CommonCode.MapKey.HAS_RESOLUTION, this.c);
        c.a("message", this.d);
        return c.toString();
    }

    public boolean u() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.m(parcel, 2, h());
        ys9.s(parcel, 3, p(), i, false);
        ys9.t(parcel, 4, k(), false);
        ys9.b(parcel, a);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
