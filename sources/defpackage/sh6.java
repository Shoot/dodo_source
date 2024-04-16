package defpackage;

import android.annotation.TargetApi;
import android.graphics.Path;
import defpackage.rh6;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* renamed from: sh6  reason: default package */
/* loaded from: classes.dex */
public class sh6 implements qr7, ji4 {
    private final String d;
    private final rh6 f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<qr7> e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* renamed from: sh6$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rh6.a.values().length];
            a = iArr;
            try {
                iArr[rh6.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[rh6.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[rh6.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[rh6.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[rh6.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public sh6(rh6 rh6Var) {
        this.d = rh6Var.c();
        this.f = rh6Var;
    }

    private void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).getPath());
        }
    }

    @TargetApi(19)
    private void f(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            qr7 qr7Var = this.e.get(size);
            if (qr7Var instanceof jt1) {
                jt1 jt1Var = (jt1) qr7Var;
                List<qr7> j = jt1Var.j();
                for (int size2 = j.size() - 1; size2 >= 0; size2--) {
                    Path path = j.get(size2).getPath();
                    path.transform(jt1Var.k());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(qr7Var.getPath());
            }
        }
        qr7 qr7Var2 = this.e.get(0);
        if (qr7Var2 instanceof jt1) {
            jt1 jt1Var2 = (jt1) qr7Var2;
            List<qr7> j2 = jt1Var2.j();
            for (int i = 0; i < j2.size(); i++) {
                Path path2 = j2.get(i).getPath();
                path2.transform(jt1Var2.k());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(qr7Var2.getPath());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b(list, list2);
        }
    }

    @Override // defpackage.ji4
    public void e(ListIterator<dt1> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            dt1 previous = listIterator.previous();
            if (previous instanceof qr7) {
                this.e.add((qr7) previous);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.qr7
    public Path getPath() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            f(Path.Op.XOR);
                        }
                    } else {
                        f(Path.Op.INTERSECT);
                    }
                } else {
                    f(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                f(Path.Op.UNION);
            }
        } else {
            a();
        }
        return this.c;
    }
}
