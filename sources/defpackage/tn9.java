package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import defpackage.un9;
import kotlin.Metadata;
/* compiled from: Room.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0013"}, d2 = {"Ltn9;", "", "T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Lun9;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lun9$a;", c.a, Action.NAME_ATTRIBUTE, "a", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: tn9  reason: default package */
/* loaded from: classes.dex */
public final class tn9 {
    public static final tn9 a = new tn9();

    private tn9() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends defpackage.un9> defpackage.un9.a<T> a(android.content.Context r2, java.lang.Class<T> r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            defpackage.z65.h(r2, r0)
            java.lang.String r0 = "klass"
            defpackage.z65.h(r3, r0)
            r0 = 1
            if (r4 == 0) goto L16
            boolean r1 = defpackage.c0b.y(r4)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            r0 = r0 ^ r1
            if (r0 == 0) goto L20
            un9$a r0 = new un9$a
            r0.<init>(r2, r3, r4)
            return r0
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn9.a(android.content.Context, java.lang.Class, java.lang.String):un9$a");
    }

    public static final <T, C> T b(Class<C> cls, String str) {
        String E;
        String str2;
        z65.h(cls, "klass");
        z65.h(str, "suffix");
        Package r1 = cls.getPackage();
        z65.e(r1);
        String name = r1.getName();
        String canonicalName = cls.getCanonicalName();
        z65.e(canonicalName);
        z65.g(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            z65.g(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        StringBuilder sb = new StringBuilder();
        E = l0b.E(str3, CoreConstants.DOT, '_', false, 4, null);
        sb.append(E);
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (name.length() == 0) {
                str2 = sb2;
            } else {
                str2 = name + CoreConstants.DOT + sb2;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            z65.f(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + sb2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final <T extends un9> un9.a<T> c(Context context, Class<T> cls) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(cls, "klass");
        return new un9.a<>(context, cls, null);
    }
}
