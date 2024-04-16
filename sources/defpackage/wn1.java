package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
/* compiled from: CompositeDisposable.java */
/* renamed from: wn1  reason: default package */
/* loaded from: classes3.dex */
public final class wn1 implements z33, a43 {
    ja7<z33> a;
    volatile boolean b;

    @Override // defpackage.z33
    public void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                ja7<z33> ja7Var = this.a;
                this.a = null;
                f(ja7Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a43
    public boolean b(z33 z33Var) {
        x47.e(z33Var, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        ja7<z33> ja7Var = this.a;
                        if (ja7Var == null) {
                            ja7Var = new ja7<>();
                            this.a = ja7Var;
                        }
                        ja7Var.a(z33Var);
                        return true;
                    }
                } finally {
                }
            }
        }
        z33Var.a();
        return false;
    }

    @Override // defpackage.a43
    public boolean c(z33 z33Var) {
        if (d(z33Var)) {
            z33Var.a();
            return true;
        }
        return false;
    }

    @Override // defpackage.a43
    public boolean d(z33 z33Var) {
        x47.e(z33Var, "disposables is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                ja7<z33> ja7Var = this.a;
                if (ja7Var != null && ja7Var.e(z33Var)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void e() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                ja7<z33> ja7Var = this.a;
                this.a = null;
                f(ja7Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(ja7<z33> ja7Var) {
        Object[] b;
        if (ja7Var == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : ja7Var.b()) {
            if (obj instanceof z33) {
                try {
                    ((z33) obj).a();
                } catch (Throwable th) {
                    rl3.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw pl3.d((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    @Override // defpackage.z33
    public boolean i() {
        return this.b;
    }
}
