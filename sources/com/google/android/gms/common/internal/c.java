package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class c<T extends IInterface> extends b<T> implements a.f {
    private final n91 F;
    private final Set G;
    private final Account H;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public c(@NonNull Context context, @NonNull Looper looper, int i, @NonNull n91 n91Var, @NonNull c.b bVar, @NonNull c.InterfaceC0218c interfaceC0218c) {
        this(context, looper, i, n91Var, (pq1) bVar, (q77) interfaceC0218c);
    }

    private final Set i0(@NonNull Set set) {
        Set<Scope> h0 = h0(set);
        for (Scope scope : h0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return h0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public final n91 g0() {
        return this.F;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public Set<Scope> h() {
        if (f()) {
            return this.G;
        }
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account r() {
        return this.H;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Executor t() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final Set<Scope> z() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(@NonNull Context context, @NonNull Looper looper, int i, @NonNull n91 n91Var, @NonNull pq1 pq1Var, @NonNull q77 q77Var) {
        this(context, looper, d.b(context), com.google.android.gms.common.a.m(), i, n91Var, (pq1) gh8.j(pq1Var), (q77) gh8.j(q77Var));
    }

    protected c(@NonNull Context context, @NonNull Looper looper, @NonNull d dVar, @NonNull com.google.android.gms.common.a aVar, int i, @NonNull n91 n91Var, pq1 pq1Var, q77 q77Var) {
        super(context, looper, dVar, aVar, i, pq1Var == null ? null : new f(pq1Var), q77Var == null ? null : new g(q77Var), n91Var.k());
        this.F = n91Var;
        this.H = n91Var.b();
        this.G = i0(n91Var.e());
    }

    @NonNull
    protected Set<Scope> h0(@NonNull Set<Scope> set) {
        return set;
    }
}
