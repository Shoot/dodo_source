package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();
    @NonNull
    public static final t91 n = jp2.c();
    final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;
    private String g;
    private final long h;
    private final String i;
    final List j;
    private final String k;
    private final String l;
    private final Set m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    @NonNull
    public static GoogleSignInAccount A(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), gh8.f(str7), new ArrayList((Collection) gh8.j(set)), str5, str6);
    }

    public static GoogleSignInAccount B(String str) throws JSONException {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount A = A(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        A.g = str7;
        return A;
    }

    @NonNull
    public final String C() {
        return this.i;
    }

    @NonNull
    public final String D() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (u() != null) {
                jSONObject.put("id", u());
            }
            if (v() != null) {
                jSONObject.put("tokenId", v());
            }
            if (k() != null) {
                jSONObject.put("email", k());
            }
            if (h() != null) {
                jSONObject.put("displayName", h());
            }
            if (t() != null) {
                jSONObject.put("givenName", t());
            }
            if (p() != null) {
                jSONObject.put("familyName", p());
            }
            Uri w = w();
            if (w != null) {
                jSONObject.put("photoUrl", w.toString());
            }
            if (z() != null) {
                jSONObject.put("serverAuthCode", z());
            }
            jSONObject.put("expirationTime", this.h);
            jSONObject.put("obfuscatedIdentifier", this.i);
            JSONArray jSONArray = new JSONArray();
            List list = this.j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: oic
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).h().compareTo(((Scope) obj2).h());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.h());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.i.equals(this.i) || !googleSignInAccount.x().equals(x())) {
            return false;
        }
        return true;
    }

    public Account g() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + x().hashCode();
    }

    public String k() {
        return this.d;
    }

    public String p() {
        return this.l;
    }

    public String t() {
        return this.k;
    }

    public String u() {
        return this.b;
    }

    public String v() {
        return this.c;
    }

    public Uri w() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.t(parcel, 2, u(), false);
        ys9.t(parcel, 3, v(), false);
        ys9.t(parcel, 4, k(), false);
        ys9.t(parcel, 5, h(), false);
        ys9.s(parcel, 6, w(), i, false);
        ys9.t(parcel, 7, z(), false);
        ys9.q(parcel, 8, this.h);
        ys9.t(parcel, 9, this.i, false);
        ys9.x(parcel, 10, this.j, false);
        ys9.t(parcel, 11, t(), false);
        ys9.t(parcel, 12, p(), false);
        ys9.b(parcel, a);
    }

    @NonNull
    public Set<Scope> x() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    public String z() {
        return this.g;
    }
}
