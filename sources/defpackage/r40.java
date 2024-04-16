package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00108&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lr40;", "La03;", "Lmd8;", "pass", "Lkd8;", "Y", "(Lmd8;Lcv1;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lcv1;", "", "block", "y", "(JLkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Lw55;", "a", "()J", "size", "Lcna;", "J", "extendedTouchPadding", "a0", "()Lkd8;", "currentEvent", "Lxyb;", "getViewConfiguration", "()Lxyb;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: r40  reason: default package */
/* loaded from: classes.dex */
public interface r40 extends a03 {
    long J();

    Object Y(md8 md8Var, cv1<? super kd8> cv1Var);

    long a();

    kd8 a0();

    xyb getViewConfiguration();

    <T> Object y(long j, Function2<? super r40, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var);
}
