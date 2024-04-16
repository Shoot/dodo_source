package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.mm6;
import defpackage.uk2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MultiModelLoader.java */
/* renamed from: pp6  reason: default package */
/* loaded from: classes.dex */
class pp6<Model, Data> implements mm6<Model, Data> {
    private final List<mm6<Model, Data>> a;
    private final jf8<List<Throwable>> b;

    /* compiled from: MultiModelLoader.java */
    /* renamed from: pp6$a */
    /* loaded from: classes.dex */
    static class a<Data> implements uk2<Data>, uk2.a<Data> {
        private final List<uk2<Data>> a;
        private final jf8<List<Throwable>> b;
        private int c;
        private yj8 d;
        private uk2.a<? super Data> e;
        private List<Throwable> f;
        private boolean g;

        a(@NonNull List<uk2<Data>> list, @NonNull jf8<List<Throwable>> jf8Var) {
            this.b = jf8Var;
            eh8.c(list);
            this.a = list;
            this.c = 0;
        }

        private void g() {
            if (this.g) {
                return;
            }
            if (this.c < this.a.size() - 1) {
                this.c++;
                d(this.d, this.e);
                return;
            }
            eh8.d(this.f);
            this.e.c(new GlideException("Fetch failed", new ArrayList(this.f)));
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<Data> a() {
            return this.a.get(0).a();
        }

        @Override // defpackage.uk2
        public void b() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.b.a(list);
            }
            this.f = null;
            for (uk2<Data> uk2Var : this.a) {
                uk2Var.b();
            }
        }

        @Override // defpackage.uk2.a
        public void c(@NonNull Exception exc) {
            ((List) eh8.d(this.f)).add(exc);
            g();
        }

        @Override // defpackage.uk2
        public void cancel() {
            this.g = true;
            for (uk2<Data> uk2Var : this.a) {
                uk2Var.cancel();
            }
        }

        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super Data> aVar) {
            this.d = yj8Var;
            this.e = aVar;
            this.f = this.b.b();
            this.a.get(this.c).d(yj8Var, this);
            if (this.g) {
                cancel();
            }
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return this.a.get(0).e();
        }

        @Override // defpackage.uk2.a
        public void f(Data data) {
            if (data != null) {
                this.e.f(data);
            } else {
                g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pp6(@NonNull List<mm6<Model, Data>> list, @NonNull jf8<List<Throwable>> jf8Var) {
        this.a = list;
        this.b = jf8Var;
    }

    @Override // defpackage.mm6
    public boolean a(@NonNull Model model) {
        for (mm6<Model, Data> mm6Var : this.a) {
            if (mm6Var.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mm6
    public mm6.a<Data> b(@NonNull Model model, int i, int i2, @NonNull ac7 ac7Var) {
        mm6.a<Data> b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        se5 se5Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            mm6<Model, Data> mm6Var = this.a.get(i3);
            if (mm6Var.a(model) && (b = mm6Var.b(model, i, i2, ac7Var)) != null) {
                se5Var = b.a;
                arrayList.add(b.c);
            }
        }
        if (arrayList.isEmpty() || se5Var == null) {
            return null;
        }
        return new mm6.a<>(se5Var, new a(arrayList, this.b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
