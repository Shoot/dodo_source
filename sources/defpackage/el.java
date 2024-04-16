package defpackage;

import defpackage.bl;
import defpackage.q81;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnnotatedCreatorCollector.java */
/* renamed from: el  reason: default package */
/* loaded from: classes2.dex */
public final class el extends tc1 {
    private final znb d;
    private final boolean e;
    private dl f;

    el(ql qlVar, znb znbVar, boolean z) {
        super(qlVar);
        this.d = znbVar;
        this.e = z;
    }

    private List<dl> i(y85 y85Var, Class<?> cls) {
        q81.a aVar;
        ArrayList arrayList;
        int i;
        List<dl> list;
        q81.a[] x;
        q81.a[] x2;
        if (!y85Var.Q()) {
            aVar = null;
            arrayList = null;
            for (q81.a aVar2 : q81.x(y85Var.u())) {
                if (t(aVar2.a())) {
                    if (aVar2.d() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        } else {
            aVar = null;
            arrayList = null;
        }
        if (arrayList == null) {
            list = Collections.emptyList();
            if (aVar == null) {
                return list;
            }
            i = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
            }
            i = size;
            list = arrayList2;
        }
        if (cls != null) {
            rc6[] rc6VarArr = null;
            for (q81.a aVar3 : q81.x(cls)) {
                if (aVar3.d() == 0) {
                    if (aVar != null) {
                        this.f = q(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (rc6VarArr == null) {
                        rc6VarArr = new rc6[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            rc6VarArr[i3] = new rc6(((q81.a) arrayList.get(i3)).a());
                        }
                    }
                    rc6 rc6Var = new rc6(aVar3.a());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i) {
                            break;
                        } else if (rc6Var.equals(rc6VarArr[i4])) {
                            list.set(i4, s((q81.a) arrayList.get(i4), aVar3));
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        if (aVar != null) {
            this.f = q(aVar, null);
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (list.get(i5) == null) {
                list.set(i5, s((q81.a) arrayList.get(i5), null));
            }
        }
        return list;
    }

    private List<il> j(rnb rnbVar, y85 y85Var, Class<?> cls) {
        Method[] w;
        Method[] declaredMethods;
        ArrayList arrayList = null;
        for (Method method : q81.w(y85Var.u())) {
            if (k(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        znb znbVar = this.d;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            rc6[] rc6VarArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (k(method2)) {
                    if (rc6VarArr == null) {
                        rc6VarArr = new rc6[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            rc6VarArr[i2] = new rc6((Method) arrayList.get(i2));
                        }
                    }
                    rc6 rc6Var = new rc6(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (rc6Var.equals(rc6VarArr[i3])) {
                            arrayList2.set(i3, r((Method) arrayList.get(i3), znbVar, method2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((il) arrayList2.get(i4)) == null) {
                Method method3 = (Method) arrayList.get(i4);
                arrayList2.set(i4, r(method3, xi6.e(method3, y85Var, rnbVar, znbVar), null));
            }
        }
        return arrayList2;
    }

    private static boolean k(Method method) {
        if (Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
            return true;
        }
        return false;
    }

    private rl m(q81.a aVar, q81.a aVar2) {
        if (this.e) {
            pl e = e(aVar.b());
            if (aVar2 != null) {
                e = d(e, aVar2.b());
            }
            return e.b();
        }
        return tc1.a();
    }

    private final rl n(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        pl e = e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            e = d(e, annotatedElement2.getDeclaredAnnotations());
        }
        return e.b();
    }

    private rl[] o(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (this.e) {
            int length = annotationArr.length;
            rl[] rlVarArr = new rl[length];
            for (int i = 0; i < length; i++) {
                pl d = d(pl.e(), annotationArr[i]);
                if (annotationArr2 != null) {
                    d = d(d, annotationArr2[i]);
                }
                rlVarArr[i] = d.b();
            }
            return rlVarArr;
        }
        return tc1.b;
    }

    public static bl.a p(ql qlVar, rnb rnbVar, znb znbVar, y85 y85Var, Class<?> cls, boolean z) {
        boolean z2;
        if (cls != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new el(qlVar, znbVar, z | z2).l(rnbVar, y85Var, cls);
    }

    private static boolean t(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    bl.a l(rnb rnbVar, y85 y85Var, Class<?> cls) {
        List<dl> i = i(y85Var, cls);
        List<il> j = j(rnbVar, y85Var, cls);
        if (this.e) {
            dl dlVar = this.f;
            if (dlVar != null && this.a.O0(dlVar)) {
                this.f = null;
            }
            int size = i.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this.a.O0(i.get(size))) {
                    i.remove(size);
                }
            }
            int size2 = j.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this.a.O0(j.get(size2))) {
                    j.remove(size2);
                }
            }
        }
        return new bl.a(this.f, i, j);
    }

    protected dl q(q81.a aVar, q81.a aVar2) {
        return new dl(this.d, aVar.a(), m(aVar, aVar2), tc1.b);
    }

    protected il r(Method method, znb znbVar, Method method2) {
        Annotation[][] parameterAnnotations;
        int length = method.getParameterTypes().length;
        if (this.a == null) {
            return new il(znbVar, method, tc1.a(), tc1.b(length));
        }
        if (length == 0) {
            return new il(znbVar, method, n(method, method2), tc1.b);
        }
        rl n = n(method, method2);
        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
        if (method2 == null) {
            parameterAnnotations = null;
        } else {
            parameterAnnotations = method2.getParameterAnnotations();
        }
        return new il(znbVar, method, n, o(parameterAnnotations2, parameterAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.dl s(defpackage.q81.a r9, defpackage.q81.a r10) {
        /*
            r8 = this;
            int r0 = r9.d()
            ql r1 = r8.a
            if (r1 != 0) goto L1c
            dl r10 = new dl
            znb r1 = r8.d
            java.lang.reflect.Constructor r9 = r9.a()
            rl r2 = defpackage.tc1.a()
            rl[] r0 = defpackage.tc1.b(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L1c:
            if (r0 != 0) goto L30
            dl r0 = new dl
            znb r1 = r8.d
            java.lang.reflect.Constructor r2 = r9.a()
            rl r9 = r8.m(r9, r10)
            rl[] r10 = defpackage.tc1.b
            r0.<init>(r1, r2, r9, r10)
            return r0
        L30:
            java.lang.annotation.Annotation[][] r1 = r9.e()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L9b
            java.lang.Class r2 = r9.c()
            boolean r4 = defpackage.q81.H(r2)
            r5 = 1
            r6 = 0
            r7 = 2
            if (r4 == 0) goto L57
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L57
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r6, r2, r7, r4)
            rl[] r3 = r8.o(r2, r3)
        L55:
            r1 = r2
            goto L72
        L57:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L72
            int r2 = r1.length
            int r2 = r2 + r5
            if (r0 != r2) goto L72
            int r2 = r1.length
            int r2 = r2 + r5
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r6, r2, r5, r4)
            java.lang.annotation.Annotation[] r1 = defpackage.tc1.c
            r2[r6] = r1
            rl[] r3 = r8.o(r2, r3)
            goto L55
        L72:
            if (r3 == 0) goto L75
            goto La6
        L75:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r9 = r9.c()
            java.lang.String r9 = r9.getName()
            r2[r6] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r5] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L9b:
            if (r10 != 0) goto L9e
            goto La2
        L9e:
            java.lang.annotation.Annotation[][] r3 = r10.e()
        La2:
            rl[] r3 = r8.o(r1, r3)
        La6:
            dl r0 = new dl
            znb r1 = r8.d
            java.lang.reflect.Constructor r2 = r9.a()
            rl r9 = r8.m(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el.s(q81$a, q81$a):dl");
    }
}
