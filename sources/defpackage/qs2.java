package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.jp5;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: qs2  reason: default package */
/* loaded from: classes2.dex */
public abstract class qs2<T extends jp5> {
    private jp5 a;
    private Bundle b;
    private LinkedList c;
    private final t77 d = new lic(this);

    public static void o(@NonNull FrameLayout frameLayout) {
        a m = a.m();
        Context context = frameLayout.getContext();
        int g = m.g(context);
        String d = cjc.d(context, g);
        String c = cjc.c(context, g);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d);
        linearLayout.addView(textView);
        Intent b = m.b(context, g, null);
        if (b != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new ckc(context, b));
        }
    }

    private final void t(int i) {
        while (!this.c.isEmpty() && ((pkc) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    private final void u(Bundle bundle, pkc pkcVar) {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            pkcVar.b(jp5Var);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(pkcVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }

    protected abstract void a(@NonNull t77<T> t77Var);

    @NonNull
    public T b() {
        return (T) this.a;
    }

    protected void c(@NonNull FrameLayout frameLayout) {
        o(frameLayout);
    }

    public void d(Bundle bundle) {
        u(bundle, new djc(this, bundle));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public View e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new xjc(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    public void f() {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            jp5Var.onDestroy();
        } else {
            t(1);
        }
    }

    public void g() {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            jp5Var.u();
        } else {
            t(2);
        }
    }

    public void h(@NonNull Activity activity, @NonNull Bundle bundle, Bundle bundle2) {
        u(bundle2, new tic(this, activity, bundle, bundle2));
    }

    public void i() {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            jp5Var.onLowMemory();
        }
    }

    public void j() {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            jp5Var.onPause();
        } else {
            t(5);
        }
    }

    public void k() {
        u(null, new mkc(this));
    }

    public void l(@NonNull Bundle bundle) {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            jp5Var.p(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void m() {
        u(null, new hkc(this));
    }

    public void n() {
        jp5 jp5Var = this.a;
        if (jp5Var != null) {
            jp5Var.g();
        } else {
            t(4);
        }
    }
}
