package defpackage;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: HuaweiRemoteMessageTransformer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lwq4;", "", "Lol3;", "a", "Lol3;", "exceptionHandler", "Lcom/google/gson/Gson;", "b", "Lrn5;", "getGson", "()Lcom/google/gson/Gson;", "gson", "<init>", "(Lol3;)V", "mindbox-huawei_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wq4  reason: default package */
/* loaded from: classes.dex */
public final class wq4 {
    private final ol3 a;
    private final rn5 b;

    /* compiled from: HuaweiRemoteMessageTransformer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wq4$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Gson> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    public wq4(ol3 ol3Var) {
        rn5 b;
        z65.h(ol3Var, "exceptionHandler");
        this.a = ol3Var;
        b = yn5.b(a.a);
        this.b = b;
    }
}
