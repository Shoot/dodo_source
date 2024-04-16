package defpackage;

import io.realm.k0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: RealmEntityRelationFinder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lj89;", "Lgj3;", "Lo89;", "entity", "", "b", "Lyi3;", "a", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: j89  reason: default package */
/* loaded from: classes2.dex */
public final class j89 implements gj3 {
    public static final j89 a = new j89();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmEntityRelationFinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Ljava/lang/reflect/Field;", "Lo89;", "entity", "", "<no name provided>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: j89$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function2<Field, o89, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(Field field, o89 o89Var) {
            z65.h(field, "<this>");
            z65.h(o89Var, "entity");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(o89Var);
        }
    }

    private j89() {
    }

    private final Collection<o89> b(o89 o89Var) {
        Class<?> cls;
        Field[] declaredFields;
        ArrayList arrayList = new ArrayList();
        if (o89Var instanceof r89) {
            cls = o89Var.getClass().getSuperclass();
        } else {
            cls = o89Var.getClass();
        }
        if (cls == null) {
            declaredFields = null;
        } else {
            declaredFields = cls.getDeclaredFields();
        }
        a aVar = a.a;
        if (declaredFields != null) {
            for (Field field : declaredFields) {
                if (o89.class.isAssignableFrom(field.getType())) {
                    z65.g(field, "field");
                    Object invoke = aVar.invoke(field, o89Var);
                    if (invoke != null && (invoke instanceof o89)) {
                        arrayList.add(invoke);
                        arrayList.addAll(a.b((o89) invoke));
                    }
                } else if (k0.class.isAssignableFrom(field.getType())) {
                    z65.g(field, "field");
                    Object invoke2 = aVar.invoke(field, o89Var);
                    if (invoke2 != null) {
                        for (Object obj : (k0) invoke2) {
                            if (obj instanceof o89) {
                                arrayList.add(obj);
                                arrayList.addAll(a.b((o89) obj));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.gj3
    public Collection<yi3> a(yi3 yi3Var) {
        int w;
        z65.h(yi3Var, "entity");
        Collection<o89> b = b((o89) yi3Var);
        w = lc1.w(b, 10);
        ArrayList arrayList = new ArrayList(w);
        for (o89 o89Var : b) {
            arrayList.add((yi3) o89Var);
        }
        return arrayList;
    }
}
