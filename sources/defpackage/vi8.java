package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bumptech.glide.h;
/* compiled from: PreloadTarget.java */
/* renamed from: vi8  reason: default package */
/* loaded from: classes.dex */
public final class vi8<Z> extends k42<Z> {
    private static final Handler e = new Handler(Looper.getMainLooper(), new a());
    private final h d;

    /* compiled from: PreloadTarget.java */
    /* renamed from: vi8$a */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((vi8) message.obj).e();
                return true;
            }
            return false;
        }
    }

    private vi8(h hVar, int i, int i2) {
        super(i, i2);
        this.d = hVar;
    }

    public static <Z> vi8<Z> f(h hVar, int i, int i2) {
        return new vi8<>(hVar, i, i2);
    }

    @Override // defpackage.n6b
    public void d(@NonNull Z z, dlb<? super Z> dlbVar) {
        ii9 h = h();
        if (h != null && h.g()) {
            e.obtainMessage(1, this).sendToTarget();
        }
    }

    void e() {
        this.d.m(this);
    }

    @Override // defpackage.n6b
    public void i(Drawable drawable) {
    }
}
