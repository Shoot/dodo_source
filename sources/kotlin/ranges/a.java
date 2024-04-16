package kotlin.ranges;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B!\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/a;", "", "", "Lgw0;", "p", "a", "C", Image.TYPE_HIGH, "()C", "first", "b", "k", "last", "", com.huawei.hms.opendevice.c.a, "I", "getStep", "()I", "step", "start", "endInclusive", "<init>", "(CCI)V", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class a implements Iterable<Character>, be5 {
    public static final C0414a d = new C0414a(null);
    private final char a;
    private final char b;
    private final int c;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kotlin.ranges.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0414a {
        private C0414a() {
        }

        public /* synthetic */ C0414a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(char c, char c2, int i) {
        if (i != 0) {
            if (i != Integer.MIN_VALUE) {
                this.a = c;
                this.b = (char) fp8.c(c, c2, i);
                this.c = i;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char h() {
        return this.a;
    }

    public final char k() {
        return this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: p */
    public gw0 iterator() {
        return new hw0(this.a, this.b, this.c);
    }
}
