package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DatabaseConnector.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J)\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ldm2;", "C", "", "", "b", "T", "Lkotlin/Function1;", "action", c.a, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "isConnected", "()Z", "a", "()Ljava/lang/Object;", "connection", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: dm2  reason: default package */
/* loaded from: classes2.dex */
public interface dm2<C> {
    C a();

    void b();

    <T> T c(Function1<? super C, ? extends T> function1);

    boolean isConnected();
}
