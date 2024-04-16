package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetsJVM.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\t\u001a\u00020\bH\u0001\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¨\u0006\r"}, d2 = {"T", "element", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "b", "", "capacity", c.a, "builder", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/SetsKt")
/* renamed from: rfa  reason: default package */
/* loaded from: classes3.dex */
public class rfa {
    public static <E> Set<E> a(Set<E> set) {
        z65.h(set, "builder");
        return ((hfa) set).k();
    }

    public static <E> Set<E> b() {
        return new hfa();
    }

    public static <E> Set<E> c(int i) {
        return new hfa(i);
    }

    public static <T> Set<T> d(T t) {
        Set<T> singleton = Collections.singleton(t);
        z65.g(singleton, "singleton(...)");
        return singleton;
    }
}
