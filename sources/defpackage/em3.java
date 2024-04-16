package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lem3;", "Lkx1;", "Ljava/io/Closeable;", "<init>", "()V", c.a, "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: em3  reason: default package */
/* loaded from: classes3.dex */
public abstract class em3 extends kx1 implements Closeable {
    public static final a c = new a(null);

    /* compiled from: Executors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lem3$a;", "Lkotlin/coroutines/b;", "Lkx1;", "Lem3;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: em3$a */
    /* loaded from: classes3.dex */
    public static final class a extends b<kx1, em3> {

        /* compiled from: Executors.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "Lem3;", "a", "(Lkotlin/coroutines/CoroutineContext$Element;)Lem3;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: em3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0306a extends ej5 implements Function1<CoroutineContext.Element, em3> {
            public static final C0306a a = new C0306a();

            C0306a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final em3 invoke(CoroutineContext.Element element) {
                if (element instanceof em3) {
                    return (em3) element;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(kx1.b, C0306a.a);
        }
    }
}
