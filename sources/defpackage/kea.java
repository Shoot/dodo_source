package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionGenerator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017¨\u0006\u001c"}, d2 = {"Lkea;", "", "", "b", "Lfea;", "a", "Lrgb;", "Lrgb;", "timeProvider", "Lkotlin/Function0;", "Ljava/util/UUID;", "Lkotlin/jvm/functions/Function0;", "uuidGenerator", c.a, "Ljava/lang/String;", "firstSessionId", "", DateTokenConverter.CONVERTER_KEY, "I", "sessionIndex", "<set-?>", e.a, "Lfea;", "()Lfea;", "currentSession", "<init>", "(Lrgb;Lkotlin/jvm/functions/Function0;)V", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: kea  reason: default package */
/* loaded from: classes2.dex */
public final class kea {
    public static final b f = new b(null);
    private final rgb a;
    private final Function0<UUID> b;
    private final String c;
    private int d;
    private fea e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SessionGenerator.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kea$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends m94 implements Function0<UUID> {
        public static final a a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: SessionGenerator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkea$b;", "", "Lkea;", "a", "()Lkea;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: kea$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kea a() {
            Object j = hw3.a(kv3.a).j(kea.class);
            z65.g(j, "Firebase.app[SessionGenerator::class.java]");
            return (kea) j;
        }
    }

    public kea(rgb rgbVar, Function0<UUID> function0) {
        z65.h(rgbVar, "timeProvider");
        z65.h(function0, "uuidGenerator");
        this.a = rgbVar;
        this.b = function0;
        this.c = b();
        this.d = -1;
    }

    private final String b() {
        String F;
        String uuid = this.b.invoke().toString();
        z65.g(uuid, "uuidGenerator().toString()");
        F = l0b.F(uuid, "-", "", false, 4, null);
        String lowerCase = F.toLowerCase(Locale.ROOT);
        z65.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final fea a() {
        String b2;
        int i = this.d + 1;
        this.d = i;
        if (i == 0) {
            b2 = this.c;
        } else {
            b2 = b();
        }
        this.e = new fea(b2, this.c, this.d, this.a.a());
        return c();
    }

    public final fea c() {
        fea feaVar = this.e;
        if (feaVar != null) {
            return feaVar;
        }
        z65.z("currentSession");
        return null;
    }

    public /* synthetic */ kea(rgb rgbVar, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rgbVar, (i & 2) != 0 ? a.a : function0);
    }
}
