package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: UrlBackoff.java */
/* renamed from: ttb  reason: default package */
/* loaded from: classes3.dex */
public class ttb {
    private static final long[] c = {5000, 15000, 60000, 120000, 300000};
    private long[] a = c;
    private final Map<String, wt2> b = new HashMap();

    public void a(String str) {
        wt2 wt2Var;
        synchronized (this.b) {
            wt2Var = this.b.get(str);
        }
        if (wt2Var == null) {
            wt2 wt2Var2 = new wt2(this.a);
            synchronized (this.b) {
                this.b.put(str, wt2Var2);
            }
            return;
        }
        wt2Var.a();
    }

    public wt2 b(String str) {
        wt2 remove;
        synchronized (this.b) {
            remove = this.b.remove(str);
        }
        return remove;
    }

    public boolean c(String str) {
        wt2 wt2Var;
        synchronized (this.b) {
            wt2Var = this.b.get(str);
        }
        if (wt2Var != null && wt2Var.c()) {
            return true;
        }
        return false;
    }
}
