package defpackage;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: Scene.java */
/* renamed from: lv9  reason: default package */
/* loaded from: classes.dex */
public class lv9 {
    private ViewGroup a;
    private Runnable b;

    public static lv9 b(@NonNull ViewGroup viewGroup) {
        return (lv9) viewGroup.getTag(rx8.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@NonNull ViewGroup viewGroup, lv9 lv9Var) {
        viewGroup.setTag(rx8.transition_current_scene, lv9Var);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) == this && (runnable = this.b) != null) {
            runnable.run();
        }
    }
}
