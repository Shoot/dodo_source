package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0013B(\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bB,\b\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0012\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lvab;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lml;", "a", "Lml;", "()Lml;", "annotatedString", "Ljcb;", "b", "J", "()J", "selection", com.huawei.hms.opendevice.c.a, "Ljcb;", "getComposition-MzsxiRA", "()Ljcb;", "composition", "()Ljava/lang/String;", "text", "<init>", "(Lml;JLjcb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLjcb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vab  reason: default package */
/* loaded from: classes.dex */
public final class vab {
    public static final c d = new c(null);
    private static final pt9<vab, Object> e = qt9.a(a.a, b.a);
    private final ml a;
    private final long b;
    private final jcb c;

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lvab;", "it", "", "a", "(Lrt9;Lvab;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vab$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<rt9, vab, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, vab vabVar) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(vabVar, "it");
            h = kc1.h(st9.u(vabVar.a(), st9.e(), rt9Var), st9.u(jcb.b(vabVar.b()), st9.q(jcb.b), rt9Var));
            return h;
        }
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lvab;", "a", "(Ljava/lang/Object;)Lvab;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vab$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Object, vab> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vab invoke(Object obj) {
            ml b;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            pt9<ml, Object> e = st9.e();
            Boolean bool = Boolean.FALSE;
            jcb jcbVar = null;
            if (z65.c(obj2, bool) || obj2 == null) {
                b = null;
            } else {
                b = e.b(obj2);
            }
            z65.e(b);
            Object obj3 = list.get(1);
            pt9<jcb, Object> q = st9.q(jcb.b);
            if (!z65.c(obj3, bool) && obj3 != null) {
                jcbVar = q.b(obj3);
            }
            z65.e(jcbVar);
            return new vab(b, jcbVar.m(), (jcb) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvab$c;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vab$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ vab(ml mlVar, long j, jcb jcbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, j, jcbVar);
    }

    public final ml a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vab)) {
            return false;
        }
        vab vabVar = (vab) obj;
        if (jcb.e(this.b, vabVar.b) && z65.c(this.c, vabVar.c) && z65.c(this.a, vabVar.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + jcb.k(this.b)) * 31;
        jcb jcbVar = this.c;
        if (jcbVar != null) {
            i = jcb.k(jcbVar.m());
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) jcb.l(this.b)) + ", composition=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ vab(String str, long j, jcb jcbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, jcbVar);
    }

    private vab(ml mlVar, long j, jcb jcbVar) {
        z65.h(mlVar, "annotatedString");
        this.a = mlVar;
        this.b = kcb.c(j, 0, c().length());
        this.c = jcbVar != null ? jcb.b(kcb.c(jcbVar.m(), 0, c().length())) : null;
    }

    public /* synthetic */ vab(ml mlVar, long j, jcb jcbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, (i & 2) != 0 ? jcb.b.a() : j, (i & 4) != 0 ? null : jcbVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ vab(String str, long j, jcb jcbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? jcb.b.a() : j, (i & 4) != 0 ? null : jcbVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private vab(String str, long j, jcb jcbVar) {
        this(new ml(str, null, null, 6, null), j, jcbVar, (DefaultConstructorMarker) null);
        z65.h(str, "text");
    }
}
