package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: Channel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&J\u0011\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0010\u0010\bR#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00118&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"La99;", "E", "", "f", "(Lcv1;)Ljava/lang/Object;", "Lcw0;", DateTokenConverter.CONVERTER_KEY, Image.TYPE_SMALL, "()Ljava/lang/Object;", "Law0;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "a", "poll", "Ll4a;", "i", "()Ll4a;", "onReceiveCatching", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: a99  reason: default package */
/* loaded from: classes3.dex */
public interface a99<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: a99$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <E> E a(a99<? extends E> a99Var) {
            Object s = a99Var.s();
            if (cw0.j(s)) {
                return (E) cw0.g(s);
            }
            Throwable e = cw0.e(s);
            if (e == null) {
                return null;
            }
            throw gta.a(e);
        }
    }

    void a(CancellationException cancellationException);

    Object d(cv1<? super cw0<? extends E>> cv1Var);

    Object f(cv1<? super E> cv1Var);

    l4a<cw0<E>> i();

    aw0<E> iterator();

    E poll();

    Object s();
}
