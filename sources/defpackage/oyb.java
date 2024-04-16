package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ViewBinder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Loyb;", "VH", "D", "", "view", "data", "", "position", "", "payloads", "", c.a, e.a, "b", "(Ljava/lang/Object;Ljava/lang/Object;I)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "changes", "a", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/util/List;)V", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oyb  reason: default package */
/* loaded from: classes.dex */
public abstract class oyb<VH, D> {
    public void a(VH vh, D d, int i, List<? extends Object> list) {
        z65.h(list, "changes");
    }

    public abstract void b(VH vh, D d, int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj, Object obj2, int i, List<? extends Object> list) {
        z65.h(obj, "view");
        z65.h(obj2, "data");
        z65.h(list, "payloads");
        if (!list.isEmpty()) {
            a(obj, obj2, i, list);
        } else {
            b(obj, obj2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Object obj) {
        z65.h(obj, "view");
        d(obj);
    }

    public void d(VH vh) {
    }
}
