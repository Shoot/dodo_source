package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ModifierLocal.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lum6;", "T", "", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lyr8;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: um6  reason: default package */
/* loaded from: classes.dex */
public abstract class um6<T> {
    private final Function0<T> a;

    public /* synthetic */ um6(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public final Function0<T> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private um6(Function0<? extends T> function0) {
        this.a = function0;
    }
}
