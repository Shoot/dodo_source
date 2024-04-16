package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.hcaptcha.sdk.HCaptchaException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* renamed from: u6b  reason: default package */
/* loaded from: classes.dex */
public abstract class u6b<TResult> {
    private boolean a;
    private boolean b;
    private TResult c;
    private HCaptchaException d;
    public final Handler h = new Handler(Looper.getMainLooper());
    private final List<b97<TResult>> e = new ArrayList();
    private final List<b87> f = new ArrayList();
    private final List<q87> g = new ArrayList();

    /* renamed from: u6b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b87 b87Var : u6b.this.f) {
                b87Var.rc(new HCaptchaException(gj4.TOKEN_TIMEOUT));
            }
        }
    }

    public u6b() {
        g();
    }

    private void g() {
        this.a = false;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    private void k() {
        boolean z = false;
        if (f() != null) {
            for (b97<TResult> b97Var : this.e) {
                b97Var.onSuccess(f());
                z = true;
            }
        }
        if (e() != null) {
            for (b87 b87Var : this.f) {
                b87Var.rc(e());
                z = true;
            }
        }
        if (z) {
            g();
        }
    }

    public u6b<TResult> b(@NonNull b87 b87Var) {
        this.f.add(b87Var);
        k();
        return this;
    }

    public u6b<TResult> c(@NonNull b97<TResult> b97Var) {
        this.e.add(b97Var);
        k();
        return this;
    }

    public void d() {
        for (q87 q87Var : this.g) {
            q87Var.g9();
        }
    }

    public HCaptchaException e() {
        return this.d;
    }

    public TResult f() {
        return this.c;
    }

    public void h(long j) {
        this.h.postDelayed(new a(), TimeUnit.SECONDS.toMillis(j));
    }

    public void i(@NonNull HCaptchaException hCaptchaException) {
        this.d = hCaptchaException;
        this.b = false;
        this.a = true;
        k();
    }

    public void j(TResult tresult) {
        this.c = tresult;
        this.b = true;
        this.a = true;
        k();
    }
}
