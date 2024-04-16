package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
/* compiled from: EnvironmentResolver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lyj3;", "Lxj3;", "Lrj3;", c.a, "a", "", "b", "", RemoteMessageConst.Notification.URL, "", DateTokenConverter.CONVERTER_KEY, "Ltj3;", "Ltj3;", "environmentConfigProvider", "Lrn5;", "f", "()Lrj3;", "defaultEnv", Image.TYPE_HIGH, "secondaryEnv", "Lsj3;", "g", "()Lsj3;", "environmentConfig", "<init>", "(Ltj3;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yj3  reason: default package */
/* loaded from: classes4.dex */
public final class yj3 implements xj3 {
    private final tj3 a;
    private final rn5 b;
    private final rn5 c;

    /* compiled from: EnvironmentResolver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrj3;", "a", "()Lrj3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yj3$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<rj3> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final rj3 invoke() {
            String b = yj3.this.g().b();
            String str = yj3.this.g().a().get(yj3.this.g().b());
            if (str != null) {
                return new rj3(b, str);
            }
            throw new IllegalStateException("The default environment is not set".toString());
        }
    }

    /* compiled from: EnvironmentResolver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrj3;", "a", "()Lrj3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yj3$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<rj3> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final rj3 invoke() {
            String c = yj3.this.g().c();
            String str = yj3.this.g().a().get(yj3.this.g().c());
            if (str != null) {
                return new rj3(c, str);
            }
            throw new IllegalStateException("The default environment is not set".toString());
        }
    }

    public yj3(tj3 tj3Var) {
        rn5 b2;
        rn5 b3;
        z65.h(tj3Var, "environmentConfigProvider");
        this.a = tj3Var;
        b2 = yn5.b(new a());
        this.b = b2;
        b3 = yn5.b(new b());
        this.c = b3;
    }

    private final rj3 f() {
        return (rj3) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sj3 g() {
        return this.a.get();
    }

    private final rj3 h() {
        return (rj3) this.c.getValue();
    }

    @Override // defpackage.xj3
    public rj3 a() {
        return h();
    }

    @Override // defpackage.xj3
    public List<rj3> b() {
        List y;
        int w;
        y = i86.y(g().a());
        List<Pair> list = y;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Pair pair : list) {
            arrayList.add(new rj3((String) pair.c(), (String) pair.d()));
        }
        return arrayList;
    }

    @Override // defpackage.xj3
    public rj3 c() {
        return f();
    }

    @Override // defpackage.utb
    public boolean d(String str) {
        String str2;
        z65.h(str, RemoteMessageConst.Notification.URL);
        String str3 = g().a().get("prod1");
        if ((str3 != null && z65.c(str3, str)) || ((str2 = g().a().get("prod2")) != null && z65.c(str2, str))) {
            return true;
        }
        return false;
    }
}
