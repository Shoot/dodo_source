package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    @NonNull
    public static final GoogleSignInOptions l;
    @NonNull
    public static final GoogleSignInOptions m;
    @NonNull
    public static final Scope n = new Scope("profile");
    @NonNull
    public static final Scope o = new Scope("email");
    @NonNull
    public static final Scope p = new Scope("openid");
    @NonNull
    public static final Scope q;
    @NonNull
    public static final Scope r;
    private static final Comparator s;
    final int a;
    private final ArrayList b;
    private Account c;
    private boolean d;
    private final boolean e;
    private final boolean f;
    private String g;
    private String h;
    private ArrayList i;
    private String j;
    private Map k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        q = scope;
        r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        l = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        m = aVar2.a();
        CREATOR = new e();
        s = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map R(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.h()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public static GoogleSignInOptions z(String str) throws JSONException {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, new HashMap(), (String) null);
    }

    @NonNull
    public final String D() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.b, s);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).h());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.d);
            jSONObject.put("forceCodeForRefreshToken", this.f);
            jSONObject.put("serverAuthRequested", this.e);
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("serverClientId", this.g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put("hostedDomain", this.h);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.g()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList r1 = r4.i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.p()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.p()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.g()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.g()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.t()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.t()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.u()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.v()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.w()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.k()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public Account g() {
        return this.c;
    }

    @NonNull
    public ArrayList<GoogleSignInOptionsExtensionParcelable> h() {
        return this.i;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).h());
        }
        Collections.sort(arrayList);
        ym4 ym4Var = new ym4();
        ym4Var.a(arrayList);
        ym4Var.a(this.c);
        ym4Var.a(this.g);
        ym4Var.c(this.f);
        ym4Var.c(this.d);
        ym4Var.c(this.e);
        ym4Var.a(this.j);
        return ym4Var.b();
    }

    public String k() {
        return this.j;
    }

    @NonNull
    public ArrayList<Scope> p() {
        return new ArrayList<>(this.b);
    }

    public String t() {
        return this.g;
    }

    public boolean u() {
        return this.f;
    }

    public boolean v() {
        return this.d;
    }

    public boolean w() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.x(parcel, 2, p(), false);
        ys9.s(parcel, 3, g(), i, false);
        ys9.c(parcel, 4, v());
        ys9.c(parcel, 5, w());
        ys9.c(parcel, 6, u());
        ys9.t(parcel, 7, t(), false);
        ys9.t(parcel, 8, this.h, false);
        ys9.x(parcel, 9, h(), false);
        ys9.t(parcel, 10, k(), false);
        ys9.b(parcel, a2);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private Set a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map h;
        private String i;

        public a() {
            this.a = new HashSet();
            this.h = new HashMap();
        }

        @NonNull
        public GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.r)) {
                Set set = this.a;
                Scope scope = GoogleSignInOptions.q;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        @NonNull
        public a b() {
            this.a.add(GoogleSignInOptions.p);
            return this;
        }

        @NonNull
        public a c() {
            this.a.add(GoogleSignInOptions.n);
            return this;
        }

        @NonNull
        public a d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.i = str;
            return this;
        }

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.h = new HashMap();
            gh8.j(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.b);
            this.b = googleSignInOptions.e;
            this.c = googleSignInOptions.f;
            this.d = googleSignInOptions.d;
            this.e = googleSignInOptions.g;
            this.f = googleSignInOptions.c;
            this.g = googleSignInOptions.h;
            this.h = GoogleSignInOptions.R(googleSignInOptions.i);
            this.i = googleSignInOptions.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, R(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = new ArrayList(map.values());
        this.k = map;
        this.j = str3;
    }
}
