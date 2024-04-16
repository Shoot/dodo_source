package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new a();
    private final String a;
    private final String b;
    private final Uri c;
    private final List<IdToken> d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> unmodifiableList;
        String trim = ((String) gh8.k(str, "credential identifier cannot be null")).trim();
        gh8.g(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z = true;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.b = str2;
        this.c = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.d = unmodifiableList;
        this.a = trim;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && m57.a(this.c, credential.c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f, credential.f)) {
            return true;
        }
        return false;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        return m57.b(this.a, this.b, this.c, this.e, this.f);
    }

    public String k() {
        return this.h;
    }

    public String p() {
        return this.g;
    }

    public String t() {
        return this.a;
    }

    public List<IdToken> u() {
        return this.d;
    }

    public String v() {
        return this.b;
    }

    public String w() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, t(), false);
        ys9.t(parcel, 2, v(), false);
        ys9.s(parcel, 3, x(), i, false);
        ys9.x(parcel, 4, u(), false);
        ys9.t(parcel, 5, w(), false);
        ys9.t(parcel, 6, h(), false);
        ys9.t(parcel, 9, p(), false);
        ys9.t(parcel, 10, k(), false);
        ys9.b(parcel, a);
    }

    public Uri x() {
        return this.c;
    }
}
