package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ObservableProperty.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0011\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, d2 = {"La67;", "V", "Ll79;", "", "Lje5;", "property", "oldValue", "newValue", "", DateTokenConverter.CONVERTER_KEY, "(Lje5;Ljava/lang/Object;Ljava/lang/Object;)Z", "", c.a, "(Lje5;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;Lje5;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lje5;Ljava/lang/Object;)V", "", "toString", "Ljava/lang/Object;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: a67  reason: default package */
/* loaded from: classes3.dex */
public abstract class a67<V> implements l79<Object, V> {
    private V a;

    public a67(V v) {
        this.a = v;
    }

    @Override // defpackage.l79, defpackage.k79
    public V a(Object obj, je5<?> je5Var) {
        z65.h(je5Var, "property");
        return this.a;
    }

    @Override // defpackage.l79
    public void b(Object obj, je5<?> je5Var, V v) {
        z65.h(je5Var, "property");
        V v2 = this.a;
        if (!d(je5Var, v2, v)) {
            return;
        }
        this.a = v;
        c(je5Var, v2, v);
    }

    protected abstract void c(je5<?> je5Var, V v, V v2);

    protected boolean d(je5<?> je5Var, V v, V v2) {
        z65.h(je5Var, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
