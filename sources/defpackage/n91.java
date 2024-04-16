package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.huawei.hms.api.HuaweiApiClientImpl;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: n91  reason: default package */
/* loaded from: classes2.dex */
public final class n91 {
    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final hka i;
    private Integer j;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* renamed from: n91$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private Account a;
        private qr b;
        private String c;
        private String d;
        private final hka e = hka.j;

        @NonNull
        public n91 a() {
            return new n91(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        @NonNull
        public a b(@NonNull String str) {
            this.c = str;
            return this;
        }

        @NonNull
        public final a c(@NonNull Collection collection) {
            if (this.b == null) {
                this.b = new qr();
            }
            this.b.addAll(collection);
            return this;
        }

        @NonNull
        public final a d(Account account) {
            this.a = account;
            return this;
        }

        @NonNull
        public final a e(@NonNull String str) {
            this.d = str;
            return this;
        }
    }

    public n91(Account account, @NonNull Set set, @NonNull Map map, int i, View view, @NonNull String str, @NonNull String str2, hka hkaVar, boolean z) {
        Set unmodifiableSet;
        this.a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = hkaVar == null ? hka.j : hkaVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (wic wicVar : map.values()) {
            hashSet.addAll(wicVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    public static n91 a(@NonNull Context context) {
        return new c.a(context).a();
    }

    public Account b() {
        return this.a;
    }

    @Deprecated
    public String c() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    public Account d() {
        Account account = this.a;
        if (account != null) {
            return account;
        }
        return new Account(HuaweiApiClientImpl.DEFAULT_ACCOUNT, "com.google");
    }

    @NonNull
    public Set<Scope> e() {
        return this.c;
    }

    @NonNull
    public Set<Scope> f(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        wic wicVar = (wic) this.d.get(aVar);
        if (wicVar != null && !wicVar.a.isEmpty()) {
            HashSet hashSet = new HashSet(this.b);
            hashSet.addAll(wicVar.a);
            return hashSet;
        }
        return this.b;
    }

    @NonNull
    public String g() {
        return this.g;
    }

    @NonNull
    public Set<Scope> h() {
        return this.b;
    }

    @NonNull
    public final hka i() {
        return this.i;
    }

    public final Integer j() {
        return this.j;
    }

    public final String k() {
        return this.h;
    }

    public final void l(@NonNull Integer num) {
        this.j = num;
    }
}
