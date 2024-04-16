package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: NestedScrollingParentHelper.java */
/* renamed from: pv6  reason: default package */
/* loaded from: classes.dex */
public class pv6 {
    private int a;
    private int b;

    public pv6(@NonNull ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.b;
    }

    public void b(@NonNull View view, @NonNull View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(@NonNull View view, @NonNull View view2, int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public void d(@NonNull View view) {
        e(view, 0);
    }

    public void e(@NonNull View view, int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
