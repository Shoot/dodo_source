package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: BlockStoreDataSource.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b1\u00102J\u001d\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00018\u00008\u00000\n\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\f\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002J)\u0010\u0013\u001a\u00020\u000e\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0018\u001a\u00020\u000eH\u0007R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010&\u001a\n \u000b*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lld0;", "", "Ljava/io/Serializable;", "T", "", "o", "(Ljava/io/Serializable;)[B", "p", "([B)Ljava/io/Serializable;", "Ly6b;", "Lfnb;", "kotlin.jvm.PlatformType", "f", "", "", "n", "", Action.KEY_ATTRIBUTE, "obj", Image.TYPE_MEDIUM, "(Ljava/lang/String;Ljava/io/Serializable;)V", "i", "(Ljava/lang/String;)Ljava/io/Serializable;", "g", Image.TYPE_HIGH, "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lih4;", "b", "Lih4;", "googlePlayServicesHelper", "Lorg/slf4j/Logger;", com.huawei.hms.opendevice.c.a, "Lrn5;", "k", "()Lorg/slf4j/Logger;", "logger", "Lyd0;", DateTokenConverter.CONVERTER_KEY, "j", "()Lyd0;", "client", "", com.huawei.hms.push.e.a, "l", "()Z", "isEndToEndEncryptionAvailable", "<init>", "(Landroid/content/Context;Lih4;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ld0  reason: default package */
/* loaded from: classes3.dex */
public final class ld0 {
    public static final a f = new a(null);
    private final Context a;
    private final ih4 b;
    private final rn5 c;
    private final rn5 d;
    private final rn5 e;

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lld0$a;", "", "", "WRONG_THREAD_EXCEPTION_MESSAGE", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ld0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends ej5 implements Function0<T> {
        final /* synthetic */ y6b<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y6b<T> y6bVar) {
            super(0);
            this.a = y6bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) o7b.a(this.a);
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0$c */
    /* loaded from: classes3.dex */
    static final class c extends ej5 implements Function1<Throwable, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "it");
            ld0.this.n(th);
            ld0.this.k().warn("Failed to delete all tokens", th);
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0$d */
    /* loaded from: classes3.dex */
    static final class d extends ej5 implements Function1<Throwable, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "it");
            ld0.this.n(th);
            ld0.this.k().warn("Failed to delete all tokens", th);
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lyd0;", "a", "()Lyd0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ld0$e */
    /* loaded from: classes3.dex */
    static final class e extends ej5 implements Function0<yd0> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final yd0 invoke() {
            return xd0.a(ld0.this.a);
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Ljava/io/Serializable;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0$f */
    /* loaded from: classes3.dex */
    static final class f extends ej5 implements Function1<Throwable, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "it");
            ld0.this.n(th);
            ld0.this.k().warn("Failed to retrieve bytes", th);
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0$g */
    /* loaded from: classes3.dex */
    static final class g extends ej5 implements Function0<Boolean> {
        g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ld0 ld0Var = ld0.this;
            y6b<Boolean> e = ld0Var.j().e();
            z65.g(e, "isEndToEndEncryptionAvailable(...)");
            Boolean bool = (Boolean) ld0Var.f(e).b();
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ld0$h */
    /* loaded from: classes3.dex */
    static final class h extends ej5 implements Function0<Logger> {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("BlockStoreDataSource");
        }
    }

    /* compiled from: BlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Ljava/io/Serializable;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0$i */
    /* loaded from: classes3.dex */
    static final class i extends ej5 implements Function1<Throwable, Unit> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "it");
            ld0.this.n(th);
            ld0.this.k().warn("Failed to store bytes", th);
        }
    }

    public ld0(Context context, ih4 ih4Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(ih4Var, "googlePlayServicesHelper");
        this.a = context;
        this.b = ih4Var;
        this.c = xn5.b(h.a);
        this.d = xn5.b(new e());
        this.e = xn5.b(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> fnb<T> f(y6b<T> y6bVar) {
        return fnb.a.a(new b(y6bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yd0 j() {
        return (yd0) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger k() {
        return (Logger) this.c.getValue();
    }

    private final boolean l() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Throwable th) {
        if ((th instanceof IllegalStateException) && z65.c(th.getMessage(), "Must not be called on the main application thread")) {
            throw th;
        }
    }

    private final <T extends Serializable> byte[] o(T t) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(t);
        objectOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        z65.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    private final <T extends Serializable> T p(byte[] bArr) {
        try {
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            z65.f(readObject, "null cannot be cast to non-null type T of ru.dodopizza.app.data.datasource.BlockStoreDataSource.toObject");
            return (T) readObject;
        } catch (Exception e2) {
            k().error("Failed to deserialize object", (Throwable) e2);
            return null;
        }
    }

    public final void g(String str) {
        List<String> e2;
        z65.h(str, Action.KEY_ATTRIBUTE);
        if (!this.b.a()) {
            return;
        }
        DeleteBytesRequest.a aVar = new DeleteBytesRequest.a();
        e2 = jc1.e(str);
        DeleteBytesRequest a2 = aVar.c(e2).a();
        z65.g(a2, "build(...)");
        y6b<Boolean> d2 = j().d(a2);
        z65.g(d2, "deleteBytes(...)");
        hnb.b(f(d2), new c());
    }

    public final void h() {
        if (!this.b.a()) {
            return;
        }
        DeleteBytesRequest a2 = new DeleteBytesRequest.a().b(true).a();
        z65.g(a2, "build(...)");
        y6b<Boolean> d2 = j().d(a2);
        z65.g(d2, "deleteBytes(...)");
        hnb.b(f(d2), new d());
    }

    public final <T extends Serializable> T i(String str) {
        List<String> e2;
        byte[] bArr;
        Map<String, RetrieveBytesResponse.BlockstoreData> h2;
        RetrieveBytesResponse.BlockstoreData blockstoreData;
        z65.h(str, Action.KEY_ATTRIBUTE);
        if (!this.b.a()) {
            return null;
        }
        RetrieveBytesRequest.a aVar = new RetrieveBytesRequest.a();
        e2 = jc1.e(str);
        RetrieveBytesRequest a2 = aVar.b(e2).a();
        z65.g(a2, "build(...)");
        y6b<RetrieveBytesResponse> b2 = j().b(a2);
        z65.g(b2, "retrieveBytes(...)");
        RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) hnb.b(f(b2), new f()).b();
        if (retrieveBytesResponse != null && (h2 = retrieveBytesResponse.h()) != null && (blockstoreData = h2.get(str)) != null) {
            bArr = blockstoreData.h();
        } else {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return (T) p(bArr);
    }

    public final <T extends Serializable> void m(String str, T t) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(t, "obj");
        if (!this.b.a()) {
            return;
        }
        StoreBytesData a2 = new StoreBytesData.a().c(str).b(o(t)).d(l()).a();
        z65.g(a2, "build(...)");
        y6b<Integer> c2 = j().c(a2);
        z65.g(c2, "storeBytes(...)");
        hnb.b(f(c2), new i());
    }
}
