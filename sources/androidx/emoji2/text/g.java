package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
/* compiled from: EmojiMetadata.java */
/* loaded from: classes.dex */
public class g {
    private static final ThreadLocal<qi6> d = new ThreadLocal<>();
    private final int a;
    @NonNull
    private final l b;
    private volatile int c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(@NonNull l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    private qi6 g() {
        ThreadLocal<qi6> threadLocal = d;
        qi6 qi6Var = threadLocal.get();
        if (qi6Var == null) {
            qi6Var = new qi6();
            threadLocal.set(qi6Var);
        }
        this.b.d().j(qi6Var, this.a);
        return qi6Var;
    }

    public void a(@NonNull Canvas canvas, float f, float f2, @NonNull Paint paint) {
        Typeface g = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
