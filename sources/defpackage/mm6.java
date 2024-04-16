package defpackage;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
/* compiled from: ModelLoader.java */
/* renamed from: mm6  reason: default package */
/* loaded from: classes.dex */
public interface mm6<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* renamed from: mm6$a */
    /* loaded from: classes.dex */
    public static class a<Data> {
        public final se5 a;
        public final List<se5> b;
        public final uk2<Data> c;

        public a(@NonNull se5 se5Var, @NonNull uk2<Data> uk2Var) {
            this(se5Var, Collections.emptyList(), uk2Var);
        }

        public a(@NonNull se5 se5Var, @NonNull List<se5> list, @NonNull uk2<Data> uk2Var) {
            this.a = (se5) eh8.d(se5Var);
            this.b = (List) eh8.d(list);
            this.c = (uk2) eh8.d(uk2Var);
        }
    }

    boolean a(@NonNull Model model);

    a<Data> b(@NonNull Model model, int i, int i2, @NonNull ac7 ac7Var);
}
