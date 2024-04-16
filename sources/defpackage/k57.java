package defpackage;

import android.os.IBinder;
import androidx.annotation.NonNull;
import defpackage.ns4;
import java.lang.reflect.Field;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: k57  reason: default package */
/* loaded from: classes2.dex */
public final class k57<T> extends ns4.a {
    private final Object a;

    private k57(Object obj) {
        this.a = obj;
    }

    @NonNull
    public static <T> T T1(@NonNull ns4 ns4Var) {
        if (ns4Var instanceof k57) {
            return (T) ((k57) ns4Var).a;
        }
        IBinder asBinder = ns4Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            gh8.j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }

    @NonNull
    public static <T> ns4 U1(@NonNull T t) {
        return new k57(t);
    }
}
