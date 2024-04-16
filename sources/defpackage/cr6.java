package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcr6;", "T", "Lsha;", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "", "a", "(Ljava/lang/Object;)Z", "f", "Lkua;", "", c.a, "()Lkua;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: cr6  reason: default package */
/* loaded from: classes3.dex */
public interface cr6<T> extends sha<T>, pz3<T> {
    boolean a(T t);

    kua<Integer> c();

    @Override // defpackage.pz3
    Object emit(T t, cv1<? super Unit> cv1Var);

    void f();
}
