package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: TextDrawableHelper.java */
/* renamed from: tab  reason: default package */
/* loaded from: classes2.dex */
public class tab {
    private float c;
    private fab f;
    private final TextPaint a = new TextPaint(1);
    private final hab b = new a();
    private boolean d = true;
    private WeakReference<b> e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: tab$a */
    /* loaded from: classes2.dex */
    class a extends hab {
        a() {
        }

        @Override // defpackage.hab
        public void a(int i) {
            tab.this.d = true;
            b bVar = (b) tab.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.hab
        public void b(@NonNull Typeface typeface, boolean z) {
            if (!z) {
                tab.this.d = true;
                b bVar = (b) tab.this.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: tab$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public tab(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public fab d() {
        return this.f;
    }

    @NonNull
    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float c = c(str);
        this.c = c;
        this.d = false;
        return c;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(fab fabVar, Context context) {
        if (this.f != fabVar) {
            this.f = fabVar;
            if (fabVar != null) {
                fabVar.o(context, this.a, this.b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                fabVar.n(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.n(context, this.a, this.b);
    }
}
