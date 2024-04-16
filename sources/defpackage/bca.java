package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¨\u0006\u000e"}, d2 = {"T", "", "Lkotlin/sequences/Sequence;", c.a, DateTokenConverter.CONVERTER_KEY, "", "seed", "Lkotlin/Function1;", "nextFunction", e.a, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "Lkotlin/Function0;", "seedFunction", "f", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/sequences/SequencesKt")
/* renamed from: bca  reason: default package */
/* loaded from: classes3.dex */
public class bca extends aca {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"bca$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bca$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Sequence<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bca$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends ej5 implements Function0<T> {
        final /* synthetic */ T a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T t) {
            super(0);
            this.a = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.a;
        }
    }

    public bca() {
    }

    public static <T> Sequence<T> c(Iterator<? extends T> it) {
        Sequence<T> d;
        z65.h(it, "<this>");
        d = d(new a(it));
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> d(Sequence<? extends T> sequence) {
        z65.h(sequence, "<this>");
        if (!(sequence instanceof gr1)) {
            return new gr1(sequence);
        }
        return sequence;
    }

    public static <T> Sequence<T> e(T t, Function1<? super T, ? extends T> function1) {
        z65.h(function1, "nextFunction");
        if (t == null) {
            return sg3.a;
        }
        return new id4(new b(t), function1);
    }

    public static <T> Sequence<T> f(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        z65.h(function0, "seedFunction");
        z65.h(function1, "nextFunction");
        return new id4(function0, function1);
    }
}
