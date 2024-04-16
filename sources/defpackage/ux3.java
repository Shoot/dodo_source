package defpackage;

import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FirebaseRemoteMessageTransformer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lux3;", "", "Lol3;", "a", "Lol3;", "exceptionHandler", "Lcom/google/gson/Gson;", "b", "Lrn5;", "getGson", "()Lcom/google/gson/Gson;", "gson", "<init>", "(Lol3;)V", c.a, "mindbox-firebase_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ux3  reason: default package */
/* loaded from: classes.dex */
public final class ux3 {
    public static final a c = new a(null);
    private final ol3 a;
    private final rn5 b;

    /* compiled from: FirebaseRemoteMessageTransformer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lux3$a;", "", "", "DATA_BUTTONS", "Ljava/lang/String;", "DATA_IMAGE_URL", "DATA_MESSAGE", "DATA_PAYLOAD", "DATA_PUSH_CLICK_URL", "DATA_TITLE", "DATA_UNIQUE_KEY", "<init>", "()V", "mindbox-firebase_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ux3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FirebaseRemoteMessageTransformer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ux3$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Gson> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    public ux3(ol3 ol3Var) {
        rn5 b2;
        z65.h(ol3Var, "exceptionHandler");
        this.a = ol3Var;
        b2 = yn5.b(b.a);
        this.b = b2;
    }
}
