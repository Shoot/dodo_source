package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.h;
import com.bumptech.glide.manager.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class f {
    final Map<androidx.lifecycle.d, h> a = new HashMap();
    @NonNull
    private final g.b b;

    /* compiled from: LifecycleRequestManagerRetriever.java */
    /* loaded from: classes.dex */
    private final class b implements wi9 {
        private final FragmentManager a;

        b(FragmentManager fragmentManager) {
            this.a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set<h> set) {
            List<Fragment> y0 = fragmentManager.y0();
            int size = y0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = y0.get(i);
                b(fragment.getChildFragmentManager(), set);
                h a = f.this.a(fragment.getLifecycle());
                if (a != null) {
                    set.add(a);
                }
            }
        }

        @Override // defpackage.wi9
        @NonNull
        public Set<h> a() {
            HashSet hashSet = new HashSet();
            b(this.a, hashSet);
            return hashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(@NonNull g.b bVar) {
        this.b = bVar;
    }

    h a(androidx.lifecycle.d dVar) {
        vub.b();
        return this.a.get(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h b(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.d dVar, FragmentManager fragmentManager, boolean z) {
        vub.b();
        h a2 = a(dVar);
        if (a2 == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(dVar);
            h a3 = this.b.a(bVar, lifecycleLifecycle, new b(fragmentManager), context);
            this.a.put(dVar, a3);
            lifecycleLifecycle.a(new a(dVar));
            if (z) {
                a3.onStart();
            }
            return a3;
        }
        return a2;
    }

    /* compiled from: LifecycleRequestManagerRetriever.java */
    /* loaded from: classes.dex */
    class a implements mp5 {
        final /* synthetic */ androidx.lifecycle.d a;

        a(androidx.lifecycle.d dVar) {
            this.a = dVar;
        }

        @Override // defpackage.mp5
        public void onDestroy() {
            f.this.a.remove(this.a);
        }

        @Override // defpackage.mp5
        public void g() {
        }

        @Override // defpackage.mp5
        public void onStart() {
        }
    }
}
