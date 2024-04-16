package defpackage;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.net.SyslogAppender;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: LottieComposition.java */
/* renamed from: ez5  reason: default package */
/* loaded from: classes.dex */
public class ez5 {
    private Map<String, List<em5>> c;
    private Map<String, rz5> d;
    private Map<String, r24> e;
    private List<n86> f;
    private cra<u24> g;
    private py5<em5> h;
    private List<em5> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private final by7 a = new by7();
    private final HashSet<String> b = new HashSet<>();
    private int o = 0;

    public void a(String str) {
        ox5.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public cra<u24> c() {
        return this.g;
    }

    public float d() {
        return (e() / this.m) * 1000.0f;
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, r24> g() {
        return this.e;
    }

    public float h(float f) {
        return ql6.i(this.k, this.l, f);
    }

    public float i() {
        return this.m;
    }

    public Map<String, rz5> j() {
        return this.d;
    }

    public List<em5> k() {
        return this.i;
    }

    public n86 l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            n86 n86Var = this.f.get(i);
            if (n86Var.a(str)) {
                return n86Var;
            }
        }
        return null;
    }

    public int m() {
        return this.o;
    }

    public by7 n() {
        return this.a;
    }

    public List<em5> o(String str) {
        return this.c.get(str);
    }

    public float p() {
        return this.k;
    }

    public boolean q() {
        return this.n;
    }

    public void r(int i) {
        this.o += i;
    }

    public void s(Rect rect, float f, float f2, float f3, List<em5> list, py5<em5> py5Var, Map<String, List<em5>> map, Map<String, rz5> map2, cra<u24> craVar, Map<String, r24> map3, List<n86> list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = py5Var;
        this.c = map;
        this.d = map2;
        this.g = craVar;
        this.e = map3;
        this.f = list2;
    }

    public em5 t(long j) {
        return this.h.g(j);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (em5 em5Var : this.i) {
            sb.append(em5Var.y(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
        }
        return sb.toString();
    }

    public void u(boolean z) {
        this.n = z;
    }

    public void v(boolean z) {
        this.a.b(z);
    }
}
