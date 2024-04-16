package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* compiled from: AnimationUtilsCompat.java */
/* renamed from: uk  reason: default package */
/* loaded from: classes.dex */
public class uk {
    public static Interpolator a(Context context, int i) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i);
    }
}
