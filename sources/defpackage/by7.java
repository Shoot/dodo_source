package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PerformanceTracker.java */
/* renamed from: by7  reason: default package */
/* loaded from: classes.dex */
public class by7 {
    private boolean a = false;
    private final Set<b> b = new qr();
    private final Map<String, lb6> c = new HashMap();
    private final Comparator<wp7<String, Float>> d = new a();

    /* compiled from: PerformanceTracker.java */
    /* renamed from: by7$a */
    /* loaded from: classes.dex */
    class a implements Comparator<wp7<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(wp7<String, Float> wp7Var, wp7<String, Float> wp7Var2) {
            float floatValue = wp7Var.b.floatValue();
            float floatValue2 = wp7Var2.b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* renamed from: by7$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(float f);
    }

    public void a(String str, float f) {
        if (!this.a) {
            return;
        }
        lb6 lb6Var = this.c.get(str);
        if (lb6Var == null) {
            lb6Var = new lb6();
            this.c.put(str, lb6Var);
        }
        lb6Var.a(f);
        if (str.equals("__container")) {
            for (b bVar : this.b) {
                bVar.a(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.a = z;
    }
}
