package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.lang.reflect.Field;
import kotlin.Metadata;
/* compiled from: DebugMetadata.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Le70;", "Ljava/lang/StackTraceElement;", DateTokenConverter.CONVERTER_KEY, "(Le70;)Ljava/lang/StackTraceElement;", "Lnn2;", "b", "", c.a, "expected", "actual", "", "a", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: on2  reason: default package */
/* loaded from: classes3.dex */
public final class on2 {
    private static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    private static final nn2 b(e70 e70Var) {
        return (nn2) e70Var.getClass().getAnnotation(nn2.class);
    }

    private static final int c(e70 e70Var) {
        Integer num;
        int i;
        try {
            Field declaredField = e70Var.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(e70Var);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(e70 e70Var) {
        int i;
        String str;
        z65.h(e70Var, "<this>");
        nn2 b = b(e70Var);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(e70Var);
        if (c < 0) {
            i = -1;
        } else {
            i = b.l()[c];
        }
        String b2 = gn6.a.b(e70Var);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
