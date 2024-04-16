package com.google.android.gms.auth.api.signin;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.tx7;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public class b extends com.google.android.gms.common.api.b<GoogleSignInOptions> {
    private static final C0214b k = new C0214b();
    private static int l = a.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* loaded from: classes2.dex */
    public enum a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* renamed from: com.google.android.gms.auth.api.signin.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0214b implements tx7.a<qh4, GoogleSignInAccount> {
        private C0214b() {
        }

        @Override // defpackage.tx7.a
        public final /* synthetic */ GoogleSignInAccount a(qh4 qh4Var) {
            return qh4Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, kz.g, googleSignInOptions, new im());
    }

    private final synchronized int A() {
        try {
            if (l == a.a) {
                Context q = q();
                com.google.android.gms.common.a m = com.google.android.gms.common.a.m();
                int h = m.h(q, com.google.android.gms.common.d.a);
                if (h == 0) {
                    l = a.d;
                } else if (m.b(q, h, null) == null && DynamiteModule.a(q, "com.google.android.gms.auth.api.fallback") != 0) {
                    l = a.c;
                } else {
                    l = a.b;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return l;
    }

    public y6b<Void> y() {
        boolean z;
        com.google.android.gms.common.api.c f = f();
        Context q = q();
        if (A() == a.c) {
            z = true;
        } else {
            z = false;
        }
        return tx7.b(q0d.c(f, q, z));
    }

    public y6b<Void> z() {
        boolean z;
        com.google.android.gms.common.api.c f = f();
        Context q = q();
        if (A() == a.c) {
            z = true;
        } else {
            z = false;
        }
        return tx7.b(q0d.a(f, q, z));
    }
}
