package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ml;
import defpackage.w24;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020!\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001f¨\u0006("}, d2 = {"Lsp6;", "Leq7;", "Ljq7;", "style", "defaultStyle", Image.TYPE_HIGH, "Lml;", "a", "Lml;", e.a, "()Lml;", "annotatedString", "", "Lml$a;", "Ljb8;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "placeholders", "", c.a, "Lrn5;", "()F", "minIntrinsicWidth", DateTokenConverter.CONVERTER_KEY, "maxIntrinsicWidth", "Ldq7;", "f", "infoList", "", "()Z", "hasStaleResolvedFonts", "Lrcb;", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "<init>", "(Lml;Lrcb;Ljava/util/List;La03;Lw24$b;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sp6  reason: default package */
/* loaded from: classes.dex */
public final class sp6 implements eq7 {
    private final ml a;
    private final List<ml.a<jb8>> b;
    private final rn5 c;
    private final rn5 d;
    private final List<dq7> e;

    /* compiled from: MultiParagraphIntrinsics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sp6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Float invoke() {
            int n;
            dq7 dq7Var;
            float f;
            eq7 b;
            List<dq7> f2 = sp6.this.f();
            if (f2.isEmpty()) {
                dq7Var = null;
            } else {
                dq7 dq7Var2 = f2.get(0);
                float b2 = dq7Var2.b().b();
                n = kc1.n(f2);
                int i = 1;
                if (1 <= n) {
                    while (true) {
                        dq7 dq7Var3 = f2.get(i);
                        float b3 = dq7Var3.b().b();
                        if (Float.compare(b2, b3) < 0) {
                            dq7Var2 = dq7Var3;
                            b2 = b3;
                        }
                        if (i == n) {
                            break;
                        }
                        i++;
                    }
                }
                dq7Var = dq7Var2;
            }
            dq7 dq7Var4 = dq7Var;
            if (dq7Var4 != null && (b = dq7Var4.b()) != null) {
                f = b.b();
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }
    }

    /* compiled from: MultiParagraphIntrinsics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sp6$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Float invoke() {
            int n;
            dq7 dq7Var;
            float f;
            eq7 b;
            List<dq7> f2 = sp6.this.f();
            if (f2.isEmpty()) {
                dq7Var = null;
            } else {
                dq7 dq7Var2 = f2.get(0);
                float c = dq7Var2.b().c();
                n = kc1.n(f2);
                int i = 1;
                if (1 <= n) {
                    while (true) {
                        dq7 dq7Var3 = f2.get(i);
                        float c2 = dq7Var3.b().c();
                        if (Float.compare(c, c2) < 0) {
                            dq7Var2 = dq7Var3;
                            c = c2;
                        }
                        if (i == n) {
                            break;
                        }
                        i++;
                    }
                }
                dq7Var = dq7Var2;
            }
            dq7 dq7Var4 = dq7Var;
            if (dq7Var4 != null && (b = dq7Var4.b()) != null) {
                f = b.c();
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }
    }

    public sp6(ml mlVar, rcb rcbVar, List<ml.a<jb8>> list, a03 a03Var, w24.b bVar) {
        rn5 a2;
        rn5 a3;
        ml h;
        List b2;
        ml mlVar2 = mlVar;
        z65.h(mlVar2, "annotatedString");
        z65.h(rcbVar, "style");
        z65.h(list, "placeholders");
        z65.h(a03Var, "density");
        z65.h(bVar, "fontFamilyResolver");
        this.a = mlVar2;
        this.b = list;
        fo5 fo5Var = fo5.c;
        a2 = yn5.a(fo5Var, new b());
        this.c = a2;
        a3 = yn5.a(fo5Var, new a());
        this.d = a3;
        jq7 J = rcbVar.J();
        List<ml.a<jq7>> g = nl.g(mlVar2, J);
        ArrayList arrayList = new ArrayList(g.size());
        int size = g.size();
        int i = 0;
        while (i < size) {
            ml.a<jq7> aVar = g.get(i);
            h = nl.h(mlVar2, aVar.f(), aVar.d());
            jq7 h2 = h(aVar.e(), J);
            String h3 = h.h();
            rcb H = rcbVar.H(h2);
            List<ml.a<vqa>> f = h.f();
            b2 = tp6.b(g(), aVar.f(), aVar.d());
            arrayList.add(new dq7(fq7.a(h3, H, f, b2, a03Var, bVar), aVar.f(), aVar.d()));
            i++;
            mlVar2 = mlVar;
        }
        this.e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jq7 h(jq7 jq7Var, jq7 jq7Var2) {
        oab l = jq7Var.l();
        if (l != null) {
            l.l();
            return jq7Var;
        }
        return jq7.b(jq7Var, null, jq7Var2.l(), 0L, null, null, null, null, null, null, 509, null);
    }

    @Override // defpackage.eq7
    public boolean a() {
        List<dq7> list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).b().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eq7
    public float b() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.eq7
    public float c() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final ml e() {
        return this.a;
    }

    public final List<dq7> f() {
        return this.e;
    }

    public final List<ml.a<jb8>> g() {
        return this.b;
    }
}
