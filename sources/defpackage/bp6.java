package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MotionSpec.java */
/* renamed from: bp6  reason: default package */
/* loaded from: classes2.dex */
public class bp6 {
    private final wka<String, cp6> a = new wka<>();
    private final wka<String, PropertyValuesHolder[]> b = new wka<>();

    private static void a(@NonNull bp6 bp6Var, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            bp6Var.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            bp6Var.i(objectAnimator.getPropertyName(), cp6.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static bp6 b(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return c(context, resourceId);
        }
        return null;
    }

    public static bp6 c(@NonNull Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @NonNull
    private static bp6 d(@NonNull List<Animator> list) {
        bp6 bp6Var = new bp6();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(bp6Var, list.get(i));
        }
        return bp6Var;
    }

    public cp6 e(String str) {
        if (g(str)) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp6)) {
            return false;
        }
        return this.a.equals(((bp6) obj).a);
    }

    public long f() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            cp6 o = this.a.o(i);
            j = Math.max(j, o.c() + o.d());
        }
        return j;
    }

    public boolean g(String str) {
        if (this.a.get(str) != null) {
            return true;
        }
        return false;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, cp6 cp6Var) {
        this.a.put(str, cp6Var);
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
