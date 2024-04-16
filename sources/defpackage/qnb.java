package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: TypeBindings.java */
/* renamed from: qnb  reason: default package */
/* loaded from: classes2.dex */
public class qnb implements Serializable {
    private static final String[] e;
    private static final y85[] f;
    private static final qnb g;
    private final String[] a;
    private final y85[] b;
    private final String[] c;
    private final int d;

    /* compiled from: TypeBindings.java */
    /* renamed from: qnb$a */
    /* loaded from: classes2.dex */
    static final class a {
        private final Class<?> a;
        private final y85[] b;
        private final int c;

        public a(Class<?> cls, y85[] y85VarArr, int i) {
            this.a = cls;
            this.b = y85VarArr;
            this.c = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.c == aVar.c && this.a == aVar.a) {
                y85[] y85VarArr = aVar.b;
                int length = this.b.length;
                if (length == y85VarArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.b[i].equals(y85VarArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.c;
        }

        public String toString() {
            return this.a.getName() + "<>";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeBindings.java */
    /* renamed from: qnb$b */
    /* loaded from: classes2.dex */
    public static class b {
        private static final TypeVariable<?>[] a = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] b = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] c = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] d = List.class.getTypeParameters();
        private static final TypeVariable<?>[] e = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] f = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] g = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] h = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable<?>[] a(Class<?> cls) {
            if (cls == Collection.class) {
                return b;
            }
            if (cls == List.class) {
                return d;
            }
            if (cls == ArrayList.class) {
                return e;
            }
            if (cls == AbstractList.class) {
                return a;
            }
            if (cls == Iterable.class) {
                return c;
            }
            return cls.getTypeParameters();
        }

        public static TypeVariable<?>[] b(Class<?> cls) {
            if (cls == Map.class) {
                return f;
            }
            if (cls == HashMap.class) {
                return g;
            }
            if (cls == LinkedHashMap.class) {
                return h;
            }
            return cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        e = strArr;
        y85[] y85VarArr = new y85[0];
        f = y85VarArr;
        g = new qnb(strArr, y85VarArr, null);
    }

    private qnb(String[] strArr, y85[] y85VarArr, String[] strArr2) {
        strArr = strArr == null ? e : strArr;
        this.a = strArr;
        y85VarArr = y85VarArr == null ? f : y85VarArr;
        this.b = y85VarArr;
        if (strArr.length == y85VarArr.length) {
            int length = y85VarArr.length;
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.b[i2].hashCode();
            }
            this.c = strArr2;
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + y85VarArr.length + ")");
    }

    public static qnb b(Class<?> cls, y85 y85Var) {
        int length;
        TypeVariable<?>[] a2 = b.a(cls);
        if (a2 == null) {
            length = 0;
        } else {
            length = a2.length;
        }
        if (length == 1) {
            return new qnb(new String[]{a2[0].getName()}, new y85[]{y85Var}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static qnb c(Class<?> cls, y85 y85Var, y85 y85Var2) {
        int length;
        TypeVariable<?>[] b2 = b.b(cls);
        if (b2 == null) {
            length = 0;
        } else {
            length = b2.length;
        }
        if (length == 2) {
            return new qnb(new String[]{b2[0].getName(), b2[1].getName()}, new y85[]{y85Var, y85Var2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static qnb d(Class<?> cls, y85[] y85VarArr) {
        String[] strArr;
        String str;
        if (y85VarArr == null) {
            y85VarArr = f;
        } else {
            int length = y85VarArr.length;
            if (length != 1) {
                if (length == 2) {
                    return c(cls, y85VarArr[0], y85VarArr[1]);
                }
            } else {
                return b(cls, y85VarArr[0]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        } else {
            strArr = e;
        }
        if (strArr.length != y85VarArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(y85VarArr.length);
            sb.append(" type parameter");
            if (y85VarArr.length == 1) {
                str = "";
            } else {
                str = Image.TYPE_SMALL;
            }
            sb.append(str);
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new qnb(strArr, y85VarArr, null);
    }

    public static qnb e(List<String> list, List<y85> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            return new qnb((String[]) list.toArray(e), (y85[]) list2.toArray(f), null);
        }
        return g;
    }

    public static qnb f(Class<?> cls, y85 y85Var) {
        int length;
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
        }
        if (length == 0) {
            return g;
        }
        if (length == 1) {
            return new qnb(new String[]{typeParameters[0].getName()}, new y85[]{y85Var}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static qnb i(Class<?> cls, y85[] y85VarArr) {
        String str;
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (y85VarArr == null) {
                y85VarArr = f;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = typeParameters[i].getName();
            }
            if (length != y85VarArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create TypeBindings for class ");
                sb.append(cls.getName());
                sb.append(" with ");
                sb.append(y85VarArr.length);
                sb.append(" type parameter");
                if (y85VarArr.length == 1) {
                    str = "";
                } else {
                    str = Image.TYPE_SMALL;
                }
                sb.append(str);
                sb.append(": class expects ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            return new qnb(strArr, y85VarArr, null);
        }
        return g;
    }

    public static qnb j() {
        return g;
    }

    public Object a(Class<?> cls) {
        return new a(cls, this.b, this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!q81.E(obj, getClass())) {
            return false;
        }
        qnb qnbVar = (qnb) obj;
        int length = this.b.length;
        if (length != qnbVar.q()) {
            return false;
        }
        y85[] y85VarArr = qnbVar.b;
        for (int i = 0; i < length; i++) {
            if (!y85VarArr[i].equals(this.b[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.d;
    }

    public y85 k(String str) {
        y85 F0;
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this.a[i])) {
                y85 y85Var = this.b[i];
                if ((y85Var instanceof jj9) && (F0 = ((jj9) y85Var).F0()) != null) {
                    return F0;
                }
                return y85Var;
            }
        }
        return null;
    }

    public y85 l(int i) {
        if (i >= 0) {
            y85[] y85VarArr = this.b;
            if (i < y85VarArr.length) {
                return y85VarArr[i];
            }
            return null;
        }
        return null;
    }

    public List<y85> m() {
        y85[] y85VarArr = this.b;
        if (y85VarArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(y85VarArr);
    }

    public boolean n(String str) {
        String[] strArr = this.c;
        if (strArr != null) {
            int length = strArr.length;
            do {
                length--;
                if (length < 0) {
                    return false;
                }
            } while (!str.equals(this.c[length]));
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.b.length == 0) {
            return true;
        }
        return false;
    }

    public int q() {
        return this.b.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y85[] r() {
        return this.b;
    }

    protected Object readResolve() {
        String[] strArr = this.a;
        if (strArr != null && strArr.length != 0) {
            return this;
        }
        return g;
    }

    public qnb s(String str) {
        int length;
        String[] strArr;
        String[] strArr2 = this.c;
        if (strArr2 == null) {
            length = 0;
        } else {
            length = strArr2.length;
        }
        if (length == 0) {
            strArr = new String[1];
        } else {
            strArr = (String[]) Arrays.copyOf(strArr2, length + 1);
        }
        strArr[length] = str;
        return new qnb(this.a, this.b, strArr);
    }

    public String toString() {
        if (this.b.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
            sb.append(this.b[i].o());
        }
        sb.append('>');
        return sb.toString();
    }
}
