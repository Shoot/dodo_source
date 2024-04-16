package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Saver.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aT\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\"\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Lrt9;", "save", "Lkotlin/Function1;", "restore", "Lpt9;", "a", "Lpt9;", "AutoSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qt9  reason: default package */
/* loaded from: classes.dex */
public final class qt9 {
    private static final pt9<Object, Object> a = a(a.a, b.a);

    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrt9;", "", "it", "a", "(Lrt9;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qt9$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<rt9, Object, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, Object obj) {
            z65.h(rt9Var, "$this$Saver");
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: qt9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Object, Object> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            z65.h(obj, "it");
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"qt9$c", "Lpt9;", "Lrt9;", "value", "a", "(Lrt9;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: qt9$c */
    /* loaded from: classes.dex */
    public static final class c<Original, Saveable> implements pt9<Original, Saveable> {
        final /* synthetic */ Function2<rt9, Original, Saveable> a;
        final /* synthetic */ Function1<Saveable, Original> b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super rt9, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.a = function2;
            this.b = function1;
        }

        @Override // defpackage.pt9
        public Saveable a(rt9 rt9Var, Original original) {
            z65.h(rt9Var, "<this>");
            return this.a.invoke(rt9Var, original);
        }

        @Override // defpackage.pt9
        public Original b(Saveable saveable) {
            z65.h(saveable, "value");
            return this.b.invoke(saveable);
        }
    }

    public static final <Original, Saveable> pt9<Original, Saveable> a(Function2<? super rt9, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        z65.h(function2, "save");
        z65.h(function1, "restore");
        return new c(function2, function1);
    }
}
