package com.dodopizza.android.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dodopizza.android.view.custom.InfoMessage;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class InfoMessage extends FrameLayout {
    private final Context a;
    private TextView b;
    private boolean c;
    private List<b> d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        String a;
        int b;
        int c;

        public b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b || this.c != bVar.c) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
        }
    }

    public InfoMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        this.a = context;
        f();
    }

    private Animation e(int i) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(translateAnimation);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.a, kv8.anim_nothing);
        loadAnimation.setDuration(i);
        loadAnimation.setStartOffset(translateAnimation.getDuration());
        animationSet.addAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.a, kv8.anim_info_message_fade_out);
        loadAnimation2.setStartOffset(translateAnimation.getDuration() + loadAnimation.getDuration());
        animationSet.addAnimation(loadAnimation2);
        return animationSet;
    }

    private void f() {
        if (isInEditMode()) {
            getTextView();
            this.b.setVisibility(0);
            setVisibility(0);
            this.b.setText("Lorem");
            return;
        }
        setVisibility(8);
        this.d = new ArrayList();
    }

    private void g(int i) {
        setVisibility(0);
        Animation e = e(i);
        e.setAnimationListener(new a());
        startAnimation(e);
    }

    private TextView getTextView() {
        if (this.b == null) {
            this.b = (TextView) View.inflate(this.a, sz8.info_message_view, this).findViewById(vx8.info_alert_message);
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(b bVar) {
        if (bVar.c == 2) {
            setBackgroundColor(iu1.c(this.a, jw8.l));
        }
        if (bVar.c == 1) {
            setBackgroundColor(iu1.c(this.a, jw8.i));
        }
        if (bVar.c == 3) {
            setBackgroundColor(iu1.c(this.a, jw8.j));
        }
        getTextView().setText(bVar.a);
        g(bVar.b);
    }

    public void h(int i, int i2) {
        i(this.a.getString(i), i2);
    }

    public void i(String str, int i) {
        if (str.isEmpty()) {
            return;
        }
        b bVar = new b(str, i, 2);
        this.d.add(bVar);
        if (this.c) {
            this.c = false;
            l(bVar);
        }
    }

    public void j(int i, int i2) {
        k(this.a.getString(i), i2);
    }

    public void k(String str, int i) {
        if (str.isEmpty()) {
            return;
        }
        b bVar = new b(str, i, 3);
        if (!this.d.contains(bVar)) {
            this.d.add(bVar);
        }
        if (this.c) {
            this.c = false;
            l(bVar);
        }
    }

    public void m(int i, int i2) {
        n(this.a.getString(i), i2);
    }

    public void n(String str, int i) {
        if (str.isEmpty()) {
            return;
        }
        b bVar = new b(str, i, 1);
        if (!this.d.contains(bVar)) {
            this.d.add(bVar);
        }
        if (this.c) {
            this.c = false;
            l(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(b bVar) {
            InfoMessage.this.l(bVar);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InfoMessage.this.c = true;
            InfoMessage.this.d.remove(0);
            InfoMessage.this.setVisibility(8);
            if (!InfoMessage.this.d.isEmpty()) {
                final b bVar = (b) InfoMessage.this.d.get(0);
                InfoMessage.this.b.post(new Runnable() { // from class: com.dodopizza.android.view.custom.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InfoMessage.a.this.b(bVar);
                    }
                });
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
