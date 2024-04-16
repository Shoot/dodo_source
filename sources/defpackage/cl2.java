package defpackage;

import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DataSet.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u001c\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\nH&J\b\u0010\u000e\u001a\u00020\rH&J6\u0010\u0012\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nH&J\"\u0010\u0013\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nH&¨\u0006\u0014"}, d2 = {"Lcl2;", "T", "", "element", "", CartQueueItemEntity.OPERATION_ADD, "(Ljava/lang/Object;)Z", "", "elements", "addAll", "Lkotlin/Function1;", "predicate", "z0", "", "r", "", "", "modification", "S", "w1", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cl2  reason: default package */
/* loaded from: classes.dex */
public interface cl2<T> extends Iterable<T>, be5 {
    void S(Function1<? super T, Boolean> function1, Function1<? super T, ? extends List<String>> function12);

    boolean add(T t);

    boolean addAll(Collection<? extends T> collection);

    void r();

    void w1(Function1<? super T, ? extends List<String>> function1);

    boolean z0(Function1<? super T, Boolean> function1);
}
