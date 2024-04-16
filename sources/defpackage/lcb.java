package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Map;
/* compiled from: TextScale.java */
/* renamed from: lcb  reason: default package */
/* loaded from: classes2.dex */
public class lcb extends clb {

    /* compiled from: TextScale.java */
    /* renamed from: lcb$a */
    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextView a;

        a(TextView textView) {
            this.a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.setScaleX(floatValue);
            this.a.setScaleY(floatValue);
        }
    }

    private void h0(@NonNull mlb mlbVar) {
        View view = mlbVar.b;
        if (view instanceof TextView) {
            mlbVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.clb
    public void g(@NonNull mlb mlbVar) {
        h0(mlbVar);
    }

    @Override // defpackage.clb
    public void j(@NonNull mlb mlbVar) {
        h0(mlbVar);
    }

    @Override // defpackage.clb
    public Animator o(@NonNull ViewGroup viewGroup, mlb mlbVar, mlb mlbVar2) {
        float f;
        if (mlbVar == null || mlbVar2 == null || !(mlbVar.b instanceof TextView)) {
            return null;
        }
        View view = mlbVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = mlbVar.a;
        Map<String, Object> map2 = mlbVar2.a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
