package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import defpackage.u66.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapObjectManager.java */
/* renamed from: u66  reason: default package */
/* loaded from: classes.dex */
public abstract class u66<O, C extends b> {
    protected final rg4 a;
    private final Map<String, C> b = new HashMap();
    protected final Map<O, C> c = new HashMap();

    /* compiled from: MapObjectManager.java */
    /* renamed from: u66$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u66.this.j();
        }
    }

    /* compiled from: MapObjectManager.java */
    /* renamed from: u66$b */
    /* loaded from: classes.dex */
    public class b {
        private final Set<O> a = new HashSet();

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void a(O o) {
            this.a.add(o);
            u66.this.c.put(o, this);
        }

        public void b() {
            for (O o : this.a) {
                u66.this.i(o);
                u66.this.c.remove(o);
            }
            this.a.clear();
        }

        protected boolean c(O o) {
            if (this.a.remove(o)) {
                u66.this.c.remove(o);
                u66.this.i(o);
                return true;
            }
            return false;
        }
    }

    public u66(@NonNull rg4 rg4Var) {
        this.a = rg4Var;
        new Handler(Looper.getMainLooper()).post(new a());
    }

    public boolean h(O o) {
        C c = this.c.get(o);
        if (c != null && c.c(o)) {
            return true;
        }
        return false;
    }

    protected abstract void i(O o);

    abstract void j();
}
