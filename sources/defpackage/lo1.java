package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H!¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\n\u0082\u0001\u0001\u0012¨\u0006\u0013"}, d2 = {"Llo1;", "T", "", "value", "Lcua;", "b", "(Ljava/lang/Object;Lqn1;I)Lcua;", "Lgo5;", "a", "Lgo5;", "()Lgo5;", "getDefaultValueHolder$runtime_release$annotations", "()V", "defaultValueHolder", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lxr8;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lo1  reason: default package */
/* loaded from: classes.dex */
public abstract class lo1<T> {
    private final go5<T> a;

    public /* synthetic */ lo1(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public final go5<T> a() {
        return this.a;
    }

    public abstract cua<T> b(T t, qn1 qn1Var, int i);

    private lo1(Function0<? extends T> function0) {
        this.a = new go5<>(function0);
    }
}
