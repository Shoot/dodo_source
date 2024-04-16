package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\f"}, d2 = {"Lxr8;", "T", "Llo1;", "value", "Lzr8;", c.a, "(Ljava/lang/Object;)Lzr8;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xr8  reason: default package */
/* loaded from: classes.dex */
public abstract class xr8<T> extends lo1<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr8(Function0<? extends T> function0) {
        super(function0, null);
        z65.h(function0, "defaultFactory");
    }

    public final zr8<T> c(T t) {
        return new zr8<>(this, t, true);
    }

    public final zr8<T> d(T t) {
        return new zr8<>(this, t, false);
    }
}
