package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.fe5;
import java.util.Map;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lrq6;", "K", "V", "Lo66;", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Liz7;", c.a, "Liz7;", "parentIterator", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "value", Action.KEY_ATTRIBUTE, "<init>", "(Liz7;Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rq6  reason: default package */
/* loaded from: classes.dex */
public final class rq6<K, V> extends o66<K, V> implements Map.Entry<K, V>, fe5.a {
    private final iz7<K, V> c;
    private V d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq6(iz7<K, V> iz7Var, K k, V v) {
        super(k, v);
        z65.h(iz7Var, "parentIterator");
        this.c = iz7Var;
        this.d = v;
    }

    public void b(V v) {
        this.d = v;
    }

    @Override // defpackage.o66, java.util.Map.Entry
    public V getValue() {
        return this.d;
    }

    @Override // defpackage.o66, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        b(v);
        this.c.c(getKey(), v);
        return value;
    }
}
