package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: RolloutsStateSubscriptionsHandler.java */
/* renamed from: rn9  reason: default package */
/* loaded from: classes2.dex */
public class rn9 {
    private b a;
    private mn9 b;
    private Executor c;
    private Set<nn9> d = Collections.newSetFromMap(new ConcurrentHashMap());

    public rn9(@NonNull b bVar, @NonNull mn9 mn9Var, @NonNull Executor executor) {
        this.a = bVar;
        this.b = mn9Var;
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(y6b y6bVar, final nn9 nn9Var, c cVar) {
        try {
            c cVar2 = (c) y6bVar.m();
            if (cVar2 != null) {
                final ln9 b = this.b.b(cVar2);
                this.c.execute(new Runnable() { // from class: qn9
                    @Override // java.lang.Runnable
                    public final void run() {
                        nn9.this.a(b);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    public void g(@NonNull c cVar) {
        try {
            final ln9 b = this.b.b(cVar);
            for (final nn9 nn9Var : this.d) {
                this.c.execute(new Runnable() { // from class: on9
                    @Override // java.lang.Runnable
                    public final void run() {
                        nn9.this.a(b);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e);
        }
    }

    public void h(@NonNull final nn9 nn9Var) {
        this.d.add(nn9Var);
        final y6b<c> e = this.a.e();
        e.h(this.c, new a97() { // from class: pn9
            @Override // defpackage.a97
            public final void onSuccess(Object obj) {
                rn9.this.f(e, nn9Var, (c) obj);
            }
        });
    }
}
