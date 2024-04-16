package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.a0;
/* compiled from: AppCompatSeekBar.java */
/* renamed from: pn  reason: default package */
/* loaded from: classes.dex */
public class pn extends SeekBar {
    private final qn a;

    public pn(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aw8.M);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
    }

    public pn(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a0.a(this, getContext());
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.c(attributeSet, i);
    }
}
