package defpackage;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ml;
import defpackage.w24;
import defpackage.wob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u001a\u00103\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b,\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u001a\u0010?\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b5\u0010>R\u0014\u0010B\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010AR\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010AR\u0014\u0010E\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010D¨\u0006H"}, d2 = {"Lai;", "Leq7;", "", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "text", "Lrcb;", "b", "Lrcb;", "i", "()Lrcb;", "style", "", "Lml$a;", "Lvqa;", c.a, "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "spanStyles", "Ljb8;", DateTokenConverter.CONVERTER_KEY, "getPlaceholders", "placeholders", "Lw24$b;", e.a, "Lw24$b;", "g", "()Lw24$b;", "fontFamilyResolver", "La03;", "f", "La03;", "getDensity", "()La03;", "density", "Lwi;", "Lwi;", "k", "()Lwi;", "textPaint", "", Image.TYPE_HIGH, "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Lum5;", "Lum5;", "()Lum5;", "layoutIntrinsics", "Lrob;", "j", "Lrob;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "<init>", "(Ljava/lang/String;Lrcb;Ljava/util/List;Ljava/util/List;Lw24$b;La03;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai implements eq7 {
    private final String a;
    private final rcb b;
    private final List<ml.a<vqa>> c;
    private final List<ml.a<jb8>> d;
    private final w24.b e;
    private final a03 f;
    private final wi g;
    private final CharSequence h;
    private final um5 i;
    private rob j;
    private final boolean k;
    private final int l;

    /* compiled from: AndroidParagraphIntrinsics.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lw24;", "fontFamily", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "Landroid/graphics/Typeface;", "a", "(Lw24;Lv34;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ai$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements a94<w24, v34, q34, r34, Typeface> {
        a() {
            super(4);
        }

        public final Typeface a(w24 w24Var, v34 v34Var, int i, int i2) {
            z65.h(v34Var, "fontWeight");
            cua<Object> a = ai.this.g().a(w24Var, v34Var, i, i2);
            if (!(a instanceof wob.b)) {
                rob robVar = new rob(a, ai.this.j);
                ai.this.j = robVar;
                return robVar.a();
            }
            Object value = a.getValue();
            z65.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }

        @Override // defpackage.a94
        public /* bridge */ /* synthetic */ Typeface q(w24 w24Var, v34 v34Var, q34 q34Var, r34 r34Var) {
            return a(w24Var, v34Var, q34Var.i(), r34Var.j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<ml$a<vqa>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public ai(String str, rcb rcbVar, List<ml.a<vqa>> list, List<ml.a<jb8>> list2, w24.b bVar, a03 a03Var) {
        boolean c;
        boolean booleanValue;
        ml.a<vqa> aVar;
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(list, "spanStyles");
        z65.h(list2, "placeholders");
        z65.h(bVar, "fontFamilyResolver");
        z65.h(a03Var, "density");
        this.a = str;
        this.b = rcbVar;
        this.c = list;
        this.d = list2;
        this.e = bVar;
        this.f = a03Var;
        wi wiVar = new wi(1, a03Var.getDensity());
        this.g = wiVar;
        c = bi.c(rcbVar);
        if (!c) {
            booleanValue = false;
        } else {
            booleanValue = mf3.a.a().getValue().booleanValue();
        }
        this.k = booleanValue;
        this.l = bi.d(rcbVar.B(), rcbVar.u());
        a aVar2 = new a();
        hcb.e(wiVar, rcbVar.E());
        vqa a2 = hcb.a(wiVar, rcbVar.K(), aVar2, a03Var, !((Collection) list).isEmpty());
        if (a2 != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    aVar = new ml.a<>(a2, 0, this.a.length());
                } else {
                    aVar = this.c.get(i - 1);
                }
                list.add(aVar);
            }
        }
        CharSequence a3 = zh.a(this.a, this.g.getTextSize(), this.b, list, this.d, this.f, aVar2, this.k);
        this.h = a3;
        this.i = new um5(a3, this.g, this.l);
    }

    @Override // defpackage.eq7
    public boolean a() {
        boolean c;
        rob robVar = this.j;
        if (robVar == null || !robVar.b()) {
            if (!this.k) {
                c = bi.c(this.b);
                if (!c || !mf3.a.a().getValue().booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.eq7
    public float b() {
        return this.i.b();
    }

    @Override // defpackage.eq7
    public float c() {
        return this.i.c();
    }

    public final CharSequence f() {
        return this.h;
    }

    public final w24.b g() {
        return this.e;
    }

    public final um5 h() {
        return this.i;
    }

    public final rcb i() {
        return this.b;
    }

    public final int j() {
        return this.l;
    }

    public final wi k() {
        return this.g;
    }
}
