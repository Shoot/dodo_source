package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: kotlinextensions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a!\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\t\u001a\u00020\b*\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u001a!\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\"\u001d\u0010\u0013\u001a\u00020\u000e*\u0004\u0018\u00010\r8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "defaultValue", c.a, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValueProvider", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", e.a, "message", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "", "", "a", "(Ljava/lang/Object;)Lkotlin/Unit;", "getExhaustive$annotations", "(Ljava/lang/Object;)V", "exhaustive", "general"}, k = 2, mv = {1, 9, 0})
/* renamed from: mh5  reason: default package */
/* loaded from: classes.dex */
public final class mh5 {
    public static final Unit a(Object obj) {
        return Unit.a;
    }

    public static final <T> T b(T t, String str) {
        z65.h(str, "message");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(str.toString());
    }

    public static final <T> T c(T t, T t2) {
        if (t == null) {
            return t2;
        }
        return t;
    }

    public static final <T> T d(T t, Function0<? extends T> function0) {
        z65.h(function0, "defaultValueProvider");
        if (t == null) {
            return function0.invoke();
        }
        return t;
    }

    public static final String e(String str, Function0<String> function0) {
        z65.h(str, "<this>");
        z65.h(function0, "defaultValueProvider");
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return function0.invoke();
        }
        return str;
    }
}
