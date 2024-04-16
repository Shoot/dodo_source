package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
@Deprecated
/* loaded from: classes2.dex */
public abstract class c {
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class a {
        private Account a;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Context i;
        private Looper l;
        private final Set b = new HashSet();
        private final Set c = new HashSet();
        private final Map h = new lr();
        private final Map j = new lr();
        private int k = -1;
        private com.google.android.gms.common.a m = com.google.android.gms.common.a.m();
        private a.AbstractC0215a n = zjc.c;
        private final ArrayList o = new ArrayList();
        private final ArrayList p = new ArrayList();

        public a(@NonNull Context context) {
            this.i = context;
            this.l = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        @NonNull
        public final n91 a() {
            hka hkaVar = hka.j;
            Map map = this.j;
            com.google.android.gms.common.api.a aVar = zjc.g;
            if (map.containsKey(aVar)) {
                hkaVar = (hka) this.j.get(aVar);
            }
            return new n91(this.a, this.b, this.h, this.d, this.e, this.f, this.g, hkaVar, false);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface b extends pq1 {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    @Deprecated
    /* renamed from: com.google.android.gms.common.api.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0218c extends q77 {
    }

    @NonNull
    public static Set<c> b() {
        Set<c> set = a;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends tk9, A>> T a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(@NonNull gka gkaVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
