package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u000ej\b\u0012\u0004\u0012\u00028\u0001`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Ly43;", "T", "K", "Lm1;", "", "b", "", c.a, "Ljava/util/Iterator;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function1;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "keySelector", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", e.a, "Ljava/util/HashSet;", "observed", "<init>", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: y43  reason: default package */
/* loaded from: classes3.dex */
final class y43<T, K> extends m1<T> {
    private final Iterator<T> c;
    private final Function1<T, K> d;
    private final HashSet<K> e;

    /* JADX WARN: Multi-variable type inference failed */
    public y43(Iterator<? extends T> it, Function1<? super T, ? extends K> function1) {
        z65.h(it, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function1, "keySelector");
        this.c = it;
        this.d = function1;
        this.e = new HashSet<>();
    }

    @Override // defpackage.m1
    protected void b() {
        while (this.c.hasNext()) {
            T next = this.c.next();
            if (this.e.add(this.d.invoke(next))) {
                e(next);
                return;
            }
        }
        c();
    }
}
