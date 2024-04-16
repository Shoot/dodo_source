package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* compiled from: ComponentRegistrarProcessor.java */
/* renamed from: wm1  reason: default package */
/* loaded from: classes2.dex */
public interface wm1 {
    public static final wm1 a = new wm1() { // from class: vm1
        @Override // defpackage.wm1
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<bm1<?>> a(ComponentRegistrar componentRegistrar);
}
