package defpackage;

import com.android.volley.VolleyError;
/* compiled from: DefaultRetryPolicy.java */
/* renamed from: lr2  reason: default package */
/* loaded from: classes.dex */
public class lr2 implements yl9 {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public lr2() {
        this(2500, 1, 1.0f);
    }

    @Override // defpackage.yl9
    public int a() {
        return this.b;
    }

    @Override // defpackage.yl9
    public void b(VolleyError volleyError) throws VolleyError {
        this.b++;
        int i = this.a;
        this.a = i + ((int) (i * this.d));
        if (d()) {
            return;
        }
        throw volleyError;
    }

    @Override // defpackage.yl9
    public int c() {
        return this.a;
    }

    protected boolean d() {
        if (this.b <= this.c) {
            return true;
        }
        return false;
    }

    public lr2(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }
}
