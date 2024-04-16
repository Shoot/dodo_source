package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CompoundTrimPathContent.java */
/* renamed from: to1  reason: default package */
/* loaded from: classes.dex */
public class to1 {
    private final List<bnb> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(bnb bnbVar) {
        this.a.add(bnbVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            fvb.b(path, this.a.get(size));
        }
    }
}
