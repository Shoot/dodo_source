package defpackage;

import android.util.Log;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EventGDTLogger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Ltk3;", "Luk3;", "Lgea;", "value", "", c.a, "sessionEvent", "", "a", "Lbs8;", "Lxlb;", "Lbs8;", "transportFactoryProvider", "<init>", "(Lbs8;)V", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: tk3  reason: default package */
/* loaded from: classes2.dex */
public final class tk3 implements uk3 {
    public static final a b = new a(null);
    private final bs8<xlb> a;

    /* compiled from: EventGDTLogger.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ltk3$a;", "", "", "AQS_LOG_SOURCE", "Ljava/lang/String;", "TAG", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: tk3$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tk3(bs8<xlb> bs8Var) {
        z65.h(bs8Var, "transportFactoryProvider");
        this.a = bs8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(gea geaVar) {
        String encode = hea.a.c().encode(geaVar);
        z65.g(encode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + encode);
        byte[] bytes = encode.getBytes(rw0.b);
        z65.g(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // defpackage.uk3
    public void a(gea geaVar) {
        z65.h(geaVar, "sessionEvent");
        this.a.get().a("FIREBASE_APPQUALITY_SESSION", gea.class, eh3.b("json"), new zkb() { // from class: sk3
            @Override // defpackage.zkb
            public final Object apply(Object obj) {
                byte[] c;
                c = tk3.this.c((gea) obj);
                return c;
            }
        }).a(pk3.e(geaVar));
    }
}
