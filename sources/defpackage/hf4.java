package defpackage;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GetTokenResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lhf4;", "", "<init>", "()V", "a", "b", "Lhf4$a;", "Lhf4$b;", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: hf4  reason: default package */
/* loaded from: classes.dex */
public abstract class hf4 {

    /* compiled from: GetTokenResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lhf4$a;", "Lhf4;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "token", "<init>", "(Ljava/lang/String;)V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: hf4$a */
    /* loaded from: classes.dex */
    public static final class a extends hf4 {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            z65.h(str, "token");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: GetTokenResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lhf4$b;", "Lhf4;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", e.a, "<init>", "(Ljava/lang/Exception;)V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: hf4$b */
    /* loaded from: classes.dex */
    public static final class b extends hf4 {
        private final Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(null);
            z65.h(exc, e.a);
            this.a = exc;
        }

        public final Exception a() {
            return this.a;
        }
    }

    private hf4() {
    }

    public /* synthetic */ hf4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
