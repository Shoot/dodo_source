package defpackage;
/* compiled from: Mask.java */
/* renamed from: c96  reason: default package */
/* loaded from: classes.dex */
public class c96 {
    private final a a;
    private final wj b;
    private final rj c;
    private final boolean d;

    /* compiled from: Mask.java */
    /* renamed from: c96$a */
    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public c96(a aVar, wj wjVar, rj rjVar, boolean z) {
        this.a = aVar;
        this.b = wjVar;
        this.c = rjVar;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public wj b() {
        return this.b;
    }

    public rj c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
