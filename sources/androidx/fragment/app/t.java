package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public class t implements androidx.lifecycle.c, nt9, vzb {
    private final Fragment a;
    private final androidx.lifecycle.t b;
    private androidx.lifecycle.h c = null;
    private mt9 d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(@NonNull Fragment fragment, @NonNull androidx.lifecycle.t tVar) {
        this.a = fragment;
        this.b = tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull d.a aVar) {
        this.c.i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.c == null) {
            this.c = new androidx.lifecycle.h(this);
            mt9 a = mt9.a(this);
            this.d = a;
            a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.d.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@NonNull Bundle bundle) {
        this.d.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@NonNull d.b bVar) {
        this.c.o(bVar);
    }

    @Override // androidx.lifecycle.c
    @NonNull
    public n22 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.a.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        jq6 jq6Var = new jq6();
        if (application != null) {
            jq6Var.c(s.a.g, application);
        }
        jq6Var.c(androidx.lifecycle.o.a, this.a);
        jq6Var.c(androidx.lifecycle.o.b, this);
        if (this.a.getArguments() != null) {
            jq6Var.c(androidx.lifecycle.o.c, this.a.getArguments());
        }
        return jq6Var;
    }

    @Override // defpackage.op5
    @NonNull
    public androidx.lifecycle.d getLifecycle() {
        b();
        return this.c;
    }

    @Override // defpackage.nt9
    @NonNull
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.d.b();
    }

    @Override // defpackage.vzb
    @NonNull
    public androidx.lifecycle.t getViewModelStore() {
        b();
        return this.b;
    }
}
