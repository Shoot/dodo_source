package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Try.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0006\n\bB\t\b\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0006\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lfnb;", "T", "", "Lkotlin/Function1;", "", "action", "a", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", com.huawei.hms.opendevice.c.a, "()Ljava/lang/Object;", "b", "<init>", "()V", "Lfnb$b;", "Lfnb$c;", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fnb  reason: default package */
/* loaded from: classes4.dex */
public abstract class fnb<T> {
    public static final a a = new a(null);

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\u0002¨\u0006\t"}, d2 = {"Lfnb$a;", "", "T", "Lkotlin/Function0;", "func", "Lfnb;", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fnb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> fnb<T> a(Function0<? extends T> function0) {
            z65.h(function0, "func");
            try {
                return new c(function0.invoke());
            } catch (Throwable th) {
                return new b(th);
            }
        }
    }

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lfnb$b;", "T", "Lfnb;", "", "b", "Ljava/lang/Throwable;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fnb$b */
    /* loaded from: classes4.dex */
    public static final class b<T> extends fnb<T> {
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(null);
            z65.h(th, "throwable");
            this.b = th;
        }

        public final Throwable d() {
            return this.b;
        }
    }

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lfnb$c;", "T", "Lfnb;", "b", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fnb$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends fnb<T> {
        private final T b;

        public c(T t) {
            super(null);
            this.b = t;
        }

        public final T d() {
            return this.b;
        }
    }

    private fnb() {
    }

    public /* synthetic */ fnb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final T a(Function1<? super Throwable, ? extends T> function1) {
        z65.h(function1, "action");
        if (this instanceof c) {
            return (T) ((c) this).d();
        }
        if (this instanceof b) {
            return function1.invoke(((b) this).d());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final T b() {
        if (this instanceof c) {
            return (T) ((c) this).d();
        }
        if (this instanceof b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final T c() {
        if (this instanceof c) {
            return (T) ((c) this).d();
        }
        if (this instanceof b) {
            throw ((b) this).d();
        }
        throw new NoWhenBranchMatchedException();
    }
}
