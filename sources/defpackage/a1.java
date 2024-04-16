package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.cw0;
import defpackage.fn0;
import defpackage.lw5;
import defpackage.rv0;
import defpackage.sk9;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007*OP$Q RB)\u0012 \u0010L\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Jj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`K¢\u0006\u0004\bM\u0010NJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0016\u0010*\u001a\u00020\u00132\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(J\u0019\u0010,\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000bH\u0014J/\u00105\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\n\u00104\u001a\u0006\u0012\u0002\b\u000303H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0086\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0004J\u0010\u0010\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;H\u0014J\b\u0010<\u001a\u00020\u0013H\u0014J\b\u0010=\u001a\u00020\u0013H\u0014R\u0014\u0010@\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0014\u0010D\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0014\u0010E\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010?R \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0F8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006S"}, d2 = {"La1;", "E", "Le2;", "Lrv0;", "R", "", "receiveMode", "Y", "(ILcv1;)Ljava/lang/Object;", "Lz89;", "receive", "", "L", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "", "Lcv1;", "block", "", "Z", "(Lv5a;ILkotlin/jvm/functions/Function2;)V", "value", "b0", "(Lkotlin/jvm/functions/Function2;Lv5a;ILjava/lang/Object;)V", "N", "(Lv5a;Lkotlin/jvm/functions/Function2;I)Z", "Lfn0;", "cont", "a0", "W", "X", "f", "(Lcv1;)Ljava/lang/Object;", "M", "Lcw0;", DateTokenConverter.CONVERTER_KEY, Image.TYPE_SMALL, "()Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "a", "", "J", "(Ljava/lang/Throwable;)Z", "wasClosed", "S", "Lc35;", "Lkba;", StatisticManager.LIST, "Lba1;", "closed", "T", "(Ljava/lang/Object;Lba1;)V", "Law0;", "iterator", "La1$g;", "K", "Lb99;", "V", "U", "O", "()Z", "isBufferAlwaysEmpty", "P", "isBufferEmpty", "Q", "isClosedForReceive", "isEmptyImpl", "Ll4a;", "i", "()Ll4a;", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b", com.huawei.hms.opendevice.c.a, com.huawei.hms.push.e.a, "g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: a1  reason: default package */
/* loaded from: classes3.dex */
public abstract class a1<E> extends e2<E> implements rv0<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"La1$a;", "E", "Law0;", "", "result", "", "b", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "a", StatisticManager.NEXT, "()Ljava/lang/Object;", "La1;", "La1;", AppsFlyerProperties.CHANNEL, "Ljava/lang/Object;", "getResult", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "<init>", "(La1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$a */
    /* loaded from: classes3.dex */
    public static final class a<E> implements aw0<E> {
        public final a1<E> a;
        private Object b = b1.d;

        public a(a1<E> a1Var) {
            this.a = a1Var;
        }

        private final boolean b(Object obj) {
            if (obj instanceof ba1) {
                ba1 ba1Var = (ba1) obj;
                if (ba1Var.d == null) {
                    return false;
                }
                throw gta.a(ba1Var.Z());
            }
            return true;
        }

        private final Object c(cv1<? super Boolean> cv1Var) {
            cv1 c;
            Object d;
            Function1<Throwable, Unit> function1;
            c = b75.c(cv1Var);
            gn0 b = in0.b(c);
            d dVar = new d(this, b);
            while (true) {
                if (this.a.L(dVar)) {
                    this.a.a0(b, dVar);
                    break;
                }
                Object W = this.a.W();
                d(W);
                if (W instanceof ba1) {
                    ba1 ba1Var = (ba1) W;
                    if (ba1Var.d == null) {
                        sk9.a aVar = sk9.b;
                        b.resumeWith(sk9.b(nf0.a(false)));
                    } else {
                        sk9.a aVar2 = sk9.b;
                        b.resumeWith(sk9.b(vk9.a(ba1Var.Z())));
                    }
                } else if (W != b1.d) {
                    Boolean a = nf0.a(true);
                    Function1<E, Unit> function12 = this.a.a;
                    if (function12 != null) {
                        function1 = g97.a(function12, W, b.getContext());
                    } else {
                        function1 = null;
                    }
                    b.G(a, function1);
                }
            }
            Object s = b.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            return s;
        }

        @Override // defpackage.aw0
        public Object a(cv1<? super Boolean> cv1Var) {
            Object obj = this.b;
            r3b r3bVar = b1.d;
            if (obj != r3bVar) {
                return nf0.a(b(obj));
            }
            Object W = this.a.W();
            this.b = W;
            if (W != r3bVar) {
                return nf0.a(b(W));
            }
            return c(cv1Var);
        }

        public final void d(Object obj) {
            this.b = obj;
        }

        @Override // defpackage.aw0
        public E next() {
            E e = (E) this.b;
            if (!(e instanceof ba1)) {
                r3b r3bVar = b1.d;
                if (e != r3bVar) {
                    this.b = r3bVar;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw gta.a(((ba1) e).Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"La1$b;", "E", "Lz89;", "value", "", "U", "(Ljava/lang/Object;)Ljava/lang/Object;", "Llw5$c;", "otherOp", "Lr3b;", "l", "(Ljava/lang/Object;Llw5$c;)Lr3b;", "", "i", "(Ljava/lang/Object;)V", "Lba1;", "closed", "T", "", "toString", "Lfn0;", DateTokenConverter.CONVERTER_KEY, "Lfn0;", "cont", "", com.huawei.hms.push.e.a, "I", "receiveMode", "<init>", "(Lfn0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$b */
    /* loaded from: classes3.dex */
    public static class b<E> extends z89<E> {
        public final fn0<Object> d;
        public final int e;

        public b(fn0<Object> fn0Var, int i) {
            this.d = fn0Var;
            this.e = i;
        }

        @Override // defpackage.z89
        public void T(ba1<?> ba1Var) {
            if (this.e == 1) {
                this.d.resumeWith(sk9.b(cw0.b(cw0.b.a(ba1Var.d))));
                return;
            }
            fn0<Object> fn0Var = this.d;
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(vk9.a(ba1Var.Z())));
        }

        public final Object U(E e) {
            if (this.e == 1) {
                return cw0.b(cw0.b.c(e));
            }
            return e;
        }

        @Override // defpackage.b99
        public void i(E e) {
            this.d.x0(hn0.a);
        }

        @Override // defpackage.b99
        public r3b l(E e, lw5.c cVar) {
            lw5.a aVar;
            fn0<Object> fn0Var = this.d;
            Object U = U(e);
            if (cVar != null) {
                aVar = cVar.c;
            } else {
                aVar = null;
            }
            if (fn0Var.e0(U, aVar, S(e)) == null) {
                return null;
            }
            if (cVar != null) {
                cVar.d();
            }
            return hn0.a;
        }

        @Override // defpackage.lw5
        public String toString() {
            return "ReceiveElement@" + jo2.b(this) + "[receiveMode=" + this.e + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"La1$c;", "E", "La1$b;", "value", "Lkotlin/Function1;", "", "", "S", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "f", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lfn0;", "", "cont", "", "receiveMode", "<init>", "(Lfn0;ILkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$c */
    /* loaded from: classes3.dex */
    public static final class c<E> extends b<E> {
        public final Function1<E, Unit> f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(fn0<Object> fn0Var, int i, Function1<? super E, Unit> function1) {
            super(fn0Var, i);
            this.f = function1;
        }

        @Override // defpackage.z89
        public Function1<Throwable, Unit> S(E e) {
            return g97.a(this.f, e, this.d.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"La1$d;", "E", "Lz89;", "value", "Llw5$c;", "otherOp", "Lr3b;", "l", "(Ljava/lang/Object;Llw5$c;)Lr3b;", "", "i", "(Ljava/lang/Object;)V", "Lba1;", "closed", "T", "Lkotlin/Function1;", "", "S", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "La1$a;", DateTokenConverter.CONVERTER_KEY, "La1$a;", "iterator", "Lfn0;", "", com.huawei.hms.push.e.a, "Lfn0;", "cont", "<init>", "(La1$a;Lfn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$d */
    /* loaded from: classes3.dex */
    public static class d<E> extends z89<E> {
        public final a<E> d;
        public final fn0<Boolean> e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(a<E> aVar, fn0<? super Boolean> fn0Var) {
            this.d = aVar;
            this.e = fn0Var;
        }

        @Override // defpackage.z89
        public Function1<Throwable, Unit> S(E e) {
            Function1<E, Unit> function1 = this.d.a.a;
            if (function1 != null) {
                return g97.a(function1, e, this.e.getContext());
            }
            return null;
        }

        @Override // defpackage.z89
        public void T(ba1<?> ba1Var) {
            Object x;
            if (ba1Var.d == null) {
                x = fn0.a.b(this.e, Boolean.FALSE, null, 2, null);
            } else {
                x = this.e.x(ba1Var.Z());
            }
            if (x != null) {
                this.d.d(ba1Var);
                this.e.x0(x);
            }
        }

        @Override // defpackage.b99
        public void i(E e) {
            this.d.d(e);
            this.e.x0(hn0.a);
        }

        @Override // defpackage.b99
        public r3b l(E e, lw5.c cVar) {
            lw5.a aVar;
            fn0<Boolean> fn0Var = this.e;
            Boolean bool = Boolean.TRUE;
            if (cVar != null) {
                aVar = cVar.c;
            } else {
                aVar = null;
            }
            if (fn0Var.e0(bool, aVar, S(e)) == null) {
                return null;
            }
            if (cVar != null) {
                cVar.d();
            }
            return hn0.a;
        }

        @Override // defpackage.lw5
        public String toString() {
            return "ReceiveHasNext@" + jo2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\u0006\u0010)\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR5\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"La1$e;", "R", "E", "Lz89;", "Lf43;", "value", "Llw5$c;", "otherOp", "Lr3b;", "l", "(Ljava/lang/Object;Llw5$c;)Lr3b;", "", "i", "(Ljava/lang/Object;)V", "Lba1;", "closed", "T", "a", "Lkotlin/Function1;", "", "S", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "La1;", DateTokenConverter.CONVERTER_KEY, "La1;", AppsFlyerProperties.CHANNEL, "Lv5a;", com.huawei.hms.push.e.a, "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "", "Lcv1;", "f", "Lkotlin/jvm/functions/Function2;", "block", "", "g", "I", "receiveMode", "<init>", "(La1;Lv5a;Lkotlin/jvm/functions/Function2;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$e */
    /* loaded from: classes3.dex */
    public static final class e<R, E> extends z89<E> implements f43 {
        public final a1<E> d;
        public final v5a<R> e;
        public final Function2<Object, cv1<? super R>, Object> f;
        public final int g;

        /* JADX WARN: Multi-variable type inference failed */
        public e(a1<E> a1Var, v5a<? super R> v5aVar, Function2<Object, ? super cv1<? super R>, ? extends Object> function2, int i) {
            this.d = a1Var;
            this.e = v5aVar;
            this.f = function2;
            this.g = i;
        }

        @Override // defpackage.z89
        public Function1<Throwable, Unit> S(E e) {
            Function1<E, Unit> function1 = this.d.a;
            if (function1 != null) {
                return g97.a(function1, e, this.e.p().getContext());
            }
            return null;
        }

        @Override // defpackage.z89
        public void T(ba1<?> ba1Var) {
            if (!this.e.o()) {
                return;
            }
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    jn0.e(this.f, cw0.b(cw0.b.a(ba1Var.d)), this.e.p(), null, 4, null);
                    return;
                }
                return;
            }
            this.e.s(ba1Var.Z());
        }

        @Override // defpackage.f43
        public void a() {
            if (M()) {
                this.d.U();
            }
        }

        @Override // defpackage.b99
        public void i(E e) {
            Object obj;
            Function2<Object, cv1<? super R>, Object> function2 = this.f;
            if (this.g == 1) {
                obj = cw0.b(cw0.b.c(e));
            } else {
                obj = e;
            }
            jn0.d(function2, obj, this.e.p(), S(e));
        }

        @Override // defpackage.b99
        public r3b l(E e, lw5.c cVar) {
            return (r3b) this.e.r(cVar);
        }

        @Override // defpackage.lw5
        public String toString() {
            return "ReceiveSelect@" + jo2.b(this) + '[' + this.e + ",receiveMode=" + this.g + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"La1$f;", "Lra0;", "", "cause", "", "a", "", "toString", "Lz89;", "Lz89;", "receive", "<init>", "(La1;Lz89;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$f */
    /* loaded from: classes3.dex */
    public final class f extends ra0 {
        private final z89<?> a;

        public f(z89<?> z89Var) {
            this.a = z89Var;
        }

        @Override // defpackage.zm0
        public void a(Throwable th) {
            if (this.a.M()) {
                a1.this.U();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.a + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"La1$g;", "E", "Llw5$d;", "Lkba;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Llw5;", "affected", "", com.huawei.hms.push.e.a, "Llw5$c;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "", "k", "Ljw5;", "queue", "<init>", "(Ljw5;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$g */
    /* loaded from: classes3.dex */
    public static final class g<E> extends lw5.d<kba> {
        public g(jw5 jw5Var) {
            super(jw5Var);
        }

        @Override // defpackage.lw5.d, defpackage.lw5.a
        protected Object e(lw5 lw5Var) {
            if (!(lw5Var instanceof ba1)) {
                if (!(lw5Var instanceof kba)) {
                    return b1.d;
                }
                return null;
            }
            return lw5Var;
        }

        @Override // defpackage.lw5.a
        public Object j(lw5.c cVar) {
            r3b U = ((kba) cVar.a).U(cVar);
            if (U == null) {
                return mw5.a;
            }
            Object obj = ty.b;
            if (U == obj) {
                return obj;
            }
            return null;
        }

        @Override // defpackage.lw5.a
        public void k(lw5 lw5Var) {
            ((kba) lw5Var).V();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"a1$h", "Llw5$b;", "Llw5;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$h */
    /* loaded from: classes3.dex */
    public static final class h extends lw5.b {
        final /* synthetic */ a1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(lw5 lw5Var, a1 a1Var) {
            super(lw5Var);
            this.d = a1Var;
        }

        @Override // defpackage.uy
        /* renamed from: k */
        public Object i(lw5 lw5Var) {
            if (this.d.P()) {
                return null;
            }
            return kw5.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"a1$i", "Ll4a;", "Lcw0;", "R", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "Lcv1;", "", "block", "", "t", "(Lv5a;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a1$i */
    /* loaded from: classes3.dex */
    public static final class i implements l4a<cw0<? extends E>> {
        final /* synthetic */ a1<E> a;

        i(a1<E> a1Var) {
            this.a = a1Var;
        }

        @Override // defpackage.l4a
        public <R> void t(v5a<? super R> v5aVar, Function2<? super cw0<? extends E>, ? super cv1<? super R>, ? extends Object> function2) {
            this.a.Z(v5aVar, 1, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* renamed from: a1$j */
    /* loaded from: classes3.dex */
    public static final class j extends ev1 {
        /* synthetic */ Object a;
        final /* synthetic */ a1<E> b;
        int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(a1<E> a1Var, cv1<? super j> cv1Var) {
            super(cv1Var);
            this.b = a1Var;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object d2 = this.b.d(this);
            d = c75.d();
            if (d2 == d) {
                return d2;
            }
            return cw0.b(d2);
        }
    }

    public a1(Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L(z89<? super E> z89Var) {
        boolean M = M(z89Var);
        if (M) {
            V();
        }
        return M;
    }

    private final <R> boolean N(v5a<? super R> v5aVar, Function2<Object, ? super cv1<? super R>, ? extends Object> function2, int i2) {
        e eVar = new e(this, v5aVar, function2, i2);
        boolean L = L(eVar);
        if (L) {
            v5aVar.j(eVar);
        }
        return L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [a1$b] */
    private final <R> Object Y(int i2, cv1<? super R> cv1Var) {
        cv1 c2;
        c cVar;
        Object d2;
        c2 = b75.c(cv1Var);
        gn0 b2 = in0.b(c2);
        if (this.a == null) {
            cVar = new b(b2, i2);
        } else {
            cVar = new c(b2, i2, this.a);
        }
        while (true) {
            if (L(cVar)) {
                a0(b2, cVar);
                break;
            }
            Object W = W();
            if (W instanceof ba1) {
                cVar.T((ba1) W);
                break;
            } else if (W != b1.d) {
                b2.G(cVar.U(W), cVar.S(W));
                break;
            }
        }
        Object s = b2.s();
        d2 = c75.d();
        if (s == d2) {
            io2.c(cv1Var);
        }
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void Z(v5a<? super R> v5aVar, int i2, Function2<Object, ? super cv1<? super R>, ? extends Object> function2) {
        while (!v5aVar.g()) {
            if (R()) {
                if (N(v5aVar, function2, i2)) {
                    return;
                }
            } else {
                Object X = X(v5aVar);
                if (X == w5a.d()) {
                    return;
                }
                if (X != b1.d && X != ty.b) {
                    b0(function2, v5aVar, i2, X);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(fn0<?> fn0Var, z89<?> z89Var) {
        fn0Var.u(new f(z89Var));
    }

    private final <R> void b0(Function2<Object, ? super cv1<? super R>, ? extends Object> function2, v5a<? super R> v5aVar, int i2, Object obj) {
        Object c2;
        boolean z = obj instanceof ba1;
        if (z) {
            if (i2 != 0) {
                if (i2 != 1 || !v5aVar.o()) {
                    return;
                }
                kqb.c(function2, cw0.b(cw0.b.a(((ba1) obj).d)), v5aVar.p());
                return;
            }
            throw gta.a(((ba1) obj).Z());
        } else if (i2 == 1) {
            cw0.b bVar = cw0.b;
            if (z) {
                c2 = bVar.a(((ba1) obj).d);
            } else {
                c2 = bVar.c(obj);
            }
            kqb.c(function2, cw0.b(c2), v5aVar.p());
        } else {
            kqb.c(function2, obj, v5aVar.p());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e2
    public b99<E> E() {
        b99<E> E = super.E();
        if (E != null && !(E instanceof ba1)) {
            U();
        }
        return E;
    }

    public final boolean J(Throwable th) {
        boolean v = v(th);
        S(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final g<E> K() {
        return new g<>(n());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean M(z89<? super E> z89Var) {
        int Q;
        lw5 H;
        if (O()) {
            lw5 n = n();
            do {
                H = n.H();
                if (!(!(H instanceof kba))) {
                    return false;
                }
            } while (!H.z(z89Var, n));
        } else {
            lw5 n2 = n();
            h hVar = new h(z89Var, this);
            do {
                lw5 H2 = n2.H();
                if (!(!(H2 instanceof kba))) {
                    return false;
                }
                Q = H2.Q(z89Var, n2, hVar);
                if (Q != 1) {
                }
            } while (Q != 2);
            return false;
        }
        return true;
    }

    protected abstract boolean O();

    protected abstract boolean P();

    public boolean Q() {
        if (l() != null && P()) {
            return true;
        }
        return false;
    }

    protected final boolean R() {
        if (!(n().F() instanceof kba) && P()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(boolean z) {
        ba1<?> m = m();
        if (m != null) {
            Object b2 = c35.b(null, 1, null);
            while (true) {
                lw5 H = m.H();
                if (H instanceof jw5) {
                    T(b2, m);
                    return;
                } else if (!H.M()) {
                    H.I();
                } else {
                    b2 = c35.c(b2, (kba) H);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    protected void T(Object obj, ba1<?> ba1Var) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((kba) obj).T(ba1Var);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((kba) arrayList.get(size)).T(ba1Var);
                } else {
                    return;
                }
            }
        }
    }

    protected Object W() {
        while (true) {
            kba F = F();
            if (F == null) {
                return b1.d;
            }
            if (F.U(null) != null) {
                F.R();
                return F.S();
            }
            F.V();
        }
    }

    protected Object X(v5a<?> v5aVar) {
        g<E> K = K();
        Object n = v5aVar.n(K);
        if (n != null) {
            return n;
        }
        K.o().R();
        return K.o().S();
    }

    @Override // defpackage.a99
    public final void a(CancellationException cancellationException) {
        if (Q()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(jo2.a(this) + " was cancelled");
        }
        J(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // defpackage.a99
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cv1<? super defpackage.cw0<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.a1.j
            if (r0 == 0) goto L13
            r0 = r5
            a1$j r0 = (defpackage.a1.j) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            a1$j r0 = new a1$j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.vk9.b(r5)
            java.lang.Object r5 = r4.W()
            r3b r2 = defpackage.b1.d
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof defpackage.ba1
            if (r0 == 0) goto L4b
            cw0$b r0 = defpackage.cw0.b
            ba1 r5 = (defpackage.ba1) r5
            java.lang.Throwable r5 = r5.d
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            cw0$b r0 = defpackage.cw0.b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.c = r3
            java.lang.Object r5 = r4.Y(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            cw0 r5 = (defpackage.cw0) r5
            java.lang.Object r5 = r5.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a1.d(cv1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a99
    public final Object f(cv1<? super E> cv1Var) {
        Object W = W();
        if (W != b1.d && !(W instanceof ba1)) {
            return W;
        }
        return Y(0, cv1Var);
    }

    @Override // defpackage.a99
    public final l4a<cw0<E>> i() {
        return new i(this);
    }

    @Override // defpackage.a99
    public final aw0<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.a99
    public E poll() {
        return (E) rv0.a.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a99
    public final Object s() {
        Object W = W();
        if (W == b1.d) {
            return cw0.b.b();
        }
        if (W instanceof ba1) {
            return cw0.b.a(((ba1) W).d);
        }
        return cw0.b.c(W);
    }

    protected void U() {
    }

    protected void V() {
    }
}
