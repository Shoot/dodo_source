package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ListCompositeDisposable.java */
/* renamed from: zq5  reason: default package */
/* loaded from: classes3.dex */
public final class zq5 implements z33, a43 {
    List<z33> a;
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
                List<z33> list = this.a;
                this.a = null;
                e(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a43
    public boolean b(z33 z33Var) {
        x47.e(z33Var, "d is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        List list = this.a;
                        if (list == null) {
                            list = new LinkedList();
                            this.a = list;
                        }
                        list.add(z33Var);
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
        x47.e(z33Var, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                List<z33> list = this.a;
                if (list != null && list.remove(z33Var)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    void e(List<z33> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (z33 z33Var : list) {
            try {
                z33Var.a();
            } catch (Throwable th) {
                rl3.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
