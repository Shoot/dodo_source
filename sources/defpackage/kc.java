package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import defpackage.jc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* renamed from: kc  reason: default package */
/* loaded from: classes2.dex */
public class kc implements jc {
    private static volatile jc c;
    private final fo a;
    final Map<String, Object> b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    /* renamed from: kc$a */
    /* loaded from: classes2.dex */
    class a implements jc.a {
        private final /* synthetic */ String a;
        private final /* synthetic */ kc b;

        a(kc kcVar, String str) {
            this.a = str;
            this.b = kcVar;
        }
    }

    private kc(fo foVar) {
        gh8.j(foVar);
        this.a = foVar;
        this.b = new ConcurrentHashMap();
    }

    @NonNull
    public static jc h(@NonNull qv3 qv3Var, @NonNull Context context, @NonNull j1b j1bVar) {
        gh8.j(qv3Var);
        gh8.j(context);
        gh8.j(j1bVar);
        gh8.j(context.getApplicationContext());
        if (c == null) {
            synchronized (kc.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (qv3Var.u()) {
                            j1bVar.a(qk2.class, new Executor() { // from class: ylc
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new vk3() { // from class: oqc
                                @Override // defpackage.vk3
                                public final void a(nk3 nk3Var) {
                                    kc.i(nk3Var);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", qv3Var.t());
                        }
                        c = new kc(jvc.h(context, null, null, null, bundle).x());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(nk3 nk3Var) {
        boolean z = ((qk2) nk3Var.a()).a;
        synchronized (kc.class) {
            ((kc) gh8.j(c)).a.i(z);
        }
    }

    private final boolean j(@NonNull String str) {
        if (!str.isEmpty() && this.b.containsKey(str) && this.b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jc
    public void a(@NonNull jc.c cVar) {
        if (!pqc.g(cVar)) {
            return;
        }
        this.a.g(pqc.b(cVar));
    }

    @Override // defpackage.jc
    public void b(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!pqc.j(str) || !pqc.e(str2, bundle) || !pqc.h(str, str2, bundle)) {
            return;
        }
        pqc.d(str, str2, bundle);
        this.a.e(str, str2, bundle);
    }

    @Override // defpackage.jc
    public void c(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (!pqc.j(str) || !pqc.f(str, str2)) {
            return;
        }
        this.a.h(str, str2, obj);
    }

    @Override // defpackage.jc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 != null && !pqc.e(str2, bundle)) {
            return;
        }
        this.a.a(str, str2, bundle);
    }

    @Override // defpackage.jc
    @NonNull
    public Map<String, Object> d(boolean z) {
        return this.a.d(null, null, z);
    }

    @Override // defpackage.jc
    @NonNull
    public jc.a e(@NonNull String str, @NonNull jc.b bVar) {
        Object obj;
        gh8.j(bVar);
        if (!pqc.j(str) || j(str)) {
            return null;
        }
        fo foVar = this.a;
        if ("fiam".equals(str)) {
            obj = new gwc(foVar, bVar);
        } else if ("clx".equals(str)) {
            obj = new zxc(foVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.b.put(str, obj);
        return new a(this, str);
    }

    @Override // defpackage.jc
    public int f(@NonNull String str) {
        return this.a.c(str);
    }

    @Override // defpackage.jc
    @NonNull
    public List<jc.c> g(@NonNull String str, @NonNull String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.b(str, str2)) {
            arrayList.add(pqc.a(bundle));
        }
        return arrayList;
    }
}
