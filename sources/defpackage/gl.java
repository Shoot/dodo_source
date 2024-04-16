package defpackage;

import defpackage.j81;
import defpackage.znb;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotatedFieldCollector.java */
/* renamed from: gl  reason: default package */
/* loaded from: classes2.dex */
public class gl extends tc1 {
    private final rnb d;
    private final j81.a e;
    private final boolean f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnnotatedFieldCollector.java */
    /* renamed from: gl$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final znb a;
        public final Field b;
        public pl c = pl.e();

        public a(znb znbVar, Field field) {
            this.a = znbVar;
            this.b = field;
        }

        public fl a() {
            return new fl(this.a, this.b, this.c.b());
        }
    }

    gl(ql qlVar, rnb rnbVar, j81.a aVar, boolean z) {
        super(qlVar);
        this.d = rnbVar;
        this.e = qlVar == null ? null : aVar;
        this.f = z;
    }

    private void i(Class<?> cls, Class<?> cls2, Map<String, a> map) {
        Field[] declaredFields;
        a aVar;
        for (Class<?> cls3 : q81.v(cls, cls2, true)) {
            for (Field field : cls3.getDeclaredFields()) {
                if (k(field) && (aVar = map.get(field.getName())) != null) {
                    aVar.c = d(aVar.c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    private Map<String, a> j(znb znbVar, y85 y85Var, Map<String, a> map) {
        Field[] declaredFields;
        j81.a aVar;
        Class<?> a2;
        y85 x = y85Var.x();
        if (x == null) {
            return map;
        }
        Class<?> u = y85Var.u();
        Map<String, a> j = j(new znb.a(this.d, x.l()), x, map);
        for (Field field : u.getDeclaredFields()) {
            if (k(field)) {
                if (j == null) {
                    j = new LinkedHashMap<>();
                }
                a aVar2 = new a(znbVar, field);
                if (this.f) {
                    aVar2.c = d(aVar2.c, field.getDeclaredAnnotations());
                }
                j.put(field.getName(), aVar2);
            }
        }
        if (j != null && (aVar = this.e) != null && (a2 = aVar.a(u)) != null) {
            i(a2, u, j);
        }
        return j;
    }

    private boolean k(Field field) {
        if (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) {
            return false;
        }
        return true;
    }

    public static List<fl> m(ql qlVar, znb znbVar, j81.a aVar, rnb rnbVar, y85 y85Var, boolean z) {
        return new gl(qlVar, rnbVar, aVar, z).l(znbVar, y85Var);
    }

    List<fl> l(znb znbVar, y85 y85Var) {
        Map<String, a> j = j(znbVar, y85Var, null);
        if (j == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(j.size());
        for (a aVar : j.values()) {
            arrayList.add(aVar.a());
        }
        return arrayList;
    }
}
