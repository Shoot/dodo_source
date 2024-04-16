package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
/* compiled from: FirebaseOptions.java */
/* renamed from: nw3  reason: default package */
/* loaded from: classes2.dex */
public final class nw3 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private nw3(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        gh8.n(!b0b.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static nw3 a(@NonNull Context context) {
        tza tzaVar = new tza(context);
        String a = tzaVar.a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new nw3(a, tzaVar.a("google_api_key"), tzaVar.a("firebase_database_url"), tzaVar.a("ga_trackingId"), tzaVar.a("gcm_defaultSenderId"), tzaVar.a("google_storage_bucket"), tzaVar.a("project_id"));
    }

    @NonNull
    public String b() {
        return this.a;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nw3)) {
            return false;
        }
        nw3 nw3Var = (nw3) obj;
        if (!m57.a(this.b, nw3Var.b) || !m57.a(this.a, nw3Var.a) || !m57.a(this.c, nw3Var.c) || !m57.a(this.d, nw3Var.d) || !m57.a(this.e, nw3Var.e) || !m57.a(this.f, nw3Var.f) || !m57.a(this.g, nw3Var.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return m57.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return m57.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
